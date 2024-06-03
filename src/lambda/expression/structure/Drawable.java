package lambda.expression.structure;

@FunctionalInterface  //It is optional
public interface Drawable {

    /**
        Read this first;
        WithoutAnonymousClass ----> displays the classical way of implementation for Drawable.
        WithAnonymousClass -------> displays the implementation for Drawable bu using anonymous class
        WithLambdaExpression -----> displays same implementation by using Lambda

     */

    public void draw();
}
