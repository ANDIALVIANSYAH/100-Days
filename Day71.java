package Day100ofcoding17;
import java.util.Scanner;
public class Day100ofcoding17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input volume bola dari pengguna
        System.out.print("Masukkan volume bola: ");
        double volumeBola = scanner.nextDouble();

        // Menghitung jari-jari bola
        double jariJariBola = Math.cbrt(volumeBola / (4 * Math.PI / 3));

        // Menampilkan hasil
        System.out.println("Jari-jari bola adalah: " + jariJariBola);

        scanner.close();
    }
}
