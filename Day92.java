package java16;
import java.util.Scanner;
public class java16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu : ");
        double suhu = input.nextDouble();
        
        if(suhu >37.5 ){
            System.out.println("Suhu Anda Abnormal");
        }else {
            System.out.println("Suhu aman");
        }
    }
}
