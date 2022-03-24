package custom.functional;

public class MoveFunctionsTest {



    public static void main(String[] args) {

        //1. With parameter no return abstract type
        Moveable getMove = distance -> System.out.println("Move " + distance + " mile");
        getMove.move(20);

        //2. With no parameter no return abstract type
        //Syntax 1
        MoveableNoParameter moveableNoParameter = () -> System.out.println("With No Parameter");
        moveableNoParameter.move();
        //Syntax 2
        MoveableNoParameter moveableNoParameter2 = () -> {
            System.out.println("With No Parameter Syntax 2");
        };
        moveableNoParameter2.move();


        //3. With parameter and return type abstract type
        MoveUp checkMoreThan5km = distances -> {return 1.6*distances>5;};
        boolean result = checkMoreThan5km.moveUp(30);
        System.out.println("result = " + result);


    }



}
