package day44;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        int[] arrayangka1 ={1,2,3,4,5};
        //merubah array menjadi String
        System.out.println("\nMerubah array menjadi string\n==================");
        printArray(arrayangka1);
        
        //mengkopi array
        System.out.println("\nmengkopi array\n=============≠===");
        int[]arrayangka2 = new int[5];
        printArray(arrayangka1);
        printArray(arrayangka2);
        System.out.println("\nmengkopi dengan loop\n==============");
        for(int i = 0; i < arrayangka1.length; i++){
            arrayangka2[i] = arrayangka1[i];
        }
        printArray(arrayangka1);
        printArray(arrayangka2);
    }
    private static void printArray(int[]dataArray){
      System.out.println("array = "+Arrays.toString(dataArray));  
    }
    
    }
