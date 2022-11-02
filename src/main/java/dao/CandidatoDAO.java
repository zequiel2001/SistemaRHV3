/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Cadidato;
/**
 *
 * @author Ezeks
 */
public class CandidatoDAO {

    
       public java.util.List<Cadidato> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       //variavel que vai guardar todos os dados vindo do banco de dados
       ResultSet rs = null;
       
       //criando lista
       java.util.List<Cadidato> candidatos = new ArrayList<Cadidato>();
       
       
       try{
           
            stmt = con.prepareStatement("SELECT nome, email, cpf, nascimento, genero, formacao, telefone, endereco, cep, numero, uf, curso, experiencia FROM candidatos;");
            //
            //stmt vai executar a query e em seguinda vai jogar o resultado na variavel que vai receber todo o resultado
            rs = stmt.executeQuery();
           
           while (rs.next()){
               Cadidato candidato =  new Cadidato();
              
                candidato.setNome(rs.getString("nome"));
                candidato.setEmail(rs.getString("email"));
                
                candidato.setCpf(rs.getString("cpf"));
                candidato.setNiversario(rs.getString("nascimento"));
                candidato.setGenero(rs.getString("genero"));
                candidato.setFormacao(rs.getString("formacao"));
                candidato.setTelefone(rs.getString("telefone"));
                candidato.setEndereco(rs.getString("endereco"));
                candidato.setCep(rs.getString("cep"));
                candidato.setNumero(rs.getString("numero"));
                candidato.setUf(rs.getString("uf"));
                candidato.setCursos(rs.getString("curso"));
                candidato.setEsperiecia(rs.getString("experiencia"));
                
              
               
               candidatos.add(candidato);
               
           }
           
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return candidatos;

       
   }
    
    
    
    
    
    
    public void cadastrar(Cadidato candidato){
        //cria variavel de conexao
        Connection con = Conexao.getConexao();
        //variavel que prepara a estrutura para fazer as inserções de dados 
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO candidatos(nome, email, cpf, nascimento, genero, formacao, telefone, endereco, cep, numero, uf, curso, experiencia, Entrevistador_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            
            
            stmt.setString(1, candidato.getNome());
            stmt.setString(2, candidato.getEmail());
            stmt.setString(3, candidato.getCpf());
            stmt.setString(4, candidato.getNiversario());
            stmt.setString(5, candidato.getGenero());
            stmt.setString(6, candidato.getFormacao());
            stmt.setString(7, candidato.getTelefone());
            stmt.setString(8, candidato.getEndereco());
            stmt.setString(9, candidato.getCep());
            stmt.setString(10, candidato.getNumero());
            stmt.setString(11, candidato.getUf());
            stmt.setString(12, candidato.getCursos());
            stmt.setString(13, candidato.getEsperiecia());
            stmt.setInt(14, candidato.getIdEntrevistador());
            
            int a = candidato.getIdEntrevistador();
            System.out.println("o id do entrevistador no arquivo dao é : " + a);
            
            //Executa a instrução SQL no objeto
            stmt.executeUpdate();
            
        //caso ocorra um erro    
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        //será fechado a conexao idependente do que acontecer no try catch   
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
        
        
        
    }
}
