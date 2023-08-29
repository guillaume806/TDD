package org.example;
import java.util.Random;


public class LePendu {
    private String motATrouver;
    private String motMasque;
    private int tentativesRestantes;

    private String[] motsPossibles = {"dino", "jambon", "programme", "jeux", "politique"};

    public LePendu() {
        Random random = new Random();
        int indexMot = random.nextInt(motsPossibles.length);
        motATrouver = motsPossibles[indexMot];

        motMasque = masquerMot(motATrouver);
        tentativesRestantes = 6;
    }

    private String masquerMot(String mot) {
        StringBuilder masque = new StringBuilder();
        for (int i = 0; i < mot.length(); i++) {
            masque.append("_");
        }
        return masque.toString();
    }

    public boolean testerLettre(char lettre) {
        boolean lettreTrouvee = false;
        StringBuilder nouveauMotMasque = new StringBuilder(motMasque);

        for (int i = 0; i < motATrouver.length(); i++) {
            if (motATrouver.charAt(i) == lettre) {
                nouveauMotMasque.setCharAt(i, lettre);
                lettreTrouvee = true;
            }
        }

        if (!lettreTrouvee) {
            tentativesRestantes--;
        }

        motMasque = nouveauMotMasque.toString();
        return lettreTrouvee;
    }

    public boolean joueurAGagne() {
        return !motMasque.contains("_");
    }

    public int getTentativesRestantes() {
        return tentativesRestantes;
    }

    public String getMotMasque() {
        return motMasque;
    }

    public String getMotATrouver() {
        return motATrouver;
    }
}
