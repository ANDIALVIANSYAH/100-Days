package Day100ofcoding11;
import java.util.Scanner;
public class Day100ofcoding11 {

    public static void main(String[] args) {
        Scanner nilaimahasiswa = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = nilaimahasiswa.nextInt();

        String statusNilai = tentukanStatusNilai(nilai);
        System.out.println("Mahasiswa mendapatkan nilai " + statusNilai);
    }

    public static String tentukanStatusNilai(int nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }    
}
