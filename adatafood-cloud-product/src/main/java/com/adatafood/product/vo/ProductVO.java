package com.adatafood.product.vo;

import com.adatafood.product.bean.ProductCategory;
import com.adatafood.product.bean.ProductInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
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

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;

    public static ProductVO build(List<ProductInfo> productInfoList, ProductCategory productCategory) {
        ProductVO productVO = new ProductVO();
        productVO.setCategoryName(productCategory.getCategoryName());
        productVO.setCategoryType(productCategory.getCategoryType());
        List<ProductInfoVO> productInfoVOList = new ArrayList<>();
        for (ProductInfo productInfo : productInfoList) {
            if (productInfo.getCategoryType() == productCategory.getCategoryType()) {
                ProductInfoVO productInfoVO = ProductInfoVO.build(productInfo);
                productInfoVOList.add(productInfoVO);
            }
        }
        productVO.setProductInfoVOList(productInfoVOList);
        return productVO;
    }

}
