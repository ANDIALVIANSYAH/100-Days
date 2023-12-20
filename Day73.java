package Day100ofcoding19;
import java.util.Scanner;

public class Day100ofcoding19 {
    
    public static void main(String[] args) {
        // Mendefinisikan array nama mahasiswa
        String[] namaMahasiswa = {"Andi", "Alvin", "Arham", "Faisal"};
        
        Scanner scanner = new Scanner(System.in);

        // Menampilkan nama mahasiswa pada indeks yang diinginkan
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan indeks (0-3): ");
            int indeks = scanner.nextInt();

            // Menampilkan nama mahasiswa pada indeks yang dimasukkan
            System.out.println("Mahasiswa pada indeks " + indeks + ": " + namaMahasiswa[indeks]);
        }

        // Menutup scanner
        scanner.close();
    }
}
