package assignment7;


import AddStudent.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtEmail;
    @FXML
    public TextField txtPoint;

    @FXML
    public Text errors;

    @FXML
    public TableView<Students> table;
    @FXML

    public TableColumn<Students, String> nameColumn;
    @FXML
    public TableColumn<Students, String> emailColumn;
    @FXML

    public TableColumn<Students, Integer> pointColumn;

    public ObservableList<Students> StudentList ;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        StudentList = FXCollections.observableArrayList(
        );
        nameColumn.setCellValueFactory(new PropertyValueFactory<Students, String>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Students, String>("email"));
        pointColumn.setCellValueFactory(new PropertyValueFactory<Students, Integer>("point"));
        table.setItems(StudentList);

        nameColumn.setSortType(TableColumn.SortType.DESCENDING);

    }

    public void add(ActionEvent e){
        Students newStudent = new Students();

        newStudent.setName(txtName.getText());
        newStudent.setEmail(txtEmail.getText());

        newStudent.setPoint(Integer.parseInt(txtPoint.getText()));
        StudentList.add(newStudent);
        table.setItems(StudentList);
    }


}
