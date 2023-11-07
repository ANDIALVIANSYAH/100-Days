package day30;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gaji karyawan");
        System.out.print("masukkan jumlah hari kerja  : ");
        int hari_kerja = input.nextInt();
        System.out.print("masukkan Gaji perhari       : ");
        int gaji_perhari = input.nextInt();
        System.out.print("masukkan uang makan perhari : ");
        int uang_makan = input.nextInt();
        int gaji_kotor = gaji_perhari * hari_kerja;
        System.out.println("Gaji kotor                  : "+gaji_kotor);
        int total_uang_makan = uang_makan * hari_kerja;
        System.out.println("Total uang makan            : "+total_uang_makan);
        int gaji_bersih = gaji_kotor - total_uang_makan;
        System.out.println("gaji bersih                 : "+gaji_bersih);
        
        System.out.println("<=======STRUK GAJI KARYAWAN========>");
        System.out.println("Jumlah hari kerja : "+hari_kerja);
        System.out.println("Gaji perhari      : "+gaji_perhari);
        System.out.println("Uang makan perhari: "+uang_makan);
        System.out.println("Gaji kotor        : "+gaji_kotor);
        System.out.println("Total uang makan  : "+total_uang_makan);
        System.out.println("Gaji bersih       : "+gaji_bersih);
        
    }
    
    }
