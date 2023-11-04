package day27;

public class Main {
    
    public static void main(String[] args) {
        //do while
        // do {
        //   aksi
        //}while (kondisi)
        System.out.println("ini awal program");
        int a = 0;
        boolean kondisi = true;
        
        do{
            //menggunakan a++ agar kondisinya ditambah satu
            //output nya dibaca dari 1 sampai 10
            a++;
            System.out.println("do while ke- "+ a);
            //jika a++ nya di taruh di atas if, maka nanti terbaca mulai dari 0 sampai 9
           // a++;
            if(a == 10){
                kondisi = false;
            }
        }while (kondisi);
        System.out.println("ini akhir program");
        
        //Setelah eksekusi do, kondisi akan dievaluasi. Jika kondisi benar (true), maka perulangan akan terus berlanjut. Jika kondisi salah (false), perulangan akan berhenti
    }
    
}
