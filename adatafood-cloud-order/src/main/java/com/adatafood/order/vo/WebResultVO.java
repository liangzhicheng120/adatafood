package com.adatafood.order.vo;

import lombok.Data;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Data
public class WebResultVO {

    /**
     * 错误码
     */
    private Integer code = 200;
    /**
     * 提示信息
     */
    private String msg = "";
    /**
     * 具体内容
     */
    private Object value;
    /**
     * 重定向地址
     */
    private String redirect = "";

    public WebResultVO() {

    }

    public WebResultVO(Object value) {
        this.value = value;
    }
}