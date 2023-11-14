package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
        //void dalam bhs inggris itu artinya hampa, kosong atau tidak ada apa²
        System.out.println(simpel());
        FungsiVoid(" apa saja");
        selamatpagi(" Ibu");
    }
    private static void selamatpagi(String nama){
        System.out.println("selamat pagi "+ nama);
    }
    //fungsi atau method tanpa kembalian
    private static void FungsiVoid(String input){
        System.out.println(input);
        
    }
    //fungsi atau method dengan kembalian
    //sehingga menggunkan return untuk
    //mengembalikan nilainya. nilainya sendiri yaitu (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}
