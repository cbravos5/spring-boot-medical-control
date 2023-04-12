package med.voll.api.medic;

public enum Specialty {
    ORTHOPEDICS("Ortopedia"),
    CARDIOLOGY("CARDIOLOGIA"),
    GYNECOLOGY("Ginecologia"),
    DERMATOLOGY("Dermatologia");

    public final String label;

    Specialty(String label) {
        this.label = label;
    }
}
