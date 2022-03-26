package collection_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author hucc
 * 2022/3/25 22:57
 */
public class HashSetExercise {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("Tom", 16));
        hashSet.add(new Employee("Tom", 16));
        hashSet.add(new Employee("Tom", 16));
        System.out.println(hashSet);

    }

}

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
