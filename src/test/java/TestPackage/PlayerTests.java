/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import models.Player;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author samue
 */
public class PlayerTests {
    private Player player;
 @Before
 public void setUp() {
 player = new Player("Player1", 100);
 }
 @Test
 public void testPlayerInitialization() {
 assertNotNull(player);
 assertEquals("Player1", player.getName());
 assertEquals(100, player.getCoins());
 assertNotNull(player.getHand());
 }
 @Test
 public void testAddCoins() {
 player.addCoins(50);
 assertEquals(150, player.getCoins());
 }
 @Test
 public void testSubtractCoins() {
 player.subtractCoins(30);
 assertEquals(70, player.getCoins());
 }
 @Test
 public void testGetHand() {
 assertNotNull(player.getHand());
 }
}
