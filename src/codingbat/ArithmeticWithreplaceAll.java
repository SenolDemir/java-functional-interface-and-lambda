package codingbat;

import java.util.Arrays;
import java.util.List;

public class ArithmeticWithreplaceAll {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3);
        nums.replaceAll(n -> (n+1)*10);
        System.out.println(nums);

    }
}
