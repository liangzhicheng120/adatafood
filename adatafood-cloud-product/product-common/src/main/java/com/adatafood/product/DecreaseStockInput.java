package com.adatafood.product;

import lombok.Data;

/**
 * 减库存入参
 */
@Data
public class DecreaseStockInput {

    /**
     * 商品类别
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}