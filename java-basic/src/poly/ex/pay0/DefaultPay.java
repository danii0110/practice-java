package poly.ex.pay0;

import com.sun.security.jgss.GSSUtil;

public class DefaultPay implements InterfacePay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
