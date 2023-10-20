package Day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;
        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang : ");
        panjang = input.nextInt();
        System.out.print("lebar   : ");
        lebar = input.nextInt();
        luas =panjang * lebar;
        System.out.println("luas    : "+luas);
        
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi  : ");
        tinggi =input.nextInt();
        volume =luas*tinggi;
        System.out.print("volume  : "+volume);
    }
    
          }
