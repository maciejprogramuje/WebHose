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
            System.out.println("click!");

            WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance("5e4f2b3f-7b67-4646-b8ca-a661bc1be8c0");

            Map<String, String> queries = new HashMap<String, String>();
            queries.put("q", "stock market language:english");
            queries.put("sort", "crawled");

// Fetch query result

            JsonElement result = null;
            try {
                result = webhoseClient.query("filterWebContent", queries);

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                Post posts = gson.fromJson(result.toString(), Post.class);

                if (posts == null) {
                    System.out.println("posts NULL");
                } else {
                    System.out.println("posts: "+posts);
                }


            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(result.getAsJsonObject().get("totalResults"));     // Print posts count


            /*WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance("5e4f2b3f-7b67-4646-b8ca-a661bc1be8c0");

            Map<String, String> queries = new HashMap<String, String>();
            queries.put("q", "Thread.section_title:instalki language:polish");
            queries.put("sort", "crawled");

            try {

                *//*GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                gson.fromJson(result.toString(), Post.class);*//*

                JsonElement result = webhoseClient.query("filterWebContent", queries);
                System.out.println(result.getAsJsonObject().get("totalResults"));

            } catch (URISyntaxException | IOException e) {
                e.printStackTrace();
            }*/
        });
    }
}


