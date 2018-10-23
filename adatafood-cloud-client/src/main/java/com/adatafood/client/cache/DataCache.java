package com.adatafood.client.cache;

import java.util.Set;

/**
 * @author liangzhicheng
 * @date 2018/10/23
 */
public interface DataCache {

    void load();

    Set<Long> get(Long id);

}
