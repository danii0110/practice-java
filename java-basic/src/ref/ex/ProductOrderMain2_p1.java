package ref.ex;

public class ProductOrderMain2_p1 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder_p1[] orders = new ProductOrder_p1[3];

        //createOrder()를 여러 번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        //printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        //getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        //총 결제 금액 출력
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
