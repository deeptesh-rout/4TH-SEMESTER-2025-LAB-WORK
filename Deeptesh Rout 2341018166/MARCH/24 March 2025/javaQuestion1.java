
public class javaQuestion1 {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "hello";
        String s3 = s2;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        String s4 = s1.intern();

        System.out.println(s2 == s4);
    }

}
