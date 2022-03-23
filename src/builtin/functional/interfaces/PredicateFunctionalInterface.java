package builtin.functional.interfaces;

import java.util.*;
import java.util.function.Predicate;

public interface PredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> {
            if(number%2==0)
                return true;
            return false;
        };

        boolean b1 = isEven.test(1002);
        System.out.println("b1 = " + b1);


        System.out.println("----------------------------------------------------");

        List<String> list = new ArrayList<>();

        list.addAll((Arrays.asList("Java", "C#", "C#", "C++")));

        Predicate<String> isUnique = p -> Collections.frequency(list, p) ==1 ;

        boolean b2 = isUnique.test("C#");
        System.out.println("b2 = " + b2);

        for (String s : list){
            if(isUnique.test(s))
                System.out.println(s);
        }

        System.out.println("----------------------------------------------------");


        List<Integer> nums = new ArrayList<>(Arrays.asList(10,10,10,20,20,20,30,30,30,40,40,50,50,60,70,80));

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)<40){
                nums.remove(i);
            }
        }

        System.out.println(nums);
        // You can not remove all the element in that condition.
        // SO you need to use iterator interface for this

        System.out.println("-------------------------");

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,10,10,20,20,20,30,30,30,40,40,50,50,60,70,80));

        Iterator<Integer> iterator = nums2.iterator();

        while (iterator.hasNext()){
            if(iterator.next()<40){
                iterator.remove();
            }
        }

        System.out.println(nums2);

        System.out.println("-------------------------");

        // The other way of using Predicate is removeIf() method

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(10,10,10,20,20,20,30,30,30,40,40,50,50,60,70,80));

        //Predicate<Integer> lessThan40 = p -> p < 40;

        nums3.removeIf(p -> p < 40);

        System.out.println(nums3);

        System.out.println("------------------------------------------------");

        //Palindrome with Predicate

        Predicate<String> palindrome = p -> {
            String reverse = "";
            for (int i = p.length()-1; i >=0; i--) {
                reverse+= p.charAt(i);
            }
            return reverse.equalsIgnoreCase(p);
        };

        System.out.println(palindrome.test("cabaca"));


    }
}
