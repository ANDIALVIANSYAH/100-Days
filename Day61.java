package Day100ofcoding8;
import java.util.Scanner;
public class Day100ofcoding8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih menu (1-3):");
        System.out.println("1. Pesan Makanan");
        System.out.println("2. Lihat Daftar Menu");
        System.out.println("3. Keluar");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih untuk pesan makanan.");
                break;
            case 2:
                System.out.println("Melihat daftar menu...");
                break;
            case 3:
                System.out.println("Keluar dari program.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
