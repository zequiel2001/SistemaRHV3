/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import dao.CandidatoDAO;
import dao.PerguntaDAO;
import java.util.ArrayList;
import java.util.List;

public class PerguntaBO {
    
    public List<Pergunta> consulta(){
        
        PerguntaDAO candidatodao = new PerguntaDAO();
        List<Pergunta> perguntas = new ArrayList<Pergunta>();
      
         try {
             perguntas = candidatodao.consulta();
             
         } catch (Exception e) {
             
              throw new RuntimeException("Erro ao inserir recuperar no banco de dados");
         }
     return perguntas;
    }
    
    public void atualizar(Pergunta pergunta){
        PerguntaDAO dao = new PerguntaDAO();
        
        try {
            dao.alterar(pergunta);
        } catch (Exception e) {
            throw new RuntimeException("Ops parece que ocorreu um erro no momento de atualizar as informações no banco");
        }
    
    }
}
