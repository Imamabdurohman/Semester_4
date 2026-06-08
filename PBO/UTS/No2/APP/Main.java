package No2.APP;

import Model.Mahasiswa;
import Model.Rendang;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HASIL SOAL 1 (GENERIC) ===");
        // Implementasi Generic sesuai soal tugas 7
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println("NIM   : " + m.getNim());
        System.out.println("Nama  : " + m.getName());
        System.out.println("Kelas : " + m.getClas());

        System.out.println("\n=== HASIL SOAL 2 (ABSTRACT & INTERFACE) ===");
        // Implementasi Makanan
        Rendang rd = new Rendang();
        rd.info();
        rd.makan();
        rd.tekstur();
    }
}