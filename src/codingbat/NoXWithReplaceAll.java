package codingbat;

import java.util.ArrayList;
import java.util.List;

public class NoXWithReplaceAll {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("ali");
        strings.add("veli");
        strings.add("xaomi");
        strings.add("xman");
        System.out.println(noX(strings));


    }
    public static List<String> noX(List<String> strings) {
        strings.replaceAll( t -> t.replace("x", ""));
        return strings;
    }

}
