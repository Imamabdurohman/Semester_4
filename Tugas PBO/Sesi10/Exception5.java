public class Exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Pesan error: " + e.getMessage());
            System.out.println("Info stack trace:");
            e.printStackTrace(); // Mencetak alur hierarki baris terjadinya error
        }
    }
}