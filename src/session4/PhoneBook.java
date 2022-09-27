package session4;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<Phone> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone){
        Phone Phone1 = new PhoneBook();
        Phone1.setName(name);
        Phone1.setNumberPhone(phone);
        for(int i =0; i < PhoneList.size(); i++){
            if(Phone1.getName() == PhoneList.get(i).getName()){
                if(Phone1.getNumberPhone() != PhoneList.get(i).getNumberPhone()){

                }
            }


        }
    }
    public void removePhone(String name){

    }
    public void updatePhone(String name,String oldNumberPhone, String newNumberPhone){

    }
    public void searchPhone(String name){

    }
    public  void sort(){

    }


}
