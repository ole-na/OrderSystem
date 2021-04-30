package de.neuefische.rem_java21_2.group3.ordersystem.database;

import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {

    private static Arguments[] provideTestListArguments() {
        return new Arguments[]{
                Arguments.of(
                        new HashMap<String, Product>(Map.ofEntries(
                                entry("1", new Product("1", "Chocolate")),
                                entry("2", new Product("2", "Skateboard")),
                                entry("3", new Product("3", "Teddy Bear"))
                        )),
                        new HashMap<String, Product>(Map.ofEntries(
                                entry("1", new Product("1", "Chocolate")),
                                entry("2", new Product("2", "Skateboard")),
                                entry("3", new Product("3", "Teddy Bear"))
                        ))
                )
        };
    }

    @ParameterizedTest
    @DisplayName("list() returns all products from DB")
    @MethodSource("provideTestListArguments")
    void list(Map<String, Product> givenProducts, Map<String, Product> expectedProducts) {
        // Given
        ProductDB productDB = new ProductDB(givenProducts);

        //When
        Map<String, Product> products = productDB.list();

        //Then
        assertEquals(expectedProducts, products);
    }

    @ParameterizedTest
    @CsvSource({"1", "2"})
    void get(String givenId) {
        //Given
        Map<String, Product> products = new HashMap<>(Map.ofEntries(
                entry("1", new Product("1", "Chocolate")),
                entry("2", new Product("2", "Skateboard")),
                entry("3", new Product("3", "Teddy Bear"))
        ));
        Product expected = products.get(givenId);
        ProductDB productDB = new ProductDB(products);

        //When
        Product actual = productDB.get(givenId);

        //Then
        assertEquals(actual, expected);
    }
}