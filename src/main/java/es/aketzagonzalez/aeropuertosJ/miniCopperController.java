package es.aketzagonzalez.aeropuertosJ;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
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
    private ImageView imgCoche;

    @FXML
    void cambiarColor(MouseEvent event) {
    	if(btnBlazingRed.isSelected()) {
    		System.out.println("AQUI");
    		imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniBlazingRed.png").toString()));
    	}else {
    		if(btnElectricBlue.isSelected()) {
    			imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniElectricBlue.png").toString()));
    		}else {
    			if(btnLapisluxuryBlue.isSelected()) {
    				imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniLapisluxuryBlue.png").toString()));
    			}else {
    				if(btnMidnightBlack.isSelected()) {
    					imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniMidnightBlack.png").toString()));
    				}else {
    					if(btnMoonwalkGrey.isSelected()) {
    						imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniMoonwalkGrey.png").toString()));
    					}else {
    						if(btnPepperWhite.isSelected()) {
    							imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniPepperWhite.png").toString()));
    						}else {
    							if(btnThunderGray.isSelected()) {
    								imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniThunderGray.png").toString()));
    							}else {
    								if(btnVolcaninOrange.isSelected()) {
    									imgCoche.setImage(new Image(getClass().getResource("/imagenes/coches/miniVolcaninOrange.png").toString()));
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    }

    @FXML
    void toggleLuces(MouseEvent event) {
    	if(imgLuces.isVisible()) {
    		imgActivarLuces.setImage(new Image(getClass().getResourceAsStream("/imagenes/lucesOff.png")));
    	}else {
    		imgActivarLuces.setImage(new Image(getClass().getResourceAsStream("/imagenes/lucesOn.png")));
    	}
    	imgLuces.setVisible(!imgLuces.isVisible());
    }
    
}
