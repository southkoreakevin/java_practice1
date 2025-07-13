package extends1.ex1;

public class Item {

    String name;
    int price;

    public void print() {
        System.out.println("이름: " + this.name + "가격: " + this.price);
    }

    public int getPrice() {
        return price;
    }

}
