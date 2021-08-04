
package Tela;
import Controle.ControleUsuario;
import javax.swing.JOptionPane;
import Origem.Usuario;
import Util.ConectaBanco;
import Util.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
    
public class TelaUsuario extends javax.swing.JInternalFrame {

    ConectaBanco conecta = new ConectaBanco();
    Usuario us = new Usuario();
    ControleUsuario control = new ControleUsuario();
    public TelaUsuario() {
        initComponents();
        conecta.conexao();
        preencherTabela("SELECT * FROM USUARIO ORDER BY NOME");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
        jLabel2Cpf = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jBNovoUsuario = new javax.swing.JButton();
        jBSalvarUsuario = new javax.swing.JButton();
        jBExcluirUsuario = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jcSexo = new javax.swing.JComboBox<>();
        jBEditarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();

        setTitle("Funcionario");

        jLabelNome.setText("Nome:");

        jLabel2Cpf.setText("CPF:");

        jLabelSexo.setText("sexo:");

        jLabelId.setText("ID:");

        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar:");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBNovoUsuario.setText("Novo");
        jBNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoUsuarioActionPerformed(evt);
            }
        });

        jBSalvarUsuario.setText("Salvar");
        jBSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarUsuarioActionPerformed(evt);
            }
        });

        jBExcluirUsuario.setText("Excluir");
        jBExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirUsuarioActionPerformed(evt);
            }
        });

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });

        jcSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        jcSexo.setToolTipText("");
        jcSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSexoActionPerformed(evt);
            }
        });

        jBEditarUsuario.setText("Editar");
        jBEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarUsuarioActionPerformed(evt);
            }
        });

        jTUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTUsuario);

        jLabel1.setText("Telefone:");

        jLabel2.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabel2Cpf)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelId)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jTID))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jBSalvarUsuario)
                                        .addGap(71, 71, 71)
                                        .addComponent(jBExcluirUsuario))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jBNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jBEditarUsuario)
                                .addGap(241, 241, 241)
                                .addComponent(jCancelar)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelSexo)
                    .addComponent(jcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Cpf)
                    .addComponent(jLabelId)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jcSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSexoActionPerformed

    private void jBNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoUsuarioActionPerformed
        
        limparCampos();
            jBNovoUsuario.setEnabled(false);
            jBSalvarUsuario.setEnabled(true);
            jBExcluirUsuario.setEnabled(false);
            jBEditarUsuario.setEnabled(false);
            jCancelar.setEnabled(true);
            jBPesquisar.setEnabled(false);
            jTPesquisar.setEnabled(false);
            jTNome.setEnabled(true);
            jTCPF.setEnabled(true);
            jTTelefone.setEnabled(false);
            jTEmail.setEnabled(false);
            jcSexo.setEnabled(true);
            jcSexo.setSelectedIndex(0);
    }//GEN-LAST:event_jBNovoUsuarioActionPerformed

    private void jBSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarUsuarioActionPerformed
        if(validarCampos()){
                us.setNome(jTNome.getText());
                us.setCpf(jTCPF.getText());
                us.setSexo((String) jcSexo.getSelectedItem());
                control.cadastrarUsuario();
                limparCampos();
                jBNovoUsuario.setEnabled(true);
                jBSalvarUsuario.setEnabled(false);
                jBEditarUsuario.setEnabled(false);
                jBExcluirUsuario.setEnabled(false);
                jCancelar.setEnabled(false);
                jBPesquisar.setEnabled(true);
                jTPesquisar.setEnabled(true);
                jTNome.setEnabled(false);
                jTTelefone.setEnabled(false);
                jTEmail.setEnabled(false);
                jcSexo.setEnabled(false);
                jTCPF.setEnabled(false);
                preencherTabela("SELECT * FROM USUARIO ORDER BY NOME");
            }
    }//GEN-LAST:event_jBSalvarUsuarioActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        
        us.setPesquisar(jTPesquisar.getText());
            Usuario model = control.buscarUsuario(us);
            jTID.setText(String.valueOf(model.getIdUsuario()));
            jTNome.setText(model.getNome());
            jTCPF.setText(model.getCpf());
            jcSexo.setSelectedItem(model.getSexo());
            jTNome.setEnabled(true);
            jTTelefone.setEnabled(false);
            jTEmail.setEnabled(false);
            jcSexo.setEnabled(true);
            jTCPF.setEnabled(true);
            jBSalvarUsuario.setEnabled(false);
            jBEditarUsuario.setEnabled(true);
            jBExcluirUsuario.setEnabled(true);
            jCancelar.setEnabled(true);
            jTPesquisar.setText("");
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirUsuarioActionPerformed
        
        us.setIdUsuario(Integer.parseInt(jTID.getText()));
            control.excluirUsuario(us);
            limparCampos();
            jTNome.setEnabled(false);
            jTTelefone.setEnabled(false);
            jTEmail.setEnabled(false);
            jcSexo.setEnabled(false);
            jTCPF.setEnabled(false);
            jBNovoUsuario.setEnabled(true);
            jBSalvarUsuario.setEnabled(false);
            jBEditarUsuario.setEnabled(false);
            jBExcluirUsuario.setEnabled(false);
            jCancelar.setEnabled(true);
             preencherTabela("SELECT * FROM USUARIO ORDER BY NOME");
    }//GEN-LAST:event_jBExcluirUsuarioActionPerformed

    private void jBEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarUsuarioActionPerformed
        us.setIdUsuario(Integer.parseInt(jTID.getText()));
            us.setNome(jTNome.getText());
            us.setCpf(jTCPF.getText());
            us.setSexo((String) jcSexo.getSelectedItem());
            control.editarUsuario(us);
            limparCampos();
            jBNovoUsuario.setEnabled(true);
            jBSalvarUsuario.setEnabled(false);
            jBEditarUsuario.setEnabled(false);
            jBExcluirUsuario.setEnabled(false);
            jCancelar.setEnabled(false);
            jBPesquisar.setEnabled(true);
            jBPesquisar.setEnabled(true);
            jTNome.setEnabled(false);
            jcSexo.setEnabled(false);
            jTTelefone.setEnabled(false);
            jTEmail.setEnabled(false);
            jTCPF.setEnabled(false);
            preencherTabela("SELECT * FROM USUARIO ORDER BY NOME");
    }//GEN-LAST:event_jBEditarUsuarioActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
         limparCampos();
            jBNovoUsuario.setEnabled(true);
            jBSalvarUsuario.setEnabled(false);
            jBEditarUsuario.setEnabled(false);
            jBExcluirUsuario.setEnabled(false);
            jCancelar.setEnabled(false);
            jBPesquisar.setEnabled(true);
            jTPesquisar.setEnabled(true);
            jTNome.setEnabled(false);
            jTTelefone.setEnabled(false);
            jTEmail.setEnabled(false);
            jcSexo.setEnabled(false);
            jTCPF.setEnabled(false);
    }//GEN-LAST:event_jCancelarActionPerformed
 private void jTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {                                       
        try {
            String u = "" + jTUsuario.getValueAt(jTUsuario.getSelectedRow(), 0);
            conecta.conexao();
            conecta.executaSQL("SELECT * FROM USUARIO WHERE NOME='" + u + "'");
            conecta.rs.first();
            jTID.setText(String.valueOf(conecta.rs.getInt("IDUSUARIO")));
            jTNome.setText(conecta.rs.getString("NOME"));
            jcSexo.setSelectedItem(conecta.rs.getString("SEXO"));
            jTCPF.setText(conecta.rs.getString("CPF"));
            jTTelefone.setText(conecta.rs.getString("TELEFONE"));
            jTEmail.setText(conecta.rs.getString("EMAIL"));
            jTNome.setEnabled(true);
            jcSexo.setEnabled(true);
            jTTelefone.setEnabled(false);
            jTEmail.setEnabled(false);
            jTCPF.setEnabled(true);
            jTPesquisar.setEnabled(true);
            jBEditarUsuario.setEnabled(true);
            jBExcluirUsuario.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public void preencherTabela(String SQL){
            ArrayList dados = new ArrayList();
            
            String[] Colunas = new String[]{"Nome","Sexo","CPF","Telefone","Email"};
            
            conecta.executaSQL(SQL);
            try {
                conecta.rs.first();
                do{
                    dados.add(new Object[]{conecta.rs.getString("NOME"),conecta.rs.getString("SEXO") ,conecta.rs.getString("CPF"),conecta.rs.getString("TELEFONE"),conecta.rs.getString("")});
                }while(conecta.rs.next());
            } catch (SQLException ex) {
                
            } 
            
            PreencherTabela modelo = new PreencherTabela(dados, Colunas);
            jTUsuario.setModel(modelo);
            jTUsuario.getColumnModel().getColumn(0).setPreferredWidth(200); //Define o tamanho da coluna na tabela.
            jTUsuario.getColumnModel().getColumn(0).setResizable(false);    //Define se a coluna é redimensionavel.
            jTUsuario.getColumnModel().getColumn(1).setPreferredWidth(145); 
            jTUsuario.getColumnModel().getColumn(1).setResizable(false);  
            jTUsuario.getColumnModel().getColumn(2).setPreferredWidth(150); 
            jTUsuario.getColumnModel().getColumn(2).setResizable(false);
            jTUsuario.getColumnModel().getColumn(3).setPreferredWidth(200); 
            jTUsuario.getColumnModel().getColumn(3).setResizable(false);   
            jTUsuario.getColumnModel().getColumn(4).setPreferredWidth(97); 
            jTUsuario.getColumnModel().getColumn(4).setResizable(false);    
            jTUsuario.getTableHeader().setReorderingAllowed(false);
            jTUsuario.setAutoResizeMode(jTUsuario.AUTO_RESIZE_OFF);
            jTUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Só pode selecionar um elemnto da tabela
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditarUsuario;
    private javax.swing.JButton jBExcluirUsuario;
    private javax.swing.JButton jBNovoUsuario;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSalvarUsuario;
    private javax.swing.JButton jCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Cpf;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTTelefone;
    private javax.swing.JTable jTUsuario;
    private javax.swing.JComboBox<String> jcSexo;
    // End of variables declaration//GEN-END:variables
private boolean validarCampos(){
    if(jTNome.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Digite o NOME do Funcionario!");
        jTNome.requestFocus();
        return false;
    }
    if(jcSexo.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(this, "Selecione o SEXO do Funcionario!");
        jcSexo.requestFocus();
        return false;
    }
    
   
    if(jTCPF.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Digite o CPF do Funcionario!");
        jTCPF.requestFocus();
        return false;
    }
    
    return true;
}
    private void limparCampos(){
    jTID.setText("");
    jTNome.setText("");
    jTCPF.setText("");
    jcSexo.setSelectedIndex(0);
    jTPesquisar.setText("");
}

}
