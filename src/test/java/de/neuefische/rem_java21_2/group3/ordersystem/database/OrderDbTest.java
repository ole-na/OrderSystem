package de.neuefische.rem_java21_2.group3.ordersystem.database;

import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
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

    @ParameterizedTest
    @CsvSource({"0", "1"})
    void get(String givenId) {

        //Given
        List<Order> expectedOrderList = List.of(new Order("0",new Product[3]), new Order("1",new Product[3]));

        Order expected = expectedOrderList.get(Integer.parseInt(givenId));
        OrderDb orderDb = new OrderDb(expectedOrderList);

        //When
        Order actual = orderDb.get(givenId);

        //Then
        assertEquals(actual, expected);
    }

    @Test
    void add() {
    }
}