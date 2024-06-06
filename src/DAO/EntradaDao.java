package DAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Logica.*;
public class EntradaDao extends Conexion {
    public void actualizar(Entrada entrada, Cliente cliente, Espectaculo espectaculo) {
        String consultaSQL = "UPDATE entrada SET codEspectaculo = ?, dni = ?, fila = ?, columna = ?, fechaCompra = ?, precio = ? WHERE codEntrada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, espectaculo.getCodEspectaculo());
            statement.setString(2, cliente.getDni());
            statement.setInt(3, entrada.getFila());
            statement.setInt(4, entrada.getColumna());
            statement.setDate(5, Date.valueOf(entrada.getFechaCompra()));
            statement.setDouble(6, entrada.getPrecio());
            statement.setObject(7, entrada.getCodEntrada());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void crear(Entrada entrada, Cliente cliente, Espectaculo espectaculo) {
        String consultaSQL = "INSERT INTO entrada (codEspectaculo, dni, fila, columna, fechacompra, precio) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, espectaculo.getCodEspectaculo());
            statement.setString(2, cliente.getDni());
            statement.setInt(3, entrada.getFila());
            statement.setInt(4, entrada.getColumna());
            statement.setDate(5, Date.valueOf(entrada.getFechaCompra()));
            statement.setDouble(6, entrada.getPrecio());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(String id) {
        String consultaSQL = "DELETE FROM entrada WHERE codEntrada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setInt(1, Integer.parseInt(id));
            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Entrada eliminada");
            } else {
                System.out.println("No existe ninguna entrada con ese código");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Entrada leerPorId(String id) {
        String consultaSQL = "SELECT * FROM entrada WHERE codEntrada = ?";
        Entrada entrada = null;
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setInt(1, Integer.parseInt(id));
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String codEntrada = resultSet.getString("codEntrada");
                String codEspectaculo = resultSet.getString("codEspectaculo");
                String dni = resultSet.getString("dni");
                int fila = resultSet.getInt("fila");
                int columna = resultSet.getInt("columna");//todo mirar esto de aqui
                Date fechaCompra = resultSet.getDate("fechaCompra");
                double precio = resultSet.getDouble("precio");
                entrada = new Entrada(codEntrada, codEspectaculo, dni, fila, columna, fechaCompra.toLocalDate(),
                        precio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrada;
    }

    public List<Entrada> listarTodos() {
        String consultaSQL = "SELECT * FROM entrada";
        List<Entrada> listaEntradas = new ArrayList<>();
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String codEntrada = resultSet.getString("codEntrada");
                String codEspectaculo = resultSet.getString("codEspectaculo");
                String dni = resultSet.getString("dni");
                int fila = resultSet.getInt("fila");
                int columna = resultSet.getInt("columna");
                Date fechaCompra = resultSet.getDate("fechaCompra");
                double precio = resultSet.getDouble("precio");
                Entrada entrada = new Entrada(codEntrada, codEspectaculo, dni, fila, columna, fechaCompra.toLocalDate(),
                        precio);
                listaEntradas.add(entrada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEntradas;
    }
}
