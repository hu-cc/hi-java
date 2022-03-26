package structural.proxy.dynamic.jdk_;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hucc
 * 2022/3/26 12:48
 */
class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after method: " + method.getName());
        return result;
    }

}
