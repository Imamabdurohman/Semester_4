class Tabungan {
    private double saldo;

    void tambah(double jumlah) {
        saldo += jumlah; 
    }

    void ambil(double jumlah) {
        saldo -= jumlah;
    }

    void infoSaldo() {
        System.out.println("Saldo :" + saldo);
    }
}

public class contoh {
    public static void main(String[] arg) {
        Tabungan imam = new Tabungan();
        // imam.saldo = -100000;
        imam.tambah(100000);
        imam.ambil(50000);
        imam.infoSaldo();
    }
}