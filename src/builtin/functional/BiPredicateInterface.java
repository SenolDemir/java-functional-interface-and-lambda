package builtin.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateInterface {

    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, e) -> {
            for (int each : arr)
                if (each == e)
                    return true;
            return false;
        };

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean b1 = contains.test(array, 9);
        System.out.println(b1);

        System.out.println("-------------------------------------");


        BiPredicate<String, String> anagram = (s1, s2) -> {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        };

        boolean b2 = anagram.test("heart", "earth");
        System.out.println(b2);


        System.out.println("-------------------------------------");


        BiPredicate<List<Integer>, Integer> isDuplicated = (l, e) -> Collections.frequency(l, e) > 1;

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7));

        list.forEach(n -> {
            if (!isDuplicated.test(list, n))
                System.out.print(n + " ");
        });

        System.out.println();

    }
}
