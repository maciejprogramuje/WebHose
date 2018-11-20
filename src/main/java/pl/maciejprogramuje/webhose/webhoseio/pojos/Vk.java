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
        return "Vk{" +
                "shares=" + shares +
                '}';
    }
}