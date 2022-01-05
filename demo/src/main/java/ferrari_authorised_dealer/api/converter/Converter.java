package ferrari_authorised_dealer.api.converter;

import ferrari_authorised_dealer.api.dto.AuthorisedDealerDto;
import ferrari_authorised_dealer.domain.AuthorisedDealer;

public class Converter {
    public static AuthorisedDealer fromDto(AuthorisedDealerDto dto) {
        return new AuthorisedDealer(dto.getId(), dto.getName(), dto.getSellers(), dto.getClients());
    }

    public static AuthorisedDealerDto toDto(AuthorisedDealer auth) {
        AuthorisedDealerDto dto = new AuthorisedDealerDto();
        dto.setId(auth.getId());
        dto.setName(auth.getName());
        dto.setSellers(auth.getSellers());
        return dto;
    }
}
