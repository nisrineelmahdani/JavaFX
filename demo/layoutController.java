import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class layoutController {
    @FXML TextField TextFieldForm ; // c'est le id dans le fichier  !!!!!!!!!!! la notation fxml associe entre ce textfield et textfield dans le fichier pour que textfield ne reste pas null ( si tu napas utilisé @fxml la valeure reste null par défaut et donc une erreur de pointernullexception)
    @FXML ListView<String> listview1 ;
    // fonction pour un événement
    public void addFruit(){
        String nom = TextFieldForm.getText();
        listview1.getItems().add(nom);
    }
}
