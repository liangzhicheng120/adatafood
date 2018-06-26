package com.adatafood.product.enums;

import lombok.Getter;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 商品上下架状态
 * @date ${date} ${time}
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),

    DOWN(1, "下架"),;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
