/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import models.Card;
import models.Hand;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author samue
 */
public class HandTests {
    
    private Hand hand;
 @Before
 public void setUp() {
 hand = new Hand();
 }
 @Test
 public void testAddCard() {
 Card card = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
 hand.addCard(card);
 assertEquals(1, hand.getCards().size());
 assertEquals(card, hand.getCards().get(0));
 }
 @Test
 public void testGetValue() {
 Card card1 = new Card(Card.Suit.HEARTS, Card.Rank.TWO);
 Card card2 = new Card(Card.Suit.CLUBS, Card.Rank.KING);
 hand.addCard(card1);
 hand.addCard(card2);
 assertEquals(12, hand.getValue());
 }
 @Test
 public void testIsBust() {
 Card card1 = new Card(Card.Suit.HEARTS, Card.Rank.KING);
 Card card2 = new Card(Card.Suit.CLUBS, Card.Rank.QUEEN);
 hand.addCard(card1);
 hand.addCard(card2);
 assertTrue(hand.isBust());
 // Reset hand and test non-bust scenario
 hand = new Hand();
 Card card3 = new Card(Card.Suit.HEARTS, Card.Rank.TWO);
 Card card4 = new Card(Card.Suit.CLUBS, Card.Rank.ACE);
 hand.addCard(card3);
 hand.addCard(card4);
 assertFalse(hand.isBust());
 }
 @Test
 public void testIsBlackjack() {
 Card card1 = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
 Card card2 = new Card(Card.Suit.CLUBS, Card.Rank.KING);
 hand.addCard(card1);
 hand.addCard(card2);
 assertTrue(hand.isBlackjack());
 // Reset hand and test non-Blackjack scenario
 hand = new Hand();
 Card card3 = new Card(Card.Suit.HEARTS, Card.Rank.TWO);
 Card card4 = new Card(Card.Suit.CLUBS, Card.Rank.ACE);
 hand.addCard(card3);
 hand.addCard(card4);
 assertFalse(hand.isBlackjack());
 }
 @Test
 public void testToString() {
 Card card1 = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
 Card card2 = new Card(Card.Suit.CLUBS, Card.Rank.TEN);
 hand.addCard(card1);
 hand.addCard(card2);
 String expectedString = "ACE HEARTS, TEN CLUBS";
 assertEquals(expectedString, hand.toString());
 }

}
