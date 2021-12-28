package ferrari_authorised_dealer.dao.jpa;

import ferrari_authorised_dealer.dao.AuthorisedDealerRepository;
import ferrari_authorised_dealer.dao.files.AuthDealerFileRepository;
import ferrari_authorised_dealer.domain.AuthorisedDealer;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.Optional;

public class AuthorisedDealerJpaRepository implements AuthorisedDealerRepository {
    private final EntityManager entityManager;

    public AuthorisedDealerJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public boolean exists(AuthorisedDealer element) {
        return entityManager.find(AuthorisedDealer.class, element.getId()) != null;
    }

    @Override
    public void createOrUpdate(AuthorisedDealer element) {
        entityManager.merge(element);
    }

    @Override
    public Collection<AuthorisedDealer> readAll() {
        return null;
    }

    @Override
    public Optional<AuthorisedDealer> readById(String id) {
        var u = entityManager.find(AuthorisedDealer.class, id);
        return Optional.ofNullable(u);
    }

    @Override
    public void deleteById(String id) {
        entityManager.remove(entityManager.find(AuthorisedDealer.class, id));
    }
}
