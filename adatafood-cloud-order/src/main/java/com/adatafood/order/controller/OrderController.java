package com.adatafood.order.controller;

import com.adatafood.order.param.OrderParam;
import com.adatafood.order.service.OrderService;
import com.adatafood.order.util.CheckUtil;
import com.adatafood.order.vo.WebResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "消费")
    @PostMapping("/create")
    public WebResultVO create(@Valid OrderParam orderParam, BindingResult bindingResult) {
        CheckUtil.checkParams(bindingResult, orderParam);
        return new WebResultVO();
    }

}
