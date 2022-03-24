package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {


        //map
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);

        list = list.stream().map( n -> n*3 ).collect(Collectors.toList());
        System.out.println(list);

        // Add 5 to each element if it is not even
        // Without Ternary
        list.stream().map( e -> { if( e%2!=0) return e+5;  return e; }).collect(Collectors.toList());
        System.out.println(list);
        // With Ternary
        list = list.stream().map( e -> e%2!=0 ? e+5: e).collect(Collectors.toList());
        System.out.println(list);


        System.out.println("------------  filter() --------------------");

        //filter()
        List<Integer> numbers = list.stream().filter( p -> p%3==0).collect(Collectors.toList());
        System.out.println(numbers);

        List<Integer> numbers2 = list.stream().filter( p -> p%3==0)
                .map( n -> n+3 ).collect(Collectors.toList());
        System.out.println(numbers2);

        System.out.println("------------  skip() ------------------");

        //skip() (skip first [given number] of elements)
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("John", "Jimmy", "Jack", "Brienna", "Shay", "Mike"));

        students.stream().skip(3).map( n -> n.toUpperCase())
                .map( s -> s.charAt(0)+""+s.charAt(s.length()-1))
                .forEach( x -> System.out.println(x));


        System.out.println("------------ distinct() --------------------");

        //distinct (remove duplicated values)
        Integer[] array = {1,1,1,2,2,2,2,2,2,3,3,3,4,5,5,5,5};
        array = Arrays.asList(array).stream().distinct()
                .collect(Collectors.toList()).toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));

        System.out.println("-------- limit() ---------------------------");

        //limit()
        //limit the stream elements with this size. It takes first written number of elements
        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        nums = nums.stream().limit(7).collect(Collectors.toList());
        System.out.println(nums);

        System.out.println("------------ sorted() ---------------------");

        //sorted()
        List<String> names = new ArrayList<>(Arrays.asList("Reflection","Collection","Stream"));
        names = names.stream().sorted().collect(Collectors.toList());
        System.out.println(names);


        System.out.println("------ reduce() ----------------------");

        // reduce()
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Kayak", "Java", "Anna", "Level", "Python", "Bob"));

        String palindrome = words.stream()
                .filter( p ->new StringBuilder(p).reverse().toString().equalsIgnoreCase(p))
                .reduce("", (x, y) -> x+" "+y);

        System.out.println(palindrome);


        System.out.println("----------- allMatch() -----------------------");

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean allEven = nums3.stream().allMatch( p -> p%2==0);
        boolean allLessThan11 = nums3.stream().allMatch(p -> p<11);
        boolean allOddAndEven = nums3.stream().allMatch(p -> p%2==0 || p%2!=0);

        System.out.println(allEven);
        System.out.println(allLessThan11);
        System.out.println(allOddAndEven);


        System.out.println("-------------- anyMatch() -------------------------");

        List<Integer> nums4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean anyNum = nums4.stream().anyMatch( p -> p>5 && p<9);
        System.out.println(anyNum);




    }
}
