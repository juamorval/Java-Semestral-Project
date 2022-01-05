package ferrari_authorised_dealer.api.dto;

import ferrari_authorised_dealer.domain.Client;
import ferrari_authorised_dealer.domain.Seller;

import java.util.Collection;
import java.util.Objects;

public class AuthorisedDealerDto {

    private Integer id;
    private String name;
    private Collection<Seller> sellers;
    private Collection<Client> clients;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(Collection<Seller> sellers) {
        this.sellers = sellers;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorisedDealerDto that = (AuthorisedDealerDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
