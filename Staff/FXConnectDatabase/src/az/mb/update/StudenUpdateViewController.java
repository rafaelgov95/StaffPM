package az.mb.update;

import az.main.PolicialPojo;
import az.main.PolicialSQL;
import java.awt.Point;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudenUpdateViewController implements Initializable {

    @FXML
    Button btnCancel, btnInsert;
    @FXML
    private TextField nome, idade, vcorrida, vapoio, vbarra, vabdom;
    PolicialSQL ssql = new PolicialSQL();
    public static Integer id;
    private PolicialPojo pojo = new PolicialPojo();

    @FXML
    private void insert(ActionEvent event) {
        pojo.setId(id);
        pojo.setNome(nome.getText());
        pojo.setIdade(Integer.parseInt(idade.getText()));
        pojo.setVcorrida(Integer.parseInt(vcorrida.getText()));
        pojo.setVapoio(Integer.parseInt(vapoio.getText()));
        pojo.setVbarra(Integer.parseInt(vbarra.getText()));
        pojo.setVabdom(Integer.parseInt(vabdom.getText()));
        ssql.updateStudent(pojo);
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
        PolicialPojo pojo = ssql.findByID(id);
        System.out.println(id);
        nome.setText(pojo.getNome());
        idade.setText(String.valueOf(pojo.getIdade()));
        vcorrida.setText(String.valueOf(pojo.getVcorrida()));
        vcorrida.setText(String.valueOf(pojo.getVapoio()));
        vcorrida.setText(String.valueOf(pojo.getVbarra()));
        vcorrida.setText(String.valueOf(pojo.getVabdom()));

    }
}
