package crud_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Leonardo Rochedo
 */
public class CarDao implements DaoInterface {
    private Connection connection;
    private PreparedStatement comand;
    private ResultSet resultSet;
    
    public CarDao() {
        connection = new CreateConnection().getConnection();
    }
    
    @Override
    public void insertElement(Car car) {
        // Inserir elemento no banco
        try {
            String sqlScript = "INSERT INTO Veiculos (modelo, ano, preco) VALUES (?, ?, ?)";
            comand = connection.prepareStatement(sqlScript);
            comand.setString(1, car.getModel()); // Modelo
            comand.setInt(2, car.getYear()); // Ano
            comand.setDouble(3, car.getPrice()); // Preco
            comand.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void refreshElement(Car car) {
        // Atualizar elemento do banco
        try {
            String sqlScript = "UPDATE Veiculos SET modelo = ?, ano = ?, preco = ? WHERE id = ?";
            comand = connection.prepareStatement(sqlScript);
            comand.setString(1, car.getModel()); // Modelo
            comand.setInt(2, car.getYear()); // Ano
            comand.setDouble(3, car.getPrice()); // Preco
            comand.setInt(4, car.getId()); // ID
            comand.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void removeElement(Car car) {
        // Remover elemento
        try {
            String sqlScript = "DELETE FROM Veiculos WHERE Veiculos.id = ?";
            comand = connection.prepareStatement(sqlScript);
            comand.setInt(1, car.getId()); // Pegando o ID
            comand.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Car searchId(int id) {
        // Procurar elemento pelo ID
        String sqlScript = "SELECT * FROM Veiculos WHERE Car.id = ?";
        try {
            comand = connection.prepareStatement(sqlScript);
            comand.setInt(1, id);
            resultSet = comand.executeQuery();
            resultSet.next();
            Car newCar = new Car();
            newCar.setId(resultSet.getInt("id"));
            newCar.setModel(resultSet.getString("model"));
            newCar.setYear(resultSet.getInt("ano"));
            newCar.setPrice(resultSet.getDouble("preco"));
            return newCar;
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public List<Car> getAll() {
        // GET em todos os elementos de Veiculos
        String sqlScript = "SELECT * FROM Veiculos";
        List<Car> list = new ArrayList<>();
        try {
            comand = connection.prepareStatement(sqlScript);
            resultSet = comand.executeQuery();
            while(resultSet.next()) {
                Car getCars = new Car();
                getCars.setId(resultSet.getInt("id"));
                getCars.setModel(resultSet.getString("modelo"));
                getCars.setYear(resultSet.getInt("ano"));
                getCars.setPrice(resultSet.getDouble("preco"));
                list.add(getCars);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }
}

