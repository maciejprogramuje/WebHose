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
    private String r;
    private String apiKey;

    public void tempAll() {
        WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance(apiKey);

        Map<String, String> queries = new HashMap<String, String>();
        queries.put("q", "stock market language:english");
        queries.put("sort", "crawled");

        try {
            JsonElement queryResult = webhoseClient.query("filterWebContent", queries);

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

                r = stringBuilder.toString();
                System.out.println(r);
            } else {
                System.out.println("results NULL");
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public String getShortResult() {
        return  r;
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
}
