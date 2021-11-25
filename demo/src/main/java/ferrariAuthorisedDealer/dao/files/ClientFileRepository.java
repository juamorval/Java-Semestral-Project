package ferrariAuthorisedDealer.dao.files;

import ferrariAuthorisedDealer.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientFileRepository extends AbstractFileRepository<String, Client>{
    @Override
    public String element(Client element) {
        return element.getName();
    }
}
