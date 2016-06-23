package automatos_trabalho2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Automatos_Trabalho2 extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent loader = FXMLLoader.load(getClass().getResource("view/JanelaPrincipal.fxml"));
        primaryStage.setScene(new Scene(loader));
        primaryStage.show();
    }

}
