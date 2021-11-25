package ferrariAuthorisedDealer.dao.files;

import org.springframework.stereotype.Repository;

import java.util.Collection;
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
        return null;
    }

    public Optional<E> readById(K id) {    //Optional
        return null;
    }

    public void deleteById(String id) {
    }
}

