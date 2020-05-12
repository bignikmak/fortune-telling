import java.util.Collections;
import java.util.List;

public class CardGame {


    public static void main(String[] args) {
        CardsDesk.setCardsDesk();
        Collections.shuffle(CardsDesk.cardsDesk);
        System.out.println(CardsDesk.getCardsDesk((int) (Math.random() * 36), (int) (Math.random() * 35),
                (int) (Math.random() * 34), (int) (Math.random() * 33)));
    }
}
