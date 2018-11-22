package pl.maciejprogramuje.webhose.webhoseio.pojos;

import java.util.Arrays;

public class Thread {
    private String uuid;
    private String url;
    private String site_full;
    private String site;
    private String site_section;
    private String[] site_categories;
    private String section_title;
    private String title;
    private String title_full;
    private String published;
    private int replies_count;
    private int participants_count;
    private String site_type;
    private String country;
    private Number spam_score;
    private String main_image;
    private int performance_score;
    private int domain_rank;
    private Social social;

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

    public String getSite_full() {
        return site_full;
    }

    public void setSite_full(String site_full) {
        this.site_full = site_full;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite_section() {
        return site_section;
    }

    public void setSite_section(String site_section) {
        this.site_section = site_section;
    }

    public String[] getSite_categories() {
        return site_categories;
    }

    public void setSite_categories(String[] site_categories) {
        this.site_categories = site_categories;
    }

    public String getSection_title() {
        return section_title;
    }

    public void setSection_title(String section_title) {
        this.section_title = section_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_full() {
        return title_full;
    }

    public void setTitle_full(String title_full) {
        this.title_full = title_full;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public int getReplies_count() {
        return replies_count;
    }

    public void setReplies_count(int replies_count) {
        this.replies_count = replies_count;
    }

    public int getParticipants_count() {
        return participants_count;
    }

    public void setParticipants_count(int participants_count) {
        this.participants_count = participants_count;
    }

    public String getSite_type() {
        return site_type;
    }

    public void setSite_type(String site_type) {
        this.site_type = site_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Number getSpam_score() {
        return spam_score;
    }

    public void setSpam_score(Number spam_score) {
        this.spam_score = spam_score;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public int getPerformance_score() {
        return performance_score;
    }

    public void setPerformance_score(int performance_score) {
        this.performance_score = performance_score;
    }

    public int getDomain_rank() {
        return domain_rank;
    }

    public void setDomain_rank(int domain_rank) {
        this.domain_rank = domain_rank;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    @Override
    public String toString() {
        String tab = "\t\t";

        return new StringBuffer()
                .append("thread: {").append("\n")
                .append(tab).append("uuid:'").append(uuid).append('\'').append(",").append("\n")
                .append(tab).append("url:'").append(url).append('\'').append(",").append("\n")
                .append(tab).append("site_full:'").append(site_full).append('\'').append(",").append("\n")
                .append(tab).append("site:'").append(site).append('\'').append(",").append("\n")
                .append(tab).append("site_section:'").append(site_section).append('\'').append(",").append("\n")
                .append(tab).append("site_categories: ").append(site_categories == null ? "null" : Arrays.asList(site_categories).toString()).append(",").append("\n")
                .append(tab).append("section_title:'").append(section_title).append('\'').append(",").append("\n")
                .append(tab).append("title:'").append(title).append('\'').append(",").append("\n")
                .append(tab).append("title_full:'").append(title_full).append('\'').append(",").append("\n")
                .append(tab).append("published:'").append(published).append('\'').append(",").append("\n")
                .append(tab).append("replies_count:").append(replies_count).append(",").append("\n")
                .append(tab).append("participants_count:").append(participants_count).append(",").append("\n")
                .append(tab).append("site_type:'").append(site_type).append('\'').append(",").append("\n")
                .append(tab).append("country:'").append(country).append('\'').append(",").append("\n")
                .append(tab).append("spam_score:").append(spam_score).append(",").append("\n")
                .append(tab).append("main_image:'").append(main_image).append('\'').append(",").append("\n")
                .append(tab).append("performance_score:").append(performance_score).append(",").append("\n")
                .append(tab).append("domain_rank:").append(domain_rank).append(",").append("\n")
                .append(tab).append(social).append("\n")
                .append("}thread").append("\n")
                .toString();
    }
}

