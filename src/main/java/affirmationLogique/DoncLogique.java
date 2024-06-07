package affirmationLogique;

import Model.Affirmation;

public class DoncLogique {
    public static boolean beauDoncPauvre(Affirmation affirmation) {
        return !affirmation.isEstBeau() ||affirmation.isEstPauvre();
    }

    // Méthode statique pour vérifier si Lou est pauvre donc Lou est généreux
    public static boolean pauvreDoncGenereux(Affirmation affirmation) {
        return !affirmation.isEstPauvre() || affirmation.isEstGenereux();
    }

    // Méthode statique pour vérifier si Lou est beau ou généreux donc Lou est pauvre
    public static boolean beauOuGenereuxDoncPauvre(Affirmation affirmation) {
        return !(affirmation.isEstBeau() || affirmation.isEstGenereux()) || affirmation.isEstPauvre();
    }
}
