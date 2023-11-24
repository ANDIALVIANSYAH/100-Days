package day47;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        System.out.println("\nGenap");
        for (int i = 2; i <= 2 * jumlahBilangan; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nGanjil");
        for (int i = 1; i < 2 * jumlahBilangan; i += 2) {
            System.out.println(i);
        }
    }
}
      
