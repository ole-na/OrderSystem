package de.neuefische.rem_java21_2.group3.ordersystem.database;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;

import java.util.*;

public class OrderDb {
    private List<Order> orderList = new ArrayList<>();

    public OrderDb(List<Order> orderList) {
        this.orderList.addAll(orderList);
    }

    public List<Order> list(){
        return orderList;
    }

    public Order get(String orderId){
        if (orderId == null){
            return null;
        }
        for (Order order: orderList) {

            if (orderId.equals(order.getId())){
                return order;
            }
        }
        return null;
    }

    public void add(Order newOrder){
        orderList.add(newOrder);
    }
}
