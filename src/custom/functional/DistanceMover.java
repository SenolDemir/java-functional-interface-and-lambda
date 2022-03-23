package custom.functional;

public class DistanceMover {

    // For implement the function of Moveable intarface
    // the old way named Anonymous Inner Class
    Moveable moveXMile = new Moveable() {
        @Override
        public void move(int distance) {
            System.out.println("Move" + distance + "mile");
        }
    };

    // with Lambda Expression
    Moveable moveXMile1 = (int distance) -> {
        System.out.println("Move" + distance + "mile");
    };

    Moveable getMoveXMile2 = distance -> System.out.println("Move" + distance + "mile");
    Moveable getMoveXMile3 = (distance) -> {System.out.println("Move" + distance + "mile");};
    Moveable getMoveXMile4 = (distance) -> System.out.println("Move" + distance + "mile");
    Moveable getMoveXMile5 = distance -> System.out.println("Move" + distance + "mile");
    //Moveable getMoveXMile6 = distance -> {return System.out.println("Move" + distance + "mile");};  // invalid



    MoveUp checkMoreThan5km = distances -> {return 1.6*distances>5;};       // valid
    MoveUp checkMoreThan5km2 = distances ->  1.6*distances>5;               // valid
    //MovUp checkMoreThan5km3 = distances -> {return 1.6*distances>5 };    // invalid
    //MovUp checkMoreThan5km4 = distances -> return 1.6*distances>5 ;      // invalid
    MoveUp checkMoreThan5km5 = (distances) -> {return 1.6*distances>5;};    // valid
}
