package collection.list.test.ex2;

import java.util.Arrays;

public class ShoppingCart_1 {

    Item[] items;
    private static final int INITAIL_SIZE = 5;
    private int size = 0;

    public ShoppingCart_1() {
        items = new Item[INITAIL_SIZE];
    }

    public void addItem(Item item) {
        if (size == items.length) {
            grow();
        }
        items[size] = item;
        size++;
    }

    public void displayItems() {
        int totalprice = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < size; i++) {
            System.out.println("상품명: " + items[i].getName() + " 합계: " + items[i].getTotalPrice());
            totalprice += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합: " + totalprice);
    }

    private void grow() {
        int new_size = size * 2;
        items = Arrays.copyOf(items, new_size);
    }


}
