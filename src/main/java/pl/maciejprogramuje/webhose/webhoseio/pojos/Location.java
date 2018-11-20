package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Location {
    private String name;
    private String sentiment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", sentiment='" + sentiment + '\'' +
                '}';
    }
}