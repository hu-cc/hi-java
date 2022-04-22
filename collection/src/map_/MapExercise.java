package map_;

import java.util.*;

/**
 * @author hucc
 * 2022/3/27 13:51
 */
public class MapExercise {

    public static void main(String[] args) {
        HashMap<String, Staff> hashMap = new HashMap<>();
        hashMap.put("a001", new Staff("Tom", 10000, "a001"));
        hashMap.put("c003", new Staff("Jack", 18000, "c003"));
        hashMap.put("b002", new Staff("Lucy", 19000, "b002"));

        Collection<Staff> values = hashMap.values();
        for(Staff object : values) {
            if (object.getSal() > 18000) {
                System.out.println(object);
            }
        }

        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            Staff staff = hashMap.get(key);
            if (staff.getSal() > 18000) {
                System.out.println(hashMap.get(key));
            }
        }

        Set<Map.Entry<String, Staff>> set = hashMap.entrySet();
        for (Map.Entry<String, Staff> stringStaffEntry : set) {
            Staff staff = (Staff) ((Map.Entry<?, ?>) stringStaffEntry).getValue();
            if (staff.getSal() > 18000) {
                System.out.println(staff);
            }
        }

    }

}

class Staff {

    private String name;
    private int sal;
    private String id;

    public Staff(String name, int sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
