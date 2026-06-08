public class Arithmetic1 {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0;
            System.out.println("Hasil = " + hasil);
        } catsh
            int b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
    }

}