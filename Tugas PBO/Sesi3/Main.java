import java.util.ArrayList;
import java.util.Scanner;

// Superclass
class Mahasiswa {
    protected String nim;
    protected String nama;
    protected double nilai;

    public Mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
}

// Subclass menerapkan Inheritance
class HitungNilai extends Mahasiswa {
    private String grade;
    private String status;

    public HitungNilai(String nim, String nama, double nilai) {
        super(nim, nama, nilai);
        tentukanGradeDanStatus();
    }

    private void tentukanGradeDanStatus() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
            status = "Lulus";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
            status = "Lulus";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C";
            status = "Lulus";
        } else if (nilai >= 50 && nilai < 60) {
            grade = "D";
            status = "Tidak Lulus";
        } else if (nilai >= 0 && nilai < 50) {
            grade = "E";
            status = "Tidak Lulus";
        } else {
            grade = "Salah";
            status = "Salah";
        }
    }

    public String getGrade() { return grade; }
    public String getStatus() { return status; }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HitungNilai> daftarMahasiswa = new ArrayList<>();
        
        System.out.println("=== ENTRY DATA NILAI MAHASISWA ===");
        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM  : ");
            String nim = scanner.nextLine();
            System.out.print("Nama : ");
            String nama = scanner.nextLine();
            
            double nilai = -1;
            while (true) {
                System.out.print("Nilai: ");
                nilai = scanner.nextDouble();
                scanner.nextLine(); // Membersihkan buffer
                
                if (nilai >= 0 && nilai <= 100) {
                    break;
                } else {
                    System.out.println("Notifikasi: Input nilai anda salah! (Harus 0-100)");
                }
            }

            // Polimorfisme & Inheritance
            HitungNilai mhs = new HitungNilai(nim, nama, nilai);
            daftarMahasiswa.add(mhs);
        }

        // ================= OUTPUT LAYOUT =================
        System.out.println("\n====================================");
        System.out.println("--- HASIL OUTPUT DATA MAHASISWA ---");
        System.out.println("====================================");

        double totalNilai = 0;
        ArrayList<String> lulusNama = new ArrayList<>();
        ArrayList<String> tidakLulusNama = new ArrayList<>();
        ArrayList<String> gradeANama = new ArrayList<>();
        ArrayList<String> gradeBNama = new ArrayList<>();
        ArrayList<String> gradeCNama = new ArrayList<>();
        ArrayList<String> gradeDNama = new ArrayList<>();
        ArrayList<String> gradeENama = new ArrayList<>();

        for (HitungNilai mhs : daftarMahasiswa) {
            System.out.println("NIM: " + mhs.nim);
            System.out.println("Nama: " + mhs.nama);
            System.out.println("Nilai: " + (int)mhs.nilai);
            System.out.println("Grade: " + mhs.getGrade());
            System.out.println("===");

            // Akumulasi data statistik
            totalNilai += mhs.nilai;
            if (mhs.getStatus().equals("Lulus")) {
                lulusNama.add(mhs.nama);
            } else {
                tidakLulusNama.add(mhs.nama);
            }

            // Pengelompokan Grade
            switch (mhs.getGrade()) {
                case "A" -> gradeANama.add(mhs.nama);
                case "B" -> gradeBNama.add(mhs.nama);
                case "C" -> gradeCNama.add(mhs.nama);
                case "D" -> gradeDNama.add(mhs.nama);
                case "E" -> gradeENama.add(mhs.nama);
            }
        }

        // Ringkasan Statistik Akhir
        double rataRata = totalNilai / daftarMahasiswa.size();

        System.out.println("Jumlah Mahasiswa: " + daftarMahasiswa.size());
        System.out.println("Jumlah Mahasiswa yg Lulus: " + lulusNama.size() + " yaitu " + String.join(", ", lulusNama));
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus: " + tidakLulusNama.size() + " yaitu " + String.join(", ", tidakLulusNama));
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + gradeANama.size() + " yaitu " + String.join(", ", gradeANama));
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + gradeBNama.size() + " yaitu " + String.join(", ", gradeBNama));
        System.out.println("Jumlah Mahasiswa dengan Nilai C = " + gradeCNama.size() + " yaitu " + String.join(", ", gradeCNama));
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + gradeDNama.size() + " yaitu " + String.join(", ", gradeDNama));
        System.out.println("Jumlah Mahasiswa dengan Nilai E = " + gradeENama.size() + " yaitu " + String.join(", ", gradeENama));
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRata);
        
        scanner.close();
    }
}