package pl.maciejprogramuje.webhose.webhoseio.pojos;

import java.util.Arrays;

public class Results {
    private Post[] posts;
    private int totalResults;
    private int moreResultsAvailable;
    private String next;
    private int requestsLeft;

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    public void setMoreResultsAvailable(int moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getRequestsLeft() {
        return requestsLeft;
    }

    public void setRequestsLeft(int requestsLeft) {
        this.requestsLeft = requestsLeft;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("Pinterest{").append("\n")
                .append("   posts=").append(posts == null ? "null" : Arrays.asList(posts).toString()).append(",").append("\n")
                .append("   totalResults=").append(totalResults).append(",").append("\n")
                .append("   moreResultsAvailable=").append(moreResultsAvailable).append(",").append("\n")
                .append("   next='").append(next).append('\'').append(",").append("\n")
                .append("   requestsLeft=").append(requestsLeft).append("\n")
                .append('}').append("\n")
                .toString();
    }
}
