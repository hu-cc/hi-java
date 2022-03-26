package structural.proxy.dynamic.cglib;

/**
 * @author hucc
 * 2022/3/26 13:41
 */
class SmsService {

    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }

}
