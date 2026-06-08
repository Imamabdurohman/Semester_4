public class Mahasiswaku {
    public static void main(String[] args) {
        // Inisialisasi class generic dengan tipe String, String, dan Integer
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}