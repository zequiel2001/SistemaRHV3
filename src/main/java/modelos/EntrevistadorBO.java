/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import dao.EntrevistadorDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezeks
 */
public class EntrevistadorBO {
    
    public void cadastrar(Entrevistador entrevistado){
         
         EntrevistadorDAO dao = new EntrevistadorDAO();
         
         try {
             //o valida cpf seria aqui, em um if, e o verifca repetição de cpf seria dentro de um outro if caso retorne true
             
             if(dao.validarLogin(entrevistado) == false){
                 dao.cadastrarUsuario(entrevistado);
                 JOptionPane.showMessageDialog(null, "Entrevistador foi cadastrado");
             }else{
                  JOptionPane.showMessageDialog(null, "Entrevistador já existe no banco! Tente fazer o Login Novamente!");
             }
   
         } catch (Exception e) {
             throw new RuntimeException("Erro ao inserir informação no banco de dados");
         }
             
     }
    
    
}
