package br.com.redleaf;
import java.lang.*;

import br.com.redleaf.models.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("03029092062","João Macedo",31,"51981759683");
        System.out.println(customer1.getName());
        customer1.checkAge();
    }
}