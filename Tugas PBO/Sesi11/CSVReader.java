import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        // Sesuaikan path lokasi file students.csv di komputer Anda
        String csvFile = "D:\\KULIAH\\Semester 4\\Ngoding\\Tugas PBO\\Sesi11\\Students.csv";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;

        System.out.println("NIM, NAMA, UMUR, PRODI");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Membaca baris pertama (header) agar tidak ikut diproses sebagai data
            String header = br.readLine(); 

            while ((line = br.readLine()) != null) {
                // Memisahkan String berdasarkan tanda koma
                String[] student = line.split(csvSplitBy);
                
                // Menampilkan data yang telah dipisahkan
                System.out.println(student[0].trim() + ", " + 
                                   student[1].trim() + ", " + 
                                   student[2].trim() + ", " + 
                                   student[3].trim());
                indeks++;
            }
            System.out.println("Jumlah Baris Data: " + indeks);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}