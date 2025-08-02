package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount = 0;


    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].disPlay();
        }
        System.out.println("총액은 : " + sum);
    }
}
