package JavaSE.Oct26.Demo03SendRedPacket;

public class User {
    private String name;
    private int balance;

    public User() {
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void show(){
        System.out.println(this.getName() + " total balance is " + this.getBalance());
    }
}
