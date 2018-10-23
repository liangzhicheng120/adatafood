package com.adatafood.client.handler;

import com.adatafood.client.bean.DspBidRequest;
import com.adatafood.client.bean.DspBidResponse;
import com.adatafood.client.service.HandlerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liangzhicheng
 * @date 2018/10/23
 */
@Component
@Slf4j
public class AfterHandler implements HandlerService {

    @Override
    public void process(DspBidRequest request,
                        DspBidResponse response) {

    }
}
