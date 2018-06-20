package com.adatafood.order.dao;

import com.adatafood.order.OrderApplicationTests;
import com.adatafood.order.bean.OrderMaster;
import com.adatafood.order.enums.OrderStatusEnum;
import com.adatafood.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Component
public class OrderMasterDaoTest extends OrderApplicationTests {
    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerAddress("广东省珠海市");
        orderMaster.setBuyerName("马云");
        orderMaster.setBuyerOpenid("123");
        orderMaster.setBuyerPhone("123456789012");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.SUCCESS.getCode());
        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertTrue(result != null);
    }
}