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
        conectar();
        String consultaSQL = "UPDATE Entrada SET codEspectaculo = ?, dni = ?, fila = ?, columna = ?, fechaCompra = ?, precio = ? WHERE codEntrada = ?";
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
        finally {
            desconectar();
        }
    }

    public void crear(Entrada entrada, Cliente cliente, Espectaculo espectaculo) {
        conectar();
        String consultaSQL = "INSERT INTO Entrada (codEspectaculo, dni, fila, columna, fechacompra, precio) VALUES (?, ?, ?, ?, ?, ?)";
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
        finally {
            desconectar();
        }
    }

    public void eliminar(String id) {
        conectar();
        String consultaSQL = "DELETE FROM Entrada WHERE codEntrada = ?";
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
        finally {
            desconectar();
        }
    }

    public Entrada leerPorId(String id) {
        conectar();
        String consultaSQL = "SELECT * FROM Entrada WHERE codEntrada = ?";
        int fila, columna;
        String codEntrada, codEspectaculo, dni;
        Date fechaCompra;
        double precio;
        Entrada entrada = null;
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setInt(1, Integer.parseInt(id));
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                codEntrada = resultSet.getString("codEntrada");
                codEspectaculo = resultSet.getString("codEspectaculo");
                dni = resultSet.getString("dni");
                fila = resultSet.getInt("fila");
                columna = resultSet.getInt("columna");//todo mirar esto de aqui
                fechaCompra = resultSet.getDate("fechaCompra");
                precio = resultSet.getDouble("precio");
                entrada = new Entrada(codEntrada, codEspectaculo, dni, fila, columna, fechaCompra.toLocalDate(), precio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            desconectar();
        }
        return entrada;
    }

    public List<Entrada> listarTodos() {
        conectar();
        String consultaSQL = "SELECT * FROM Entrada";
        List<Entrada> listaEntradas = new ArrayList<>();
        int fila, columna;
        String codEntrada, codEspectaculo, dni;
        Date fechaCompra;
        double precio;
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                codEntrada = resultSet.getString("codEntrada");
                codEspectaculo = resultSet.getString("codEspectaculo");
                dni = resultSet.getString("dni");
                fila = resultSet.getInt("fila");
                columna = resultSet.getInt("columna");
                fechaCompra = resultSet.getDate("fechaCompra");
                precio = resultSet.getDouble("precio");
                Entrada entrada = new Entrada(codEntrada, codEspectaculo, dni, fila, columna, fechaCompra.toLocalDate(), precio);
                listaEntradas.add(entrada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            desconectar();
        }
        return listaEntradas;
    }
}
