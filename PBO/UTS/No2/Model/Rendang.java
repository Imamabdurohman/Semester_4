package No2.Model;

public class Rendang extends Makanan {
    public Rendang() {
        super("Rendang Daging");
    }

    @Override
    public void makan() {
        System.out.println("Cara makan: Dimakan langsung dengan nasi.");
    }

    @Override
    public void tekstur() {
        System.out.println("Tekstur: Serat daging empuk.");
    }
}