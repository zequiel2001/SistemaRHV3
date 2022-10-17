/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.List;
import dao.CandidatoDAO;
/**
 *
 * @author Ezeks
 */
public class CandidatoBO {
    
    public List<Cadidato> consulta(){
        
        CandidatoDAO candidatodao = new CandidatoDAO();
        
        List<Cadidato> candidatos = candidatodao.consulta();
        
        return candidatos;
    }
}
