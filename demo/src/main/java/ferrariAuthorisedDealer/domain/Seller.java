package ferrariAuthorisedDealer.domain;

import java.util.Collection;
import java.util.Objects;

public class Seller {

    private String name;
    private String surname;
    private Integer number;
    private Collection<Client> mn;

    public Seller(String name, String surname, Integer number, Collection<Client> mn) {
        this.name = name;
        this.surname = surname;
        this.number = number;
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
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                ", mn=" + mn +
                '}';
    }
}
