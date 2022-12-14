/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import teligamagrao.Pessoa;
/**
 *
 * @author ArthurCyrilloGeiger
 */
public class AdicionarGanho extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarGanho
     */
    public AdicionarGanho() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adicionarGanho = new javax.swing.JLabel();
        adicioneGanhoAqui = new javax.swing.JLabel();
        txtValorGanho = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        dataGanho = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        cancelar = new javax.swing.JLabel();
        fixar = new javax.swing.JCheckBox();
        addGanho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adicionarGanho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adicionarGanho.setText("Adicionar Ganho");

        adicioneGanhoAqui.setText("Adicione o seu ganho aqui:");

        descricao.setText("Descrição:");

        dataGanho.setText("Data:");

        cancelar.setText("< Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        fixar.setText("Fixar");

        addGanho.setText("Salvar");
        addGanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adicioneGanhoAqui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorGanho, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricao)
                                    .addComponent(dataGanho))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addGanho))
                                    .addComponent(txtDescricao))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarGanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fixar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarGanho)
                    .addComponent(fixar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicioneGanhoAqui)
                    .addComponent(txtValorGanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataGanho)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGanho))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        // voltar para a tela inicial
        TelaInicial inicio = new TelaInicial();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_cancelarMouseClicked

    private void addGanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGanhoActionPerformed
        // recebe os dados inseridos
        Float valor = Float.parseFloat(txtValorGanho.getText());
        String descricao = txtDescricao.getText();
        String data = txtData.getText();
            
        //checando para ver se o valor não é zero
        if (valor != 0){
        
        try {     
            
            float saldoAtual = 0;
            
            // inicia conexão e busca o saldo
            Connection con = null;
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://babar.db.elephantsql.com:5432/byilvclc", "byilvclc", "yXK3NfRASYu3lbByS86UJp5rB7ClzphY");
            System.out.println("CONECTADO!");
            Statement stm = con.createStatement();
            String sql = "SELECT balance FROM public.accounts a WHERE iduser='1'";
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()){                
                saldoAtual = rs.getFloat("balance");
                System.out.println("SALDO ATUAL:"+saldoAtual);
            }
            
            // armazeno os dados do valor no banco         
            String sql2 = "INSERT INTO wallet (value, description, date, iduser) VALUES ('"+valor+"','"+descricao+"','"+data+"','1');";
            stm.execute(sql2);
            
            // atualizo o saldo
            float novoSaldo = saldoAtual + valor;
            String sql3 = "UPDATE accounts SET balance = '"+novoSaldo+"' WHERE iduser='1'";
            stm.execute(sql3);    
            
            // fecha conexão
            con.close();          
            
            // voltar para a tela inicial
            TelaInicial inicio = new TelaInicial();
            this.dispose();
            inicio.setVisible(true);
            
            }catch (Exception e) {
            e.printStackTrace();
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "ERRO! Não é possível adicionar um valor igual a zero.");
        }
        
    }//GEN-LAST:event_addGanhoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarGanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarGanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarGanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarGanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarGanho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGanho;
    private javax.swing.JLabel adicionarGanho;
    private javax.swing.JLabel adicioneGanhoAqui;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel dataGanho;
    private javax.swing.JLabel descricao;
    private javax.swing.JCheckBox fixar;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValorGanho;
    // End of variables declaration//GEN-END:variables
}
