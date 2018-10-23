package com.adatafood.client.service;

import com.adatafood.client.bean.DspBidRequest;
import com.adatafood.client.bean.DspBidResponse;

/**
 * @author liangzhicheng
 * @date 2018/10/22
 */
public interface HandlerService {

    void process(final DspBidRequest request, final DspBidResponse response);
}
