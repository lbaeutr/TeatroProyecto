package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conexion;

    public Connection getConexion() {
        return conexion;
    }
    private final String url = "jdbc:mariadb://localhost:3306/jdbc";
    private final String user = "root";
    private final String pass = "admin";

    public void conectar() {
        
        try {
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void desconectar() {
        try{
            if (conexion != null) {
                if (!conexion.isClosed()) {
                    conexion.close();
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        
    }
    public boolean login(String user,String pass){
        boolean resultado = false;
        try {
            conexion = DriverManager.getConnection(url, user, pass);
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
