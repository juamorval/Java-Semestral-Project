package ferrari_authorised_dealer.business;

import ferrari_authorised_dealer.dao.files.AbstractFileRepository;
import java.util.Collection;
import java.util.Optional;

public abstract class AbstractCrudService <K, E>{

    protected final AbstractFileRepository<K, E> repository;

    protected AbstractCrudService(AbstractFileRepository<K, E> repository) {
        this.repository = repository;
    }

    //CRUD
    public void create(E element) throws EntityStateException {
        if(repository.exists(element))
            throw new EntityStateException(null);
        repository.createOrUpdate(element);


    }

    public void update(E element) throws EntityStateException {
        if(repository.exists(element))
            repository.createOrUpdate(element);
        else
            throw new EntityStateException(null);
    }

    public Collection<E> readAll() {
        return repository.readAll();
    }

    public Optional<E> readById(K id) {    //Optional
        return repository.readById(id);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
