package functional.and.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class RemoveIf {

    public static void main(String[] args) {

        /***
        Given a list of strings, return a list of the strings,
         omitting any string that contains a "z".
         (Note: the str.contains(x) method returns a boolean)

        noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
        noZ(["hziz", "hzello", "hi"]) → ["hi"]
        noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]

         */

        List<String> words1 = new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"));
        List<String> words2 = new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"));
        List<String> words3 = new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"));

        BiFunction<List<String>, String, List<String>> removeIfContains = (a,b) -> {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < a.size(); i++)
                if(!a.get(i).contains(b))
                    result.add(a.get(i));
            return  result;
        };

        System.out.println(removeIfContains.apply(words1, "z"));
        System.out.println(removeIfContains.apply(words2, "i"));

        System.out.println("------------------------------------");

        words1.removeIf( p -> p.contains("z"));
        words2.removeIf( p -> p.contains("z"));
        words3.removeIf( p -> p.contains("z"));

        System.out.println(words1);
        System.out.println(words2);
        System.out.println(words3);

        System.out.println("------------------------------------");

        words1.stream().filter( p -> p.contains("z")).collect(Collectors.toList());
        words2.stream().filter( p -> p.contains("z")).collect(Collectors.toList());
        words3.stream().filter( p -> p.contains("z")).collect(Collectors.toList());

        System.out.println(words1);
        System.out.println(words2);
        System.out.println(words3);

        System.out.println("-------------------------------------");

        /***
        Given a list of strings, return a list of the strings, omitting any string length 4 or more.


        noLong(["this", "not", "too", "long"]) → ["not", "too"]
        noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
        noLong(["cccc", "cccc", "cccc"]) → []
         ***/

        List<String> words4 = new ArrayList<>(Arrays.asList("this", "not", "too", "long"));
        List<String> words5 = new ArrayList<>(Arrays.asList("a", "bbb", "cccc"));
        List<String> words6 = new ArrayList<>(Arrays.asList("cccc", "cccc", "cccc"));

        words4.removeIf( p -> p.length()>=4);
        words5.removeIf( p -> p.length()>=4);
        words6.removeIf( p -> p.length()>=4);

        System.out.println(words4);
        System.out.println(words5);
        System.out.println(words6);


    }
}
