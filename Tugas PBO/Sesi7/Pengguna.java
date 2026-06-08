package Tugas PBO.Sesi7;

// Mengimplementasikan konsep Abstract Class & Encapsulation
public abstract class Pengguna implements AksiAkademik {
    private String id;
    private String nama;

    public Pengguna(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter (Encapsulation)
    public String getId() { return id; }
    public String getNama() { return nama; }
}