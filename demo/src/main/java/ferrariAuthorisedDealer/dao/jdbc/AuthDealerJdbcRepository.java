package ferrariAuthorisedDealer.dao.jdbc;

import ferrariAuthorisedDealer.dao.AuthorisedDealerRepository;
import ferrariAuthorisedDealer.dao.files.AuthDealerFileRepository;
import ferrariAuthorisedDealer.domain.AuthorisedDealer;

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
        Statement s = connection.createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM wanillo");
        var ret = new ArrayList<AuthorisedDealer>();
        while(r.next()) {
            ret.add(new AuthorisedDealer(r.getString("username")));
        }
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
