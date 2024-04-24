package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int amount = sc.nextInt();
        sc.nextLine();

        ProductOrder_p1[] orders = new ProductOrder_p1[amount];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }
    static ProductOrder_p1 createOrder(String productName, int price, int quantity) {
        ProductOrder_p1 order = new ProductOrder_p1();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder_p1[] orders) {
        for (ProductOrder_p1 order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격:" + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder_p1[] orders) {
        int totalAmount = 0;
        for (ProductOrder_p1 order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
