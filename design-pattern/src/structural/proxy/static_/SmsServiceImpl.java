package structural.proxy.static_;

/**
 * @author hucc
 * 2022/3/26 12:38
 */
class SmsServiceImpl implements SmsService {

    @Override
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }

}
