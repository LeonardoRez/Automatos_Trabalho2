package automatos_trabalho2.view;

import automatos_trabalho2.AFD;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JanelaPrincipalController implements Initializable {

    //referencias dos objetos gráficos
    @FXML
    public Button btConferir;
    @FXML
    public TextField tfPalavra;
    @FXML
    public Label lbLog;
    AFD AFD;

    //eventos
    @FXML
    public void conferePalavra() {
        if (tfPalavra.getText().length() > 0) {
            if (AFD.funcaoEstendida(tfPalavra.getText())) {
                lbLog.setText("PALAVRA RECONHECIDA PELO AUTÔMATO");
                lbLog.setTextFill(Color.BLUE);
            } else {
                lbLog.setText("PALAVRA !!NÃO!! RECONHECIDA!");
                lbLog.setTextFill(Color.RED);
            }
        } else {
            lbLog.setText("PALAVRA !!NÃO!! RECONHECIDA!");
            lbLog.setTextFill(Color.RED);
        }
    }

    public void fecharComEsc(KeyEvent t) {

        if (t.getCode() == KeyCode.ESCAPE) {
            Stage s = (Stage) lbLog.getScene().getWindow();
            s.close();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AFD = new AFD();
        lbLog.setAlignment(Pos.CENTER);
    }

}
