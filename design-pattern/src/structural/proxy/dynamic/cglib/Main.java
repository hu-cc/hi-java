package structural.proxy.dynamic.cglib;

/**
 * @author hucc
 * 2022/3/26 13:45
 */
public class Main {

    public static void main(String[] args) {
        SmsService smsService = (SmsService) CglibProxyFactory.getProxy(SmsService.class);
        smsService.send("java");
    }

}
