package Sesi6;

public class LaptopUser {
    private Laptop laptop;

    // Menggunakan prinsip Loose Coupling melalui Interface
    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOnLaptop() {
        this.laptop.powerOn();
    }

    public void turnOffLaptop() {
        this.laptop.powerOff();
    }

    public void makeLaptopLouder() {
        this.laptop.volumeUp();
    }

    public void makeLaptopSilent() {
        this.laptop.volumeDown();
    }
}