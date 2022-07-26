package Main;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Menu implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private Button btnCAMISETA;

    @FXML
    private Button btnCatalogo;

    @FXML
    private Button btnClientes;

    @FXML
    void CLICK(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarCamisa.fxml"));

        // Cargo el padre
        Parent root = loader.load();

        // Obtengo el controlador
        AgregarCamisas controlador = loader.getController();

        // Creo la scene y el stage
        Scene scene1 = new Scene(root);
        Stage stage = new Stage();


        stage.setScene(scene1);
        stage.show();

        // Indico que debe hacer al cerrar
        stage.setOnCloseRequest(e -> {
            try {
                controlador.closeWindows();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Ciero la ventana donde estoy
        Stage myStage = (Stage) this.btnCAMISETA.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void Click(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarClientes.fxml"));

        // Cargo el padre
        Parent root = loader.load();

        // Obtengo el controlador
        AgregarClientes controlador = loader.getController();

        // Creo la scene y el stage
        Scene scene1 = new Scene(root);
        Stage stage = new Stage();


        stage.setScene(scene1);
        stage.show();

        // Indico que debe hacer al cerrar
        stage.setOnCloseRequest(e -> {
            try {
                controlador.closeWindows();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Ciero la ventana donde estoy
        Stage myStage = (Stage) this.btnClientes.getScene().getWindow();
        myStage.close();
    }


    @FXML
    void click (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarCatalogos.fxml"));

        // Cargo el padre
        Parent root = loader.load();

        // Obtengo el controlador
        AgregarCatalogos controlador = loader.getController();

        // Creo la scene y el stage
        Scene scene1 = new Scene(root);
        Stage stage = new Stage();


        stage.setScene(scene1);
        stage.show();

        // Indico que debe hacer al cerrar
        stage.setOnCloseRequest(e -> {
            try {
                controlador.closeWindows();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Ciero la ventana donde estoy
        Stage myStage = (Stage) this.btnCatalogo.getScene().getWindow();
        myStage.close();
    }



}