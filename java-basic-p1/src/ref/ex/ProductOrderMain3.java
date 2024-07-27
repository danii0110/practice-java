package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[n] = createOrder(productName, price, quantity);
        }
        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalPrice = getTotalAmount(orders);
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        //ProductOrder를 생성하고 매개변수로 초기값을 설정
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        //마지막으로 생성한 ProductOrder를 반환
        return po;
    }
    static void printOrders(ProductOrder[] orders) {
        //배열을 받아서 배열에 들어있는 전체 ProductOrder의 상품명, 가격, 수량을 출력
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        //배열을 받아서 배열에 들어있는 전체 ProductOrder의 총 결제 금액을 계산하고, 계산 결과를 반환
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
