  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import dao.CandidatoDAO;
import dao.PerguntaQuestionarioDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ezeks
 */
public class PerguntaQuestionarioBO {
    public List<Cadidato> consulta(){
     
         
        PerguntaQuestionarioDAO dao = new PerguntaQuestionarioDAO();
        List<Cadidato> candidatos = new ArrayList<Cadidato>();
      
      
         try {
             candidatos = dao.consultaTabelaCandidatos();
             
         } catch (Exception e) {
             
              throw new RuntimeException("erro ao realizar consulta");
         }
     return candidatos;
     }
        
     public void cadastrarResposta(java.util.List<PerguntaQuestionario> perguntasQ, int id){

        PerguntaQuestionarioDAO dao = new PerguntaQuestionarioDAO();

        try {
            dao.cadastrarResposta(perguntasQ, id);
        } catch (Exception e) {
            throw new RuntimeException("Ops! Parece que houve um erro no momento de cadastrar as respostas");
        }

   }
}
