package com.adatafood.client.cache.impl;

import com.adatafood.client.cache.DataCache;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * @author liangzhicheng
 * @date 2018/10/23
 */
@Repository
@Slf4j
public class DataCacheImpl implements DataCache {

    private SetMultimap<Long, Long> ids = ImmutableSetMultimap.of();

    @Scheduled(initialDelay = 0, fixedRate = 1000)
    @Override
    public void load() {
        Multimap<Long, Long> idsMap = HashMultimap.create();
        idsMap.put(1L, 2L);
        idsMap.put(3L, 4L);
        ids = ImmutableSetMultimap.copyOf(idsMap);
        log.info("load");
    }

    @Override
    public Set<Long> get(Long id) {
        return ids.get(id);
    }
}
