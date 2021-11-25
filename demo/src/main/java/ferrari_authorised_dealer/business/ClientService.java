package ferrari_authorised_dealer.business;

import ferrari_authorised_dealer.dao.files.AbstractFileRepository;
import ferrari_authorised_dealer.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientService extends AbstractCrudService<String, Client>{

    public ClientService(AbstractFileRepository<String, Client> repository) {
        super(repository);
    }
}
