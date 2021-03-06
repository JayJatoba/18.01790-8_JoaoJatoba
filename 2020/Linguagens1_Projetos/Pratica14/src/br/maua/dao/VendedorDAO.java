package br.maua.dao;

import br.maua.models.Cliente;
import br.maua.models.Vendedor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO implements DAO<Vendedor>, DAOFields {
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:dados_tuned.db";

    public VendedorDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    @Override
    public List<Vendedor> get(String condition) {
        List<Vendedor> vendedores = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
            while(result.next()){
                Vendedor vendedor = new Vendedor(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("password")
                );
                vendedores.add(vendedor);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return vendedores;
    }

    @Override
    public List<Vendedor> getAll() {
        List<Vendedor> vendedores = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                Vendedor vendedor = new Vendedor(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("password")
                );
                vendedores.add(vendedor);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return vendedores;
    }

    @Override
    public void update(Vendedor vendedor) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
            preparedStatement.setString(1, vendedor.getId());
            preparedStatement.setString(2, vendedor.getName());
            preparedStatement.setString(3, vendedor.getName());
            preparedStatement.setString(4, vendedor.getId());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Vendedor vendedor) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, vendedor.getId());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(Vendedor vendedor) {
        try{
            // TODO
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, vendedor.getId());
            preparedStatement.setString(2, vendedor.getName());
            // Viola regra de nao imprimir senha

            //TODO: Criar gerador de Hash
            //baeldung.com/java-hashcode
            //commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/builder/HashCodeBuilder.html

            preparedStatement.setString(3, vendedor.getSenhaHash());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "vendedores";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+ table +" WHERE id = ?";
    }

    @Override
    public String getUpdateString(String table) {
        //TODO
        return "UPDATE "+ table +" SET id = ?, name = ?, password = ? WHERE id = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+ table + " (id, name, password) VALUES (?, ?, ?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }
    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM " + table + " WHERE ";
    }
}
