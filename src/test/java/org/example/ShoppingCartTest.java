package org.example;

import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @Test
    void testEnglishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "US"));
        assertEquals("Enter the number of items to purchase:", rb.getString("prompt.items"));
    }

    @Test
    void testFinnishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("fi", "FI"));
        assertEquals("Anna ostettavien tuotteiden määrä:", rb.getString("prompt.items"));
    }

    @Test
    void testSwedishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("sv", "SE"));
        assertEquals("Ange antalet varor att köpa:", rb.getString("prompt.items"));
    }

    @Test
    void testJapaneseBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("ja", "JP"));
        assertEquals("購入する商品の数を入力してください:", rb.getString("prompt.items"));
    }

    // Objective: Create unit tests using JUnit 5 to verify the key functionalities of the application (e.g., calculating the
    // total cost for each item, calculating the total cost of the cart).
    @Test
    void testCalculateTotalCost() {
        double price = 5.0;
        int quantity = 3;
        double expectedTotal = 15.0;
        assertEquals(expectedTotal, ShoppingCart.calculateTotalCost(price, quantity));
    }
}