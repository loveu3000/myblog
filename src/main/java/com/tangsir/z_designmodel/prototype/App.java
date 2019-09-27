package com.tangsir.z_designmodel.prototype;

import java.util.List;

public class App {
    public static void main(String[] args) {
       //OrderApi comOrder = new CompanyOrder();
        OrderApi comOrder = new PersonOrder();
        comOrder.setOrderNum(1456);
        List<OrderApi> list = ProtoType.dealOrder(comOrder);
        System.out.println(list);
    }
}
