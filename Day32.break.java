package belajarlagi;

public class Main {
    
    public static void main(String[] args) {
        // control Flow (untuk mengatur loop)
        //ada 3 keyword yaitu Break, continue , return
        //tapi disini saya akan menggunakan break terlebih dahulu
        System.out.println("ini awal program");
        int a = 0;
        while(true){
            a++;
            if(a == 10){
                break;
                //ini adalah keyword yang memaksa untuk keluar dari loop.
                // atau menghentikan program
            }
            System.out.println("Looping ke- "+ a);
        }
        System.out.println("ini akhir program");
    }
    
}
