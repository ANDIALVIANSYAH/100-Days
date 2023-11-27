package alvian;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        /*Buatlah program yang apabila Nilainya genap maka program akan berhenti.
        Jika ganjil maka program akan meminta inputan lagi.*/
        Scanner x = new Scanner(System.in);
        
        while(true){
            System.out.print("Masukkan Angka : ");
            int angka = x.nextInt();
            
            if(angka % 2 == 0){
                break;
            }
            
        }
    }
    
}
