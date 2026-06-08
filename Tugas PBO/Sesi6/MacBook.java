package Tugas PBO.Sesi6;

public class MacBook implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public MacBook() {
        this.volume = 40; // Volume awal default
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("=== MacBook ===");
        System.out.println("Laptop menyala... macOS is loading. Ding!");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("MacBook berhasil dimatikan (Shut Down).");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume MacBook sudah maksimal (100%)!");
            } else {
                this.volume += 10;
                System.out.println("Volume MacBook sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan MacBook terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume MacBook sudah mute (0%)!");
            } else {
                this.volume -= 10;
                System.out.println("Volume MacBook sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan MacBook terlebih dahulu!");
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