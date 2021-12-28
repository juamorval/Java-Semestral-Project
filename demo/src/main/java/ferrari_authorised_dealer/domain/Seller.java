package ferrari_authorised_dealer.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqS")
    @SequenceGenerator(name = "seqS", sequenceName = "seqS", allocationSize = 1)
    private Integer number;
    private String sellerName;
    private String surname;

    @ManyToMany(mappedBy = "Client")
    private Collection<Client> mn;

    public Seller(String sellerName, String surname, Integer number, Collection<Client> mn) {
        this.sellerName = sellerName;
        this.surname = surname;
        this.number = number;
        this.mn = mn;
    }

    public Seller() {
    }

    public String getName() {
        return sellerName;
    }

    public void setName(String name) {
        this.sellerName = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Collection<Client> getMn() {
        return mn;
    }

    public void setMn(Collection<Client> mn) {
        this.mn = mn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return number.equals(seller.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerName='" + sellerName + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                ", mn=" + mn +
                '}';
    }
}
