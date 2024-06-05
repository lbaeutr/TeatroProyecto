package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD;
import logica.Cliente;

public class ClienteDao extends Conexion implements CRUD<Cliente> {

    @Override
    public void actualizar(Cliente cliente) {

        String consultaSQL = "UPDATE clientes SET nombre = ?, prApellido = ?, sgApellido = ? WHERE dni = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getPrApellido());
            statement.setString(3, cliente.getSgApellido());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void crear(Cliente cliente) {

        String consultaSQL = "INSERT INTO clientes (dni, nombre, prApellido, sgApellido) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getPrApellido());
            statement.setString(4, cliente.getSgApellido());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(String dni) {
        int filasAfectadas;
        String consultaSQL = "DELETE FROM clientes WHERE dni = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, dni);
            filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente borrado");
            } else {
                System.out.println("No existe ningun cliente con ese dni");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Cliente leerPorId(String dni) {

        String consultaSQL = "SELECT * FROM clientes WHERE id = ?";
        String nombre;
        String prApellido;
        String sgApellido;

        Cliente clienteEncontrado = null;

        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, dni);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                nombre = resultSet.getString("nombre");
                prApellido = resultSet.getString("prApellido");
                sgApellido = resultSet.getString("sgApellido");

                clienteEncontrado = new Cliente(dni, nombre, prApellido, sgApellido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clienteEncontrado;
    }

    @Override
    public List<Cliente> listarTodos() {
        String dni;
        String nombre;
        String prApellido;
        String sgApellido;

        Cliente cliente = null;
        List<Cliente> listaClientes = new ArrayList();

        String consultaSQL = "SELECT * FROM clientes";
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                dni = resultSet.getString("dni");
                nombre = resultSet.getString("nombre");
                prApellido = resultSet.getString("prApellido");
                sgApellido = resultSet.getString("sgApellido");

                cliente = new Cliente(dni, nombre, prApellido, sgApellido);
                listaClientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaClientes;
    }
}
