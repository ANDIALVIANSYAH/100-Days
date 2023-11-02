import java.util.Scanner;
public class Belajar1 {
    public static void main(String[] args) {
        Scanner iky = new Scanner(System.in);
        //menggunakan Scanner agar nilai nya dapat di ubah-ubah sesuai keinginan
        //menggunakan tipe data float agar dapat mengisi angka yang bernilai koma
       float a,b,hasil;
       char operator;
       System.out.print("nilai 1 = ");
       //disini adalah tempat untuk mengisikan inputan
       a = iky.nextFloat();
       System.out.print("operator = ");
       operator = iky.next().charAt(0);
       System.out.print("nilai 2 = ");
       b = iky.nextFloat();
       System.out.println("input user = "+ a +" "+operator+" "+b);
       
     //operator yang tersedia + - * /
     // menggunakan ciri char yaitu (')agar operator aritmatika nya terpanggil
     // if digunakan sebagai kondisi pertama 
     if (operator == '+'){
         //penjumlahan
         hasil = a + b;
         System.out.println("hasil "+hasil);
     //else if sebagai kondisi kedua
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
         //disini menggunakan if bersarang 
         //jika tdk menggunakan if bersarang maka nanti hasilnya infinity(tak terhingga)
         if (b == 0){
             System.out.println("pembagi nol menghasilkan tak hingga");
         }else{
             hasil = a / b;
         System.out.println("hasil "+hasil); 
         }
      //else sebagai kondisi yang tidak memenuhi 
     }else{
         System.out.println("operator tidak ditemukan");
     }
    //jika if atau else if tidak memenuhi syarat maka yang dijalankan adalah else 
        }
    }
