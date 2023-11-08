package day31;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uang =0;
        //menggunakan perulangan For 
        //biar kodingan kita tidak panjang dan mengimput data nya jg lebih cepat
        for(int a = 1; a <=5; a++){
            System.out.println(a);
     int gaji_kotor_perhari = 120000;
     int uang_makan = 15000;
     //menggunakan Scanner supaya pada saat perulangan berlangsung
     //nilai dari hari kerjanya dapat di isi sesuai keinginan       
     System.out.print("hari kerja = ");   
     int hari_kerja = input.nextInt();
     int tot_gaji_kotor = gaji_kotor_perhari * hari_kerja;
     int tot_uang_makan = uang_makan * hari_kerja;   
     int gaji_bersih = tot_gaji_kotor - tot_uang_makan;
     System.out.println("karyawan "+ a);
     System.out.println("hari kerja = "+hari_kerja);
        System.out.println("uang makan = "+uang_makan);
        System.out.println("total gaji kotor = "+tot_gaji_kotor);
        System.out.println("gaji bersih = "+gaji_bersih);
        System.out.println(" ");
       uang += gaji_bersih;
        }
        System.out.println("dana yang harus dikeluarkan "+uang);
    }
    
}
