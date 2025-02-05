
public class JavaQuestion6<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        JavaQuestion6<Integer> integerBox = new JavaQuestion6<>();
        integerBox.set(15);
        integerBox.inspect(10); // Works because 10 is an Integer, a subclass of Number
    }
}
