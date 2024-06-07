package affirmationLogique;

import Model.Affirmation;

public class EtLogique {
    public static boolean estPauvreEtGenereux(Affirmation affirmation) {
        return affirmation.isEstPauvre() && affirmation.isEstGenereux();
    }
}
