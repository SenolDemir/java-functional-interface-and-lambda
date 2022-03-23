package comparator;

import java.util.*;

public class ComparingObject{


    public static void main(String[] args) {
        List<Person> plist = new ArrayList<>();
        plist.add(new Person("John", 20));
        plist.add(new Person("Mike", 33));
        plist.add(new Person("Anderson", 27));
        plist.add(new Person("John", 17));

        System.out.println(plist);

        Comparator<Person> comp = new PersonNameComparator();
        Collections.sort(plist, comp);
        System.out.println(plist);

        Comparator<Person> ageComparator = Comparator.comparing(p -> p.age);
        Collections.sort(plist, ageComparator);
        System.out.println(plist);

        Comparator<Person> nameComparator = (o1, o2) -> o1.name.compareTo(o2.name);
        Collections.sort(plist, nameComparator);
        System.out.println(plist);

        Comparator<Person> nameReverseComparator = (o1, o2) -> o2.name.compareTo(o1.name);
        Collections.sort(plist, nameReverseComparator);
        System.out.println(plist);

        Comparator<Person> nameThenAgeComparator =
                nameComparator.thenComparing(ageComparator);
        Collections.sort(plist, nameThenAgeComparator);
        System.out.println(plist);







    }


}
