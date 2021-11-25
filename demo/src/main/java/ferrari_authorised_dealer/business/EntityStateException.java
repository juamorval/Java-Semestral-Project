package ferrari_authorised_dealer.business;

public class EntityStateException extends Exception {
    public <E> EntityStateException(E entity) {
        super("Illegal state of entity " + entity);
    }
}
