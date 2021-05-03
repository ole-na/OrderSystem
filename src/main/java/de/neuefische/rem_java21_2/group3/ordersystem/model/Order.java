package de.neuefische.rem_java21_2.group3.ordersystem.model;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private String id;
    private Product[] products;

    public Order(String id, Product[] products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}