package custom.functional;

@FunctionalInterface
public interface DataFunctions<T> {

    T function(T t);

    /*
    Class T
    It is possible to create classes that work with different data types.
     */
}
