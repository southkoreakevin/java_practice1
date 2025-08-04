package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    //code write
    public void add(Product product, Integer number) {
        if (cartMap.containsKey(product)) {
            System.out.println("true");
            Integer i = cartMap.get(product);
            i = i + number;
            cartMap.put(product, i);
        } else {
            cartMap.put(product, number);
        }
    }

    public void printAll() {
        for (Entry<Product, Integer> productIntegerEntry : cartMap.entrySet()) {
            System.out.println(
                productIntegerEntry.getKey() + " 수량: " + productIntegerEntry.getValue());

        }
    }

    public void minus(Product product, Integer number) {
        Integer i = cartMap.get(product) - number;
        if (i == 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, i);
        }
    }


}
