package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LePenduTest {

    @Test
    public void testTesterLettre() {
        LePendu jeu = new LePendu();
        assertTrue(jeu.testerLettre('a'));
        assertFalse(jeu.testerLettre('z'));
    }

    @Test
    public void testJoueurAGagne() {
        LePendu jeu = new LePendu();
        assertFalse(jeu.joueurAGagne());
        jeu.testerLettre('j');
        jeu.testerLettre('a');
        jeu.testerLettre('v');
        assertTrue(jeu.joueurAGagne());
    }
}
