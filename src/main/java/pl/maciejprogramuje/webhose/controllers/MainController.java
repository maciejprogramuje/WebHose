package pl.maciejprogramuje.webhose.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.maciejprogramuje.webhose.WebhoseIOClient;
import pl.maciejprogramuje.webhose.pojos.Post;
import pl.maciejprogramuje.webhose.pojos.Results;

import java.io.IOException;
import java.net.URISyntaxException;
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
            WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance("5e4f2b3f-7b67-4646-b8ca-a661bc1be8c0");

            Map<String, String> queries = new HashMap<String, String>();
            queries.put("q", "stock market language:english");
            queries.put("sort", "crawled");

            JsonElement result = null;
            try {
                result = webhoseClient.query("filterWebContent", queries);

                System.out.println(result.getAsJsonObject().get("totalResults"));

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                Results results = gson.fromJson(result.toString(), Results.class);

                if (results == null) {
                    System.out.println("results NULL");
                } else {
                    for (int i = 0; i < results.getPosts().length; i++) {
                        System.out.println(i + ". result: "+results.getPosts()[i].getTitle());
                    }
                }
            } catch (URISyntaxException | IOException e) {
                e.printStackTrace();
            }
        });
    }
}


