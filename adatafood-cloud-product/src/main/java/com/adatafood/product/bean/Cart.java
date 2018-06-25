package com.adatafood.product.bean;

import lombok.Data;

/**
 * 扣库存
 */
@Data
public class Cart {
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public Cart() {
    }

    public Cart(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

