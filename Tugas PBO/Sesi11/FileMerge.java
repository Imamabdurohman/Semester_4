import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {
    public static void main(String[] args) {
        // Daftar file sumber yang akan digabungkan
        String[] files = {"D:\\file1.txt", "D:\\file2.txt"};
        // File hasil penggabungan
        String mergedFile = "D:\\merge.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                System.out.println("Membaca dan menggabungkan: " + file);
                
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    System.out.println("Gagal membaca file " + file + ": " + e.getMessage());
                }
            }
            System.out.println("Proses selesai! File gabungan disimpan di: " + mergedFile);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan sistem I/O utama: " + e.getMessage());
        }
    }
}