import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class myjavafx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start (Stage primaryStage) throws Exception {
        // lire le fichier
        BorderPane borderpane =FXMLLoader.load(getClass().getResource("layout.fxml")); // mettre l url de fichier fxml
        Scene scene = new Scene(borderpane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
