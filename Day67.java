package Day100ofcoding13;

public class Day100ofcoding13 {
    public static void main(String[] args) {
        int hasilJumlah = jumlahkanAngka(11, 20);
        System.out.println("Jumlah angka dari 11 hingga 20 adalah: " + hasilJumlah);
    }

    public static int jumlahkanAngka(int awal, int akhir) {
        int total = 0;

        for (int i = awal; i <= akhir; i++) {
            total += i;
        }

        return total;
    }
}
