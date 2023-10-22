package Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        //Perhitungan persamaan kuadrat
        Scanner Alvin = new Scanner(System.in);
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;
        System.out.print("nilai x    : ");
        x = Alvin.nextInt();
        System.out.print("gradient m : ");
        m = Alvin.nextInt();
        System.out.print("bias c     : ");
        c =Alvin.nextInt();
        int y = m*x*x+c;
        System.out.print("nilai y    : "+y);
    }
    
}
