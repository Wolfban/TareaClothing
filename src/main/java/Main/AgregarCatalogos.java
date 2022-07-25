package Main;

import Modelo.Catalogos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AgregarCatalogos implements Initializable {

    @FXML
    private Button btnAgregarCamisa;

    @FXML
    private Button btnCrear;

    @FXML
    private TableColumn<?, ?> colmFecha;

    @FXML
    private TableColumn<?, ?> colmFecha1;

    @FXML
    private TableColumn<?, ?> colmNombre;

    @FXML
    private TableView<Catalogos> tblCatalogo;

    @FXML
    private TextField txtFechaCreacion;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtNombre;

    @FXML
    void click(ActionEvent event) {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

