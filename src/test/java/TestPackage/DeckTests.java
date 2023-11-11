/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;


import models.Card;
import models.Deck;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author samue
 */
public class DeckTests {
    private Deck deck;
 @Before
 public void setUp() {
 deck = new Deck();
 }
 @Test
 public void testDeckInitialization() {
 assertNotNull(deck);
 }
 @Test
 public void testDeckSize() {
 assertEquals(52, deck.cards.size());
 }
 @Test
 public void testDrawCard() {
 Card drawnCard = deck.draw();
 assertNotNull(drawnCard);
 assertEquals(51, deck.cards.size());
 }
 @Test
 public void testShuffledDeck() {
 // Create a new deck
 Deck newDeck = new Deck();
 // Draw a card from the original deck
 Card originalCard = deck.draw();
 // Draw a card from the new deck
 Card newCard = newDeck.draw();
 // Verify that the decks are shuffled (i.e., cards are not in the same order)
 assertTrue(originalCard.getRank() != newCard.getRank() || originalCard.getSuit() != 
newCard.getSuit());
 }
    
}
