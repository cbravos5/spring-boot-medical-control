package med.voll.api.medic;

public record ListMedicResponse(String id, String name, String email, String crm, Specialty specialty) {
    public ListMedicResponse(Medic medic) {
        this(medic.getId(), medic.getName(), medic.getEmail(), medic.getCrm(), medic.getSpecialty());
    }
}
