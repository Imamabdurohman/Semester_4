public class HandPhone { // Perbaikan: Menggunakan kurung kurawal buka '{' bukan kurung biasa '('
    
    // Perbaikan: Variabel tidak boleh menggunakan spasi. 'tahun pembuatan' diganti 'tahun_pembuatan'
    String jenis_hp; // Perbaikan: Tambah titik koma ';'
    int tahun_pembuatan; 

    // Perbaikan: Urutan access modifier harus 'public void', bukan 'String public'
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        // Perbaikan: Gunakan kata kunci 'this' untuk membedakan atribut class dengan parameter method
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Perbaikan: Tambahkan statement 'return' di dalam method getter
    String getJenisHP() {
        return jenis_hp; 
    }

    // Perbaikan: Menyesuaikan nama variabel yang benar tanpa spasi dan beri 'return'
    int getTahunPembuatan() { // Perbaikan: diubah mengembalikan 'int' bukan 'String'
        return tahun_pembuatan;
    }

    // Perbaikan: Urutan method main yang benar adalah 'public static void main(String[] args)'
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        
        // Perbaikan: Masukkan nilai konkret (argumen) ke dalam method setter
        hp.setDataHP("Samsung Galaxy S24", 2024);
        
        // Perbaikan: Gunakan System.out.println agar hasil get bisa tercetak di layar monitor dan tambah ';'
        System.out.println("Jenis HP : " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan : " + hp.getTahunPembuatan());
    }
}