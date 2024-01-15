package Day99;
import java.util.Scanner;
public class Day99 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        int volume = sisi * sisi * sisi;

        System.out.println("Volume kubus: " + volume);
    }
}
