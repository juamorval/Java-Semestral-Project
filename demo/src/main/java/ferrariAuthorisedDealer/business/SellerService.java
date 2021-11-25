package ferrariAuthorisedDealer.business;

import ferrariAuthorisedDealer.dao.files.AbstractFileRepository;
import ferrariAuthorisedDealer.domain.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerService extends AbstractCrudService<String, Seller>{

    public SellerService(AbstractFileRepository<String, Seller> repository) {
        super(repository);
    }
}
