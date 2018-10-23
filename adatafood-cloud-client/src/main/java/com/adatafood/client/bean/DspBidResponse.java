package com.adatafood.client.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author liangzhicheng
 * @date 2018/10/22
 */
@Data
public class DspBidResponse {

    /**
     * 最终中选的广告位
     */
    List<Long> slodIds = Arrays.asList(1L, 2L, 3L);
}
