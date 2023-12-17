package Day200ofcoding16;
import java.util.Scanner;
public class Day100ofcoding16 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka bulat: ");
        
        int angka = scanner.nextInt();
        tentukanKategori(angka);
    }

    static void tentukanKategori(int angka) {
        if (angka < 0) {
            System.out.println("Masukkan angka bulat non-negatif.");
            return;
        }

        if (angka < 10) {
            System.out.println("Ini adalah angka satuan.");
        } else if (angka < 100) {
            System.out.println("Ini adalah angka puluhan.");
        } else if (angka < 1000) {
            System.out.println("Ini adalah angka ratusan.");
        } else {
            System.out.println("Ini adalah angka ribuan atau lebih besar.");
        }
    }
}
