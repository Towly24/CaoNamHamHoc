package assignment;


public class Acount {
    public int id;
    public String name;
    public double balance;

    public Acount() {
    }

    public Acount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean creadit(int amount){
        if(amount <=0) return false;
        balance+=amount;
        return true;
    }
    public boolean debit(int amount){
        if(amount <=0 || amount>balance) return false;
        balance -=amount;
        return true;
    }
    public boolean tranfer(Acount acount, int amount){
        if(amount <=0 || amount>balance) return false;
        acount.balance += amount;
        balance -=amount;
        return true;
    }
}
