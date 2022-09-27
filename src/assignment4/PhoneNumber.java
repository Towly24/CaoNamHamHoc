package assignment4;

import java.util.ArrayList;
import java.util.Comparator;

public class PhoneNumber extends PhoneBook{
    public String name;
    public ArrayList<String> phone;

    public PhoneNumber(String name, ArrayList<String> phone) {
        this.name = name;
        this.phone = phone;
    }
    public boolean Sosanhname(String name){
        boolean contains = false;
        if(this.name == name){
            contains = true;
        }
        return contains;
    }

}
