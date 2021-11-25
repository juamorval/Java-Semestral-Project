package ferrari_authorised_dealer.dao.jpa;

import ferrari_authorised_dealer.domain.AuthorisedDealer;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.Optional;

public class AuthorisedDealerRepository implements ferrari_authorised_dealer.dao.AuthorisedDealerRepository {
    private final EntityManager entityManager;

    public AuthorisedDealerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public boolean exists(AuthorisedDealer element) {
        return false;
    }

    @Override
    public void createOrUpdate(AuthorisedDealer element) {

    }

    @Override
    public Collection<AuthorisedDealer> readAll() {
        return null;
    }

    @Override
    public Optional<AuthorisedDealer> readById(String id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(String id) {

    }
}
