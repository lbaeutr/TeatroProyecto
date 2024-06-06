package DAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD;
import Logica.Espectaculo;

public class EspectaculoDao extends Conexion implements CRUD<Espectaculo> {
    @Override
    public List<Espectaculo> listarTodos() {
        String codEspectaculo;
        int numeroEntradas;
        String nombreEspectaculo;
        String genero;
        LocalDate fechaEspectaculo;
        Espectaculo espectaculo = null;
        List<Espectaculo> listaEspectaculos = new ArrayList();
        String consultaSQL = "SELECT * FROM espectaculo";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                codEspectaculo = resultSet.getString("codEspectaculo");
                nombreEspectaculo = resultSet.getString("nombreEspectaculo");
                genero = resultSet.getString("genero");
                fechaEspectaculo = resultSet.getDate("fechaEspectaculo").toLocalDate();
                numeroEntradas = resultSet.getInt("numeroEntradas");
                espectaculo = new Espectaculo(codEspectaculo, nombreEspectaculo, genero, fechaEspectaculo, numeroEntradas);
                listaEspectaculos.add(espectaculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEspectaculos;
    }

    @Override
    public Espectaculo leerPorId(String codEspectaculo) {
        String consultaSQL = "SELECT * FROM espectaculo WHERE codEspectaculo = ?";
        String nombreEspectaculo;
        String genero;
        LocalDate fechaEspectaculo;
        int numeroEntradas;
        Espectaculo espectaculo = null;
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, codEspectaculo);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                nombreEspectaculo = resultSet.getString("nombreEspectaculo");
                genero = resultSet.getString("genero");
                fechaEspectaculo = resultSet.getDate("fechaEspectaculo").toLocalDate();
                numeroEntradas = resultSet.getInt("numeroEntradas");
                espectaculo = new Espectaculo(codEspectaculo, nombreEspectaculo, genero, fechaEspectaculo, numeroEntradas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return espectaculo;
    }

    @Override
    public void crear(Espectaculo espectaculo) {
        String consultaSQL = "INSERT INTO espectaculo (codEspectaculo, nombreEspectaculo, genero, fechaEspectaculo, numeroEntradas) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, espectaculo.getCodEspectaculo());
            statement.setString(2, espectaculo.getNombreEspectaculo());
            statement.setString(3, espectaculo.getGenero());
            statement.setDate(4, Date.valueOf(espectaculo.getFechaEspectaculo()));
            statement.setInt(5, espectaculo.getNumeroEntradas());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Espectaculo espectaculo) {
        String consultaSQL = "UPDATE espectaculo SET nombreEspectaculo = ?, genero = ?, fechaEspectaculo, numeroEntradas WHERE codEspectaculo = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, espectaculo.getNombreEspectaculo());
            statement.setString(2, espectaculo.getGenero());
            statement.setDate(3, Date.valueOf(espectaculo.getFechaEspectaculo()));
            statement.setInt(4, espectaculo.getNumeroEntradas());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(String id) {
        int filasAfectadas;
        String consultaSQL = "DELETE FROM espectaculo WHERE codEspectaculo = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, "codEspectaculo");
            filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Espectaculo borrado");
            } else {
                System.out.println("No existe ningun Espectaculo con ese cod");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
