package es.aketzagonzalez.aeropuertosJ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase MainApp.
 */
public class MainApp extends Application {
    
    /** El stage. */
    private static Stage stage;

    /**
     * Metodo que mustra la pantalla llamando a setRoot.
     *
     * @param s the s
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public void start(@SuppressWarnings("exports") Stage s) throws IOException {
        stage=s;
        setRoot("miniCopper","");
    }

    /**
     * Establece the root llamando al setRoot de 2 parametros.
     *
     * @param fxml the new root
     * @throws IOException Signals that an I/O exception has occurred.
     */
    static void setRoot(String fxml) throws IOException {
        setRoot(fxml,stage.getTitle());
    }

    /**
     * Establece el root y el titulo del stage.
     *
     * @param fxml the fxml
     * @param title the title
     * @throws IOException Signals that an I/O exception has occurred.
     */
    static void setRoot(String fxml, String title) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Carga el FXML.
     *
     * @param fxml the fxml
     * @return the parent
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }


    /**
     * El metodo main que lanza el programa.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
