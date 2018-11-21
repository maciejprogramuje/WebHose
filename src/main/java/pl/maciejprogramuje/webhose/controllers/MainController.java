package pl.maciejprogramuje.webhose.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pl.maciejprogramuje.webhose.managers.WebHoseManager;

public class MainController {
    public TextField queryTextField;
    public Button queryButton;
    public TextField apiKeyTextField;
    public Label resultsNumberLabel;
    public Label longResultLabel;
    public ProgressIndicator queryIndicator;
    public ListView<String> shortResultListView;

    private int currentResultNumber;

    @FXML
    public void initialize() {
        enableControlls();

        shortResultListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        WebHoseManager webHoseManager = new WebHoseManager();

        queryButton.setOnAction(event -> {
            disableControlls();

            webHoseManager.setApiKey(apiKeyTextField.getText());

            //TODO - tymczasowe
            apiKeyTextField.setText(webHoseManager.getApiKey());

            new Thread(() -> {
                webHoseManager.tempAll();

                Platform.runLater(() -> {
                    shortResultListView.setItems(webHoseManager.getShortResultsList());

                    shortResultListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
                        currentResultNumber = (int) newValue;
                        longResultLabel.setText(webHoseManager.getFullResultsList().get(currentResultNumber).toString());
                    });

                    resultsNumberLabel.setText("The total number of posts matching your query: " + String.valueOf(webHoseManager.getResultsNumber()));

                    enableControlls();
                });
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


