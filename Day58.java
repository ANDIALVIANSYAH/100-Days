package Day100ofcoding5;

public class Day100ofcoding5 {
    
    public static void main(String[] args) {
        // Contoh pemanggilan fungsi penjumlahan
        int hasilPenjumlahan = penjumlahan(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // Contoh pemanggilan fungsi perkalian
        int hasilPerkalian = perkalian(8, 4);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }

    // Fungsi penjumlahan
    private static int penjumlahan(int angka1, int angka2) {
        return angka1 + angka2;
    }

    // Fungsi perkalian
    private static int perkalian(int angka1, int angka2) {
        return angka1 * angka2;
    }
}
