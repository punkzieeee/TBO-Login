package netbeans.projekakhirtbo;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class Connection {

    private static Connection koneksi;

    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            new Driver();
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projekakhirtbo", "root", "");
        }
        return koneksi;
    }

    public static void main(String args[]) {
        try {
            getConnection();
            System.out.println("Koneksi Sukses");
        } catch (SQLException ex) {
            System.err.println("Koneksi Gagal");
        }
    }
}