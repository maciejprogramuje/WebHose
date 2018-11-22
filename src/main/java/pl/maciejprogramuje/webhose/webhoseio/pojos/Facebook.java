package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Facebook {
    private int likes;
    private int comments;
    private int shares;

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("Facebook{").append("\n")
                .append("   likes=").append(likes).append(",").append("\n")
                .append("   comments=").append(comments).append(",").append("\n")
                .append("   shares=").append(shares).append("\n")
                .append('}').append("\n")
                .toString();
    }
}
