package functional.and.lambda;

import java.util.function.Consumer;

public class LetterCounterWithConsumer {


    /***
        Given any String print out how many times each character is found in the String
     */

    public static void main(String[] args) {

        String str = "Amadeus Mozart";
        str = str.toLowerCase().replace(" ", "");
        String usedLetters = "";

        for (int i = 0; i < str.length()-1; i++) {
            int count = 0;
            if(usedLetters.contains(str.charAt(i)+""))
                continue;
            for (int j = 0; j <=str.length()-1 ; j++) {
                if(str.charAt(j)==str.charAt(i))
                    count+=1;
            }
            System.out.println(str.charAt(i) +" is used "+ count + " times in "+ str);
            usedLetters+=str.charAt(i)+"";

        }

        System.out.println("-------------------------------------------------");

        Consumer<String> letterCount = s -> {
            s = s.toLowerCase().replace(" ", "");
            String usedLetters2 = "";
            for (int i = 0; i <s.length()-1 ; i++) {
                int letterCounter=0;
                if (usedLetters2.contains(s.charAt(i)+""))
                    continue;
                for (int j = 0; j <s.length()-1 ; j++) {
                    if(s.charAt(j)==s.charAt(i))
                        letterCounter+=1;
                }
                System.out.println(s.charAt(i) +" is used "+ letterCounter + " times in "+ s);
                usedLetters2+=s.charAt(i)+"";
            }
        };

        letterCount.accept(str);




    }

}
