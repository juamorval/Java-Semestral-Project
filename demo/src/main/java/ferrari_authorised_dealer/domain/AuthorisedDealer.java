package ferrari_authorised_dealer.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class AuthorisedDealer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "seq", allocationSize = 1)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "sellerName")
    private Collection<Seller> sellers;
    @OneToMany(mappedBy = "clientName")
    private Collection<Client> clients;


    public AuthorisedDealer(Integer id,String name, Collection<Seller> sellers, Collection<Client> clients) {
        this.id = id;
        this.name = name;
        this.sellers = sellers;
        this.clients = clients;

    }

    public AuthorisedDealer() {
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(Collection<Seller> sellers) {
        this.sellers = sellers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorisedDealer that = (AuthorisedDealer) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AuthorisedDealer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sellers=" + sellers +
                ", clients=" + clients +
                '}';
    }
}
