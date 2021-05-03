package de.neuefische.rem_java21_2.group3.ordersystem.services;
import de.neuefische.rem_java21_2.group3.ordersystem.database.OrderDb;
import de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OrderService {
    private ProductDB productdb = new ProductDB(new HashMap<>());
    private OrderDb orderdb = new OrderDb(new ArrayList<>());

    public OrderService(ProductDB productdb) {
        this.productdb = productdb;
    }

    public OrderService(){}

    public void addOrder(String[] productIds) {
        if(productIds != null && productIds.length > 0){
            Product[] products = new Product[productIds.length];
            for(int i = 0; i < productIds.length; i++){
                Optional<Product> product = productdb.get(productIds[i]);
                if(product.isEmpty()){
                    return;
                } else {
                    products[i] = product.get();
                }
            }
            String orderId = String.valueOf(orderdb.list().size() + 1);
            Order xy = new Order(orderId, products);
            orderdb.add(xy);
        }

    }

    public List<Order> listOrders() {
        return orderdb.list();
    }
}
