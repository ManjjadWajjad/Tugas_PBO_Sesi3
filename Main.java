import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai: ");
        double nilai = scanner.nextDouble();

        NilaiMahasiswa mahasiswa = new NilaiMahasiswa(nim, nama, nilai);
        System.out.println("\n--- Hasil ---");
        mahasiswa.tampilkanHasil();

        scanner.close();
    }
}