
//5
import java.time.LocalDate;

public class GetDayWeekMonthCheckLeap {

	public static void main(String[] args) {
		System.out.println(LocalDate.parse("2024-02-29").getDayOfWeek()); // THURSDAY
        System.out.println(LocalDate.parse("2024-02-29").getDayOfMonth()); // 29
        System.out.println(LocalDate.parse("2024-02-29").isLeapYear()); // true


	}
}
