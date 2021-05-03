package de.neuefische.rem_java21_2.group3.ordersystem;

import de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;
import de.neuefische.rem_java21_2.group3.ordersystem.services.OrderService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB.*;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("t1", "Teddy Bear");
        Product product2 = new Product("t2", "Ball");
        Product product3 = new Product("t3", "Eisenbahn");
        Product product4 = new Product("t4", "Fahrrad");
        Product product5 = new Product("w5", "Bleistift");
        Product product6 = new Product("w6", "Kugelschreiber");
        Product product7 = new Product("w7", "Pinsel");

        Map<String, Product> products = new HashMap<>();

        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
        products.put(product4.getId(), product4);
        products.put(product5.getId(), product5);
        products.put(product6.getId(), product6);
        products.put(product7.getId(), product7);

        ProductDB productDB = new ProductDB(products);
        OrderService orderService = new OrderService(productDB);
        System.out.println("All products: " + Main.listProducts(productDB));
        Main.orderProducts(orderService, new String[]{"t1", "t3"});
        System.out.println("All orders: " + Main.listOrders(orderService));
    }

    public static Map listProducts(ProductDB productDB) {
        return productDB.list();
    }

    public static void orderProducts(OrderService orderService, String[] productIds) {
        orderService.addOrder(productIds);
    }

    public static List<Order> listOrders(OrderService orderService) {
        return orderService.listOrders();
    }
}
