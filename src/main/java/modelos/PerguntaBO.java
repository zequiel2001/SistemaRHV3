/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import dao.PerguntaDAO;
import java.util.List;

/**
 *
 * @author Ezeks
 */
public class PerguntaBO {
    public List<Pergunta> consulta(){
        
        PerguntaDAO perguntadao = new PerguntaDAO();
        
        List<Pergunta> pergunta = perguntadao.consulta();
        
        return pergunta;
    }
}
