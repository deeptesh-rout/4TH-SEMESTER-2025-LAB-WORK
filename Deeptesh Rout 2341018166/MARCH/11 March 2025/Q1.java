
import java.util.*;
public class Q1 {
//RunTime Exceptions
	public static void main(String[] args) {
		int a= 5;
		@SuppressWarnings("unused")
        int ans;
		int[] arr= new int[3];
		Scanner sc= new Scanner(System.in);
		//ArithmaticException
		try {
			ans=a/0;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception: "+ e.getMessage());
		}
		//ArrayOutOfIndexException
		System.out.println("Enter the numbers for array:");
		try {
			for(int i=0; i<=3; i++) {
				arr[3]=sc.nextInt();
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exceptions: "+ e.getMessage());
		}
		 // NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
        //NumberFormatException
        try {
            String numStr = "abc";
            int num = Integer.parseInt(numStr); 
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        }
        //StringIndexOutOfBoundsException
        try {
            String str = "hello";
            char c = str.charAt(10);  // Index out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception: " + e.getMessage());
        }
        //UnsupportedOperationException
        try {
        	java.util.List<String> unmodifiableList= java.util.Collections.emptyList();
        	unmodifiableList.add("Item");
        }catch(UnsupportedOperationException e) {
        	System.out.println("Unsupported Operation Exception: "+e.getMessage());
        }
        
        //IllegalArgumentException
        try {
            if (a % 2 == 0) {
                System.out.println("It is even");
            } else {
                throw new IllegalArgumentException("Number is odd, exception triggered.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception: " + e.getMessage());
        }
    }
}