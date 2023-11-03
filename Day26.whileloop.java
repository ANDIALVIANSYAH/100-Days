package belajar4;

public class Main {
    
    public static void main(String[] args) {
        //while loop(perulangan)
        //cara untuk menjalankan nya
        // while (kondisi) {
        //      aksi
        //  }
        //contoh :
        int a = 2;
        //output perulangan nya nanti dimulai dari 2
        boolean kondisi = true;
        System.out.println("awal program");
        
        while (kondisi) {
            System.out.println("while loop ke- "+a);
            //a++ gunanya menambah satu
            //disini a++ nya yang dibaca terlebih dahulu baru percabangan if nya
           // a++;
            if (a == 15){
                kondisi = false;
                //output yang keluar "while loop ke-2 sampai while loop ke-14
                
            }
            a++;
            //output yang keluar "while loop ke-2 sampai while loop ke-15
            
            //jika ingin memanggil output while loop sampe ke-15, kita cek kondisi if nya dulu baru ditambhkan a++
         // di sini tempat memanggil a++ yang nanti output yang keluar sampai 15
        }
        System.out.println("Program berakhir");
    }
    //disini saya memanggil output dari "while loop ke-2" sampai di "while loop ke-15"
  }
