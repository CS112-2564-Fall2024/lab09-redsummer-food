package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import static cs112.lab09.Constants.HISTORICAL_DATA;

public class CityController {
    @FXML
    Label locationLabel = new Label();
    @FXML
    Label rivsedLabel = new Label();
    @FXML
    ImageView eventImageView = new ImageView();
    @FXML
    Label dateLabel = new Label();
    @FXML
    Label descriptionLabel = new Label();
    @FXML
    Label revisedDescriptionLabel = new Label();
    @FXML
    Hyperlink citationHyperlink = new Hyperlink();
    @FXML
    Button closeButton = new Button();

        public void close(){
            Stage stage = (Stage)eventImageView.getScene().getWindow();
            stage.close();
        }



    public void initData(Constants.Event eventIndex) {
            String[] data = HISTORICAL_DATA[eventIndex.ordinal()];
            RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
            locationLabel.setText(event.getLocation());
            System.out.println(event.getDescription());
            //String[] data = Constants.HISTORICAL_DATA[event];
            eventImageView.setImage(event.getImage());
            dateLabel.setText(event.getEventDay().toString());
            descriptionLabel.setText(event.getDescription());
            revisedDescriptionLabel.setText(event.getRevisedDescription());
            citationHyperlink.setText(event.getCitation());


        }

}
