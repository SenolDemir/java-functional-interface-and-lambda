package comparable.functional;

    /**
    Comparable interface sorts the list structures like Arrays and ArrayLists containing custom objects.
	This interface is found in java.lang package and contains only one method named compareTo(Object).
	It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
	For example, it may be rollno, name, age or anything else.
     */

public class Person implements Comparable<Person>{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return (this.name.compareTo(o.name) == 0)
                ? Integer.compare(this.age, o.age)
                : this.name.compareTo(o.name);
    }
}
