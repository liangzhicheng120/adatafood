package com.adatafood.product.dao;

import com.adatafood.product.ProductApplicationTests;
import com.adatafood.product.bean.ProductInfo;
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
 * @Description: 商品信息查询
 * @date ${date} ${time}
 */
@Component
public class ProductInfoDaoTest extends ProductApplicationTests {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void findAllByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = productInfoDao.findAllByProductStatus(0);
        assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void findByProductIdIn() throws Exception {
        List<ProductInfo> productInfoList = productInfoDao.findByProductIdIn(Arrays.asList("157875227953464068", "164103465734242707"));
        assertTrue(productInfoList.size() > 0);
    }

}