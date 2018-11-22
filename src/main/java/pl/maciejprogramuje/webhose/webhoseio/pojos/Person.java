package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Person {
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
        final StringBuffer sb = new StringBuffer("Person { ");
        sb.append("name = '").append(name).append('\'');
        sb.append(", sentiment = '").append(sentiment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
