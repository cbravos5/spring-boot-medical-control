package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zip;

    public Address(AddressData data) {
        this.street = data.street();
        this.number = data.number();
        this.complement = data.complement();
        this.neighborhood = data.neighborhood();
        this.city = data.city();
        this.state = data.state();
        this.zip = data.state();
    }
}
