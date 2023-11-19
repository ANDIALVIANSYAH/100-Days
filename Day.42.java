package day42;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner alvin = new Scanner(System.in);
        System.out.print(" masukan nilai n : ");
        int n = alvin.nextInt();
        int a[] = new int[n];
         for (int i = 0; i < n; i++) {
             System.out.print("masukan nilai index ke - "+(i+1)+" : ");
             a[i] = alvin.nextInt();
            
        }
            System.out.println(" ");
            System.out.println("output");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            
        }
        
        }
    
    }

