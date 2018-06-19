package com.adatafood.product.service.impl;


import com.adatafood.product.bean.ProductInfo;
import com.adatafood.product.dao.ProductInfoDao;
import com.adatafood.product.enums.ProductStatusEnum;
import com.adatafood.product.service.ProductService;
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
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findAllByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
