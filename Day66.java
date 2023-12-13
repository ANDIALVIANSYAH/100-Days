package Day100ofcoding12;
import java.util.Scanner;
public class Day100ofcoding12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scanner.nextInt();

        // Mendeklarasikan dan mengisi array
        int[] arrayAngka = new int[jumlahElemen];
        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arrayAngka[i] = scanner.nextInt();
        }

        // Menampilkan elemen array
        System.out.println("Elemen-elemen array:");

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print(arrayAngka[i] + " ");
        }

        // Menutup Scanner setelah selesai menggunakan
        scanner.close();
    }
}
          
