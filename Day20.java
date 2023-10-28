package BelajarScanner;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
      //belajar input
        
      Scanner input = new Scanner(System.in);
     System.out.print("masukkan Nama \t: ");
       String Nama = input.nextLine();
      System.out.print("masukkan Nim \t: ");
       String Nim = input.nextLine();
      System.out.print("masukkan Nilai \t: ");
        int Nilai = input.nextInt();
      System.out.println("=====================");
      System.out.println("Hasil yang ditampilkan");
      System.out.println("Nama mahasiswa \t: "+Nama);
        System.out.println("Nim mahasiswa \t: "+Nim);
        System.out.println("Nilai mahasiswa\t: "+Nilai);
        
        if (Nilai>=90){
            System.out.println("keterangan \t: A ");
            System.out.println("LULUS TERBAIK");
            System.out.println("TERIMA KASIH SUDAH MENGISI.");
        }else if(Nilai>=80){
            System.out.println("keterangan \t: B ");
            System.out.println("LULUS");
            System.out.println("TERIMA KASIH SUDAH MENGISI.");
        }else if(Nilai>=70){
            System.out.println("keterangan \t: C ");
            System.out.println("MENGULANG SEMESTER");
            System.out.println("TERIMA KASIH SUDAH MENGISI.");
        }else if(Nilai>=60){
            System.out.println("keterangan \t: D ");
            System.out.println("TIDAK LULUS");
            System.out.println("TERIMA KASIH SUDAH MENGISI.");
        }else{
            System.out.println("keterangan \t: E");
            System.out.println("MAAF ANDA DI D.O DARI KAMPUS.");
            System.out.println("SAYA HARAP ANDA SEHAT SELALU DAN PANJANG UMUR.HARAPAN SAYA KEDEPANNYA ANDA HARUS TETAP BELAJAR.");
        }
            
        
    }
    
}
