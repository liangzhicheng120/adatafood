package com.adatafood.product.dao;

import com.adatafood.product.bean.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 商品信息接口
 * @date ${date} ${time}
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findAllByProductStatus(Integer productStatus);
}
