package crud_java;

import java.util.List;
/**
 *
 * @author Leonardo Rochedo
 */
public interface DaoInterface {
    // Criando a interface Dao
    void insertElement(Car car);
    void refreshElement(Car car);
    void removeElement(Car car);
    Car searchId(int i);
    List<Car> getAll();
    
}
