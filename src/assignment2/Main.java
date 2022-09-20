package assignment2;

public class Main {
    public static void main(String[] args){
        Account c1= new Account();
        c1.id = 1;
        c1.name = "nam";
        c1.balance = 200;
        c1.Credit();
        c1.Debit();
        Account c2 = new Account(2, "Dan", 300);
        c2.Credit();
        c2.Debit();
    }
}
