import java.util.ArrayList;
import java.util.List;

public class CardsDesk {
    public static List<Card> cardsDesk = new ArrayList<>();

    public static void setCardsDesk(List<Card> cardsDesk) {
        CardsDesk.cardsDesk = cardsDesk;
    }

    public static List<Card> getCardsDesk() {
        cardsDesk.add(new Card("2", "spades"));
        cardsDesk.add(new Card("3", "spades"));
        cardsDesk.add(new Card("4", "spades"));
        cardsDesk.add(new Card("5", "spades"));
        cardsDesk.add(new Card("6", "spades"));
        cardsDesk.add(new Card("7", "spades"));
        cardsDesk.add(new Card("8", "spades"));
        cardsDesk.add(new Card("9", "spades"));
        cardsDesk.add(new Card("10", "spades"));
        cardsDesk.add(new Card("Jack", "spades"));
        cardsDesk.add(new Card("Queen", "spades"));
        cardsDesk.add(new Card("King", "spades"));
        cardsDesk.add(new Card("Ace", "spades"));
        cardsDesk.add(new Card("2", "hearts"));
        cardsDesk.add(new Card("3", "hearts"));
        cardsDesk.add(new Card("4", "hearts"));
        cardsDesk.add(new Card("5", "hearts"));
        cardsDesk.add(new Card("6", "hearts"));
        cardsDesk.add(new Card("7", "hearts"));
        cardsDesk.add(new Card("8", "hearts"));
        cardsDesk.add(new Card("9", "hearts"));
        cardsDesk.add(new Card("10", "hearts"));
        cardsDesk.add(new Card("Jack", "hearts"));
        cardsDesk.add(new Card("Queen", "hearts"));
        cardsDesk.add(new Card("King", "hearts"));
        cardsDesk.add(new Card("Ace", "hearts"));
        cardsDesk.add(new Card("2", "clubs"));
        cardsDesk.add(new Card("3", "clubs"));
        cardsDesk.add(new Card("4", "clubs"));
        cardsDesk.add(new Card("5", "clubs"));
        cardsDesk.add(new Card("6", "clubs"));
        cardsDesk.add(new Card("7", "clubs"));
        cardsDesk.add(new Card("8", "clubs"));
        cardsDesk.add(new Card("9", "clubs"));
        cardsDesk.add(new Card("10", "clubs"));
        cardsDesk.add(new Card("Jack", "clubs"));
        cardsDesk.add(new Card("Queen", "clubs"));
        cardsDesk.add(new Card("King", "clubs"));
        cardsDesk.add(new Card("Ace", "clubs"));
        cardsDesk.add(new Card("2", "diamonds"));
        cardsDesk.add(new Card("3", "diamonds"));
        cardsDesk.add(new Card("4", "diamonds"));
        cardsDesk.add(new Card("5", "diamonds"));
        cardsDesk.add(new Card("6", "diamonds"));
        cardsDesk.add(new Card("7", "diamonds"));
        cardsDesk.add(new Card("8", "diamonds"));
        cardsDesk.add(new Card("9", "diamonds"));
        cardsDesk.add(new Card("10", "diamonds"));
        cardsDesk.add(new Card("Jack", "diamonds"));
        cardsDesk.add(new Card("Queen", "diamonds"));
        cardsDesk.add(new Card("King", "diamonds"));
        cardsDesk.add(new Card("Ace", "diamonds"));
        return cardsDesk;
    }
}
