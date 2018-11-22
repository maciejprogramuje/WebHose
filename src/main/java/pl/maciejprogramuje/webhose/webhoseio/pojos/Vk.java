package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Vk {
    private int shares;

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("Vk{").append("\n")
                .append("shares=").append(shares).append("\n")
                .append('}').append("\n")
                .toString();
    }
}