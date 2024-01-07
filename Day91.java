import java.util.Scanner;
public class Alvin4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        double suhuFahrenheit = (suhuCelsius * 9 / 5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);

        scanner.close();
    }
}

