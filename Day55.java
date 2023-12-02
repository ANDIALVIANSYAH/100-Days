package Day100ofcoding2;
import java.util.Scanner;
public class Day100ofcoding2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar item dan harga dalam Rupiah
        String item1 = "Buku";
        int hargaItem1 = 15000;
        String item2 = "Pensil";
        int hargaItem2 = 3000;

        // Input pilihan pengguna
        System.out.println("Pilih item:");
        System.out.println("1. " + item1 + " - Rp " + hargaItem1);
        System.out.println("2. " + item2 + " - Rp " + hargaItem2);

        System.out.print("Masukkan nomor item yang ingin dibeli: ");
        int pilihan = scanner.nextInt();

        // Proses pemilihan
        if (pilihan == 1 || pilihan == 2) {
            System.out.print("Masukkan jumlah yang ingin dibeli: ");
            int jumlah = scanner.nextInt();

            // Hitung total harga dalam Rupiah
            int totalHarga = (pilihan == 1) ? hargaItem1 * jumlah : hargaItem2 * jumlah;

            // Output total harga dalam Rupiah
            System.out.println("Anda membeli " + jumlah + " " + ((pilihan == 1) ? item1 : item2) +
                    " dengan total harga: Rp " + totalHarga);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
 }
                               
