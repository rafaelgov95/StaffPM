package az.dialog;

import az.main.PolicialPojo;
import az.main.PolicialSQL;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DialogViewController implements Initializable {

    @FXML
    Button btnCancel, btnInsert;
    @FXML
    private TextField nome, idade, vcorrida, vapoio, vbarra, vabdom;
    PolicialSQL ssql = new PolicialSQL();

    @FXML
    private void insert(ActionEvent event) {
        PolicialPojo pojo = new PolicialPojo();
        System.out.println(ssql.studentMaxID());
        pojo.setId(ssql.studentMaxID());
        pojo.setNome(nome.getText());
        pojo.setIdade(Integer.parseInt(idade.getText()));
        pojo.setVcorrida(Integer.parseInt(vcorrida.getText()));
        pojo.setVapoio(Integer.parseInt(vapoio.getText()));
        pojo.setVbarra(Integer.parseInt(vbarra.getText()));
        pojo.setVabdom(Integer.parseInt(vabdom.getText()));
        pojo.setMcorrida(pojo.getHomem().Correr(pojo.getVcorrida(), pojo.getIdade()));
        pojo.setMapoio(pojo.getHomem().Apio(pojo.getVapoio(), pojo.getIdade()));
        pojo.setMbarra(pojo.getHomem().barra(pojo.getVcorrida(), pojo.getIdade()));
        pojo.setMabdom(pojo.getHomem().abdom(pojo.getVabdom(), pojo.getIdade()));
        pojo.setMediafinal(((pojo.getMapoio()+pojo.getMcorrida()+pojo.getMbarra()+pojo.getMabdom())/4));
        ssql.insertPolicial(pojo);
        Stage stage = (Stage) btnInsert.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void cancel(ActionEvent event) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
