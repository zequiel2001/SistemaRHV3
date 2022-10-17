/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import modelos.Pergunta;

/**
 *
 * @author Ezeks
 */
public class PerguntaDAO {
    public List<Pergunta> consulta(){
        
        List<Pergunta> pergunta = new ArrayList<>();
        
        Pergunta p = new Pergunta();
        p.setPergunta("Could you tell me about yourself and describe your background briefly?");
        
        Pergunta p1 = new Pergunta();
        p1.setPergunta("Tell me about your professional experiences (if you have any).");
        
        Pergunta p2 = new Pergunta();
        p2.setPergunta("What are your working hours?");
        
        Pergunta p3 = new Pergunta();
        p3.setPergunta("Why  did you choose this job/career?");
        
        pergunta.add(p);
        pergunta.add(p1);
        pergunta.add(p2);
        pergunta.add(p3);
        
    
        
        return pergunta;
    }
}
