package com.adatafood.product.service;

import com.adatafood.product.bean.ProductCategory;

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
public interface ProductCategoryService {
    List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryTypeList);
}
