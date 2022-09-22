package assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Acount myAccount = new Acount(1,"Cao Hoàng Nam", 1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut: ");
        int x =sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rut thanh cong");
        }else{
            System.out.println("rut that bai");
        }
        Acount dan = new Acount(2,"Nguyen Linh Dan",10000);
        System.out.println("Nhap so tien muon chuyen: ");
        int b =sc.nextInt();
        if(myAccount.tranfer(dan,b)){
            System.out.println("chuyen thanh cong sang tai khoan "+ dan.getName());
        }else {
            System.out.println("chuyen that bai");
        }
    }
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);

        PhanSo f1 = new PhanSo();
        f1.setTuSo(sc.nextInt());
        f1.setMauSo(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        PhanSo t = f1.add(f2);
        t.rutGon();
        t.inPhanSo();
    }
}
