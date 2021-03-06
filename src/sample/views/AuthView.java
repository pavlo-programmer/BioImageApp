package sample.views;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.libs.CurrentStage;


import java.io.IOException;

public class AuthView{

    Stage primaryStage = new Stage();
    public void render() throws IOException
    {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/AuthModuleView.fxml"));
        Scene scene = new Scene(parent, 600, 400);
        primaryStage.setResizable(false);
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.setTitle("Authorization");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(0, "sample/views/css/style.css");
        CurrentStage.setStage(primaryStage);
        primaryStage.show();


    }
}
