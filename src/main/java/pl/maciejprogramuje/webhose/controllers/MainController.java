package pl.maciejprogramuje.webhose.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import pl.maciejprogramuje.webhose.managers.WebHoseManager;

public class MainController {
    public TextField queryTextField;
    public Button queryButton;
    public TextField apiKeyTextField;
    public Label resultsNumberLabel;
    public Label shortResultLabel;
    public Label longResultLabel;
    public ProgressIndicator queryIndicator;

    @FXML
    public void initialize() {
        enableControlls();

        WebHoseManager webHoseManager = new WebHoseManager();

        queryButton.setOnAction(event -> {
            disableControlls();

            webHoseManager.setApiKey(apiKeyTextField.getText());

            //TODO - tymczasowe
            apiKeyTextField.setText(webHoseManager.getApiKey());

            new Thread(() -> {
                webHoseManager.tempAll();

                Platform.runLater(() -> {
                    shortResultLabel.setText(webHoseManager.getShortResult());
                    longResultLabel.setText(webHoseManager.getLongResult());
                    resultsNumberLabel.setText("The total number of posts matching your query: " + String.valueOf(webHoseManager.getResultsNumber()));

                    enableControlls();
                });

                System.out.println(webHoseManager.getLongResult());
            }).start();
        });
    }

    private void disableControlls() {
        queryButton.setDisable(true);
        queryIndicator.setVisible(true);
    }

    private void enableControlls() {
        queryButton.setDisable(false);
        queryIndicator.setVisible(false);
    }
}


