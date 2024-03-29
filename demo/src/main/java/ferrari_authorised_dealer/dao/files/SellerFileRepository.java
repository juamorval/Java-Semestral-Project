package ferrari_authorised_dealer.dao.files;

import ferrari_authorised_dealer.domain.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerFileRepository extends AbstractFileRepository<String, Seller>{
    @Override
    public String element(Seller element) {
        return element.getName();
    }

}
