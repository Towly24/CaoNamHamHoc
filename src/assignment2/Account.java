package assignment2;

import java.util.Scanner;

public class Account {
    int id;
    String name;
    int balance,amount;
    public Account () {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.amount = amount;
    }
    public Account (int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.amount = amount;
    }
    public void Credit() {
        Scanner cd = new Scanner(System.in);
        System.out.println("Nạp tiền vào tài khoản: ");
        amount = cd.nextInt();
        if(amount>0){
            balance+=amount;
        }
        System.out.println("Tài khoản hiện tại có: " +balance);
    }
    public void Debit() {
        Scanner cd = new Scanner(System.in);
        System.out.println("Thanh toán tiền: ");
        amount = cd.nextInt();
        if(amount>balance){
            System.out.println("thanh toán không thành công");
        }
        else{
            balance-=amount;
            System.out.println("Tài khoản còn lại: "+balance);
        }
    }
}
