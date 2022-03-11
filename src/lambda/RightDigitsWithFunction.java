package functional.and.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class RightDigitsWithFunction {

    public static void main(String[] args) {

        /**
        Given a list of non-negative integers, return an integer list of the rightmost digits.
        (Note: use %)

        rightDigit([1, 22, 93]) → [1, 2, 3]
        rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
        rightDigit([10, 0]) → [0, 0]
         */

        int[] arr = {16, 8,886, 8,1};
        int[] arr2 = {1, 22, 93};
        int[] arr3 = {10, 0};

        int ist = 886%10;
        System.out.println(ist);




        Function<int[], List<Integer>> arrayToList = a -> {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < a.length; i++)
                list.add(a[i]);
            return list;
        };

        List<Integer> list = arrayToList.apply(arr);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        Function<int[], List<Integer>> reverseArrayToList = a -> {
            List<Integer> result = new ArrayList<>();
            for (int i = a.length-1; i>=0; i--)
                result.add(a[i]);
            return result;
        };

        List<Integer> list2 = reverseArrayToList.apply(arr);
        System.out.println(list2);

        System.out.println("-----------------------------------------");

        Function<int[], int[]> rightDigits = ar -> {
            int[] result = new int[ar.length];
            for (int i = 0; i < ar.length; i++) {
                result[i] = ar[i]%10;
            }
            return result;
        };

        int[] newArr = rightDigits.apply(arr);
        System.out.println(Arrays.toString(newArr));

        System.out.println(Arrays.toString(rightDigits.apply(arr2)));
        System.out.println(Arrays.toString(rightDigits.apply(arr3)));


    }
}
