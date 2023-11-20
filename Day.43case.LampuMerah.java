package inputlagi;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilih;
        System.out.println("RAMBU LALU LINTAS");
        System.out.println("M (merah)");
        System.out.println("K (kuning)");
        System.out.println("H (hijau)");
        System.out.print("PILIH : ");
        pilih = input.next().charAt(0);
        switch(pilih){
            case 'M':
            System.out.println("BERHENTI");
            break;
            case 'K':
            System.out.println("HATI-HATI");
            break;
            case 'H':
            System.out.println("JALAN");
            break;
        }
    }
    
              }
