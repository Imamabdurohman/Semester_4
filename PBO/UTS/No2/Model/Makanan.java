package No2.Model;

import No2.Interface.Konsumsi;

public abstract class Makanan implements Konsumsi {
    protected String nama;

    public Makanan(String nama) {
        this.nama = nama;
    }

    // Method konkrit yang bisa digunakan semua turunan makanan
    public void info() {
        System.out.println("Menu: " + nama);
    }
}
