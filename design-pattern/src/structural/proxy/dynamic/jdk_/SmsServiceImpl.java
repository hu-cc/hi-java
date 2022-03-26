package structural.proxy.dynamic.jdk_;

/**
 * @author hucc
 * 2022/3/26 12:47
 */
class SmsServiceImpl implements SmsService {

    @Override
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }

}
