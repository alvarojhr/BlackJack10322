/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;


import models.Card;
import static models.Card.Rank.THREE;
import static models.Card.Suit.DIAMONDS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author PC 4060TI
 */
public class NewClass {   
    @Test
    void compareMethod() {
        Card card = new Card(DIAMONDS, THREE);
        assertEquals("THREE DIAMONDS", card.toString());
    }
    
    @Test 
    void compareGetRank(){
        Card card = new Card(DIAMONDS, THREE);
        assertEquals(THREE, card.getRank());
    }
}
