package com.adatafood.order.controller;

import com.adatafood.order.bean.Cart;
import com.adatafood.order.bean.Order;
import com.adatafood.order.enums.ResultEnum;
import com.adatafood.order.exception.OrderException;
import com.adatafood.order.param.OrderParam;
import com.adatafood.order.service.OrderService;
import com.adatafood.order.service.ProductService;
import com.adatafood.order.util.CheckUtil;
import com.adatafood.order.vo.WebResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
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

    @Autowired
    private ProductService productService;

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

    @ApiOperation(value = "获取上架商品列表")
    @GetMapping("/list")
    public WebResultVO list() {
        return productService.list();
    }

    @ApiOperation(value = "扣库存")
    @PostMapping("/decrease/stock")
    public WebResultVO decreaseStock(@RequestBody List<Cart> cartList) {
        return productService.decreaseStock(cartList);
    }

}
