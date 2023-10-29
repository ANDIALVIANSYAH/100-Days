import java.util.Scanner;

public class Belajar2 {
    public static void main(String[] args) {
        //switc case
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>ABSEN<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.print("panggil nama : ");
        input = inputUser.next();
        
        //ekspresinya berupa satuan (int,long,byte,short)dan String
        switch (input){
            case "Alvin":
                System.out.println("Saya Alvin hadir bos !!!");
            break;
            case "Futri":
                System.out.println("Saya Futri dan hadir bos !!!");
            break;
            case "Rizky":
                System.out.println("Saya Rizky dan hadir bos !!!");
            break;
            default:
                System.out.println(input+ " Tidak hadir boss");
        }
        System.out.println("program berakhir");
    }
    
    }
