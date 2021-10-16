package services;

import pojo.Order;

import java.util.ArrayList;
import java.util.List;

public class CustomOperation {
    public static List<Order> createDummyList(){
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order("iPhoneX", 1, 2));
        orderList.add(new Order("Samsung", 1, 1));
        return orderList;
    }
}
