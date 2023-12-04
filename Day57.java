package Day100ofcoding4;
import java.util.Scanner;
public class Day100ofcoding3 {
    
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        // Memanggil fungsi dan menampilkan hasilnya
        tampilkanJenisAngka(angka);
    }

    // Fungsi untuk menentukan jenis angka
    public static void tampilkanJenisAngka(double angka) {
        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Nol");
        }
    }
}
