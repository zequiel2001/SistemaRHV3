/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.List;
import dao.CandidatoDAO;
import java.util.ArrayList;
/**
 *
 * @author Ezeks
 */
public class CandidatoBO {
    
    /*public List<Cadidato> consulta(){
        
        CandidatoDAO candidatodao = new CandidatoDAO();
        
        List<Cadidato> candidatos = candidatodao.consulta();
        
        return candidatos;
    }*/
    
    
    public List<Cadidato> consulta(){
     
         
     CandidatoDAO candidatodao = new CandidatoDAO();
      List<Cadidato> candidatos = new ArrayList<Cadidato>();
      
      
         try {
             candidatos = candidatodao.consulta();
             
         } catch (Exception e) {
             
              throw new RuntimeException("Erro ao inserir recuperar no banco de dados");
         }
     
     
     return candidatos;
     }
    
    
    public void cadastrar(Cadidato candidato){

        CandidatoDAO dao = new CandidatoDAO();

        try {
            dao.cadastrar(candidato);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir informação no banco de dados");
        }

   }
    
    public void deletar(Cadidato candidato){
    
        CandidatoDAO dao = new CandidatoDAO();
        try {
           dao.excluir(candidato);
        } catch (Exception e) {
             throw new RuntimeException("Erro ao excluir a informação no banco de dados");
        }
    
    }
    
    public void atualizar(Cadidato candidato){
        CandidatoDAO dao = new CandidatoDAO();
        
        try {
            dao.alterar(candidato);
        } catch (Exception e) {
            throw new RuntimeException("Ops parece que ocorreu um erro no momento de atualizar as informações no banco");
        }
    
    }
        
        
}
