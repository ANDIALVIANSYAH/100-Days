package contoh4;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        double bilangan = scanner.nextDouble();

        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        double hasil = 1;

        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan;
       }

        System.out.println("Hasil " + bilangan + " pangkat " + pangkat + " adalah: " + hasil);
    }
 }
