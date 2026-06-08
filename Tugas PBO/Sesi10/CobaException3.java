public class CobaException3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0); // Pembagian dengan nol tidak valid
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ini menghandle error umum yang terjadi");
        }
    }
}