package ferrariAuthorisedDealer.domain;

import java.time.LocalDate;
import java.util.Objects;

public class AuthorisedDealer {

    private Integer id;
    private String name;
    private Integer capacity;
    private String location;


    public AuthorisedDealer(Integer id,String name, Integer capacity, String location) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.location = location;

    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                ", capacity=" + capacity +
                ", location='" + location + '\'' +
                '}';
    }
}
