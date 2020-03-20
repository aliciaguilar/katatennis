/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katatennis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ali
 */
public class KataTennisTest {
    KataTennis game = new KataTennis("x", "y");
    
    public KataTennisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void casoUno() {
        puntos(30, 31);
        String score = game.getScore();
        assertEquals("Advantage y", score);
    }

    @Test
    public void casoDos() {
        game.playerOneScores();
	String score = game.getScore();
	assertEquals("Fifteen,Love", score);
    }

    @Test
    public void casotres() {
        puntos(31, 30);
	String score = game.getScore();
	assertEquals("Advantage x", score);
    }
    
    @Test
    public void casoCuatro(){
        puntos(45, 15);
        String score = game.getScore();
	assertEquals("x wins", score);
    }
    
    @Test
    public void casoCinco(){
        puntos(0, 15);
        String score = game.getScore();
	assertEquals("y wins", score);
    
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        KataTennis.main(args);
    }

    private void puntos(int x, int y) {
        for (int i = 0; i < x; i++) {
            game.playerOneScores();
	}
	for (int i = 0; i < y; i++) {
            game.playerTwoScores();
	}
    }
    
}
