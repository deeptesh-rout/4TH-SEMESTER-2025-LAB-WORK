
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class JavaQuestion2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harry");
        names.add("Steve");
        names.add("Adams");
        names.add("Chris");
        names.add("Allen");

        names.forEach(new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        });

        names.forEach(name -> System.out.println(name));
    }
}
