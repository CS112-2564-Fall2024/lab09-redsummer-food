package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static cs112.lab09.Constants.HISTORICAL_DATA;

public class CityController {
    @FXML
    Label locationLabel = new Label();
    Label rivsedLabel = new Label();




    public void initData(Constants.Event eventIndex) {
            String[] data = HISTORICAL_DATA[eventIndex.ordinal()];
            RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
            locationLabel.setText(event.getLocation());
            System.out.println(event.getDescription());


        }

}
