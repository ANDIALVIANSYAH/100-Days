package Day100ofcoding7;
import java.util.Scanner;
public class Day100ofcoding7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan operasi matematika (+, -, *, /): ");
        char operasi = scanner.next().charAt(0);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        lakukanOperasi(operasi, angka1, angka2);
    }

    static void lakukanOperasi(char operasi, double angka1, double angka2) {
        switch (operasi) {
            case '+':
                System.out.println(angka1 + angka2);
                break;
            case '-':
                System.out.println(angka1 - angka2);
                break;
            case '*':
                System.out.println(angka1 * angka2);
                break;
            case '/':
                if (angka2 != 0) {
                    System.out.println(angka1 / angka2);
                } else {
                    System.out.println("Error: Pembagian oleh nol");
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
        }
    }
}
