package ferrari_authorised_dealer.dao.files;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@Repository
public abstract class AbstractFileRepository<K, E> {

    public abstract K element(E element);

    //CRUD
    public boolean exists(E element) {
        return true;
    }

    public void createOrUpdate(E element) {
    }

    public Collection<E> readAll() {
        return Collections.EMPTY_LIST;
    }

    public Optional<E> readById(K id) {    //Optional
        return Optional.empty();
    }

    public void deleteById(String id) {
    }
}

