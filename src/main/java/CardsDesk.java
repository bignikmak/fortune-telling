import javafx.scene.shape.Path;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;

public class CardsDesk {
    public static List<Card> cardsDesk = new ArrayList<Card>();
    public static FileInputStream cardImg;

    static {

        try {
            cardImg = new FileInputStream(new File("/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCardsDesk() {
        cardsDesk.add(new Card("6", "spades", cardImg));
        cardsDesk.add(new Card("7", "spades", cardImg));
        cardsDesk.add(new Card("8", "spades", cardImg));
        cardsDesk.add(new Card("9", "spades", cardImg));
        cardsDesk.add(new Card("10", "spades", cardImg));
        cardsDesk.add(new Card("Jack", "spades", cardImg));
        cardsDesk.add(new Card("Queen", "spades", cardImg));
        cardsDesk.add(new Card("King", "spades", cardImg));
        cardsDesk.add(new Card("Ace", "spades", cardImg));

        cardsDesk.add(new Card("6", "hearts", cardImg));
        cardsDesk.add(new Card("7", "hearts", cardImg));
        cardsDesk.add(new Card("8", "hearts", cardImg));
        cardsDesk.add(new Card("9", "hearts", cardImg));
        cardsDesk.add(new Card("10", "hearts", cardImg));
        cardsDesk.add(new Card("Jack", "hearts", cardImg));
        cardsDesk.add(new Card("Queen", "hearts", cardImg));
        cardsDesk.add(new Card("King", "hearts", cardImg));
        cardsDesk.add(new Card("Ace", "hearts", cardImg));

        cardsDesk.add(new Card("6", "clubs", cardImg));
        cardsDesk.add(new Card("7", "clubs", cardImg));
        cardsDesk.add(new Card("8", "clubs", cardImg));
        cardsDesk.add(new Card("9", "clubs", cardImg));
        cardsDesk.add(new Card("10", "clubs", cardImg));
        cardsDesk.add(new Card("Jack", "clubs", cardImg));
        cardsDesk.add(new Card("Queen", "clubs", cardImg));
        cardsDesk.add(new Card("King", "clubs", cardImg));
        cardsDesk.add(new Card("Ace", "clubs", cardImg));

        cardsDesk.add(new Card("6", "diamonds", cardImg));
        cardsDesk.add(new Card("7", "diamonds", cardImg));
        cardsDesk.add(new Card("8", "diamonds", cardImg));
        cardsDesk.add(new Card("9", "diamonds", cardImg));
        cardsDesk.add(new Card("10", "diamonds", cardImg));
        cardsDesk.add(new Card("Jack", "diamonds", cardImg));
        cardsDesk.add(new Card("Queen", "diamonds", cardImg));
        cardsDesk.add(new Card("King", "diamonds", cardImg));
        cardsDesk.add(new Card("Ace", "diamonds", cardImg));
    }

    public static String getCardsDesk(int fi, int se, int th, int fo) {
        ArrayList<Card> arrayList = new ArrayList<Card>();
            arrayList.add(cardsDesk.get(fi));
            cardsDesk.remove(fi);
            arrayList.add(cardsDesk.get(se));
            cardsDesk.remove(se);
            arrayList.add(cardsDesk.get(th));
            cardsDesk.remove(th);
            arrayList.add(cardsDesk.get(fo));
            return arrayList.toString().replaceAll(",", "\n").replaceAll("\\[", " ").replaceAll("]", "");
        }
}
