import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestPGJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/fullstackdb";
        String username = "postgres";
        String password = "postgres";

        Connection connection = null;

        try{
            // Step 1: Register the PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            //Step 2: Establish the Connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to PostgreSQL Database");

            // Step 3: Create a statement
            Statement statement = connection.createStatement();

            // Step 4: Execute a query
            String query = "select version()";
            ResultSet rs= statement.executeQuery(query);

            // Step 5: process the result set
            if(rs.next()){
                System.out.println("PostgreSQL version: " + rs.getString(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(connection != null){
                    connection.close();
                    System.out.println("Connection closed");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
