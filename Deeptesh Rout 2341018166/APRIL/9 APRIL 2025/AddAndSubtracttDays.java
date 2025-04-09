
//4
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AddAndSubtracttDays {
	 public static void main(String[] args) {
	        LocalDate tomorrow = LocalDate.now().plusDays(1);
	        LocalDate lastMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
	        System.out.println(tomorrow);
	        System.out.println(lastMonth);
	    }

}
