package ferrariAuthorisedDealer.business;

import ferrariAuthorisedDealer.dao.files.AbstractFileRepository;
import ferrariAuthorisedDealer.domain.AuthorisedDealer;
import org.springframework.stereotype.Component;

@Component
public class AuthorisedDealerService extends AbstractCrudService<String, AuthorisedDealer>{

    public AuthorisedDealerService(AbstractFileRepository<String, AuthorisedDealer> repository) {
        super(repository);
    }
}
