package com.adatafood.client.handler;

import com.adatafood.client.bean.DspBidRequest;
import com.adatafood.client.bean.DspBidResponse;
import com.adatafood.client.cache.DataCache;
import com.adatafood.client.service.HandlerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/**
 * @author liangzhicheng
 * @date 2018/10/22
 */
@Component
@Slf4j
public class TestHandler implements HandlerService {

    @Resource
    private ExecutorService biddingThreadpool;

    @Resource
    private DataCache dataCache;

    @Override
    public void process(DspBidRequest request,
                        DspBidResponse response) {

        System.out.println(dataCache.get(1L));
        response.setSlodIds(new ArrayList<>(dataCache.get(1L)));

    }

}
