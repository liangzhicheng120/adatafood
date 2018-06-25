package com.adatafood.order.service;

import com.adatafood.order.vo.WebResultVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

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
public interface ProductService {
    @GetMapping("/product/list")
    WebResultVO list();
}
