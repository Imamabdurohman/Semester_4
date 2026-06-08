class Produk {
    protected  String nama;
    protected  int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String tampilInfo() {
        return "[UMUM]  " + nama + " | Harga: " + harga;
    }

}