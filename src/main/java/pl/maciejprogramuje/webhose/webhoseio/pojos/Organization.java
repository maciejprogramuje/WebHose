package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Organization {
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
        return new StringBuffer()
                .append("Organization{").append("\n")
                .append("   name='").append(name).append(",").append("\n")
                .append("   sentiment='").append(sentiment).append('\'').append("\n")
                .append('}').append("\n")
                .toString();
    }
}
