package builtin.functional;

import java.util.*;
import java.util.function.BiFunction;

public class BıFunctionInterface {

    public static void main(String[] args) {

        BiFunction<int[], int[], List<Integer>> addArraysToList = (a,b) -> {
            List<Integer> list = new ArrayList<>();
            for (int i : a) list.add(i);
            for (int i : b) list.add(i);
            return list;
        };

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11};

        List<Integer> nums = addArraysToList.apply(arr1, arr2);
        System.out.println(nums);

        System.out.println("----------------------------------");
        
        BiFunction<List<String>, List<Integer>, Map<String, Integer>> addListsToMap = (x, y) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < x.size(); i++)
                map.put(x.get(i), y.get(i));
            return map;
        };

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> salaries = new ArrayList<>();

        names.addAll(Arrays.asList("Mohammad", "Chris", "Mike", "Sophia", "Afrooz"));
        salaries.addAll(Arrays.asList(100000, 106000, 102000, 105000, 104000));

        Map<String, Integer> employees = addListsToMap.apply(names, salaries);

        System.out.println(employees);

        employees.forEach( (k, v) -> {
            if(v >= 104000) System.out.println(k);
        });
        




    }
}
