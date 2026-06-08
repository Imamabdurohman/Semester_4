import java.util.ArrayDeque;
import java.util.ArrayList;

public class DemoCollection {
    public static void main(String[] args) {
        // 1. Contoh ArrayList (Menyimpan daftar nama secara berurutan)
        System.out.println("=== DEMO ARRAYLIST ===");
        ArrayList<String> listMahasiswa = new ArrayList<>();
        listMahasiswa.add("Budi");
        listMahasiswa.add("Aris");
        listMahasiswa.add("Fahmi");

        for (String mhs : listMahasiswa) {
            System.out.println("Nama Mahasiswa: " + mhs);
        }

        // 2. Contoh ArrayDeque (Simulasi Antrean Sidang/Admin - First In First Out)
        System.out.println("\n=== DEMO ARRAYDEQUE (ANTREAN FIFO) ===");
        ArrayDeque<String> antreanSidang = new ArrayDeque<>();
        antreanSidang.addLast("Antrean 1: Ferdi");
        antreanSidang.addLast("Antrean 2: Cahyo");
        antreanSidang.addLast("Antrean 3: Amelia");

        // Memproses antrean satu per satu dari depan
        while (!antreanSidang.isEmpty()) {
            System.out.println("Dipanggil -> " + antreanSidang.pollFirst());
        }
    }
}