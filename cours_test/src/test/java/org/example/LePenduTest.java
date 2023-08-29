package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LePenduTest {

    @Test
    public void testTesterLettre() {
        LePendu jeu = new LePendu();
        assertFalse(jeu.testerLettre('z'));
    }

    @Test
    public void testTesterLettre1() {
        LePendu jeu = new LePendu();
        assertTrue(jeu.testerLettre('a'));
    }


    @Test
    public void testJoueurAGagne() {
        LePendu jeu = new LePendu();
        assertFalse(jeu.joueurAGagne());
        jeu.testerLettre('j');
        jeu.testerLettre('e');
        jeu.testerLettre('u');
        jeu.testerLettre('x');
        assertTrue(jeu.joueurAGagne());
    }
}
