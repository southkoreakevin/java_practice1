package class1;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders;

        ProductOrder productOrder1 = new ProductOrder();

        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();

        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();

        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        productOrders = new ProductOrder[]{productOrder1, productOrder2, productOrder3};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(
                "상품명: " + productOrders[i].productName + " 가격: " + productOrders[i].price +
                    "갯수 :" + productOrders[i].quantity);
            sum += productOrders[i].price * productOrders[i].quantity;
        }
        System.out.println(sum);
    }

}
