package ferrari_authorised_dealer.business;

import ferrari_authorised_dealer.dao.files.AbstractFileRepository;
import ferrari_authorised_dealer.domain.AuthorisedDealer;
import org.springframework.stereotype.Component;

@Component
public class AuthorisedDealerService extends AbstractCrudService<String, AuthorisedDealer>{

    public AuthorisedDealerService(AbstractFileRepository<String, AuthorisedDealer> repository) {
        super(repository);
    }
}
