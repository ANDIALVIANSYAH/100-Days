package operatorLogika;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //sebuah program sederhana menebak sebuah angka
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai tebakan dari 1 - 10");
        int nilaibenar = 7;
        int nilaitebakan;
        boolean statustebakan;
        System.out.print("masukkan nilai tebakan anda : ");
        nilaitebakan = input.nextInt();
        System.out.println("nilai tebakan anda adalah   : "+ nilaitebakan);
        
        
        //operator logika
        statustebakan = (nilaibenar == nilaitebakan);
        System.out.println("tebakan anda : "+statustebakan);
        
        //operasi aljabar boolean (and / or)
        System.out.print("masukkan nilai diantara 2 dengan 9 : ");
        nilaitebakan = input.nextInt();
        statustebakan =(nilaitebakan > 2) && (nilaitebakan< 9);
        System.out.println("tebakan anda : "+statustebakan);
        
    }
          }
