import java.util.Scanner;   
public class Main {
    
    public static void main(String[] args) {
        //buatlah sebuah inputan yang apabila kita memasukkan inputan nilai dan dia habis dibagi 3 maka akan mencetak pride of-3
        //dan apabila habis dibagi dengan 5 maka mencetak pride of-5.
        //dan apabila habis dibagi 3 dan 5 akan mencetak Master Class.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int input = scanner.nextInt();

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("Master Class");
        } else if (input % 3 == 0) {
            System.out.println("Pride of 3");
        } else if (input % 5 == 0) {
            System.out.println("Pride of 5");
        }

        scanner.close();
    }
}
