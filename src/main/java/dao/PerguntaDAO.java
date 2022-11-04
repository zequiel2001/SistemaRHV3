
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Cadidato;
import modelos.Pergunta;

public class PerguntaDAO {
    public java.util.List<Pergunta> consulta(){
        
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       java.util.List<Pergunta> perguntas = new ArrayList<Pergunta>();
       
       try{
           
            stmt = con.prepareStatement("SELECT id, pergunta FROM perguntas;");

            rs = stmt.executeQuery();
           
           while (rs.next()){
               Pergunta pergunta = new Pergunta();
               
               pergunta.setIdPergunta(rs.getInt("id"));
               pergunta.setPergunta(rs.getString("pergunta"));
               
               perguntas.add(pergunta);
               
           }
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
        finally {
            Conexao.fecharConexao(con, stmt);
        } 
      return perguntas;
    }
    
    public void cadastrarPergunta(Pergunta pergunta){
 
        Connection con = Conexao.getConexao();

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("INSERT INTO perguntas (pergunta) VALUES (?)");

            stmt.setString(1, pergunta.getPergunta());

            stmt.executeUpdate();

  
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } finally {
            Conexao.fecharConexao(con, stmt);
        }

    }
    
    
    public void alterar(Pergunta pergunta) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE perguntas SET pergunta = ? where id = ? ");
            
            stmt.setString(1, pergunta.getPergunta());
            stmt.setInt(2, pergunta.getIdPergunta());    
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

            //  throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }
    }  
    

   
}
