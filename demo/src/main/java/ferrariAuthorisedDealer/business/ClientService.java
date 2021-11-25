package ferrariAuthorisedDealer.business;

import ferrariAuthorisedDealer.dao.files.AbstractFileRepository;
import ferrariAuthorisedDealer.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientService extends AbstractCrudService<String, Client>{

    public ClientService(AbstractFileRepository<String, Client> repository) {
        super(repository);
    }
}
