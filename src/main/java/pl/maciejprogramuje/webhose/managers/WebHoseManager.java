package pl.maciejprogramuje.webhose.managers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import pl.maciejprogramuje.webhose.webhoseio.WebhoseIOClient;
import pl.maciejprogramuje.webhose.webhoseio.pojos.Results;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static pl.maciejprogramuje.webhose.Main.API_KEY;

public class WebHoseManager {
    private String shortResult;
    private String longResult;
    private int resultsNumber;
    private String apiKey;

    public void tempAll() {
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
                longResult = results.toString();

                StringBuilder stringBuilder = new StringBuilder();

                for (int i = 0; i < results.getPosts().length; i++) {
                    stringBuilder.append(i + 1).append(". queryResult: ").append(results.getPosts()[i].getTitle()).append("\n");
                }

                shortResult = stringBuilder.toString();
            } else {
                System.out.println("results NULL");
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public void setApiKey(String apiKey) {
        //TODO - tymczasowy apiKey
        if(apiKey== null || apiKey.isEmpty()) {
            this.apiKey = API_KEY;
        } else {
            this.apiKey = apiKey;
        }
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getLongResult() {
        return longResult;
    }

    public String getShortResult() {
        return shortResult;
    }

    public int getResultsNumber() {
        return resultsNumber;
    }
}
