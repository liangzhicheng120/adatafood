package com.adatafood.product.vo;

import com.adatafood.product.bean.ProductCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 商品结果集
 * @date ${date} ${time}
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    List<ProductInfoVO> productInfoVOList;

    public static ProductVO build(ProductCategory productCategory) {
        ProductVO productVO = new ProductVO();
        productVO.setCategoryName(productCategory.getCategoryName());
        productVO.setCategoryType(productCategory.getCategoryType());
        return productVO;
    }

}
