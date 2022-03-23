package codingbat;

import java.util.Arrays;
import java.util.List;

public class CopiesWithReplaceAll {

    public static void main(String[] args) {

        List<String> copies = Arrays.asList("abc", "de", "xyz");

        copies.replaceAll(n -> n.concat(n).concat(n));
        System.out.println(copies);

        copies.replaceAll(n -> "y"+n+"y");
        System.out.println(copies);

    }
}
