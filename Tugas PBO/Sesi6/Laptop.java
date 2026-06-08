package Tugas PBO.Sesi6;

public interface Laptop {
    // Konstanta untuk batasan volume
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    // Method abstract yang wajib diimplementasikan
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
    boolean isPowerOn();
}