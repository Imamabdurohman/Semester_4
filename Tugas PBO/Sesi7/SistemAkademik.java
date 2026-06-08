package Tugas PBO.Sesi7;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemAkademik {
    public static void main(String[] args) {
        // Mengimplementasikan konsep Collection (ArrayList untuk menampung objek Interface)
        ArrayList<AksiAkademik> dataAkademik = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== INPUT DATA PROJECT AKADEMIK ===");
        
        // 1. Input Data Dosen
        System.out.print("Masukkan NIDN Dosen    : ");
        String nidn = scanner.nextLine();
        System.out.print("Masukkan Nama Dosen    : ");
        String namaDosen = scanner.nextLine();
        System.out.print("Mata Kuliah yg Diampu  : ");
        String matkul = scanner.nextLine();
        dataAkademik.add(new Dosen(nidn, namaDosen, matkul));
        
        System.out.println();

        // 2. Input Data Mahasiswa (Menggunakan Generic String untuk Grade)
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMhs = scanner.nextLine();
        System.out.print("Masukkan Grade Nilai (A/B/C) : ");
        String grade = scanner.nextLine();
        dataAkademik.add(new Pelajar<String>(nim, namaMhs, grade));

        System.out.println();
        
        // 3. Input Data Mahasiswa Kedua (Menggunakan Generic Integer untuk Angka)
        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        String nim2 = scanner.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 2: ");
        String namaMhs2 = scanner.nextLine();
        System.out.print("Masukkan Nilai Angka (0-100): ");
        int angka = scanner.nextInt();
        dataAkademik.add(new Pelajar<Integer>(nim2, namaMhs2, angka));

        // Tampilan Output Menggunakan Polimorfisme
        System.out.println("\n=============================================");
        System.out.println("       LAPORAN DATA SISTEM AKADEMIK          ");
        System.out.println("=============================================");
        for (AksiAkademik entitas : dataAkademik) {
            entitas.tampilkanInfo(); // Memanggil metode secara polimorfis
        }
        System.out.println("=============================================");
        
        scanner.close();
    }
}