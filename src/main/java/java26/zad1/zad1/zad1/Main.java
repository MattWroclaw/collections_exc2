package java26.zad1.zad1.zad1;

import lombok.Data;

import java.util.Map;
import java.util.TreeMap;

@Data
public class Main {
    public static void main(String[] args) {
        // polecenie 1
        //a
      /*  Map<Long, Student> studentMap = new HashMap<>();

        Student student1 = new Student(78987, "jacek", "placek");
        Student student2 = new Student(75653, "tomek", "Bpawe");

        studentMap.put(student1.getNumerIndeksu(),student1);
        studentMap.put(student2.getNumerIndeksu(), student2);

        Student student3 = new Student(100200, "fas", "ead");
        studentMap.put(student3.getNumerIndeksu(), student3);

        System.out.println(studentMap.containsKey(100200));
*/


        Map<Long, Student> studentMap = new TreeMap<>();



        Student student1 = new Student(1231, "a1", "b2");

        studentMap.put(student1.getNumerIndeksu(), student1);



        Student student2 = new Student(1232, "a2", "b3");

        studentMap.put(student2.getNumerIndeksu(), student2);



        Student student3 = new Student(1233, "a3", "b4");

        studentMap.put(student3.getNumerIndeksu(), student3);


        System.out.println(studentMap.containsKey(100200L));
        System.out.println(studentMap.get(100200L));




        Student student4 = new Student(1234, "a4", "b5");

        studentMap.put(student4.getNumerIndeksu(), student4);



        Student student5 = new Student(1235, "a5", "b6");

        studentMap.put(student5.getNumerIndeksu(), student5);



        Student student6 = new Student(100400, "a6", "b1");

        studentMap.put(student6.getNumerIndeksu(), student6);



        Student student7 = new Student(100200, "a7", "b7");

        studentMap.put(student7.getNumerIndeksu(), student7);


        System.out.println(studentMap.containsKey(100400L));
        System.out.println(studentMap.get(100200L));

        // lsta studentow pkt d
        System.out.println(studentMap.size());


        //pkt e
        System.out.println(studentMap.values());

    }
}
