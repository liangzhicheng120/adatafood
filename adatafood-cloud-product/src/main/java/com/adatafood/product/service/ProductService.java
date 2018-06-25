package com.adatafood.product.service;

import com.adatafood.product.bean.ProductInfo;

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
public interface ProductService {
    /**
     * 查询所有上架商品
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     */
    List<ProductInfo> findList(List<String> productIdList);

}
