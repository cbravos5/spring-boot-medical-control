package med.voll.api.medic;

public record ListMedicResponse(String name, String email, String crm, Specialty specialty) {
    public ListMedicResponse(Medic medic) {
        this(medic.getName(), medic.getEmail(), medic.getCrm(), medic.getSpecialty());
    }
}
