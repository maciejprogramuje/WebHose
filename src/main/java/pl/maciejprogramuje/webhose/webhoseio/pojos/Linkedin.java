package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Linkedin {
    private int shares;

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return "Linkedin{" +
                "shares=" + shares +
                '}';
    }
}
