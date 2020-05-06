import java.util.Collections;
import java.util.List;

public class CardGame {


    public static void main(String[] args) {
        CardsDesk.getCardsDesk();
        Collections.shuffle(CardsDesk.cardsDesk);
        System.out.println(CardsDesk.cardsDesk.get((int) (Math.random() * 52)));
        System.out.println(CardsDesk.cardsDesk.get((int) (Math.random() * 52)));
        System.out.println(CardsDesk.cardsDesk.get((int) (Math.random() * 52)));
        System.out.println(CardsDesk.cardsDesk.get((int) (Math.random() * 52)));
    }
}
