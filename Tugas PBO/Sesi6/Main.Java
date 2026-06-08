package Tugas PBO.Sesi6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop laptopFisik = null;
        
        System.out.println("=== PILIHAN LAPTOP ===");
        System.out.println("[1] Toshiba");
        System.out.println("[2] MacBook");
        System.out.print("Pilih laptop yang ingin digunakan (1/2): ");
        int pilihanLaptop = input.nextInt();
        input.nextLine(); // Clear buffer

        // Inisialisasi objek berdasarkan pilihan user (Polimorfisme)
        if (pilihanLaptop == 1) {
            laptopFisik = new Toshiba();
        } else if (pilihanLaptop == 2) {
            laptopFisik = new MacBook();
        } else {
            System.out.println("Pilihan tidak valid! Program keluar.");
            input.close();
            return;
        }

        // Hubungkan laptop fisik dengan user pengontrol
        LaptopUser user = new LaptopUser(laptopFisik);
        String aksi;

        System.out.println("\n--- SISTEM OPERASI LAPTOP SIAP ---");
        System.out.println("Gunakan perintah berikut:");
        System.out.println("-> 'ON'   : Menyala");
        System.out.println("-> 'OFF'  : Mematikan");
        System.out.println("-> 'UP'   : Menambah Volume");
        System.out.println("-> 'DOWN' : Mengurangi Volume");
        System.out.println("-> 'EXIT' : Keluar Program");
        System.out.println("----------------------------------");

        do {
            System.out.print("\nMasukkan Perintah: ");
            aksi = input.nextLine().trim().toUpperCase(); // Normalisasi input [cite: 120, 121, 123, 124]

            switch (aksi) {
                case "ON" -> user.turnOnLaptop();     // [cite: 120]
                case "OFF" -> user.turnOffLaptop();   // [cite: 121]
                case "UP" -> user.makeLaptopLouder();  // [cite: 123]
                case "DOWN" -> user.makeLaptopSilent(); // [cite: 124]
                case "EXIT" -> System.out.println("Terima kasih telah menggunakan simulasi.");
                default -> System.out.println("Perintah tidak dikenali! Ketik ON, OFF, UP, DOWN, atau EXIT.");
            }
        } while (!aksi.equals("EXIT"));

        input.close();
    }
}