package netbeans.projekakhirtbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connect {
    private Connection koneksi;
    
    public Connection getKoneksi(){
        return koneksi;
    }
    
    public void koneksiDatabase() { 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            try {
                String url, user, password;
                url = "jdbc:mysql://localhost:3306/projekakhirtbo"; 
                user = "root";
                password = "";
                koneksi = DriverManager.getConnection(url, user, password);

            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
                System.exit(0);
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!");
            System.exit(0);
        }
    }
    
    public static void main(String[] kon) {
        new Connect().koneksiDatabase();
    }
    
}