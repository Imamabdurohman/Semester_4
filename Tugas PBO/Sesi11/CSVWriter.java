import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    public static void main(String[] args) {
        // Lokasi file tujuan penulisan data baru
        String csvFile = "D:\\KULIAH\\Semester 4\\Ngoding\\Tugas PBO\\Sesi11\\new_students.csv";
        
        // Data yang akan dimasukkan ke dalam file
        String[] data = {
            "NIM, NAMA, UMUR, PRODI",
            "05, Eka, 20, TI",
            "06, Fani, 21, TE",
            "07, Gani, 22, TI"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);    // Menulis baris data ke file
                bw.newLine();      // Menambahkan baris baru (enter)
            }
            System.out.println("Data berhasil ditulis ke file: " + csvFile);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}