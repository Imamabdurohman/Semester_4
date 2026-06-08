public class Main {
    public static void main(String[] args) {
        BankAccount imam = new BankAccount (1000000, "8790094922","Imam");
        imam.deposit(5000000);
        imam.withdraw(500000);
        System.out.println(imam);
    }
}
