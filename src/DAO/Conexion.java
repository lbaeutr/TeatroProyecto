package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conexion;

    
    private final String url = "jdbc:mariadb://localhost:3306/jdbc";
    private String user;
    private String pass;
    private static String usuarioActual;
    private static String contraseñaActual;
    
    public boolean login(String user,String pass){
        boolean resultado = false;
        
        try {
            conexion = DriverManager.getConnection(url, user, pass);
            resultado = true;
            usuarioActual = user;
            contraseñaActual = pass;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public void conectar() {
        
        try {
            conexion = DriverManager.getConnection(url, usuarioActual, contraseñaActual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConexion() {
        return conexion;
    }
     public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
}