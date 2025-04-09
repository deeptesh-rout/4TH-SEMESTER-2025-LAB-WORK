
import java.time.LocalTime;

public class CompareTimes {

	public static void main(String[] args) {
		System.out.println(LocalTime.parse("03:20").isBefore(LocalTime.parse("04:00"))); // true

	}

}
