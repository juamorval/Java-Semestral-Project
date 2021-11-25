package ferrariAuthorisedDealer.dao.files;

import ferrariAuthorisedDealer.domain.AuthorisedDealer;
import org.springframework.stereotype.Component;

@Component
public class AuthDealerFileRepository extends AbstractFileRepository<String, AuthorisedDealer>{

    @Override
    public String element(AuthorisedDealer element) {
        return element.getName();
    }
}
