import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a temperature in Fahrenheit to convert to Celsius");
        double fahrenheit = scanner.nextDouble();

        TempratureConverter converter = new TempratureConverter();
        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
