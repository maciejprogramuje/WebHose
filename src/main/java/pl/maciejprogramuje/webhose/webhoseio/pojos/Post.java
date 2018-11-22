package pl.maciejprogramuje.webhose.webhoseio.pojos;

import java.util.Arrays;

public class Post {
    private Thread thread;
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

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Post{");
        sb.append("thread=").append(thread);
        sb.append(", uuid='").append(uuid).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", ord_in_thread=").append(ord_in_thread);
        sb.append(", author='").append(author).append('\'');
        sb.append(", published='").append(published).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", highlightText='").append(highlightText).append('\'');
        sb.append(", highlightTitle='").append(highlightTitle).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", external_links=").append(external_links == null ? "null" : Arrays.asList(external_links).toString());
        sb.append(", entities=").append(entities);
        sb.append(", rating=").append(rating);
        sb.append(", crawled='").append(crawled).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
