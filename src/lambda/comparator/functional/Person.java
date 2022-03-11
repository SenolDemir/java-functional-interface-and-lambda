package functional.and.lambda.comparator.functional;

public class Person implements Comparable<Person>{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
