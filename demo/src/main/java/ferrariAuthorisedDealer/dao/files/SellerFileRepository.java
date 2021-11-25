package ferrariAuthorisedDealer.dao.files;

import ferrariAuthorisedDealer.domain.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerFileRepository extends AbstractFileRepository<String, Seller>{
    @Override
    public String element(Seller element) {
        return element.getName();
    }

}
