package java14;
import java.util.Scanner;
public class java14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = input.nextInt();
        
        System.out.print("Masukkan tahun sekarang: ");
        int tahunSekarang = input.nextInt();
        
        int umur = tahunSekarang - tahunLahir;

        System.out.println("Umur Anda adalah " + umur + " tahun.");
    }
}
