package br.com.redleaf.repository;
import br.com.redleaf.domain.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private DatabaseConnection connection;

    public CustomerRepository(){
        this.connection = DatabaseConnection.getInstance();
    }

    public List<Customer> FindAll () throws SQLException {
        List<Customer> customers = new ArrayList<>();

        PreparedStatement preparedStatement = this.connection
                .getConnection().prepareStatement("SELECT * FROM CLIENTE");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            Customer customer = new Customer();
            customer.setId(resultSet.getInt("id"));
            customer.setFirstName(resultSet.getString("nome"));
            customer.setDocument(resultSet.getString("cpf"));
            customer.setEmail(resultSet.getString("email"));
            customers.add(customer);

        }

        return customers;
    }
}
