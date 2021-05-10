package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {
    public TextField touche;
    public AnchorPane anchorPane;
    boolean laTouche=false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gestionTouche();
    }

    public void gestionTouche() {
        TimerTask tachebaseDeTemps= new TimerTask() {
            @Override
            public void run() {
                if(Main.getMyVariable()){
                    anchorPane.setStyle( "-fx-background-color: red;");
                }else if (!Main.getMyVariable()){
                    anchorPane.setStyle( "-fx-background-color: white;");
                }
            }
        };
        new Timer().scheduleAtFixedRate(tachebaseDeTemps,0,50);
    }

}
