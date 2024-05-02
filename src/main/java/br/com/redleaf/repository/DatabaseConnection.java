package br.com.redleaf.repository;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance(){
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {
        try {
            createConnection();
        } catch (SQLException e) {
            System.out.println("Erro ao se conectar ao banco de dados: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão fechada com sucesso.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    private void createConnection() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/redcrm", "root", "");
        this.connection.setAutoCommit(true);
    }
}
