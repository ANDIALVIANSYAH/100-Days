package day29;
import java.util.*;
//kita pakai scanner biar nilai nya dapat di ubah kapan saja
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //membuat program looping untuk menjumlahkan angka dari rentang tertentu
        //program loop akan berakhir jika Nilai Awal > Nilai Akhkr
        //contoh :
        /*Kita mau menghitung nilai total
        Nilai Awal = 1
        Nilai Akhir = 10
        total = 1+2+3+4+5+6+7+8+9+10
        # disini ada nilai yang bergerak yaitu contoh nya 1+2 = 3, setelah itu 3+3= 6, 6+4=10 sampai seterusnya
        dari total diatas di dapat nilai nya yaitu (55)
        jika dijalankan di sebuah program,maka caranya sebagai berikut sekaligus kita buktikan.*/
        
        int nilaiawal,nilaiakhir,total;
        System.out.println("awal program");
        System.out.print("Masukkan nilai awal  = ");
        nilaiawal = input.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiakhir = input.nextInt();
        
        total = 0;
        //kita menggunakan perupangan While
        while (nilaiawal <= nilaiakhir){
            total = total + nilaiawal;
            System.out.println("ditambah "+ nilaiawal +" menjadi "+ total);
            nilaiawal++;
            //menggunakan ++ supaya dia berputar / berulang
            /* total disebut sebagai variabel bergerak, dia nilainya terus berubah
            di dalam loop ini*/
        }
        System.out.println("program berakhir");
    }
    
          }
