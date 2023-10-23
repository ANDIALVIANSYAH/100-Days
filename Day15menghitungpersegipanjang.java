package BelajarScanner;
import java.util.Scanner;
public class Harusbisa {
    
    public static void main(String[] args) {
        Scanner andi = new Scanner(System.in);
        //menghitung persegi panjang
        //dengan rumus panjang x lebar
        int panjang,lebar,luas;
        System.out.print("Masukkan panjang :");
        panjang = andi.nextInt();
        System.out.print("Masukkan lebar   :");
        lebar = andi.nextInt();
        luas =panjang*lebar;
        System.out.print("luas \t\t :"+luas+" cm ");
    }
    
}
