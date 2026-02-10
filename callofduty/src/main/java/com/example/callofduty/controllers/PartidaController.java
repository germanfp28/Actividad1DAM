package com.example.callofduty.controllers;

import com.example.callofduty.dao.JugadorDao;
import com.example.callofduty.dao.PartidaDao;
import com.example.callofduty.models.Jugador;
import com.example.callofduty.models.Partida;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PartidaController {
    @FXML
    private ComboBox<Jugador> cmbJugador;
    @FXML private TextField txtBajas;
    @FXML private TextField txtMuertes;
    @FXML private TableView<Partida> tabla;
    @FXML private TableColumn<Partida, String> colJugador;
    @FXML private TableColumn<Partida, String> colArma;
    @FXML private TableColumn<Partida, Integer> colBajas;
    @FXML private TableColumn<Partida, Integer> colMuertes;

    @FXML
    public void initialize() {
        try {
            cmbJugador.setItems(FXCollections.observableArrayList(JugadorDao.getJugadores()));
            colJugador.setCellValueFactory(d -> new javafx.beans.property.SimpleStringProperty(d.getValue().getJugador()));
            colArma.setCellValueFactory(d -> new javafx.beans.property.SimpleStringProperty(d.getValue().getArma()));
            colBajas.setCellValueFactory(d -> new javafx.beans.property.SimpleIntegerProperty(d.getValue().getBaja()).asObject());
            colMuertes.setCellValueFactory(d -> new javafx.beans.property.SimpleIntegerProperty(d.getValue().getMuerte()).asObject());
            cargarTabla();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void insertarPartida() {
        try {
            Jugador j = cmbJugador.getValue();
            if(j == null || txtBajas.getText().isEmpty() || txtMuertes.getText().isEmpty()) return;
            int bajas = Integer.parseInt(txtBajas.getText());
            int muertes = Integer.parseInt(txtMuertes.getText());
            PartidaDao.CreaciondePartida(jugador, bajas, muertes);
            cargarTabla();
            txtBajas.clear();
            txtMuertes.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarTabla() throws Exception {
        tabla.setItems(FXCollections.observableArrayList(PartidaDao.getPartida()));
    }
}
