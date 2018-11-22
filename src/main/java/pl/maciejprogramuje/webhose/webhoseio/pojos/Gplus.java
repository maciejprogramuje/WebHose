package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Gplus {
    private int shares;

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gplus { ");
        sb.append("shares = ").append(shares);
        sb.append('}');
        return sb.toString();
    }
}
