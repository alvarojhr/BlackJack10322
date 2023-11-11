/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import models.Card;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author samue
 * 
 * DOCUMENTO SE IMPORTA LA CLASE CARD DEL PAQUETE MODELS
 * LA CLASE CONTIENE PRUEBA DE CARD UTILIZANDO EL FRAMWORK DE PRUEBA
 * JUnit para realizar PRUEBAS UNITARIAS
 * PUEBE DE INICIALIZACION DE LA INSTANCIA CARS VERIFICANDO DE ESTE MODO QUE LA ISNTANCIA
 * NO SEA NULA Y QUE LOS VALORES DE PALO Y RANGO SEAN CORRECTAMENTE ESTABLECIDOS
 */
public class CardTests {
     @Test
 public void testCardInitialization() {
 Card card = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
 assertNotNull(card);// Verifica que la instancia no sea nula
 assertEquals(Card.Suit.HEARTS, card.getSuit());
 assertEquals(Card.Rank.ACE, card.getRank());// Verifica que el palo sea HEARTS y el rango sea ACE
 }
 @Test
 public void testCardToString() {
 Card card = new Card(Card.Suit.CLUBS, Card.Rank.FIVE);
 String expectedString = "FIVE CLUBS";
 String cardString = card.toString(); // Verifica que la cadena generada sea igual a la cadena esperada
 assertEquals(expectedString, cardString);
 }  
}
