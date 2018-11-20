package pl.maciejprogramuje.webhose.pojos;

public class Posts {
    private Thread[] threads;
    private String uuid;
    private String url;
    private int ord_in_thread;
    private String author;
    private String published;
    private String title;
    private String text;
    private String highlightText;
    private String highlightTitle;
    private String language;
    private String[] external_links;
    private Entities entities;
    private int rating;
    private String crawled;

    public Thread[] getThreads() {
        return threads;
    }

    public void setThreads(Thread[] threads) {
        this.threads = threads;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrd_in_thread() {
        return ord_in_thread;
    }

    public void setOrd_in_thread(int ord_in_thread) {
        this.ord_in_thread = ord_in_thread;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHighlightText() {
        return highlightText;
    }

    public void setHighlightText(String highlightText) {
        this.highlightText = highlightText;
    }

    public String getHighlightTitle() {
        return highlightTitle;
    }

    public void setHighlightTitle(String highlightTitle) {
        this.highlightTitle = highlightTitle;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String[] getExternal_links() {
        return external_links;
    }

    public void setExternal_links(String[] external_links) {
        this.external_links = external_links;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCrawled() {
        return crawled;
    }

    public void setCrawled(String crawled) {
        this.crawled = crawled;
    }
}
