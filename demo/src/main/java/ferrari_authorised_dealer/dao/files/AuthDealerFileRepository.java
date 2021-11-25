package ferrari_authorised_dealer.dao.files;

import ferrari_authorised_dealer.domain.AuthorisedDealer;
import org.springframework.stereotype.Component;

@Component
public class AuthDealerFileRepository extends AbstractFileRepository<String, AuthorisedDealer>{

    @Override
    public String element(AuthorisedDealer element) {
        return element.getName();
    }
}
