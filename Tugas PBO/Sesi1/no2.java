import javax.swing.JOptionPane;

public class no2 {
    public static void main(String[] args) {
        // 1. Menampilkan dialog Input
        String jawaban = JOptionPane.showInputDialog(
                null, 
                "Anda sedang belajar apa?", 
                "Input", 
                JOptionPane.QUESTION_MESSAGE
        );

        // 2. Mengecek apakah pengguna memasukkan teks dan menekan OK
        if (jawaban != null && !jawaban.trim().isEmpty()) {
            // Menampilkan dialog Message dengan jawaban yang diinputkan pengguna
            JOptionPane.showMessageDialog(
                    null, 
                    "Belajar " + jawaban + " sangat mudah", 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}