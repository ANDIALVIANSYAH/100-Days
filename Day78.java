package java6;
import java.util.Scanner;
public class java6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil,pangkat,hasil;
        System.out.print("Bilangan : ");
        bil = input.nextInt();
        System.out.print("Pangkat  : ");
        pangkat = input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.print("Hasil    : ");
        hasil = bil;
        
        for (int i = 1; i < pangkat; i++){
            hasil *= bil;
    }
        System.out.println(hasil);
    }
}
