package com.adatafood.order.bean;

import com.adatafood.order.enums.ResultEnum;
import com.adatafood.order.exception.OrderException;
import com.adatafood.order.param.OrderParam;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Data
@Slf4j
public class Order {
    /**
     * 订单id.
     */
    private String orderId;

    /**
     * 买家名字.
     */
    private String buyerName;

    /**
     * 买家手机号.
     */
    private String buyerPhone;

    /**
     * 买家地址.
     */
    private String buyerAddress;

    /**
     * 买家微信Openid.
     */
    private String buyerOpenid;

    /**
     * 订单总金额.
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态, 默认为0新下单.
     */
    private Integer orderStatus;

    /**
     * 支付状态, 默认为0未支付.
     */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;

    public static Order transfrom(OrderParam orderParam) {
        Order order = new Order();
        Gson gson = new Gson();
        order.setBuyerName(orderParam.getName());
        order.setBuyerAddress(orderParam.getAddress());
        order.setBuyerOpenid(orderParam.getOpenid());
        order.setBuyerPhone(orderParam.getPhone());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderParam.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        } catch (Exception e) {
            log.error("【json转换】错误, string={}", orderParam.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        order.setOrderDetailList(orderDetailList);
        return order;
    }
}
