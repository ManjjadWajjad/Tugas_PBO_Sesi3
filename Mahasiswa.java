public class Mahasiswa {
    protected String nim;
    protected String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampilkanData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
    }
}
