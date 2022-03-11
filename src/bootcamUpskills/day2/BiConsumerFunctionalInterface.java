package bootcamUpskills.day2;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printMultipleTimes = (x, y) -> {

            for(int i=0; i<y; i++){
                System.out.print(x+" ");
            }
            System.out.println();
        };

        printMultipleTimes.accept("Cybertek", 4);

        System.out.println("------------------------------------------");

        Map<String, LocalDate> map = new LinkedHashMap<>();

        map.put("John", LocalDate.of(2020, 8, 15));
        map.put("Mike", LocalDate.of(2019, 8, 15));
        map.put("Aeron", LocalDate.of(2017, 8, 15));
        map.put("Shay", LocalDate.of(2018, 8, 15));

        map.forEach( (k,v) -> {
            if(v.getYear()<2019)
                System.out.println(k);
        });




    }




}
