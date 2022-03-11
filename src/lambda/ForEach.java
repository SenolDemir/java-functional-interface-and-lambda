package functional.and.lambda;

import java.util.*;

public class ForEach {

    public static void main(String[] args) {
        List<String> myNames = Arrays.asList("Yusuf", "Sefa", "SEZER");
        myNames.forEach((t) -> System.out.println(t + " -> " + t.length()));

        List<Integer> nums = Arrays.asList(1,2,3,4,5,15);
        nums.forEach((n) -> System.out.println(n*10));

        //nums.forEach(n -> System.out.println(n<10));  // give boolean output




        List<String> items = new ArrayList<>();

        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");

        items.forEach((String name) -> {
            System.out.println(name);
        });

    }
}
