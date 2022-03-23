package codingbat;

import java.util.Arrays;
import java.util.List;

public class DoublingWithReplaceAll {

    public static void main(String[] args) {


        /***
        Given a list of integers, return a list where each integer is multiplied by 2.
        doubling([1, 2, 3]) → [2, 4, 6]
        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
        doubling([]) → []
         */
        List<Integer> numbers = Arrays.asList(6, 8, 6, 8, -1);
        System.out.println(doubling(numbers));



    }

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(t -> t*2);
        return nums;
    }
}
