package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {
    public void backToList(ActionEvent actionEvent) throws Exception{
        Parent formPage = FXMLLoader.load(getClass().getResource("../list/JavaFx.fxml"));
        Scene formScene = new Scene(formPage,800,600);
        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(formScene);
    }
}
