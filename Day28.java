package belajarkelas;

public class Main {
    
    public static void main(String[] args) {
        /*Buatlah varibel nama depan dengan value “Andi” dan varibel nama belakang dengan value “Alviansyah S”. 
        Kemudian updatelah nilai variable nama depan menjadi “M Rizky” dan nama belakang menjadi “Anwar”. 
        Tampilkan hasil nilai akhir dari kedua varibel tersebut.*/
        
        String nama_depan, nama_belakang;
        //Nilai variabel awal
        nama_depan = "Andi";
        nama_belakang = "Alviansyah S";
        
        //update nilai variabel
        
        nama_depan = "M Rizky";
        nama_belakang = "Anwar";
        
        System.out.println("Nama depan "+nama_depan);
        System.out.println("Nama belakang "+nama_belakang);
        //Di java, variabel lama langsung ditimpa dgn data baru
        
    }
    
}
