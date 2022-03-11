package functional.and.lambda;

import java.util.function.Consumer;

public class FibonacciWithConsumer {

    public static void main(String[] args) {

        Consumer<Integer> fibonacci = e -> {
            int sum, t1 = 0, t2=1;
            while(t1<=e) {
                System.out.print(t1 + " ");
                sum = t1+t2;
                t1 = t2;
                t2 = sum;
            }
        };

        fibonacci.accept(200);

    }
}
