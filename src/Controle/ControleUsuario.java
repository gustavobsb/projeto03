
package Controle;

import Origem.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Util.ConectaBanco;
public class ControleUsuario {
    Usuario us = new Usuario();
    ConectaBanco conexao = new ConectaBanco();
    public void cadastrarUsuario(){
     conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into usuario(NOME,CPF,SEXO,TELEFONE,EMAIL)values(?,?,?,?,?)");
            pst.setString(1, us.getNome());
            pst.setString(2, us.getCpf());
            pst.setString(3, us.getSexo());
            pst.setString(4, us.getTelefone());
            pst.setString(5, us.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Funcionar: \n " + ex);
        }
    }
    public Usuario buscarUsuario(Usuario us){
        conexao.conexao();
        conexao.executaSQL("select * from usuario where nome like '%"+us.getPesquisar()+"%'");
        try {
            conexao.rs.first();
            us.setIdUsuario(conexao.rs.getInt("idUsuario"));
            us.setNome(conexao.rs.getString("nome"));
            us.setCpf(conexao.rs.getString("cpf"));
            us.setSexo(conexao.rs.getString("sexo"));
            us.setTelefone(conexao.rs.getString("telefone"));
            us.setEmail(conexao.rs.getString("email"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
        }
        return us;
    }
    public void editarUsuario(Usuario us){
            conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("UPDATE USUARIO SET NOME=?, CPF=?, SEXO=?, TELEFONE=?, EMAIL=? WHERE IDUSUARIO=?");
            pst.setString(1, us.getNome());
            pst.setString(2, us.getCpf());
            pst.setString(3, us.getSexo());
            pst.setString(4, us.getTelefone());
            pst.setString(5, us.getEmail());
            pst.setInt(8, us.getIdUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario editado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Cliente: "+ex);
        }
    }
    public void excluirUsuario(Usuario us){
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("delete from usuario where IDUSUARIO=?");
            pst.setInt(1, us.getIdUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Usuario: "+ex);
        }
        
    }
    public void criar_Senha_Login(Usuario us){
       conexao.conexao();
       try{
          PreparedStatement pst = conexao.conn.prepareStatement("insert into usuario(senha,login)values(?,?)");
          pst.setString(1, us.getSenha());
          pst.setString(2, us.getLogin());
          pst.execute();
          JOptionPane.showMessageDialog(null,"Seu login Foi criado!!");
       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"erro ao criar login e Senha!!!");
       }
    }
}
