package Tugas PBO.Sesi7;

// Mengimplementasikan konsep Generic Class <T> untuk penanganan nilai/tingkat bervariasi
public class Pelajar<T> extends Pengguna {
    private T nilaiAkhir;

    public Pelajar(String id, String nama, T nilaiAkhir) {
        super(id, nama);
        this.nilaiAkhir = nilaiAkhir;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pelajar [NIM: " + getId() + " | Nama: " + getNama() + " | Nilai: " + nilaiAkhir + "]");
    }
}