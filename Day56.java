package Day100ofcoding;
import java.util.Scanner;
public class Day100ofcoding {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah inputan: ");
        int jumlahInputan = scanner.nextInt();

        for (int i = 0; i < jumlahInputan; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();

            if (nilai % 2 == 0) {
                System.out.println("Angka " + nilai + " adalah genap.");
            } else {
                System.out.println("Angka " + nilai + " adalah ganjil.");
            }
        }
        
    }
}
