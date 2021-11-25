package ferrariAuthorisedDealer.domain;

import java.util.Collection;
import java.util.Objects;

public class Client {

    private String name;
    private String surname;
    private Integer id;
    private String genre;
    private Collection<Seller> mn;

    public Client(String name, String surname, Integer id, String genre, Collection<Seller> mn) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.genre = genre;
        this.mn = mn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", genre='" + genre + '\'' +
                ", mn=" + mn +
                '}';
    }
}
