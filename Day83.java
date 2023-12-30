package java10;
import java.util.Scanner;
public class java10 {
    
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka %2==0){
            angka+=2;
        }else{
            angka+=1;
        }
        System.out.println(angka);
    }
}
