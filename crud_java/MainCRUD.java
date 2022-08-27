package crud_java;

import java.util.List;

/**
 *
 * @author Leonardo Rochedo
 */
public class MainCRUD {
    
    public static void main(String[] args) {
        
        CarDao garagem = new CarDao();
        Car fusca = new Car();
        
        // Inserindo um elemento
        fusca.setModel("Fusca");
        fusca.setYear(1890);
        fusca.setPrice(25.00);
        
        garagem.insertElement(fusca); // Inserindo o objeto no bancosql indiretamente
        
        // Atualizando um element
        fusca.setModel("Fusca");
        fusca.setYear(1890);
        fusca.setPrice(7502.30);
        fusca.setId(3);
        
        garagem.refreshElement(fusca);

        // Removendo um elemento
        //garagem.removeElement(fusca);
        
        List<Car> lista = garagem.getAll(); // Dando um getAll
        
        for(int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
