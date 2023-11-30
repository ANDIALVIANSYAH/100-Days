package kasir;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pilihan nama barang ");
        System.out.println(" 1. Baju");
        System.out.println(" 2. celana");
        System.out.println(" 3. hoodie");
        System.out.print("pilih : ");
        int pilih = scanner.nextInt();

        System.out.print("Masukkan harga barang : ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan jumlah barang : ");
        int jumlahBarang = scanner.nextInt();

        double totalHarga = hargaBarang * jumlahBarang;

        System.out.println("Total harga: " + totalHarga);

        System.out.print("Masukkan jumlah uang pembeli: ");
        double jumlahUang = scanner.nextDouble();

        if (jumlahUang >= totalHarga) {
            double kembalian = jumlahUang - totalHarga;
            System.out.println("Kembalian: " + kembalian);
        } else {
            System.out.println("Maaf, uang pembeli tidak mencukupi.");
        }
        
    }
} 
