package structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author hucc
 * 2022/3/26 13:43
 */
class CglibProxyFactory {

    public static Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new DebugMethodInterceptor());
        return enhancer.create();
    }

}
