package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hucc
 * 2022/2/25 10:12
 */
@SuppressWarnings({"all"})
public class TryList {

    public static void main(String[] args) {
         List list = new ArrayList();
         for (int i = 0; i < 10; i++) {
             list.add(i);
         }
         for (int i = 10; i < 15; i++) {
             list.add(i);
         }
         list.add(100);
         list.add(200);
         list.add(null);
    }

}
