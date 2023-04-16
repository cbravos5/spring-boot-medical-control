package med.voll.api.medic;

import med.voll.api.address.AddressData;

public record UpdateMedicRequest(
        String name,

        String phone,

        AddressData address) {
}
