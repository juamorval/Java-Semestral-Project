package ferrari_authorised_dealer.business;

import ferrari_authorised_dealer.dao.files.AbstractFileRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

public abstract class AbstractCrudService <K, E>{

    protected final AbstractFileRepository<K, E> repository;

    protected AbstractCrudService(AbstractFileRepository<K, E> repository) {
        this.repository = repository;
    }

    //CRUD
    public void create(E element) throws EntityStateException {
        if(repository.exists(element))
            throw new EntityStateException(element);
        repository.createOrUpdate(element);

    }

    public void update(E element) throws EntityStateException {
        if(repository.exists(element))
            repository.createOrUpdate(element);
        else
            throw new EntityStateException(element);
    }

    public Collection<E> readAll() {
        return repository.readAll();
    }

    public Optional<E> readById(K id) {    //Optional
        return repository.readById(id);
    }

    public void deleteById(String id) {
        if(repository.readById((K) id).isEmpty()) {
            repository.deleteById(id);
        } else {
            throw new NoSuchElementException();
        }

    }

}