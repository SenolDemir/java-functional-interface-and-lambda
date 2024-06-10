package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayWithStream {

    public static void main(String[] args) {


        int[] nums = {4,6,7,10,55};

        //sum of numbers in array
        int r = Arrays.stream(nums).sum();
        System.out.println("sum of array is: " + r);

        Integer [] arrs = { 9 , 4 , 23 , 6 , 78 , 4 };

        System.out.println(" ---- distinct() ---------- ");
        //remove same elements from array with distinct()
        System.out.println(Arrays.toString(arrs));
        arrs = Arrays.asList(arrs)
                .stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrs));

        System.out.println(" -----  using map() ---------- ");
        // using lambda with map
        arrs = java.util.Arrays.asList(arrs)
                .stream().map(p -> p*10).collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(java.util.Arrays.toString(arrs));
    }
}
