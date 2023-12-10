package Day100ofcoding10;
import java.util.Scanner;
public class Day100ofcoding10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan;

        do {
            System.out.print("Masukkan sebuah bilangan (0 untuk keluar): ");
            bilangan = scanner.nextInt();

            // Tambahkan logika atau operasi lain sesuai kebutuhan
            if (bilangan != 0) {
                System.out.println("Anda memasukkan: " + bilangan);
            }

        } while (bilangan != 0);

        System.out.println("Program selesai. Terima kasih!");
    }
}
