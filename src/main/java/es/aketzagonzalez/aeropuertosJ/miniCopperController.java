package es.aketzagonzalez.aeropuertosJ;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class miniCopperController {

    @FXML
    private ToggleButton btnBlazingRed;

    @FXML
    private ToggleButton btnElectricBlue;

    @FXML
    private ToggleButton btnLapisluxuryBlue;

    @FXML
    private ToggleButton btnMidnightBlack;

    @FXML
    private ToggleButton btnMoonwalkGrey;

    @FXML
    private ToggleButton btnPepperWhite;

    @FXML
    private ToggleButton btnThunderGray;

    @FXML
    private ToggleButton btnVolcaninOrange;

    @FXML
    private ToggleGroup grupoColores;

    @FXML
    private ImageView imgActivarLuces;

    @FXML
    private ImageView imgLuces;

    @FXML
    void cambiarColor(MouseEvent event) {

    }

    @FXML
    void toggleLuces(MouseEvent event) {
    	imgLuces.setVisible(!imgLuces.isVisible());
    }

}
