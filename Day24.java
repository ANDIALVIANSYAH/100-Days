package day24;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        //ternary operator
        //ternary operator berguna untuk mempersingkat kondisi if statement
        Scanner inputuser =new Scanner(System.in);
        int input, x;
        System.out.print("Masukkan nilai : ");
        input = inputuser.nextInt();
        
        //variabel x = ekspresi ? statement_true : statement_false
        x = (input == 20) ? (input*input) : (input/2);
        System.out.println("hasilnya "+x);
        
        //jika input nya sama dengan 20, maka inputnya dikuadratkan(dikalikan)
        //jika input nya tidak sama dengan 20, maka input di bagi dengan dua.
        //dua ini nilai tetap
        
        //jika menggunakan if else
        if (input==10){
            x = input*input;
            
        }else{
            x = input/2;
        }
    }
    
}
