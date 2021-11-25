package ferrari_authorised_dealer.dao.files;

import ferrari_authorised_dealer.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientFileRepository extends AbstractFileRepository<String, Client>{
    @Override
    public String element(Client element) {
        return element.getName();
    }
}
