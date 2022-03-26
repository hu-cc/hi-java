package structural.proxy.dynamic.jdk_;

/**
 * @author hucc
 * 2022/3/26 13:34
 */
public class Main {

    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }

}
