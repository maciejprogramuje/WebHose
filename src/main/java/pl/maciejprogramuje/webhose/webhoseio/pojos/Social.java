package pl.maciejprogramuje.webhose.webhoseio.pojos;

public class Social {
    private Facebook facebook;
    private Gplus gplus;
    private Pinterest pinterest;
    private Linkedin linkedin;
    private Stumbledupon stumbledupon;
    private Vk vk;

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    public Gplus getGplus() {
        return gplus;
    }

    public void setGplus(Gplus gplus) {
        this.gplus = gplus;
    }

    public Pinterest getPinterest() {
        return pinterest;
    }

    public void setPinterest(Pinterest pinterest) {
        this.pinterest = pinterest;
    }

    public Linkedin getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(Linkedin linkedin) {
        this.linkedin = linkedin;
    }

    public Stumbledupon getStumbledupon() {
        return stumbledupon;
    }

    public void setStumbledupon(Stumbledupon stumbledupon) {
        this.stumbledupon = stumbledupon;
    }

    public Vk getVk() {
        return vk;
    }

    public void setVk(Vk vk) {
        this.vk = vk;
    }

    @Override
    public String toString() {
        return "Social{" +
                "facebook=" + facebook +
                ", gplus=" + gplus +
                ", pinterest=" + pinterest +
                ", linkedin=" + linkedin +
                ", stumbledupon=" + stumbledupon +
                ", vk=" + vk +
                '}';
    }
}