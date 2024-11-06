package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

import static cs112.lab09.Constants.*;
import static cs112.lab09.Constants.REDSUMMER_IMAGE_PATH;

public class MapController {
    @FXML
    Label titleLabel;
    @FXML
    Label subtitleLabel;
    @FXML
    Label descriptionLabel;
    @FXML
    ImageView mapImage = new ImageView();
    Stage stage = new Stage();



    public void initialize(){
        //titleLabel.setText(MAP_VIEW_TITLE);
        Image image = new Image(REDSUMMER_IMAGE_PATH);
        mapImage.setImage(image);
    }
    public void handleSFButton1() throws IOException {
        handleOpenPopup(Event.SAN_FRANCISCO);
    }
    public void handleSFButton2() throws IOException {
        handleOpenPopup(Event.BISBEE);
    }

    public void handleOpenPopup(Constants.Event eventIndex) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);
        stage.initModality(Modality.APPLICATION_MODAL);

        CityController cityController = fxmlLoader.getController();
        cityController.initData(eventIndex);
        stage.show();

    }
    /**public void handleCity2(){
        System.out.println("OOOOOOOOOOOOOO");
    }**/

}
