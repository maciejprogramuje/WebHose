package pl.maciejprogramuje.webhose.controllers;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pl.maciejprogramuje.webhose.managers.WebHoseManager;
import pl.maciejprogramuje.webhose.webhoseio.pojos.Post;

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

        queryButton.setOnAction(event -> {
            disableControlls();

            WebHoseManager webHoseManager = new WebHoseManager();
            webHoseManager.setApiKey(apiKeyTextField.getText());

            //TODO - tymczasowe
            apiKeyTextField.setText(webHoseManager.getApiKey());

            new Thread(() -> {
                webHoseManager.makeQuery();

                Platform.runLater(() -> {
                    shortResultListView.setItems(webHoseManager.getShortResultsList());

                    ObservableList<Post> fullResultsList = webHoseManager.getFullResultsList();
                    if(fullResultsList.size() > 0) {
                        longResultLabel.setText(fullResultsList.get(0).toString());
                    }

                    shortResultListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
                        currentResultNumber = (int) newValue;
                        longResultLabel.setText(fullResultsList.get(currentResultNumber).toString());
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


