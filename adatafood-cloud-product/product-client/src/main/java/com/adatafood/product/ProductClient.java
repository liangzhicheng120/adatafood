package com.adatafood.product;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
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
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@FeignClient(name = "adatafood-cloud-product", fallback = ProductClient.ProductClientFallback.class)
@RequestMapping("/product")
public interface ProductClient {

    @PostMapping("/order/list")
    List<ProductInfoVO> listForOrder(@RequestBody List<String> productIdList);


    @PostMapping("/decrease/stock")
    void decreaseStock(@RequestBody List<DecreaseStockParam> decreaseStockInputList);

    @Component
    class ProductClientFallback implements ProductClient {

        @Override
        public List<ProductInfoVO> listForOrder(List<String> productIdList) {
            return null;
        }

        @Override
        public void decreaseStock(List<DecreaseStockParam> decreaseStockInputList) {

        }
    }

}
