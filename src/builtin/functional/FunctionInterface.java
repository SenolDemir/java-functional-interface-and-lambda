package builtin.functional;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {

        Function<String, String> reverse = s -> {
            String result = "";
            for (int i = s.length()-1; i>=0; i--){
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.apply("Hello Java"));


        System.out.println("---------------------------------------");

        Function<int[], int[]> reverseIntArray = arr -> {
            int[] result = new int[arr.length];
            for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
                result[j] = arr[i];
            }
            return result;
        };

        int [] a = {1,2,3,4,5,6};
        int [] b = reverseIntArray.apply(a);
        System.out.println(Arrays.toString(b));

        System.out.println("------------------------------");

        Function<String, Boolean> isPalindrome = s -> reverse.apply(s).equalsIgnoreCase(s);

        System.out.println(isPalindrome.apply("bananab"));

    }
}
