
//6
import java.time.LocalDate;

public class CompareDate {

	public static void main(String[] args) {
		boolean isBefore = LocalDate.parse("2024-06-01").isBefore(LocalDate.parse("2025-01-01"));
		boolean isAfter = LocalDate.parse("2025-01-01").isAfter(LocalDate.parse("2024-06-01"));
		System.out.println(isBefore); // true
		System.out.println(isAfter); // true
	}
}
