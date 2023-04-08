package med.voll.medic;

import med.voll.address.AddressData;

public record MedicRegisterRequest(String name, String email, String phone, String CRM, Specialty specialty, AddressData address) {
}
