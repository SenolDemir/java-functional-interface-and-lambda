package custom.functional;

public class DataStringFunctionsTest {

    public static void main(String[] args) {

        // Creating Lambda Expression With Custom Functional Interface, StringFunction
        StringFunctions longestString = (s1, s2) -> {
            if (s1.length()> s2.length())
                return s1;
            return s2;
        };
        System.out.println(longestString.function("Java", "C#"));

        System.out.println("------------DataFunction Interface-------------------------");

        // Creating Lambda Expression With Custom Functional Interface, DataFunction
        //1. Way
        DataFunctions<String> reverse = s -> {return new StringBuilder(s).reverse().toString();};
        System.out.println(reverse.function("Java"));

        //2. Way
        DataFunctions<String> reverseString = s -> {
            String result = "";
            for(int i = s.length()-1; i>=0; i--)
                result+=s.charAt(i);
                return  result;
        };
        System.out.println(reverseString.function("Java is Fun"));

        System.out.println("---------------- DataFunction 2 ----------------------------------------");

        DataFunctions<Integer> cube = n -> n*n*n;
        int r = cube.function(10);
        System.out.println("r = " + r);



    }
}
