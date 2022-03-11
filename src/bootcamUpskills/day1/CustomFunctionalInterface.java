package bootcamUpskills.day1;

public class CustomFunctionalInterface {

    public static void main(String[] args) {

        StringFunctions longestString = (s1, s2) -> {
            if (s1.length()> s2.length())
                return s1;
            return s2;
        };

        System.out.println(longestString.function("Java", "C#"));

        System.out.println("-----------------------------------------------------");

        /*** First way
        DataFunctions<String> reverse = s -> return new StringBuilder(s).reverse().toString();
         ***/

        /***Second Way***/
        DataFunctions<String> reverse = s -> {
            String result = "";
            for(int i = s.length()-1; i>=0; i--)
                result+=s.charAt(i);
                return  result;
        };

        System.out.println(reverse.function("Cybertek"));

        System.out.println("--------------------------------------------------------");

        DataFunctions<Integer> cube = n -> n*n*n;

        int r1 = cube.function(10);
        System.out.println("r1 = " + r1);


    }
}
