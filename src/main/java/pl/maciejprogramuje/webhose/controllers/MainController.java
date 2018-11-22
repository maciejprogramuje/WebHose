package pl.maciejprogramuje.webhose.controllers;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pl.maciejprogramuje.webhose.managers.CopyToClipboard;
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
    public Button copyToClipboardButton;
    public Button nextButton;

    private ObservableList<Post> fullResultsList;
    private WebHoseManager webHoseManager;

    @FXML
    public void initialize() {
        enableControlls();

        shortResultListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        shortResultListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
            int position = (int) newValue;
            if (position == -1) {
                position = 0;
            }

            longResultLabel.setText(fullResultsList.get(position).toString());
        });

        queryButton.setOnAction(event -> {
            disableControlls();

            webHoseManager = new WebHoseManager();
            webHoseManager.setApiKey(apiKeyTextField.getText());
            webHoseManager.setQuery(queryTextField.getText());

            //TODO - tymczasowe
            apiKeyTextField.setText(webHoseManager.getApiKey());

            new Thread(() -> {
                webHoseManager.makeQuery();

                Platform.runLater(() -> {
                    shortResultListView.getItems().clear();
                    shortResultListView.getSelectionModel().clearSelection();
                    shortResultListView.setItems(webHoseManager.getShortResultsList());

                    fullResultsList = webHoseManager.getFullResultsList();
                    if(fullResultsList.size() > 0) {
                        shortResultListView.scrollTo(0);
                        shortResultListView.getSelectionModel().select(0);
                    }

                    resultsNumberLabel.setText("The total number of posts matching your query: " + String.valueOf(webHoseManager.getResultsNumber()));

                    enableControlls();
                });
            }).start();
        });

        nextButton.setOnAction(event -> {
            //TODO - pobierz następną stronę wyników i wyświetl
        });

        copyToClipboardButton.setOnAction(event -> {
            CopyToClipboard.copy(longResultLabel.getText());
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


