
// PROGRAM 8
public class Non_Pure_Functions_Without_Sideffects {
	
	private int x = 0;
	
	public int subtract(int value ) {
		this.x = this.x - value ;
		return this.x;
	}
	
	
public static void main(String[] args) {
	Non_Pure_Functions_Without_Sideffects example = new Non_Pure_Functions_Without_Sideffects();
	
	System.out.println("first subtraction result "+example.subtract(5));
	System.out.println("Second subtracting result " + example.subtract(3));
}
}
