package ferrari_authorised_dealer.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Client {

    @Id
    @GeneratedValue//(strategy = GenerationType.SEQUENCE, generator = "seqC")
    //@SequenceGenerator(name = "seqC", sequenceName = "seqC", allocationSize = 1)
    private Integer id;
    private String clientName;
    private String surname;

    private String genre;

    @ManyToMany(mappedBy = "clients")
    private Collection<Seller> mn;

    public Client(String clientName, String surname, Integer id, String genre, Collection<Seller> mn) {
        this.clientName = clientName;
        this.surname = surname;
        this.id = id;
        this.genre = genre;
        this.mn = mn;
    }

    public Client() {
    }

    public String getName() {
        return clientName;
    }

    public void setName(String name) {
        this.clientName = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(String email) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Collection<Seller> getMn() {
        return mn;
    }

    public void setMn(Collection<Seller> mn) {
        this.mn = mn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id.equals(client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", genre='" + genre + '\'' +
                ", mn=" + mn +
                '}';
    }
}
