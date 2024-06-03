package lambda.expression.structure;

public class WithoutAnonymousClass implements Drawable{

    int width = 10;
    @Override
    public void draw(){
        System.out.println("Drawing " + width);
    }

    public static void main(String[] args) {

        Drawable drawable = new WithoutAnonymousClass();
        drawable.draw();
    }


}
