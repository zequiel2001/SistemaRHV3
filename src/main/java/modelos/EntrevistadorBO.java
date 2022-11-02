/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import dao.EntrevistadorDAO;

/**
 *
 * @author Ezeks
 */
public class EntrevistadorBO {
    
    public void cadastrar(Entrevistador entrevistado){
         
         EntrevistadorDAO dao = new EntrevistadorDAO();
         
         try {
             dao.cadastrarUsuario(entrevistado);
         } catch (Exception e) {
             throw new RuntimeException("Erro ao inserir informação no banco de dados");
         }
             
     }
    
    
}
