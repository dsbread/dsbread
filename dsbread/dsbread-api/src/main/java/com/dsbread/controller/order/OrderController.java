package com.dsbread.controller.order;


import com.dsbread.model.order.Orders;
import com.dsbread.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("userInfo")
    public Orders getOrderInfo(Long enterpriseId , String orderNo){
        return orderService.selectInfoByOrderNo(enterpriseId,orderNo);
    }

}
