package com.adatafood.product.dao;

import com.adatafood.product.ProductApplicationTests;
import com.adatafood.product.bean.ProductCategory;
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
 * @Description: 商品类目测试
 * @date ${date} ${time}
 */
@Component
public class ProductCategoryDaoTest extends ProductApplicationTests {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findAllByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = productCategoryDao.findAllByCategoryTypeIn(Arrays.asList(11, 12));
        assertTrue(productCategoryList.size() > 0);
    }
}