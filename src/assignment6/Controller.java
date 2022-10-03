package assignment6;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtPhoneNumber;

    public Text fullName;
    public Text phoneNumber;

    public Text noticeFullName;
    public Text noticePhoneNumber;

    public TextArea ngocNguNgoc;

    public void handleSubmit(){
        String fn = txtFullName.getText();
        if(fn.isEmpty()){
            noticeFullName.setText("Vui lòng nhập họ tên");
            noticeFullName.setVisible(true);
        }else {
            fullName.setText(fn);
            noticeFullName.setVisible(false);
            ngocNguNgoc.appendText(fn);

        }
        String pn = txtPhoneNumber.getText();
        if(pn.isEmpty()){
            noticePhoneNumber.setText("Vui lòng nhập số điện thoại");
            noticePhoneNumber.setVisible(true);
        }else {
            phoneNumber.setText(pn);
            noticePhoneNumber.setVisible(false);
            ngocNguNgoc.appendText(" - " + pn + "\n");
        }


    }
}