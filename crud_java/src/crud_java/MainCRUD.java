package crud_java;

import java.util.List;

/**
 *
 * @author Leonardo Rochedo
 */
public class MainCRUD {
    
    public static void main(String[] args) {
        
        // *TESTES*
        
        CarDao garagem = new CarDao();
        Car fusca = new Car();
        
        // Inserindo um elemento
        fusca.setModel("Fusca");
        fusca.setYear(1890);
        fusca.setPrice(25.00);
        
        garagem.insertElement(fusca); // Inserindo o objeto no bancosql indiretamente
        
        // Removendo um elemento
        //garagem.removeElement(fusca);

    }
}
