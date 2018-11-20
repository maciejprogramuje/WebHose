package pl.maciejprogramuje.webhose.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.maciejprogramuje.webhose.webhoseio.WebhoseIOClient;
import pl.maciejprogramuje.webhose.webhoseio.pojos.Results;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class MainController {
    public TextField queryTextField;
    public Label queryLabel;
    public Button queryButton;
    public Label resultLabel;
    public TextField apiKeyTextField;

    @FXML
    public void initialize() {

        queryButton.setOnAction(event -> {
            WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance("5e4f2b3f-7b67-4646-b8ca-a661bc1be8c0");

            Map<String, String> queries = new HashMap<String, String>();
            queries.put("q", "stock market language:english");
            queries.put("sort", "crawled");

            JsonElement queryResult = null;
            try {
                queryResult = webhoseClient.query("filterWebContent", queries);

                System.out.println(queryResult.getAsJsonObject().get("totalResults"));

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                Results results = gson.fromJson(queryResult.toString(), Results.class);

                if (results != null) {
                    System.out.println(results);

                    StringBuilder stringBuilder = new StringBuilder();

                    for (int i = 0; i < results.getPosts().length; i++) {
                        stringBuilder.append(i + 1).append(". queryResult: ").append(results.getPosts()[i].getTitle()).append("\n");
                    }

                    String r = stringBuilder.toString();
                    System.out.println(r);
                    resultLabel.setText(r);
                } else {
                    System.out.println("results NULL");
                }
            } catch (URISyntaxException | IOException e) {
                e.printStackTrace();
            }
        });
    }
}


