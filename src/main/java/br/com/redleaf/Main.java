package br.com.redleaf;
import java.lang.*;

import br.com.redleaf.models.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("03029092062","João Macedo",31,"51981759683");
        System.out.println(cliente1.getName());
        cliente1.checkAge();
    }
}