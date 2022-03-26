package structural.proxy.dynamic.jdk_;

import java.lang.reflect.Proxy;

/**
 * @author hucc
 * 2022/3/26 13:33
 */
class JdkProxyFactory {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }

}
