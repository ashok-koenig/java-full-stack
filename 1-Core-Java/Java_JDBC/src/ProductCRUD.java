import java.sql.*;
import java.util.Scanner;

public class ProductCRUD {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/fullstackdb";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "postgres";

    private static void addProduct(Connection conn, Scanner scanner){
        System.out.println("Enter Product Title");
        String title = scanner.nextLine();
        System.out.println("Enter Product Category");
        String category = scanner.nextLine();
        System.out.println("Enter product price");
        Double price = scanner.nextDouble();
        String sql = "insert into products (title, category, price) values(?,?,?)";
        PreparedStatement pstmt = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, category);
            pstmt.setDouble(3, price);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " product inserted");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null){
                    pstmt.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void viewProducts(Connection conn){
        String sql = "select * from products";
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt("id")+ "\t" + rs.getString("title") + "\t" + rs.getString("category") + "\t" + rs.getDouble("price"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(stmt != null){
                    stmt.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }


    private static void updateProduct(Connection conn, Scanner scanner){
        System.out.println("Enter Product Title");
        String title = scanner.nextLine();
        System.out.println("Enter Product Category");
        String category = scanner.nextLine();
        System.out.println("Enter product price");
        Double price = scanner.nextDouble();
        System.out.println("Enter the product ID to update");
        int id = scanner.nextInt();
        String sql = "update products set title=?, category=?, price=? where id=?";
        PreparedStatement pstmt = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, category);
            pstmt.setDouble(3, price);
            pstmt.setInt(4,id);
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated + " product updated");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null){
                    pstmt.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void deleteProduct(Connection conn, Scanner scanner){

        System.out.println("Enter the product ID to delete");
        int id = scanner.nextInt();
        String sql = "delete from products where id=?";
        PreparedStatement pstmt = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println(rowsDeleted + " product deleted");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null){
                    pstmt.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        Scanner scanner = new Scanner(System.in);

        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connected to the database");
//            addProduct(conn, scanner);
//            updateProduct(conn, scanner);
            deleteProduct(conn, scanner);
            viewProducts(conn);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(conn != null){
                    conn.close();
                    System.out.println("Connection closed");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
