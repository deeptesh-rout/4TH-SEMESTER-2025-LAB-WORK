
enum Day {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private final int value;

    Day(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class JavaQuestion1 {

    public static void main(String[] args) {
      
        Day day = Day.MONDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("It's Sunday, time to relax!");
                break;
            case MONDAY:
                System.out.println("It's Monday, the start of the week!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday, let's keep going!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday, halfway through!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday, almost there!");
                break;
            case FRIDAY:
                System.out.println("It's Friday, the weekend is near!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday, enjoy your weekend!");
                break;
            default:
                System.out.println("Unknown day.");
                break;
        }
    }
}
