package day45;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        int[] arrayangka1 ={1,2,3,4,5};
        //merubah array menjadi String
        System.out.println("\nMerubah array menjadi string\n==================");
        printArray(arrayangka1);
        
        System.out.println("\nmengkopi dengan copyOf");
        int[] arrayangka2 = Arrays.copyOf(arrayangka1, 5);
        printArray(arrayangka1);
        printArray(arrayangka2);
        //misal kita ganti 5 nya menjadi 3, maka hanya 3 angka yang akan terbaca
    }
    private static void printArray(int[]dataArray){
      System.out.println("array = "+Arrays.toString(dataArray));  
    }
    
          }
