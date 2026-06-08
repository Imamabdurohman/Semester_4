public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello World!",
            "No, I mean it!",
            "HELLO WORLD!"
        };
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i = 0; // Mengembalikan indeks ke 0 jika melebihi batas
                break; // Break untuk menghindari infinite loop
            }
        }
    }
}