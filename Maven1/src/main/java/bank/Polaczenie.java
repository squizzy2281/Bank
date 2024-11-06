package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Polaczenie {
    private static final String URL = "jdbc:mysql://localhost:3306/Bank_Lombok";
    private static final String USER = "root";
    private static final String PASSWORD = "An333an333an";  

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM Client LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);


            if (resultSet.next()) {

                System.out.println("Client: " + resultSet.getString("firstName") + " " + resultSet.getString("lastName"));
            } else {
                System.out.println("Brak danych w tabeli Client.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
