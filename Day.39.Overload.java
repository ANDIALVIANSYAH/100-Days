package day39;

public class Main {
    
    public static void main(String[] args) {
        printangka(10);
        printangka(10.6f);
        printangka(24.0d);
        printangka(24);
        
    }
    private static void printangka(double angkaDouble){
        System.out.println("angka ini adalah double dengan nilai = "+angkaDouble);
    }
    private static void printangka(float angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = "+angkaFloat);
    
    }
    private static void printangka(int angkaIntiger){
        System.out.println("angka ini adalah intiger dengan nilai = "+angkaIntiger);
    }
}
        
