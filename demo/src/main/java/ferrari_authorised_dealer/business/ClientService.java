package ferrari_authorised_dealer.business;

import ferrari_authorised_dealer.dao.ClientRepository;
import ferrari_authorised_dealer.dao.files.AbstractFileRepository;
import ferrari_authorised_dealer.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientService extends AbstractCrudService<String, Client>{
    public ClientRepository clientRepository;

    public ClientService(AbstractFileRepository<String, Client> repository) {
        super(repository);
    }

    public Integer numberClientsPerGenreBySeller(Integer n) {
        return clientRepository.clientsPerGenreBySeller(n);
    }
}