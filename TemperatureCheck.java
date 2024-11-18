// User-defined exceptions
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        // Ensure an argument is passed
        if (args.length != 1) {
            System.out.println("Please provide the temperature in Celsius as a command-line argument.");
            return;
        }

        try {
            // Parse the input temperature
            double temperature = Double.parseDouble(args[0]);

            // Check for "TooHot" or "TooCold"
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Normal");
                // Convert Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
            }
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a numeric value.");
        }
    }
}
