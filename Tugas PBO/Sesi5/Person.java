public class Person {
    // Atribut di-encapsulate (private)
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Override toString
    @Override
    public String toString() {
        return name + " (" + address + ")";
    }
}