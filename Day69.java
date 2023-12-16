package Day100ofcoding15;
import java.util.Scanner;
public class Day100ofcoding15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Program Mahasiswa");

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + i + ":");
            
            System.out.print("Masukkan Nama Mahasiswa: ");
            String namaMahasiswa = scanner.next();

            System.out.print("Masukkan NIM Mahasiswa: ");
            String nimMahasiswa = scanner.next();

            System.out.print("Masukkan IPK Mahasiswa: ");
            double ipkMahasiswa = scanner.nextDouble();

            // Menampilkan status mahasiswa berdasarkan IPK
            if (ipkMahasiswa >= 3.0) {
                System.out.println("Status: Lulus");
                
            }else if (ipkMahasiswa >= 2.85){ 
                System.out.println("Status: Lulus");
                
            } else {
                System.out.println("Status: Tidak Lulus");
            }
        }

        scanner.close();
    }
             }
