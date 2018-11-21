package pl.maciejprogramuje.webhose.managers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.maciejprogramuje.webhose.webhoseio.WebhoseIOClient;
import pl.maciejprogramuje.webhose.webhoseio.pojos.Post;
import pl.maciejprogramuje.webhose.webhoseio.pojos.Results;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static pl.maciejprogramuje.webhose.Main.API_KEY;

public class WebHoseManager {
    private int resultsNumber;
    private String apiKey;
    private ObservableList<String> shortResultsList;
    private ObservableList<Post> fullResultsList;

    public void tempAll() {
        shortResultsList = FXCollections.observableArrayList();
        fullResultsList = FXCollections.observableArrayList();

        WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance(apiKey);

        Map<String, String> queries = new HashMap<String, String>();
        queries.put("q", "stock market language:english");
        queries.put("sort", "crawled");

        try {
            JsonElement queryResult = webhoseClient.query("filterWebContent", queries);

            resultsNumber = Integer.valueOf(queryResult.getAsJsonObject().get("totalResults").toString());

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            Results results = gson.fromJson(queryResult.toString(), Results.class);

            if (results != null) {
                for (int i = 0; i < results.getPosts().length; i++) {
                    String tempShortResult = (i + 1) + ". queryResult: " + results.getPosts()[i].getTitle() + "\n";
                    shortResultsList.add(tempShortResult);
                    fullResultsList.add(results.getPosts()[i]);
                }
            } else {
                System.out.println("results NULL");
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public void setApiKey(String apiKey) {
        //TODO - tymczasowy apiKey
        if (apiKey == null || apiKey.isEmpty()) {
            this.apiKey = API_KEY;
        } else {
            this.apiKey = apiKey;
        }
    }

    public String getApiKey() {
        return apiKey;
    }

    public int getResultsNumber() {
        return resultsNumber;
    }

    public ObservableList<String> getShortResultsList() {
        return shortResultsList;
    }

    public ObservableList<Post> getFullResultsList() {
        return fullResultsList;
    }
}
