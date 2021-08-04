
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConectaBanco {
    public Statement stm; // Realiza pesquisas no Banco
    public ResultSet rs; // Armazena o resultado de uma pesquisa.
    private final String driver = "com.mysql.jdbc.Driver";
    private final String host = "jdbc:mysql://localhost:3306/loja";
    private final String user = "root";
    private final String senha = "";
    public Connection conn; // Realiza a conexao com o Banco
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(host, user, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao! \n Erro: "+ ex);
        }
    }
    
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao! \n Erro: "+ ex);
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

