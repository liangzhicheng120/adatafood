package com.adatafood.order.service.impl;

import com.adatafood.order.bean.Order;
import com.adatafood.order.bean.OrderDetail;
import com.adatafood.order.bean.OrderMaster;
import com.adatafood.order.dao.OrderDetailDao;
import com.adatafood.order.dao.OrderMasterDao;
import com.adatafood.order.enums.OrderStatusEnum;
import com.adatafood.order.enums.PayStatusEnum;
import com.adatafood.order.service.OrderService;
import com.adatafood.order.util.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Autowired
    private OrderMasterDao orderMasterDao;

//    @Autowired
//    private ProductClient productClient;

    @Override
    public Order create(Order order) {
        // 订单入库
        String orderId = KeyUtil.genUniqueKey();
//         查询商品信息
        List<String> productList = order.getOrderDetailList().stream()
                .map(OrderDetail::getProductId)
                .collect(Collectors.toList());

//         计算总价
        BigDecimal orderAmout = new BigDecimal(BigInteger.ZERO);
//        for (OrderDetail orderDetail : order.getOrderDetailList()) {
//            for (ProductInfo productInfo : productList) {
//
//            }
//        }
        OrderMaster orderMaster = new OrderMaster();
        order.setOrderId(orderId);
        BeanUtils.copyProperties(order, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMasterDao.save(orderMaster);
        return order;
    }
}
