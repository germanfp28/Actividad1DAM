module org.example.actividad {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires java.desktop;

    opens com.example.callofduty to javafx.fxml;
    opens com.example.callofduty.controllers to javafx.fxml; // <-- abrir controladores
    opens com.example.callofduty.models to javafx.fxml; // <-- abrir modelos si los usas en FXML

    exports com.example.callofduty;
}