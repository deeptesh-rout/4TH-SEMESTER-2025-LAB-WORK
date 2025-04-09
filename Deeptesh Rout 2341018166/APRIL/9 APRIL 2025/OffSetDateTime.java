
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class OffSetDateTime {

	public static void main(String[] args) {
		LocalDateTime ltd = LocalDateTime.of(2025, 4, 6, 10, 30);
		java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.of(ltd, ZoneOffset.of("+04:00"));
		System.out.println(offsetDateTime);

	}

}
