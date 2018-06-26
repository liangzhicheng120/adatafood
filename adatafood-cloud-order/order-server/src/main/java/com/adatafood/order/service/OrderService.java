package com.adatafood.order.service;

import com.adatafood.order.bean.Order;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
public interface OrderService {
    /**
     * 创建订单
     *
     * @param order 订单参数
     * @return
     */
    Order create(Order order);
}
