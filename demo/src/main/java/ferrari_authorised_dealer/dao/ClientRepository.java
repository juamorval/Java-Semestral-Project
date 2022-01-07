package ferrari_authorised_dealer.dao;

import ferrari_authorised_dealer.domain.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends AbstractCrudRepository{

    @Query("SELECT COUNT(c.clientName) FROM Client c JOIN Seller s WHERE s.number = :n GROUP BY c.genre")
    Integer clientsPerGenreBySeller(Integer n);
}
