package typeinfo;

import java.lang.reflect.Method;

/**
 * @author hucc
 * 2021/12/23 23:00
 */
public class Reflection {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("typeinfo.Reflection");
            Class[] partTypes = new Class[2];
            partTypes[0] = Integer.TYPE;
            partTypes[1] = Integer.TYPE;
            Method method = clazz.getMethod("add", partTypes);

            Reflection reflection = new Reflection();
            Object[] argList = new Object[2];
            argList[0] = 37;
            argList[1] = 47;
            Object ret = method.invoke(reflection, argList);
            Integer val = (Integer) ret;
            System.out.println(val.intValue());
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }

    public int add(int a, int b) {
        return a + b;
    }

}
