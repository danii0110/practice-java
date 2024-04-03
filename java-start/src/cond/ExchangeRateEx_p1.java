package cond;

public class ExchangeRateEx_p1 {
    public static void main(String[] args) {
        int dollar = 5;
        System.out.println("dollar = " + dollar);

        if(dollar < 0) System.out.println("잘못된 금액입니다.");
        else if(dollar == 0) System.out.println("환전할 금액이 없습니다.");
        else {
            int total = dollar * 1300;
            System.out.println("환전 금액은 " + total + "원입니다.");
        }
    }
}
