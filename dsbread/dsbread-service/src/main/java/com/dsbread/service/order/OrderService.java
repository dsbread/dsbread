package com.dsbread.service.order;

import com.dsbread.model.order.Orders;
import org.apache.ibatis.annotations.Param;

public interface OrderService {


    Orders selectInfoByOrderNo(@Param("enterpriseId") Long enterpriseId, @Param("orderNo") String orderNo);

}
