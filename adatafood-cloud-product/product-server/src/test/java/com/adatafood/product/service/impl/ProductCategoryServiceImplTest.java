package com.adatafood.product.service.impl;

import com.adatafood.product.ProductApplicationTests;
import com.adatafood.product.bean.ProductCategory;
import com.adatafood.product.service.ProductCategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Component
public class ProductCategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void findAllByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = productCategoryService.findAllByCategoryTypeIn(Arrays.asList(11, 12));
        assertTrue(productCategoryList.size() > 0);
    }
}