package zadanie2;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class MyClassGeneric<T> {
    private T t;

    public MyClassGeneric(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    @Override
    public String toString() {
        return "Nazwa klasy, wartość = " + this.getClass().getSimpleName() + ", " + this.get();
    }
}
