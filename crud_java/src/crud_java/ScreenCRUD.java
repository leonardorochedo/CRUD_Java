package crud_java;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Leonardo Rochedo
 */
public class ScreenCRUD extends javax.swing.JFrame {

    CarDao garagem = new CarDao(); // Criando um elemento da classe CarDao
    
    // Metodo construtor
    public ScreenCRUD() {
        initComponents();
        initialGrid();
        jTable1.addMouseListener(new addClick());
    }
    
    public void initialGrid() {
        // 1- Definir header (nome das colunas)
        Vector header = new Vector();
        header.add("ID");//
        header.add("Modelo");
        header.add("Ano");
        header.add("Preço");
        
        // 2- Carrega os dados da tabela no MySql
        CarDao garagem = new CarDao();
        List<Car> list = garagem.getAll(); // Pegando todos os dados da tabela
        
        Vector dados = new Vector(); // Cria um vetor para inserir os dados
        
        // Povoando a tabela com os dados do MySql
        for(int i=0; i<list.size(); i++) {
            Car car = list.get(i);
            
            Vector row = new Vector();
            row.add(car.getId());
            row.add(car.getModel());
            row.add(Integer.toString(car.getYear()));
            row.add(Double.toString(car.getPrice()));
            dados.add(row);
        }
        
        // 3- Montar no jTable
        TableModel dataModel = new DefaultTableModel (dados, header);
        jTable1.setModel(dataModel); // Setando tudo no jTable1 do jFrame
    }

    private class addClick implements MouseListener {
        // Cirando a classe puxando do MouseListener
        @Override
        public void mouseClicked(MouseEvent e) {
            // Quando o mouse clicar no jFrame ele vai:
            int rowSelected = jTable1.getSelectedRow(); // Pegar a linha selecionada
            
            // Pegar os valores do elemento que a linha selecionou
            int id = (Integer) jTable1.getValueAt(rowSelected, 0);
            String model = (String) jTable1.getValueAt(rowSelected, 1);
            String year = (String) jTable1.getValueAt(rowSelected, 2);
            String price = (String) jTable1.getValueAt(rowSelected, 3);
            
            // E Inserir nos text field
            jLabel5.setText(String.valueOf(id));
            jTextField1.setText(model);
            jTextField2.setText(year);
            jTextField3.setText(price);
        }
        
        // Metodos extras do MouseListener
        @Override
        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo");

        jLabel2.setText("Ano");

        jLabel3.setText("Valor");

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Deleta elemento
        Car removeCar = new Car();
        
        // Pegando o model do TextField
        String removeId = jLabel5.getText();
        String removeModel = jTextField1.getText();
        
        // Filtrando os dados para deletar
        try {
            // Setando os elementos
            removeCar.setId(Integer.parseInt(removeId));
            removeCar.setModel(removeModel);
        
            garagem.removeElement(removeCar); // Removendo elemento da tabela
        JOptionPane.showMessageDialog(jTable1, removeModel + " Removido com sucesso!!!"); // Cria o OptionPane
        } catch(NumberFormatException error) {
            // Se o ID estiver vazio
            JOptionPane.showMessageDialog(jTable1, "[ERRO] ID inexistente! Insira o elemento e tente novamente!!!");
        }
        
        initialGrid(); // Dando um refresh na table
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Atualizar elemento
        Car refreshCar = new Car();
        
        // Pegando os elementos do carro
        String removeId = jLabel5.getText();
        String refreshModel = jTextField1.getText();
        String refreshYear = jTextField2.getText();
        String refreshPrice = jTextField3.getText();
        
        // Filtrando os dados para a atualizacao da tabela
        try {
            // Setando os dados no refreshCar
            refreshCar.setId(Integer.parseInt(removeId));
            refreshCar.setModel(refreshModel);
            refreshCar.setYear(Integer.parseInt(refreshYear));
            refreshCar.setPrice(Double.parseDouble(refreshPrice));
            
            garagem.refreshElement(refreshCar); // Atualizando na tabela
            JOptionPane.showMessageDialog(jTable1, refreshModel + " Atualizado com Sucesso!!"); // OptionPane
        } catch(NumberFormatException error) {
            // Se o dado inserido não estiver correto
            JOptionPane.showMessageDialog(jTable1, "[ERRO] Dado inserido incorretamente! Corriga e tente novamente!!!");
        }
        
        initialGrid(); // Dando um refresh na table
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Inserir elemento
        Car newCar = new Car(); // Criando o carro
        
        // Pegando os valores do Text Field
        String newModel = jTextField1.getText();
        String newYear = jTextField2.getText();
        String newPrice = jTextField3.getText();
        
        // Filtrando os dados para a insercao
        try {
            // Setando no newCar
            newCar.setModel(newModel);
            newCar.setYear(Integer.parseInt(newYear));
            newCar.setPrice(Double.parseDouble(newPrice));
        
            garagem.insertElement(newCar); // Inserindo na tabela
            JOptionPane.showMessageDialog(jTable1, newModel + " Inserido com Sucesso!!!"); // OptionPane
        } catch(NumberFormatException error) {
            // Se o dado inserido não estiver correto
            JOptionPane.showMessageDialog(jTable1, "[ERRO] Dado inserido incorretamente! Corriga e tente novamente!!!");
        }
        
        initialGrid(); // Dando um refresh na table
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Main, deixa o jFrame visivel
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
