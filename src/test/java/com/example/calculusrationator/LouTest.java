package com.example.calculusrationator;

import Model.Affirmation;
import affirmationLogique.DoncLogique;
import affirmationLogique.EtLogique;
import affirmationLogique.OuLogique;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LouTest {

    @Test
    public void testEstPauvreEtGenereux() {
        Affirmation affirmation = new Affirmation(true, false, true);
        assertFalse(EtLogique.estPauvreEtGenereux(affirmation), "Lou est pauvre et Lou est généreux devrait être faux.");

        affirmation = new Affirmation(true, false, false);
        assertFalse(EtLogique.estPauvreEtGenereux(affirmation), "Lou est pauvre et Lou est généreux devrait être faux.");

        affirmation = new Affirmation(true, true, true);
        assertTrue(EtLogique.estPauvreEtGenereux(affirmation), "Lou est pauvre et Lou est généreux devrait être vrai.");
    }

    @Test
    public void testBeauDoncPauvre() {
        Affirmation affirmation = new Affirmation(true, false, true);
        assertFalse(DoncLogique.beauDoncPauvre(affirmation), "Lou est beau donc Lou est pauvre devrait être faux.");

        affirmation = new Affirmation(true, true, true);
        assertTrue(DoncLogique.beauDoncPauvre(affirmation), "Lou est beau donc Lou est pauvre devrait être vrai.");

        affirmation = new Affirmation(false, false, true);
        assertTrue(DoncLogique.beauDoncPauvre(affirmation), "Lou est beau donc Lou est pauvre devrait être vrai.");
    }

    @Test
    public void testPauvreDoncGenereux() {
        Affirmation affirmation = new Affirmation(true, false, true);
        assertTrue(DoncLogique.pauvreDoncGenereux(affirmation), "Lou est pauvre donc Lou est généreux devrait être vrai.");

        affirmation = new Affirmation(true, true, true);
        assertTrue(DoncLogique.pauvreDoncGenereux(affirmation), "Lou est pauvre donc Lou est généreux devrait être vrai.");

        affirmation = new Affirmation(true, true, false);
        assertFalse(DoncLogique.pauvreDoncGenereux(affirmation), "Lou est pauvre donc Lou est généreux devrait être faux.");
    }

    @Test
    public void testBeauOuGenereuxDoncPauvre() {
        Affirmation affirmation = new Affirmation(true, false, true);
        assertFalse(DoncLogique.beauOuGenereuxDoncPauvre(affirmation), "Lou est beau ou Lou est généreux donc Lou est pauvre devrait être faux.");

        affirmation = new Affirmation(true, true, true);
        assertTrue(DoncLogique.beauOuGenereuxDoncPauvre(affirmation), "Lou est beau ou Lou est généreux donc Lou est pauvre devrait être vrai.");

        affirmation= new Affirmation(false, false, false);
        assertTrue(DoncLogique.beauOuGenereuxDoncPauvre(affirmation), "Lou est beau ou Lou est généreux donc Lou est pauvre devrait être vrai.");
    }

    @Test
    public void testPauvreOuGenereux() {
        Affirmation affirmation = new Affirmation(true, false, true);
        assertTrue(OuLogique.pauvreOuGenereux(affirmation), "Lou est pauvre ou Lou est généreux devrait être vrai.");

        affirmation = new Affirmation(true, true, true);
        assertTrue(OuLogique.pauvreOuGenereux(affirmation), "Lou est pauvre ou Lou est généreux devrait être vrai.");

        affirmation = new Affirmation(true, false, false);
        assertFalse(OuLogique.pauvreOuGenereux(affirmation), "Lou est pauvre ou Lou est généreux devrait être faux.");
    }
}
