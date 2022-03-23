package builtin.functional.interfaces;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {

        Supplier<String> returnCybertek = () -> "Cybertek";

        System.out.println( returnCybertek.get());

        System.out.println("---------------------------------------------");

        Supplier<int[]> returnIntArray = () -> {
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(1000);
            }
            return arr;
        };

        System.out.println(Arrays.toString(returnIntArray.get()));
    }
}
