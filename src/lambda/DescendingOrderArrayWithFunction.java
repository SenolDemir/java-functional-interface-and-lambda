package functional.and.lambda;

import java.util.Arrays;
import java.util.function.Function;

public class DescendingOrderArrayWithFunction {

    public static void main(String[] args) {


        int [] arr = { 9 , 4 , 23 , 6 , 78 , 4 };
        Arrays.sort(arr);
        System. out .println(Arrays. toString (arr));

        System.out.println("---------------------------");

        for ( int i = 0 ; i < arr. length ; i++) {
            for ( int j = 0 ; j < arr. length ; j++) {
                int temp= 0 ;
                if (arr[i] > arr[j]){ // if I change ‘<’ to ‘>’ it will sort from bigger to smaller
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp; } } }
        System. out .println(Arrays. toString (arr));

        System.out.println("--------------------------------------------------");


        int [] array = { 9 , 4 , 23 , 6 , 78 , 4 };

        System. out .println(Arrays. toString (array));

        Function<int[], int[]> descendingOrderArray = a -> {
            int[] result = new int[a.length];
            Arrays.sort(a);
            for (int i = a.length - 1, j=0; i >= 0; i--, j++)
                result[j] = a[i];
            return result;
        };

        System.out.println(Arrays.toString(descendingOrderArray.apply(array)));


    }
}
