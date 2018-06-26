package com.adatafood.product.vo;

import com.adatafood.product.bean.ProductInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 商品信息结果集
 * @date ${date} ${time}
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

    public static ProductInfoVO build(ProductInfo productInfo) {
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productInfoVO.setProductDescription(productInfo.getProductDescription());
        productInfoVO.setProductIcon(productInfo.getProductIcon());
        productInfoVO.setProductId(productInfo.getProductId());
        productInfoVO.setProductName(productInfo.getProductName());
        productInfoVO.setProductPrice(productInfo.getProductPrice());
        return productInfoVO;
    }
}
