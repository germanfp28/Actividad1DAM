package com.example.callofduty.controllers;

import com.example.callofduty.dao.ArmaDao;
import com.example.callofduty.dao.JugadorDao;
import com.example.callofduty.models.Arma;
import com.example.callofduty.models.Jugador;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class JugadorController {
    @FXML
    private TextField txtNick;
    @FXML private ComboBox<Arma> cmbArmas;
    @FXML private TableView<Jugador> tabla;
    @FXML private TableColumn<Jugador, String> colNick;
    @FXML private TableColumn<Jugador, String> colArma;

    @FXML
    public void initialize() {
        try {
            cmbArmas.setItems(FXCollections.observableArrayList(ArmaDao.getArmas()));
            colNick.setCellValueFactory(d -> new javafx.beans.property.SimpleStringProperty(d.getValue().getNickname()));
            colArma.setCellValueFactory(d -> new javafx.beans.property.SimpleStringProperty(d.getValue().getArma()));
            cargarTabla();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void insertarJugador() {
        try {
            Arma arma = cmbArmas.getValue();
            if(txtNick.getText().isEmpty() || arma == null) return;
            JugadorDao.CreaciondeJugador(txtNick.getText(), arma.getId());
            cargarTabla();
            txtNick.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarTabla() throws Exception {
        tabla.setItems(FXCollections.observableArrayList(JugadorDao.getJugadores()));
    }
}
