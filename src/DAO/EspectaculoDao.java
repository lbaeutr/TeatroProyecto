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
        conectar();
        String codEspectaculo, nombreEspectaculo, informacionEspectaculo, genero;
        int numeroEntradas;
        LocalDate fechaEspectaculo;
        Espectaculo espectaculo = null;
        List<Espectaculo> listaEspectaculos = new ArrayList();
        String consultaSQL = "SELECT * FROM Espectaculo";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                codEspectaculo = resultSet.getString("codEspectaculo");
                nombreEspectaculo = resultSet.getString("nombreEspectaculo");
                genero = resultSet.getString("genero");
                fechaEspectaculo = resultSet.getDate("fechaEspectaculo").toLocalDate();
                informacionEspectaculo = resultSet.getString("informacionEspectaculo");
                numeroEntradas = resultSet.getInt("numeroEntradas");
                espectaculo = new Espectaculo(codEspectaculo, nombreEspectaculo, genero, fechaEspectaculo, informacionEspectaculo, numeroEntradas);
                listaEspectaculos.add(espectaculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            desconectar();
        }
        return listaEspectaculos;
    }

    @Override
    public Espectaculo leerPorId(String codEspectaculo) {
        conectar();
        String consultaSQL = "SELECT * FROM Espectaculo WHERE codEspectaculo = ?";
        String nombreEspectaculo, genero, informacionEspectaculo;
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
                informacionEspectaculo = resultSet.getString("informacionEspectaculo");
                numeroEntradas = resultSet.getInt("numeroEntradas");
                espectaculo = new Espectaculo(codEspectaculo, nombreEspectaculo, genero, fechaEspectaculo, informacionEspectaculo, numeroEntradas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            desconectar();
        }
        return espectaculo;
    }

    @Override
    public void crear(Espectaculo espectaculo) {
        conectar();
        String consultaSQL = "INSERT INTO Espectaculo (codEspectaculo, nombreEspectaculo, genero, fechaEspectaculo, informacionEspectaculo, numeroEntradas) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, espectaculo.getCodEspectaculo());
            statement.setString(2, espectaculo.getNombreEspectaculo());
            statement.setString(3, espectaculo.getGenero());
            statement.setDate(4, Date.valueOf(espectaculo.getFechaEspectaculo()));
            statement.setString(5, espectaculo.getInformacionEspectaculo());
            statement.setInt(6, espectaculo.getNumeroEntradas());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            desconectar();
        }
    }

    @Override
    public void actualizar(Espectaculo espectaculo) {
        conectar();
        String consultaSQL = "UPDATE espectaculo SET nombreEspectaculo = ?, genero = ?, fechaEspectaculo, informacionEspectaculo, numeroEntradas WHERE codEspectaculo = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, espectaculo.getNombreEspectaculo());
            statement.setString(2, espectaculo.getGenero());
            statement.setDate(3, Date.valueOf(espectaculo.getFechaEspectaculo()));
            statement.setString(4, espectaculo.getInformacionEspectaculo());
            statement.setInt(5, espectaculo.getNumeroEntradas());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            desconectar();
        }
    }

    @Override
    public void eliminar(String codEspectaculo) {
        conectar ();
        int filasAfectadas;
        String consultaSQL = "DELETE FROM Espectaculo WHERE codEspectaculo = ?";
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
        finally {
            desconectar();
        }
    }
}
