package pl.maciejprogramuje.webhose.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.maciejprogramuje.webhose.managers.WebHoseManager;

public class MainController {
    public TextField queryTextField;
    public Button queryButton;
    public TextField apiKeyTextField;
    public Label resultsNumberLabel;
    public Label shortResultLabel;
    public Label longResultLabel;

    @FXML
    public void initialize() {
        WebHoseManager webHoseManager = new WebHoseManager();

        queryButton.setOnAction(event -> {
            webHoseManager.setApiKey(apiKeyTextField.getText());

            //TODO - tymczasowe
            apiKeyTextField.setText(webHoseManager.getApiKey());

            new Thread(() -> {
                webHoseManager.tempAll();

                Platform.runLater(() -> {
                    shortResultLabel.setText(webHoseManager.getShortResult());
                    longResultLabel.setText(webHoseManager.getLongResult());
                    resultsNumberLabel.setText("The total number of posts matching your query: " + String.valueOf(webHoseManager.getResultsNumber()));
                });

                System.out.println(webHoseManager.getLongResult());
            }).start();
        });
    }
}


