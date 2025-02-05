

public class JavaQuestion2 {
	public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
	  public static String reverse(String str, int start, int end) {
	        char[] charArray = str.toCharArray();
	        while (start < end) {
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;
	            start++;
	            end--;
	        }

	        return new String(charArray);
	    }
	  public static void reverse(char[] charArray) {
	        int left = 0;
	        int right = charArray.length - 1;
	        
	        // Reverse the array in place
	        while (left < right) {
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            left++;
	            right--;
	        }
	    }
	public static void main(String[] args) {
	String str="DEEPTESH ROUT";
	System.out.println("Reversed String: "+reverse(str));
    System.out.println("Reversed Substring: "+reverse(str,3,14));
    char[] charArray = str.toCharArray();
    reverse(charArray);
    System.out.println("Reversed Char Array: " + new String(charArray));
	}

}

