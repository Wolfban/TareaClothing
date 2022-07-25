module com.example.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens Main to javafx.fxml;
    exports Main;

    opens Controlador to javafx.fxml;
    exports Controlador;
    opens Modelo to javafx.fxml;
    exports Modelo;
}