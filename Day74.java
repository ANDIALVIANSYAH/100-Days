package Day100ofcoding20;
import java.util.Scanner;
public class Day100ofcoding20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Gaji : ");
        int gaji = input.nextInt();
        int jam=0,total,Gajibersih;
        System.out.print("Masukkan jam : ");
        jam=input.nextInt();
        total = jam*55000;
        
        Gajibersih = gaji+total;
        System.out.println("Total gaji : "+Gajibersih);
        
        
    }
}
