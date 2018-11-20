package pl.maciejprogramuje.webhose.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class MainController {
    public TextField queryTextField;
    public Label queryLabel;
    public Button queryButton;
    public Label resultLabel;

    @FXML
    public void initialize() {
        System.out.println("initialize");

        queryButton.setOnAction(event -> {
            System.out.println("click!");

            /*WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance("5e4f2b3f-7b67-4646-b8ca-a661bc1be8c0");

            Map<String, String> queries = new HashMap<String, String>();
            queries.put("q", "thread.section_title:instalki language:polish");
            queries.put("sort", "crawled");*/
        });
    }
}
