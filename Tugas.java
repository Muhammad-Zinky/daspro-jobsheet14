import java.util.Scanner;

public class Tugas {
    static int totalRekursif(Scanner sc, int n) {
        if (n == 0) {
            return 0; 
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return angka + totalRekursif(sc, n - 1); 
        }
    }
    static int totalIteratif(Scanner sc, int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        System.out.println("=== Metode Rekursif ===");
        int totalRek = totalRekursif(sc, n);

        System.out.println("=== Metode Iteratif ===");
        int totalIter = totalIteratif(sc, n);

        System.out.println("Total dari " + n + " angka yang dimasukkan (rekursif): " + totalRek);
        System.out.println("Total dari " + n + " angka yang dimasukkan (iteratif): " + totalIter);
    }
}
