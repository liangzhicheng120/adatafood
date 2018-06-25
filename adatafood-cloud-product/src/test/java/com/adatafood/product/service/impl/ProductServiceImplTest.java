package com.adatafood.product.service.impl;

import com.adatafood.product.ProductApplicationTests;
import com.adatafood.product.bean.Cart;
import com.adatafood.product.bean.ProductInfo;
import com.adatafood.product.dao.ProductInfoDao;
import com.adatafood.product.service.ProductService;
import org.junit.Assert;
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
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfo> productInfoList = productService.findList(Arrays.asList("157875227953464068", "164103465734242707"));
        Assert.assertTrue(productInfoList.size() > 0);
    }


    @Test
    public void decreaseStock() throws Exception {
        Cart cart = new Cart("157875227953464068", 2);
        productService.decreaseStock(Arrays.asList(cart));
    }
}