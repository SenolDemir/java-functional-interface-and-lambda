package functional.and.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class RemoveDuplicatedinString {

    public static void main(String[] args) {


        BiPredicate<List<Integer>, Integer> isDuplicated = (l, e) -> Collections.frequency(l, e) > 1;

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,4,5,6,6,7));

        list.forEach( n -> {
            if(!isDuplicated.test(list, n))
                System.out.print(n+" ");
        });

        System.out.println();

        System.out.println("--------------------------------------------------------");

        String str= "AAABBBCCC" ;

        String result = "" ;
        for ( int i = 0 ; i <str.length() ; i++) {
            for ( int j = 0 ; j <str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j)){
                    result += str.charAt(i);
                    str = str.replaceAll( "" +str.charAt(i), "" );
                } }
            System. out .println(result); }

        System.out.println("-----------------------------------------------");

        String str2= "AAABBBCCC" ;

        Function<String, String> removeDuplicated = s -> {
            String r = "";
            for (int i = 0; i < s.length() ; i++)
                if(!r.contains(String.valueOf(s.charAt(i))))
                    r += s.charAt(i);
            return r;
        };
        System.out.println(removeDuplicated.apply(str2));





    }
}
