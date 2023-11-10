package Belajarlagi1;

public class Main {
    
    public static void main(String[] args) {
         // control Flow (untuk mengatur loop)
        //ada 3 keyword yaitu Break, continue , return
        //tapi disini saya akan menggunakan continue
        System.out.println("ini awal program");
        int a = 0;
        while(true){
            a++;
            if(a == 10){
                break;
            }else if(a == 5){
                continue;
            //continue adalah keyword yang memaksa memulai program dari awal
            }
            System.out.println("Looping ke- "+ a);
            // println ini akan terskip. karna saat continue, 5 nya terskip
        }
            System.out.println("ini akhir program");
    }
}
