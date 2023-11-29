package Day52;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner Alvin = new Scanner(System.in);
        /*Buatlah program yang hanya menerimah inputan nilai 40 sampai 99. 
        Jika nilai di luar dari nilai yang telah di tentukan maka program akan meminta inputan kembali. 
        Jika inputan sama dengan angka yang telah di tentukan maka tampilkan inputan tersebut*/

        int nilai;
        while (true) {
            System.out.print("Masukkan nilai (40-99): ");
            nilai = Alvin.nextInt();

            if (nilai >= 40 && nilai <= 99) {
                System.out.println("Nilai yang dimasukkan: " + nilai);
                break;
        }
        
    }
        
    }
}
