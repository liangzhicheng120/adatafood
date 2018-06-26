package com.adatafood.order.util;

import com.adatafood.order.enums.ResultEnum;
import com.adatafood.order.exception.OrderException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Slf4j
public class CheckUtil {

    public static void checkParams(BindingResult bindingResult, Object obj) {
        if (bindingResult.hasErrors()) {
            log.error("参数不正确, {}={}", obj.getClass(), obj);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
    }
}
