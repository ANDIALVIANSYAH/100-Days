import java.util.Scanner;
public class Belajar1 {
    public static void main(String[] args) {
        Scanner iky = new Scanner(System.in);
       float a,b,hasil;
       char operator;
       System.out.print("nilai 1 = ");
       a = iky.nextFloat();
       System.out.print("operator = ");
       operator = iky.next().charAt(0);
       System.out.print("nilai 2 = ");
       b = iky.nextFloat();
       System.out.println("input user = "+ a +" "+operator+" "+b);
       
     //operator yang tersedia + - * /
     if (operator == '+'){
         //penjumlahan
         hasil = a + b;
         System.out.println("hasil "+hasil);
     }else if (operator == '-'){
         //pengurangan 
         hasil = a - b;
         System.out.println("hasil "+hasil);
     }else if (operator == '*'){
         //perkalian
         hasil = a * b;
         System.out.println("hasil "+hasil);
     }else if (operator == '/'){
         //pembagian
         if (b == 0){
             System.out.println("pembagi nol menghasilkan tak hingga");
         }else{
             hasil = a / b;
         System.out.println("hasil "+hasil); 
         }
        
     }else{
         System.out.println("operator tidak ditemukan");
     }
            
        }
    }
