package assignment8.List;

import assignment8.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ListController {

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../Form/FormFx.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        assignment8.Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);
    }
}

