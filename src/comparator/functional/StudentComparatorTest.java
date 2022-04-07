package comparator.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentComparatorTest {

    public static void main(String args[]){
        //create an ArrayList of Students
        ArrayList myList=new ArrayList();
        myList.add(new Student(101,"Adrian",25));
        myList.add(new Student(106,"Sydney",22));
        myList.add(new Student(105,"Marcus",27));

        //call Collections.sort method with AgeComparator object to sort ArrayList
        Collections.sort(myList,new StudentAgeComparator());
        System.out.println("Sorted Student objects by Age are as follows:");

        Iterator iter= myList.iterator();
        while(iter.hasNext()){
            Student st=(Student) iter.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
