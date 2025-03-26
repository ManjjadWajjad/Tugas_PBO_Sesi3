public class NilaiMahasiswa extends Mahasiswa {
    private double nilai;

    public NilaiMahasiswa(String nim, String nama, double nilai) {
        super(nim, nama);
        this.nilai = nilai;
    }

    public String getGrade() {
        if (nilai >= 80 && nilai <= 100) {
            return "A (Lulus)";
        } else if (nilai >= 70) {
            return "B (Lulus)";
        } else if (nilai >= 60) {
            return "C (Lulus)";
        } else if (nilai >= 50) {
            return "D (Tidak Lulus)";
        } else if (nilai >= 0) {
            return "E (Tidak Lulus)";
        } else {
            return "Input nilai anda salah";
        }
    }

    public void tampilkanHasil() {
        tampilkanData();
        if (nilai >= 0 && nilai <= 100) {
            System.out.println("Nilai: " + nilai);
            System.out.println("Grade: " + getGrade());
        } else {
            System.out.println(getGrade());
        }
    }
}