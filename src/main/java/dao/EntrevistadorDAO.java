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
import modelos.Entrevistador;

/**
 *
 * @author Ezeks
 */
public class EntrevistadorDAO {
        static int idEntrevistado;
        public boolean checarusuario(String login, String senha){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       //variavel que vai guardar todos os dados vindo do banco de dados
       ResultSet rs = null;
       boolean chek = false;
       //criando lista
       //java.util.List<Entrevistador> entrevistados = new ArrayList<Entrevistador>();
       
       
       try{
           
            stmt = con.prepareStatement("SELECT * from entrevistador where usuario = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            //
            //stmt vai executar a query e em seguinda vai jogar o resultado na variavel que vai receber todo o resultado
            rs = stmt.executeQuery();
           
           if (rs.next()){
               chek = true;
               Entrevistador entrevistado = new Entrevistador(); 
               
               idEntrevistado = rs.getInt("id");
               entrevistado.setId(idEntrevistado);
               //System.out.println("o id do entrevistador na classe entrevistador e " + entrevistado.getId());
               //System.out.println("o id do entrevistador é " + idEntrevistado);
               
           }
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return chek;

       
   }
        
        
        
    public int getID(){
    
        int idEnt = idEntrevistado;
        
        return idEnt;
    
    }
        
        
        public void cadastrarUsuario(Entrevistador entrevistador){
        //cria variavel de conexao
        Connection con = Conexao.getConexao();
        //variavel que prepara a estrutura para fazer as inserções de dados 
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO entrevistador (usuario, senha, cpf, nome) VALUES (?,?,?,?)");
            
            stmt.setString(1, entrevistador.getUsuario());
            stmt.setString(2, entrevistador.getSenha());
            stmt.setString(3, entrevistador.getCpf());
            stmt.setString(4, entrevistador.getNome());
            
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
        
        
    public boolean validarLogin(Entrevistador entrevistado) {
         Connection con = Conexao.getConexao();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         
         try {
             stmt = con.prepareStatement("select usuario, senha from entrevistador where usuario = ? and senha = ?");
             stmt.setString(1, entrevistado.getUsuario());
             stmt.setString(2, entrevistado.getSenha());
             rs = stmt.executeQuery();
             return rs.next();       
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //return rs.next();
        return true;
    }     
}
