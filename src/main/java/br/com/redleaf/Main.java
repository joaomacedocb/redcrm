package br.com.redleaf;
import java.lang.*;
import java.sql.SQLException;

import br.com.redleaf.domain.Customer;
import br.com.redleaf.models.CustomerOld;
import br.com.redleaf.repository.CustomerRepository;

public class Main {
    public static void main(String[] args) throws SQLException {

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.insert(new Customer("Junior Silva","jrsilva@email.com","03029092062"));
        customerRepository.FindAll().forEach(System.out::println);
    }
}