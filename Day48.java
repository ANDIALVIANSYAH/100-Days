package belajar1;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        //menjumlahkan 2 dataArray
        int[] arrayAngka1 ={4,4,5,3,7,2,9,1,5};
        int[] arrayAngka2 ={0,6,5,3,3,3,1,4,6};
        
        int[] hasil = new int[arrayAngka1.length];
        for(int i = 0; i < arrayAngka1.length; i++){
            hasil[i] = arrayAngka1[i] + arrayAngka2[i];
        }                       //Message
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(hasil      , "hasil");
    }
    private static void printArray(int[]dataArray,String message){
        System.out.println(message+ " = "+Arrays.toString(dataArray));
    }
    
  }
