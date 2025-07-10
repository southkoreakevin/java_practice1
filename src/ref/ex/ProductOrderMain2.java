package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("갯수 입력 :");
        int num = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[num];
        String productName;
        int price;
        int quantity;

        for (int i = 0; i < num; i++) {
            System.out.print("product name: ");
            productName = scanner.nextLine();
            System.out.print("product price: ");
            price = scanner.nextInt();
            System.out.print("product quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName, price, quantity);

        }
        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println(total);
    }


    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println(
                "productName : " + orders[i].productName + "price: " + orders[i].price +
                    "quantity: " + orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalamout = 0;
        for (int i = 0; i < orders.length; i++) {
            totalamout += orders[i].price * orders[i].quantity;
        }
        return totalamout;
    }

}

