package de.neuefische.rem_java21_2.group3.ordersystem.services;

import de.neuefische.rem_java21_2.group3.ordersystem.database.OrderDb;
import de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;

import java.util.List;

public class OrderService {

    private ProductDB productdb = new ProductDB();
    private OrderDb orderdb = new OrderDb();

    public void addOrder(Order newOrder) {

    }

    public List<Order> listOrders() {
        return null;
    }
}
