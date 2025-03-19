import java.lang.ref.*;

public class question2 {

    public static void main(String[] args) {
        Employee emp = new Employee("Deeptesh", 45);
        emp = null;
        System.out.println(emp);
        System.out.println();
        PhantomRefer();
        System.out.println();
        SoftRefer();
        System.out.println();
        WeakRefer();

    }

    private static void PhantomRefer() {
        Employee emp = new Employee("Deeptesh", 45);
        ReferenceQueue<Employee> refq = new ReferenceQueue<>();
        PhantomReference<Employee> phan = new PhantomReference<>(emp, refq);
        System.out.println(phan.get());
    }

    private static void SoftRefer() {
        Employee emp = new Employee("Deeptesh", 45);
        SoftReference<Employee> soft = new SoftReference<>(emp);
        System.out.println(emp);
        System.out.println(soft.get());
        emp = null;
        System.gc();
        System.out.println(soft.get());
    }

    private static void WeakRefer() {
        Employee emp = new Employee("Deepetsh", 45);
        WeakReference<Employee> weak = new WeakReference<>(emp);
        System.out.println(emp);
        System.out.println(weak.get());
        emp = null;
        System.gc();
        System.out.println(weak.get());
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(String nm, int i) {
        name = nm;
        id = i;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
