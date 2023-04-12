package med.voll.api.medic;

import med.voll.api.address.AddressData;

public record MedicRegisterRequest(String name, String email, String phone, String crm, Specialty specialty, AddressData address) {
}
