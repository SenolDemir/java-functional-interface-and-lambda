package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Eva");
        names.add("John");
        names.add("James");
        names.add("Jonathan");
        names.add("Frank");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------------------------------");


        names.sort(Comparator.comparing(str -> str.substring(0,1)));

        for (String name : names) {
            System.out.println(name);
        }
        
        names.sort(Comparator.comparingInt(str -> str.length()));
        System.out.println(names);

    }
}
