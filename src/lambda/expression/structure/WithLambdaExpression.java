package lambda.expression.structure;

public class WithLambdaExpression {

    public static void main(String[] args) {

        int width = 10;

        //with lambda
        Drawable drawer = () -> {
            System.out.println("Drawing " + width);
        };
        drawer.draw();
    }
}
