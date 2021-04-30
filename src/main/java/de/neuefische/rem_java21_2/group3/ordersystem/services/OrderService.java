package de.neuefische.rem_java21_2.group3.ordersystem.services;

import de.neuefische.rem_java21_2.group3.ordersystem.database.OrderDb;
import de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderService {

    private ProductDB productdb = new ProductDB(new HashMap<String, Product>());

    private OrderDb orderdb = new OrderDb(new ArrayList<>());

    public void addOrder(Product[] products) {

    }

    public List<Order> listOrders() {
        return null;
    }
}
