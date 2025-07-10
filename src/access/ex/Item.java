package access.ex;

public class Item {

    private String name;
    private int price;
    private int num;

    public Item(String name, int price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public int disPlay() {
        System.out.println("상품명 : " + this.name + ", 합계:" + this.price);
        return (this.price * this.num);

    }

}
