package affirmationLogique;

import Model.Affirmation;

public class OuLogique {
    public static boolean pauvreOuGenereux(Affirmation affirmation) {
        return affirmation.isEstPauvre() || affirmation.isEstGenereux();
    }
}
