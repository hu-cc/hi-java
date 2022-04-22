import javafx.util.Pair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hucc
 * 2022/4/9 23:24
 */
public class AliHandbook {
    public static void main(String[] args) {
//        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
//        pairArrayList.add(new Pair<>("version", 12.10));
//        pairArrayList.add(new Pair<>("version", 12.19));
//        pairArrayList.add(new Pair<>("version", 6.28));
//
//        Map<String, Double> map = pairArrayList.stream()
//                .collect(Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));
//        System.out.println(map);

        float a = 1.0F - 0.9F;
        float b = 0.9F - 0.8F;
        float diff = 1e-6F;

        if (Math.abs(a - b) < diff) {
            System.out.println("a == b");
        }

        BigDecimal x = new BigDecimal("1.0");
        BigDecimal y = new BigDecimal("0.9");
        BigDecimal z = new BigDecimal("0.8");

        BigDecimal foo = x.subtract(y);
        BigDecimal bar = y.subtract(z);

        if (foo.compareTo(bar) == 0) {
            System.out.println(true);
        }

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if ("1".equals(item)) {
//                iterator.remove();
//            }
//        }

//        list.removeIf("1"::equals);

        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);

    }
}
