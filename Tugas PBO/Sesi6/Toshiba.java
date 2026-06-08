package Tugas PBO.Sesi6;

public class Toshiba implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Toshiba() {
        this.volume = 50; // Volume awal default
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("=== Toshiba ===");
        System.out.println("Laptop menyala... Welcome to TOSHIBA Leading Innovation");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Laptop Toshiba dimatikan.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume Toshiba sudah maksimal (100%)!");
            } else {
                this.volume += 10;
                System.out.println("Volume Toshiba sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan laptop Toshiba terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume Toshiba sudah paling rendah (0%)!");
            } else {
                this.volume -= 10;
                System.out.println("Volume Toshiba sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan laptop Toshiba terlebih dahulu!");
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean isPowerOn() {
        return this.isPowerOn;
    }
}