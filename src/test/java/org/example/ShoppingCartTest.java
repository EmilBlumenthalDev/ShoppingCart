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

    @Test
    void testUpdateTotalCost() {
        double price = 5.0;
        int quantity = 3;
        double expectedTotal = 15.0;
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(expectedTotal, shoppingCart.updateTotalCost(price, quantity));
    }
    
    @Test
    void testAddItems() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(5, shoppingCart.addItems(5));
        assertEquals(8, shoppingCart.addItems(3));
    }

    @Test 
    void testAddItems_throwsIllegalArgumentException() {
        ShoppingCart shoppingCart = new ShoppingCart();
        try {
            shoppingCart.removeItems(1);
        } catch (IllegalArgumentException e) {
            assertEquals("Item count can't be negative", e.getMessage());
        }
    }

    @Test
    void testRemoveItems() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItems(10);
        assertEquals(0, shoppingCart.removeItems(10));
    }
}