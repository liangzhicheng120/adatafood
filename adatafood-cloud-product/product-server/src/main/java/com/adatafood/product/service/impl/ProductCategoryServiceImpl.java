package com.adatafood.product.service.impl;

import com.adatafood.product.bean.ProductCategory;
import com.adatafood.product.dao.ProductCategoryDao;
import com.adatafood.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findAllByCategoryTypeIn(categoryTypeList);
    }
}
