

public class JavaQuestion3 {

    public static void main(String[] args) {
        UnitConversion converter = new UnitConversion();

        double kmToMiles = converter.convert(5.0, "km", "miles");
        System.out.println("5 km in miles: " + kmToMiles);

      
        double celsiusToFahrenheit = converter.convert(25.0, "celsius", "fahrenheit");
        System.out.println("25°C in Fahrenheit: " + celsiusToFahrenheit);

        
        int hoursToMinutes = converter.convert(5, "hours");
        System.out.println("5 hours in minutes: " + hoursToMinutes);

        
        int minutesToSeconds = converter.convert(3, "minutes");
        System.out.println("3 minutes in seconds: " + minutesToSeconds);

        
        int timeInSeconds = converter.convert("2:30:50");
        System.out.println("2 hours 30 minutes in seconds: " + timeInSeconds);
    }
}

class UnitConversion {

    
    public double convert(double value, String unitFrom, String unitTo) {
        switch (unitFrom.toLowerCase()) {
            case "km":
                if ("miles".equalsIgnoreCase(unitTo)) {
                    return value * 0.621371;
                }
                break;
            case "miles":
                if ("km".equalsIgnoreCase(unitTo)) {
                    return value / 0.621371;
                }
                break;
            case "celsius":
                if ("fahrenheit".equalsIgnoreCase(unitTo)) {
                    return (value * 9 / 5) + 32;
                }
                break;
            case "fahrenheit":
                if ("celsius".equalsIgnoreCase(unitTo)) {
                    return (value - 32) * 5 / 9;
                }
                break;
            default:
                System.out.println("Invalid unit conversion.");
                break;
        }
        return 0.0;
    }

  
    public int convert(int value, String unitType) {
        switch (unitType.toLowerCase()) {
            case "hours":
                return value * 60;
            case "minutes":
                return value * 60; 
            default:
                System.out.println("Invalid time unit.");
                return 0;
        }
    }

    
    public int convert(String time) {
        if (time == null || time.length() != 8) {
            System.out.println("Invalid time format. Use HH:MM:SS.");
            return 0;
        }

        
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6, 8));

        return (hours * 3600) + (minutes * 60) + seconds; 
    }

}



/*
 * OUTPUT
 

5 km in miles: 3.106855
25°C in Fahrenheit: 77.0
5 hours in minutes: 300
3 minutes in seconds: 180
Invalid time format. Use HH:MM:SS.
2 hours 30 minutes in seconds: 0
 
  
 
*/