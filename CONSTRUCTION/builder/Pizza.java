package CONSTRUCTION.builder;

public class Pizza {
    public String patte;
    public String sauce;
    public String garniture;

    public void setPatte(String patte) {
        this.patte = patte;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public String affiche() {
        return "Pizza{" +
                "patte='" + patte + '\'' +
                ", sauce='" + sauce + '\'' +
                ", garniture='" + garniture + '\'' +
                '}';
    }
}
