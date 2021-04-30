package de.neuefische.rem_java21_2.group3.ordersystem.database;

import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDbTest {

    @Test
    void list() {

        // Given
        List<Order> expectedOrderList = List.of(new Order("1",new Product[3]), new Order("2",new Product[3]));

        OrderDb givenOrderDb = new OrderDb(expectedOrderList);

        // When

        List<Order> actual = givenOrderDb.list();

        // Then

        assertEquals(expectedOrderList,actual);


    }

    @Test
    void get() {
    }

    @Test
    void add() {
    }
}