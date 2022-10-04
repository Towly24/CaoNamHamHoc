package javafxPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Observable;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtPhoneNumber;


    public Text noticeFullName;
    public Text noticePhoneNumber;

    public ListView<PhoneNumber> lv;

    public ObservableList<PhoneNumber> PhoneList = FXCollections.observableArrayList();



//    public void handleSubmit(){
//        String fn = txtFullName.getText();
//        if(fn.isEmpty()){
//            noticeFullName.setText("Vui lòng nhập họ tên");
//            noticeFullName.setVisible(true);
//        }else {
//            fullName.setText(fn);
//            noticeFullName.setVisible(false);
//            ngocNguNgoc.appendText(fn);
//
//        }
//        String pn = txtPhoneNumber.getText();
//        if(pn.isEmpty()){
//            noticePhoneNumber.setText("Vui lòng nhập số điện thoại");
//            noticePhoneNumber.setVisible(true);
//        }else {
//            phoneNumber.setText(pn);
//            noticePhoneNumber.setVisible(false);
//            ngocNguNgoc.appendText(" - " + pn + "\n");
//        }
//
//
//    }



    public void addContract(){
        try{
            noticeFullName.setVisible(false);
            noticePhoneNumber.setVisible(false);
            if(txtFullName.getText().isEmpty()){
                throw new Exception("Vui Lòng nhập đầy đủ họ và tên");
            }
            if(txtPhoneNumber.getText().isEmpty()){
                throw new Exception("Vui Lòng nhập số điện thoại");
            }

            printfResult();
            updatePhone();
        }catch (Exception e){
            noticeFullName.setText(e.getMessage());
            noticePhoneNumber.setText(e.getMessage());
            noticePhoneNumber.setVisible(true);
            noticeFullName.setVisible(true);
        }

    }

    public void updatePhone(){
        for(PhoneNumber p : PhoneList){
            if(p.getName().equals(txtFullName.getText())){
                p.setPhone(txtPhoneNumber.getText());
                return;
            }
        }
        PhoneList.add(new PhoneNumber(txtFullName.getText(), txtPhoneNumber.getText()));
    }
    public void printfResult(){

        lv.setItems(PhoneList);
        lv.refresh();
    }


}
