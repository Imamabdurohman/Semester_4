import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SIMULASI DATA MAHASISWA ===");
        System.out.print("Masukkan Nama Mahasiswa : ");
        String mhsName = scanner.nextLine();
        System.out.print("Masukkan Alamat Mahasiswa: ");
        String mhsAddress = scanner.nextLine();
        
        Student student = new Student(mhsName, mhsAddress);
        
        // Input Mata Kuliah Mahasiswa
        System.out.print("Berapa jumlah mata kuliah mahasiswa? ");
        int jmlMataKuliah = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        
        for (int i = 0; i < jmlMataKuliah; i++) {
            System.out.print("Nama Mata Kuliah ke-" + (i+1) + ": ");
            String course = scanner.nextLine();
            System.out.print("Nilai untuk " + course + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            student.addCourseGrade(course, grade);
        }
        
        System.out.println("\n=== SIMULASI DATA DOSEN ===");
        System.out.print("Masukkan Nama Dosen    : ");
        String tchrName = scanner.nextLine();
        System.out.print("Masukkan Alamat Dosen  : ");
        String tchrAddress = scanner.nextLine();
        
        Teacher teacher = new Teacher(tchrName, tchrAddress);
        
        // Simulasi fungsi addCourse dan removeCourse pada Teacher
        System.out.println("\n--- Menguji Tambah/Hapus Mata Kuliah Dosen ---");
        System.out.print("Masukkan Mata Kuliah yang diampu Dosen: ");
        String c1 = scanner.nextLine();
        if (teacher.addCourse(c1)) {
            System.out.println("Berhasil menambahkan kelas " + c1);
        }
        
        // Cek validasi duplikat
        System.out.println("Mencoba menambahkan kembali kelas yang sama (" + c1 + ")...");
        if (!teacher.addCourse(c1)) {
            System.out.println("-> Notifikasi: Gagal! Mata kuliah sudah terdaftar (Return False).");
        }
        
        System.out.print("Masukkan Mata Kuliah kedua untuk Dosen: ");
        String c2 = scanner.nextLine();
        teacher.addCourse(c2);
        
        System.out.print("Masukkan Mata Kuliah yang ingin dihapus dari Dosen: ");
        String cRemove = scanner.nextLine();
        if (teacher.removeCourse(cRemove)) {
            System.out.println("Berhasil menghapus kelas " + cRemove);
        } else {
            System.out.println("-> Notifikasi: Gagal! Mata kuliah tidak ditemukan (Return False).");
        }

        // ==========================================
        // TAMPILAN OUTPUT AKHIR (Sesuai toString())
        // ==========================================
        System.out.println("\n=================================");
        System.out.println("      REKAPITULASI DATA AKHIR    ");
        System.out.println("=================================");
        System.out.println(student.toString());
        student.printGrades();
        System.out.printf("Rata-rata Nilai: %.2f\n", student.getAverageGrade());
        System.out.println("---------------------------------");
        System.out.println(teacher.toString());
        
        scanner.close();
    }
}