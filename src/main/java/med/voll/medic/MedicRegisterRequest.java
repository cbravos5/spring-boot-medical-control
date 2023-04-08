package med.voll.medic;

import med.voll.address.Address;

public record MedicRegisterRequest(String name, String email, String phone, String CRM, Specialty specialty, Address address) {
}
