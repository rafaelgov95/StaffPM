package az.mb;

import az.dialog.DialogPolicial;
import az.main.PolicialPojo;
import az.main.PolicialSQL;
import az.mb.update.StudenUpdateViewController;
import az.mb.update.StudentUppdateModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ViewController implements Initializable {

    @FXML
    private TableView<PolicialPojo> table;
    @FXML
    private TableColumn<PolicialPojo, String> date, nome;
    @FXML
    private TableColumn<PolicialPojo, Integer> idade, vcorrida, vbarra, vapoio, vabdom, mcorrida, mbarra, mapoio, mabdom;
    @FXML
    private TableColumn<PolicialPojo, Double> mediafinal;
    @FXML
    private ObservableList<PolicialPojo> list = FXCollections.observableArrayList();
    PolicialSQL ssql = new PolicialSQL();
    @FXML
    private Button btnInsert, btnDelete, btnRefresh;

    @FXML
    private void insert(ActionEvent event) throws IOException {
        new DialogPolicial().start(new Stage());
        list = ssql.listStudent();
        table.setItems(list);
    }

    @FXML
    private void update(ActionEvent event) {
        new StudentUppdateModel().start(new Stage());
    }

    @FXML
    private void refresh(ActionEvent event) {
        list = ssql.listStudent();
        table.setItems(list);
    }

    @FXML
    private void delete() {
        PolicialPojo pojo = table.getSelectionModel().getSelectedItem();
        ssql.deleteStudent(pojo.getId());
        System.out.println(pojo.getId());
        list = ssql.listStudent();
        table.setItems(list);
    }

    @FXML
    private void selectRow(MouseEvent event) {
        if (event.getClickCount() == 2) {
            PolicialPojo pojo = table.getSelectionModel().getSelectedItem();
            StudenUpdateViewController.id = pojo.getId();
            System.out.println(StudenUpdateViewController.id);
            new StudentUppdateModel().start(new Stage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

//        id.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("id"));
        date.setCellValueFactory(new PropertyValueFactory<PolicialPojo, String>("date"));
        nome.setCellValueFactory(new PropertyValueFactory<PolicialPojo, String>("nome"));
        idade.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("idade"));
        vcorrida.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("vcorrida"));
        vapoio.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("vapoio"));
        vbarra.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("vbarra"));
        vabdom.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("vabdom"));
        mcorrida.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("mcorrida"));
        mapoio.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("mapoio"));
        mbarra.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("mbarra"));
        mabdom.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Integer>("mabdom"));
        mediafinal.setCellValueFactory(new PropertyValueFactory<PolicialPojo, Double>("mediafinal"));
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        list = ssql.listStudent();
        table.setItems(list);

    }
}
