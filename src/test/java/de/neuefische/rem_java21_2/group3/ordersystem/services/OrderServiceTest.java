package de.neuefische.rem_java21_2.group3.ordersystem.services;

import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void addOrder() {
    }

    @Test
    void testListOrders() {

        //Given
        OrderService testOrderService = new OrderService();
        List<Order> expected = new ArrayList<Order>();

        //When
        List<Order> actual = testOrderService.listOrders();

        //Then
        assertEquals(expected, actual);
    }
}