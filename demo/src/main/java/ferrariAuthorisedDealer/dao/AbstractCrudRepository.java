package ferrariAuthorisedDealer.dao;

import java.util.Collection;
import java.util.Optional;

public interface AbstractCrudRepository <K, E>{

    boolean exists(E element);

    void createOrUpdate(E element);

    Collection<E> readAll();

    Optional<E> readById(K id);

    void deleteById(String id);
}
