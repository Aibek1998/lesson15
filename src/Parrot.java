public class Parrot {
    private String name;
    private String color ;
    private String feature;
    private  String character;

    public Parrot(String name, String color, String feature, String character) {
        this.name = name;
        this.color = color;
        this.feature = feature;
        this.character = character;
    }

    public Parrot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
