package com.adatafood.client.controller;

import com.adatafood.client.bean.DspBidRequest;
import com.adatafood.client.bean.DspBidResponse;
import com.adatafood.client.service.HandlerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liangzhicheng
 * @date 2018/10/22
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private List<HandlerService> testServiceHandler;

    @GetMapping("/get")
    public void get() {
        DspBidRequest request = new DspBidRequest();
        DspBidResponse response = new DspBidResponse();
        for (HandlerService handler : testServiceHandler)
        {
            handler.process(request, response);
        }

    }

}
