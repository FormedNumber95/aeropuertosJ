package es.aketzagonzalez.aeropuertosJ;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Clase miniCopperController.
 */
public class miniCopperController {

    /** El btn blazing red. */
    @FXML
    private ToggleButton btnBlazingRed;

    /** El btn electric blue. */
    @FXML
    private ToggleButton btnElectricBlue;

    /** El btn lapisluxury blue. */
    @FXML
    private ToggleButton btnLapisluxuryBlue;

    /** El btn midnight black. */
    @FXML
    private ToggleButton btnMidnightBlack;

    /** El btn moonwalk grey. */
    @FXML
    private ToggleButton btnMoonwalkGrey;

    /** El btn pepper white. */
    @FXML
    private ToggleButton btnPepperWhite;

    /** El btn thunder gray. */
    @FXML
    private ToggleButton btnThunderGray;

    /** El btn volcanin orange. */
    @FXML
    private ToggleButton btnVolcaninOrange;

    /** El grupo colores. */
    @FXML
    private ToggleGroup grupoColores;

    /** LA img activar luces. */
    @FXML
    private ImageView imgActivarLuces;

    /** La img luces. */
    @FXML
    private ImageView imgLuces;
    
    /** La img coche. */
    @FXML
    private ImageView imgCoche;

    /**
     * Cambiar color del coche.
     *
     * @param event the event
     */
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

    /**
     * Cambia es estado de las luces (encendidas/apagadas).
     *
     * @param event the event
     */
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
