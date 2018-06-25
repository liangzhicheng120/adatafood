package com.adatafood.product.exception;

import com.adatafood.product.enums.ResultEnum;

/**
 * Created by liangzhicheng on 2018-06-25.
 */
public class ProductException extends RuntimeException {
    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
