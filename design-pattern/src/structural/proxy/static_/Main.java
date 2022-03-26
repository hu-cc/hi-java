package structural.proxy.static_;

/**
 * @author hucc
 * 2022/3/26 12:40
 */
public class Main {

    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }

}
