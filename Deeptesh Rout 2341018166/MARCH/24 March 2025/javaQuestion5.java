
public class javaQuestion5 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = str1;

        str1 = str1 + " World";

        System.out.println("Original String (str2): " + str2);
        System.out.println("Modified String (str1): " + str1);

        System.out.println("\nAfter modification, str1 and str2 are different objects:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("\nDemonstrating CharSequence behavior:");
        CharSequence charSeq = str1;

        System.out.println("charSeq.length(): " + charSeq.length());
        System.out.println("charSeq.charAt(6): " + charSeq.charAt(6));
        System.out.println("charSeq.subSequence(0, 5): " + charSeq.subSequence(0, 5));

        System.out.println("charSeq.toString(): " + charSeq.toString());
    }
}
