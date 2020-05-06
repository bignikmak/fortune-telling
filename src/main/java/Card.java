

import java.awt.image.BufferedImage;

public class Card {
    private String name, suite;
    private int value;
    private BufferedImage image;

    public Card(String name, String suite, int value, BufferedImage image) {
        this.name = name;
        this.suite = suite;
        this.value = value;
        this.image = image;
    }

    public Card(String name, String suite) {
        this.name = name;
        this.suite = suite;
    }

    public Card(String name, String suite, BufferedImage image) {
        this.name = name;
        this.suite = suite;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getSuite() {
        return suite;
    }

    public int getValue() {
        return value;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String toString() {
        return String.format("%s of %s", name, suite);
    }
}
