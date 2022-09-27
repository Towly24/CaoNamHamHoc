package session3;

import assignment.Acount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        BullDog bd = new BullDog();

    }
    public static void mainOld(String[] args) {
        ArrayList arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add("hello world!");
        arrList.add(new Acount());
        arrList.remove(1);
        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("hello");
        strArray.add("world");
        strArray.add("net");
        for (String s: strArray){
            System.out.println(s);
        }
        for(int i=0;i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }
    }

}
