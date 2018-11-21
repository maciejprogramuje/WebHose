package pl.maciejprogramuje.webhose.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.maciejprogramuje.webhose.managers.WebHoseManager;

public class MainController {
    public TextField queryTextField;
    public Label queryLabel;
    public Button queryButton;
    public Label resultLabel;
    public TextField apiKeyTextField;

    @FXML
    public void initialize() {
        WebHoseManager webHoseManager = new WebHoseManager();

        queryButton.setOnAction(event -> {
            webHoseManager.setApiKey(apiKeyTextField.getText());

            //TODO - tymczasowe
            apiKeyTextField.setText(webHoseManager.getApiKey());

            new Thread(() -> {
                webHoseManager.tempAll();

                Platform.runLater(() -> resultLabel.setText(webHoseManager.getShortResult()));
            }).start();
        });
    }
}


