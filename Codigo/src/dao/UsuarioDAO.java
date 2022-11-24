package dao;

import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.medDTO;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<medDTO> lista = new ArrayList<>();
        
    
    public ResultSet autenticacaoUsuario(Login objlogin) {
        conn = new ConnectionFactory().getConnection();

        try {
            String sql = "select * from administrador where senha = ? and usuario = ?";

            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlogin.getSenha());
            pstm.setString(2, objlogin.getUsuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    public void cadastrarRemedio(medDTO objcanaisDTO) {

        String sql = "INSERT INTO `meds` (`nome`, `recomendacao`, `quant`, `preco`, `desc` ) VALUES (?, ?, ?, ?, ?)";

        conn = new ConnectionFactory().getConnection();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcanaisDTO.getNome());
            pstm.setString(4, objcanaisDTO.getPreco());
            pstm.setString(3, objcanaisDTO.getQuant());
            pstm.setString(2, objcanaisDTO.getRecomendacao());
            pstm.setString(5, objcanaisDTO.getDesc());


            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrarMed" + erro);
        }

    }
    
    
    

    public ArrayList<medDTO> listarCanais() {

        String sql = "select * from meds ";
        conn = new ConnectionFactory().getConnection();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                medDTO objmedsDTO = new medDTO();
                objmedsDTO.setId(rs.getInt("id"));
                objmedsDTO.setNome(rs.getString("nome"));
                objmedsDTO.setRecomendacao(rs.getString("recomendacao"));
                objmedsDTO.setQuant(rs.getString("quant"));
                objmedsDTO.setPreco(rs.getString("preco"));
                objmedsDTO.setDesc(rs.getString("desc"));


                lista.add(objmedsDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CanaisDAO" + erro);
        }
        return lista;
    }
    
    
 public void excluirCadastros(medDTO objmedsDTO){
      String sql = "delete from meds where id = ?";
      conn = new ConnectionFactory().getConnection();
      
      
      try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objmedsDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }
 
 
 public void alterarCadastro(medDTO objmedsDTO){
    String sql = "UPDATE `meds` SET nome = ?, recomendacao = ?, quant = ?, preco = ?, `desc` = ? WHERE id = ?";    
   
    conn = new ConnectionFactory().getConnection();
    
    
      try {

           pstm = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, objmedsDTO.getNome());
           pstm.setString(2, objmedsDTO.getRecomendacao());
           pstm.setString(3, objmedsDTO.getQuant());
           pstm.setString(4, objmedsDTO.getPreco());
           pstm.setString(5, objmedsDTO.getDesc());
           
           pstm.setInt(6, objmedsDTO.getId());
            

           pstm.execute();
           pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AlterarMed" + erro);
        }
 
 }


public Vector  pesquisar(String pesq) throws Exception {
     Vector  tb = new Vector ();
     
     conn = new ConnectionFactory().getConnection();
     String sql = "select * from meds where nome like '" + pesq + "%'";
     PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     
     
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Vector nl = new Vector();
         nl.add(rs.getInt("id"));
         nl.add(rs.getString("nome"));
         nl.add(rs.getString("recomendacao"));
         nl.add(rs.getString("preco"));
         nl.add(rs.getString("quant"));
         nl.add(rs.getString("desc"));
         
         tb.add(nl);
         
     }
     return tb;
 }
   
    
/*
public void cadastrarCanaladm(medDTO objcanaisDTO) {

        String sql = "insert into canaladm (canalamd ,tipoadm, autentica) values (?, ?, ?)";

        conn = new ConnectionFactory().getConnection();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcanaisDTO.getCanalamd());
            pstm.setString(2, objcanaisDTO.getTipoadm());
            pstm.setString(3, objcanaisDTO.getAutentica());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanalADM  " + erro);
        }

    }
*/

}