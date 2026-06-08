// ==========================================
// 1. SUPERCLASS BANK (METHOD OVERLOADING)
// ==========================================
class Bank {
    
    // Suku bunga standar [cite: 45]
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    // Variasi 1: Transfer sesama bank (tanpa biaya admin) [cite: 41]
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("--- Transfer Sesama Bank ---");
        System.out.println("Transfer ke rekening: " + rekeningTujuan);
        System.out.println("Jumlah              : Rp " + jumlah);
        System.out.println("Biaya Admin         : Rp 0");
        System.out.println("Total Transaksi     : Rp " + jumlah);
        System.out.println("Status              : BERHASIL\n");
    }

    // Variasi 2: Transfer ke bank lain (dengan Bonus Challenge biaya transfer) [cite: 42, 53]
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biayaAdmin = hitungBiayaTransfer(bankTujuan);
        System.out.println("--- Transfer Antar Bank ---");
        System.out.println("Transfer ke rekening: " + rekeningTujuan + " (" + bankTujuan + ")");
        System.out.println("Jumlah              : Rp " + jumlah);
        System.out.println("Biaya Admin         : Rp " + biayaAdmin);
        System.out.println("Total Transaksi     : Rp " + (jumlah + biayaAdmin));
        System.out.println("Status              : BERHASIL\n");
    }

    // Variasi 3: Transfer dengan tambahan berita [cite: 43, 44]
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        int biayaAdmin = hitungBiayaTransfer(bankTujuan);
        System.out.println("--- Transfer dengan Berita ---");
        System.out.println("Transfer ke rekening: " + rekeningTujuan + " (" + bankTujuan + ")");
        System.out.println("Jumlah              : Rp " + jumlah);
        System.out.println("Berita              : \"" + berita + "\"");
        System.out.println("Biaya Admin         : Rp " + biayaAdmin);
        System.out.println("Total Transaksi     : Rp " + (jumlah + biayaAdmin));
        System.out.println("Status              : BERHASIL\n");
    }

    // Bonus Challenge: Logika penentu biaya transfer berdasarkan bank tujuan 
    protected int hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI") || bankTujuan.equalsIgnoreCase("BCA")) {
            return 6500; // Biaya standar antar bank umum
        } else {
            return 7500; // Biaya bank lainnya
        }
    }
}

// ==========================================
// 2. SUBCLASS BANK BNI (METHOD OVERRIDING)
// ==========================================
class BankBNI extends Bank {
    
    // Overriding Suku Bunga BNI (4%) [cite: 49, 50]
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah: 4%");
    }

    // Overriding Transfer Uang dengan bankTujuan otomatis "BNI" [cite: 49, 52]
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        String bankOtomatis = "BNI"; 
        // Menggunakan logika biaya transfer internal BNI (jika sesama BNI biaya 0, jika salah input tetap dihitung antar-bank) 
        int biayaAdmin = bankTujuan.equalsIgnoreCase("BNI") ? 0 : 6500;
        
        System.out.println("--- [BNI Mobile] Transfer Online ---");
        System.out.println("Bank Pengirim       : BNI");
        System.out.println("Transfer ke rekening: " + rekeningTujuan + " (" + bankOtomatis + ")");
        System.out.println("Jumlah              : Rp " + jumlah);
        System.out.println("Biaya Admin         : Rp " + biayaAdmin);
        System.out.println("Total Transaksi     : Rp " + (jumlah + biayaAdmin));
        System.out.println("Status              : BERHASIL\n");
    }
}

// ==========================================
// 3. SUBCLASS BANK BCA (METHOD OVERRIDING)
// ==========================================
class BankBCA extends Bank {
    
    // Overriding Suku Bunga BCA (4.5%) [cite: 49, 51]
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah: 4.5%");
    }

    // Overriding Transfer Uang dengan bankTujuan otomatis "BCA" [cite: 49, 52]
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        String bankOtomatis = "BCA";
        int biayaAdmin = bankTujuan.equalsIgnoreCase("BCA") ? 0 : 6500; // Bonus challenge biaya transfer 
        
        System.out.println("--- [KlikBCA] Transfer Online ---");
        System.out.println("Bank Pengirim       : BCA");
        System.out.println("Transfer ke rekening: " + rekeningTujuan + " (" + bankOtomatis + ")");
        System.out.println("Jumlah              : Rp " + jumlah);
        System.out.println("Biaya Admin         : Rp " + biayaAdmin);
        System.out.println("Total Transaksi     : Rp " + (jumlah + biayaAdmin));
        System.out.println("Status              : BERHASIL\n");
    }
}

// ==========================================
// 4. KELAS UTAMA UNTUK PENGUJIAN (MAIN CLASS)
// ==========================================
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN POLIMORFISME BANK ===\n");

        // ------------------------------------------
        // Pengujian 1: Method Overloading pada class Bank [cite: 46, 47]
        // ------------------------------------------
        System.out.println(">>> 1. PENGUJIAN METHOD OVERLOADING (Class Bank) <<<");
        Bank bankUmum = new Bank();
        bankUmum.sukuBunga(); // Memanggil suku bunga standar [cite: 45]
        System.out.println();
        
        // Memanggil variasi transfer 1 (Jumlah, Rekening) [cite: 41]
        bankUmum.transferUang(500000, "123456789");
        
        // Memanggil variasi transfer 2 (Jumlah, Rekening, Bank) [cite: 42]
        bankUmum.transferUang(250000, "987654321", "Mandiri");
        
        // Memanggil variasi transfer 3 (Jumlah, Rekening, Bank, Berita) [cite: 43, 44]
        bankUmum.transferUang(100000, "555666777", "BRI", "Bayar Uang Kas");

        System.out.println("--------------------------------------------------\n");

        // ------------------------------------------
        // Pengujian 2: Method Overriding pada Subclass [cite: 47, 48]
        // ------------------------------------------
        System.out.println(">>> 2. PENGUJIAN METHOD OVERRIDING & BONUS CHALLENGE <<<");
        
        // Menguji Bank BNI 
        Bank bni = new BankBNI();
        bni.sukuBunga(); // Output harus 4% [cite: 50]
        bni.transferUang(150000, "0011223344", "BNI"); // Bank tujuan otomatis disesuaikan menjadi BNI [cite: 52]
        
        // Menguji Bank BCA 
        Bank bca = new BankBCA();
        bca.sukuBunga(); // Output harus 4.5% [cite: 51]
        bca.transferUang(300000, "4433221100", "BCA"); // Bank tujuan otomatis disesuaikan menjadi BCA [cite: 52]
    }
}