package br.com.redleaf.repository;
import br.com.redleaf.domain.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private final DatabaseConnection connection;

    public CustomerRepository(){
        this.connection = DatabaseConnection.getInstance();
    }

    public List<Customer> FindAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();

        PreparedStatement preparedStatement = this.connection
                .getConnection().prepareStatement("SELECT * FROM CLIENTE");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            Customer customer = new Customer();
            customer.setId(resultSet.getInt("id"));
            customer.setName(resultSet.getString("nome"));
            customer.setDocument(resultSet.getString("cpf"));
            customer.setEmail(resultSet.getString("email"));
            customers.add(customer);

        }

        return customers;
    }

    public Customer findById(int id) throws SQLException {

        Customer customer = null;

        PreparedStatement preparedStatement = this.connection
                .getConnection().prepareStatement("SELECT * FROM CLIENTE WHERE id = ?");
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            customer = new Customer();
            customer.setId(resultSet.getInt("id"));
            customer.setName(resultSet.getString("nome"));
            customer.setDocument(resultSet.getString("cpf"));
            customer.setEmail(resultSet.getString("email"));
        }

        return customer;
    }

    public boolean insert(Customer customer) throws SQLException {
        boolean inserted = false;

        String insertSql = "INSERT INTO cliente (nome, email, cpf) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = this.connection
                .getConnection().prepareStatement(insertSql);

        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getDocument());

        inserted = preparedStatement.execute();

        return inserted;
    }

    public boolean update(Customer customer) throws SQLException {
        boolean updated = false;

        if (customer == null || customer.getId() >= 0){
            return false;
        }

        String updateSql = "UPDATE cliente " +
                "SET nome = ?," +
                "SET email = ?," +
                "SET cpf = ? " +
                "WHERE id = ?";


        PreparedStatement preparedStatement = this.connection
                .getConnection().prepareStatement(updateSql);

        preparedStatement.setString(1,customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getDocument());
        preparedStatement.setInt(4,customer.getId());

        updated = preparedStatement.execute();

        return updated;
    }

}
