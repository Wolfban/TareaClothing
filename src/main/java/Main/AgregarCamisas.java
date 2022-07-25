package Main;

import Modelo.Camisas;
import Modelo.Usuarios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AgregarCamisas implements Initializable {

    @FXML
    private ComboBox Combobox;

    @FXML
    private Button btnCrear;

    @FXML
    private TableColumn coluColor;

    @FXML
    private TableColumn coluDesc;

    @FXML
    private TableColumn<?, ?> coluID;

    @FXML
    private TableColumn<?, ?> coluImg;

    @FXML
    private TableColumn<?, ?> coluPrecio;

    @FXML
    private TableColumn<?, ?> coluTamannio;

    @FXML
    private TableView<Camisas> tblCamisa;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtPrecio;

    @FXML
    void select(ActionEvent event) {

        String s = Combobox.getSelectionModel().getSelectedItem().toString();

    }




    @FXML
    void click(ActionEvent event) {
        try {
            String color = this.txtColor.getText();
            String desc = this.txtDescripcion.getText();
            float precios = Integer.parseInt(this.txtPrecio.getText());
            String s = this.Combobox.getPromptText();

            Camisas c = new Camisas(color, desc, precios );

            if (!this.camisas.contains(c)) {
                this.camisas.add(c);
                this.tblCamisa.setItems(camisas);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Formato Incorrecto");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato Incorrecto");
            alert.showAndWait();
        }
    }




    private ObservableList<Camisas> camisas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        camisas = FXCollections.observableArrayList();
        coluDesc.setCellValueFactory(new PropertyValueFactory("desc"));
        coluID.setCellValueFactory(new PropertyValueFactory("ID"));
        coluColor.setCellValueFactory(new PropertyValueFactory("color"));
        coluPrecio.setCellValueFactory(new PropertyValueFactory("precio"));
        coluTamannio.setCellValueFactory(new PropertyValueFactory("list"));
        tblCamisa.setItems(camisas);
        ObservableList<String> list = FXCollections.observableArrayList("S","L","M");
        Combobox.setItems(list);
    }


    public void closeWindows() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));

        Parent root = loader.load();
        Object controlador = loader.getController();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

    }
}

