package com.adatafood.order.dao;

import com.adatafood.order.bean.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
public interface OrderDetailDao extends JpaRepository<OrderDetail, String> {

}
