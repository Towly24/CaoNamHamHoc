package assignment2;

import java.util.Scanner;

public class Account {
    int id;
    String name;
    int balance;
    public Account () {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }
    public Account (int id, String name, int balance) {
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void Credit() {
        Scanner cd = new Scanner(System.in);
        System.out.println("Nạp tiền vào tài khoản với " +id +": ");
        int amount = cd.nextInt();
        if(amount>0){
            this.balance+=amount;
        }
        System.out.println("Tài khoản "+ id +" hiện tại có " +balance);
    }
    public void Debit() {
        Scanner cd = new Scanner(System.in);
        System.out.println("Thanh toán tiền: ");
        int amount = cd.nextInt();
        if(amount>balance){
            System.out.println("thanh toán không thành công");
        }
        else{
            this.balance-=amount;
            System.out.println("Tài khoản còn lại: "+balance);
        }
    }
}
