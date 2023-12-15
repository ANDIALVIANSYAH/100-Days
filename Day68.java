package Day100ofcoding14;
import java.util.Scanner;
public class Day100ofcoding14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret Fibonacci: ");
        int panjangDeret = scanner.nextInt();

        System.out.println("Deret Fibonacci:");
        for (int i = 0; i < panjangDeret; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
