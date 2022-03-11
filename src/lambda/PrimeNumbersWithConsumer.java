package functional.and.lambda;

import java.util.function.Consumer;

public class PrimeNumbersWithConsumer {

    public static void main(String[] args) {

        /***
         * Kendinden baska sayılara bolunemeyen sayılar
         *
         * Prime numbers from 1 to 100 are :
         * 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

        int num =0;
        String  primeNumbers = "";

        for (int i = 1; i <= 100; i++){
            int counter=0;
            for(int num =i; num>=1; num--)
            {
                if(i%num==0)
                    counter = counter + 1;
            }
            if (counter ==2){
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);

         */

        System.out.println("---------------------------------------");

        Consumer<Integer> primeNumber = n -> {
            System.out.println("Prime numbers from 1 to " + n + " are :");
            for (int j = 1; j <n ; j++) {
                int count = 0;
                for(int m=j; m>=1; m--){
                    if(j%m==0)
                        count+=1;
                }if(count==2)
                    System.out.print(j + " ");
            }
            System.out.println();
        };

        primeNumber.accept(100);

        System.out.println("----------------------------------");

            // Classical Way
            primeNumbers(100);


    }

    public static void primeNumbers(int num){
        System.out.println("Prime numbers from 1 to "+num+ " are :");
        for (int i = 1; i < num; i++) {
            int count = 0;
            for (int j = i; j >=1; j--) {
                if(i%j==0)
                    count+=1;
            }if (count==2)
                System.out.print(i + " ");
        }
        System.out.println();
    }


}
