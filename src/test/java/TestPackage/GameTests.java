package TestPackage;

import models.Game;
import models.Hand;
import models.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTests {

    private Game game;

    @Before
    public void setUp() {
        game = new Game("Player1", 100);
    }

    @Test
    public void testGameInitialization() {
        assertNotNull(game);
        assertNotNull(game.getPlayer());
        assertNotNull(game.getDealer());
        assertNotNull(game.getDeck());
    }

    @Test
public void testDealInitialCards() {
    game.dealInitialCards();
    Hand playerHand = game.getPlayer().getHand();
    Hand dealerHand = game.getDealer().getHand();
    assertEquals(2, playerHand.getCards().size());
    assertEquals(2, dealerHand.getCards().size());
}

@Test
public void testHitPlayer() {
    game.dealInitialCards();
    int initialPlayerCardCount = game.getPlayer().getHand().getCards().size();
    game.hitPlayer();
    int updatedPlayerCardCount = game.getPlayer().getHand().getCards().size();
    assertEquals(initialPlayerCardCount + 1, updatedPlayerCardCount);
}

@Test
public void testHitDealer() {
    game.dealInitialCards();
    int initialDealerCardCount = game.getDealer().getHand().getCards().size();
    game.hitDealer();
    int updatedDealerCardCount = game.getDealer().getHand().getCards().size();
    assertEquals(initialDealerCardCount + 1, updatedDealerCardCount);
}
}
