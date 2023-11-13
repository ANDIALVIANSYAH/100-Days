package Belajarlagi2;

public class Main {
    
    //method ini adalah fungsi utama yang akan dipanggil
    public static void main(String[] args) {
        
        //Belajar Fungsi atau method
        //method kedua disini digunakan supaya kita tidak usah menulis ulang y = (x + 2) * x
        //fungsi berasal dari matematika
        //misal kita memiliki Fungsi y = (x+2) * x
        int y,x;
        x = 10;
      
        //ini penulisan rumus nya jika tidak menggunakan method yg kedua
        // y = (x+2) * x;
      
        //ini jika menggunakan method yg kedua dan yg ini lebih mudah
        y = hitung(x);
        System.out.println("x = "+ x + " y = "+ y);
        
        x = 20;
        y = hitung(x);
        System.out.println("x = "+ x + " y = "+ y);
        
        x = 5;
        y = hitung(x);
        System.out.println("x = "+ x + " y = "+ y);
        
    }
    //metode untuk menghitung hasil berdasarkan input
    /*Fungsi kedua pada metode hitung adalah untuk melakukan perhitungan matematika berdasarkan parameter input yang diterima.
    Lebih spesifik, metode tersebut mengambil suatu nilai (input), menambahkannya dengan 2, kemudian mengalikan hasilnya dengan nilai awal (input). 
    Hasil perhitungan ini kemudian dikembalikan sebagai nilai hasil dari metode tersebut. 
    Dengan demikian, fungsi metode hitung adalah untuk menghasilkan nilai berdasarkan operasi matematika yang didefinisikan di dalamnya.*/
    
    public static int hitung(int input){
        int hasil;
        hasil = (input + 2) *input;
        //misal jika ingin mengubah rumusnya, kita bisa langsung ubah di method kedua ini
        //contoh rumus berpangkat
        // hasil = input * input; (jika rumusnya di ubah di sini, otomatis input diatas jawabannya juga akan berubah)
        return hasil;
            //gunanya supaya hasilnya terpanggil
            // jika sudah di return, maka java nya Finish.
            // return adalah pasangan dari metod main
            //dimanapun ada return maka akan keluar dari metod.
            //jika dijava maka programnya akan Finish
    }
}
//keunggulan menggunakan method kedua ini, kalau tadi mau ganti rumusnya kita ganti semuanya.Tapi kalau buat method baru
//tidak usah. Tapi bisa langsung di ubah di method keduanya
  
