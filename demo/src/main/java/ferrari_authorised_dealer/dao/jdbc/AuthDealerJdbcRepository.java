package ferrari_authorised_dealer.dao.jdbc;

import ferrari_authorised_dealer.dao.AuthorisedDealerRepository;
import ferrari_authorised_dealer.domain.AuthorisedDealer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class AuthDealerJdbcRepository implements AuthorisedDealerRepository {

    private final Connection connection;

    public AuthDealerJdbcRepository() {
        try {
            connection = DriverManager.getConnection("jbdc");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean exists(AuthorisedDealer element) {
        return false;
    }

    @Override
    public void createOrUpdate(AuthorisedDealer element) {

    }

    @Override
    public Collection<AuthorisedDealer> readAll() {

        return null;
    }

    @Override
    public Optional<AuthorisedDealer> readById(String id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(String id) {

    }
}
