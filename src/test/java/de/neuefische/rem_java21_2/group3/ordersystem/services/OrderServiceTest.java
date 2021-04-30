package de.neuefische.rem_java21_2.group3.ordersystem.services;

import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private static Arguments[] provideTestAddOrderArguments(){
        return new Arguments[]{
                Arguments.of((Object) new Product[]{}),
                Arguments.of((Object) new Product[]{new Product("1", "Teddy")}),
                Arguments.of((Object) new Product[]{new Product("-1", "Teddy")})
        };
    }

    @ParameterizedTest
    @MethodSource("provideTestAddOrderArguments")
    void addOrder(Product[] givenProducts) {

        //Given
        OrderService testOrderService = new OrderService();
        Order newOrder = new Order("1", givenProducts);
        List<Order> expected = List.of(newOrder);

        //When
        testOrderService.addOrder(givenProducts);
        List<Order> actual = testOrderService.listOrders();

        //Then
        assertEquals(expected, actual);

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