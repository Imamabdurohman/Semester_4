public class Exception1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100; // Memicu error indeks luar batas
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi pelanggaran memory: " + e.getMessage());
        }
    }
}