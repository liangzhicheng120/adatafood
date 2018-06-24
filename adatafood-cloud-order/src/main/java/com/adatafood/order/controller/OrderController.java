package com.adatafood.order.controller;

import com.adatafood.order.bean.Order;
import com.adatafood.order.enums.ResultEnum;
import com.adatafood.order.exception.OrderException;
import com.adatafood.order.param.OrderParam;
import com.adatafood.order.service.OrderService;
import com.adatafood.order.util.CheckUtil;
import com.adatafood.order.vo.WebResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "消费")
    @PostMapping("/create")
    public WebResultVO create(@Valid OrderParam orderParam, BindingResult bindingResult) {
        CheckUtil.checkParams(bindingResult, orderParam);
        Order order = Order.transfrom(orderParam);
        if (CollectionUtils.isEmpty(order.getOrderDetailList())) {
            log.error("【创建订单】购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }
        Order result = orderService.create(order);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", result.getOrderId());
        return new WebResultVO(map);
    }

}
