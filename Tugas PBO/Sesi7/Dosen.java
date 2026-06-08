package Tugas PBO.Sesi7;

// Mengimplementasikan konsep Inheritance (Turunan dari Pengguna)
public class Dosen extends Pengguna {
    private String mataKuliah;

    public Dosen(String id, String nama, String mataKuliah) {
        super(id, nama);
        this.mataKuliah = mataKuliah;
    }

    // Polimorfisme (Overriding method dari interface)
    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen  [ID: " + getId() + " | Nama: " + getNama() + " | Mengajar: " + mataKuliah + "]");
    }
}