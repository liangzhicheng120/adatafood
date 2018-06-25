package com.adatafood.order.service;

import com.adatafood.order.bean.Cart;
import com.adatafood.order.vo.WebResultVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 服务调用
 * @date ${date} ${time}
 */
@FeignClient(name = "adatafood-cloud-product")
@RequestMapping("/product")
public interface ProductService {
    @GetMapping("/list")
    WebResultVO list();

    @PostMapping("/order/list")
    WebResultVO listForOrder(@RequestBody List<String> productList);

    @PostMapping("/decrease/stock")
    WebResultVO decreaseStock(List<Cart> cartList);
}
