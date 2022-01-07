package ferrari_authorised_dealer.business;

import ferrari_authorised_dealer.dao.AbstractCrudRepository;
import ferrari_authorised_dealer.dao.files.AbstractFileRepository;
import ferrari_authorised_dealer.domain.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerService extends AbstractCrudService<String, Seller>{

    public SellerService(AbstractFileRepository<String, Seller> repository) {
        super(repository);
    }
}
