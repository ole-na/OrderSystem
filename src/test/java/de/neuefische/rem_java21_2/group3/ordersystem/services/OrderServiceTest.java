package de.neuefische.rem_java21_2.group3.ordersystem.services;
import de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private static Arguments[] provideTestAddOrderArguments(){
        return new Arguments[]{
                Arguments.of((Object) new String[]{},
                        new ArrayList<Order>()),
                Arguments.of((Object) new String[]{"1"},
                        new ArrayList<Order>(List.of(new Order("1", new Product[]{})))),
                Arguments.of((Object) new String[]{"-1"},
                        new ArrayList<Order>())
        };
    }

    @ParameterizedTest
    @MethodSource("provideTestAddOrderArguments")
    void addOrder(String[] givenProducts, List<Order> expected) {
        //Given
        ProductDB z = new ProductDB(new HashMap<String, Product>(Map.of("1", new Product("1", "Teddy"))));
        OrderService testOrderService = new OrderService(z);

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