package de.neuefische.rem_java21_2.group3.ordersystem.database;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;

import java.util.*;

public class OrderDb {

    private List<Order> orderList = new ArrayList<>();

    public OrderDb(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> list(){
        return orderList;
    }

    public Order get(String orderId){
        return null;
    }

    public void add(Order newOrder){
    }

}
