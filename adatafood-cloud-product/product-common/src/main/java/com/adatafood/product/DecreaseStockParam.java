package com.adatafood.product;

import lombok.Data;

/**
 * 减库存入参
 */
@Data
public class DecreaseStockParam {

    /**
     * 商品类别
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockParam() {
    }

    public DecreaseStockParam(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}