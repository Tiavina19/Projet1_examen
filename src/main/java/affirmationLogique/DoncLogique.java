package affirmationLogique;

import Model.Affirmation;

public class DoncLogique {
    public static boolean beauDoncPauvre(Affirmation affirmation) {
        return !affirmation.isEstBeau() ||affirmation.isEstPauvre();
    }


    public static boolean pauvreDoncGenereux(Affirmation affirmation) {
        return !affirmation.isEstPauvre() || affirmation.isEstGenereux();
    }


    public static boolean beauOuGenereuxDoncPauvre(Affirmation affirmation) {
        return !(affirmation.isEstBeau() || affirmation.isEstGenereux()) || affirmation.isEstPauvre();
    }
}
