package java9;
import java.util.Scanner;
public class java9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang dalam meter: ");
        double panjangMeter = input.nextDouble();

        double hasilKonversi = panjangMeter / 1000;

        System.out.println(panjangMeter+" meter sama dengan "+hasilKonversi+" kilometer");
    }
    
}
