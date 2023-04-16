package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressData(@NotBlank String street, @NotBlank String number, String complement,
                          @NotBlank String neighborhood, @NotBlank String city, @NotBlank String state,
                          @NotBlank @Pattern(regexp = "\\d{8}") String zip) {
}
