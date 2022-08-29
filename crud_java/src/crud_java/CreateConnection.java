package crud_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Rochedo
 */
public class CreateConnection {
    // LEMBRE DE IMPORTAR O mysql-connector-java
    
    private String url = "jdbc:mysql://localhost/crud"; // Localizando o banco do mysql da maquina
    private String user = "root";
    private String pass = "leo123321"; // Senha do seu MySql
    
    public Connection getConnection() {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CreateConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(CreateConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
}
