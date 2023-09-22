package lab.lab_1;

public class TestTemperture {

	public static void main(String[] args) {
        // Create a Temperature object
        Temperature temperature = new Temperature(32, 'F');

        // Access temperature in both scales
        System.out.println("Temperature in Celsius: " + temperature.getCelsium() + "°C");
        System.out.println("Temperature in Fahrenheit: " + temperature.getFahrenheit() + "°F");

        // Set new values and scale
        temperature.setValueAndScale(25, 'C');
        System.out.println("New temperature in Celsius: " + temperature.getCelsium() + "°C");
        System.out.println("New temperature in Fahrenheit: " + temperature.getFahrenheit() + "°F");
    }

}
