import java.util.Scanner;

public class Belajar3 {
    public static void main(String[] args) {
        Scanner Andi = new Scanner(System.in);
        System.out.println("kalkulator sederhana");
        double angka1,angka2,hasil=0;
        System.out.print("masukkan angka1 : ");
        angka1 = Andi.nextDouble();
        System.out.print("masukkan angka2 : ");
        angka2 = Andi.nextDouble();
        System.out.println("+,-,*,/");
        System.out.print("Pilih : ");
        String masukan = Andi.next();
        switch (masukan){
            case "+":
        hasil = angka1+angka2;
                System.out.println(angka1+" "+masukan+" "+angka2+" = "+hasil);
            break;
            case "-":
        hasil = angka1-angka2;
                System.out.println(angka1+" "+masukan+" "+angka2+" = "+hasil);
            break;
            case "*":
        hasil = angka1*angka2;
                System.out.println(angka1+" "+masukan+" "+angka2+" = "+hasil);
            break;
            case "/":
        hasil = angka1/angka2;
                System.out.println(angka1+" "+masukan+" "+angka2+" = "+hasil);
            break;
                
        }
        System.out.println("operasi selesai"); 
       
    }
    
}
