package br.com.redleaf;
import java.lang.*;
import java.sql.SQLException;

import br.com.redleaf.domain.Customer;
import br.com.redleaf.models.CustomerOld;
import br.com.redleaf.repository.CustomerRepository;

public class Main {
    public static void main(String[] args) throws SQLException {

        CustomerRepository c1 = new CustomerRepository();
        c1.delete(104);
        c1.FindAll().forEach(System.out::println);
    }
}