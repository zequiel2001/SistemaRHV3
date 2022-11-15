/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.List;
import dao.CandidatoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;

/**
 *
 * @author Ezeks
 */
public class CandidatoBO {

    public List<Cadidato> consulta() {

        CandidatoDAO candidatodao = new CandidatoDAO();
        List<Cadidato> candidatos = new ArrayList<Cadidato>();

        try {
            candidatos = candidatodao.consulta();

        } catch (Exception e) {

            throw new RuntimeException("Erro ao inserir recuperar no banco de dados");
        }

        return candidatos;
    }

    public void cadastrar(Cadidato candidato) {

        CandidatoDAO dao = new CandidatoDAO();

        try {
            //dao.cadastrar(candidato);

            /*if(this.verificaCampoVazio(candidato) == false){
                if (validaCpf(candidato)) {
                    if(dao.validaCadastroCandidato(candidato) == false){
                        dao.cadastrar(candidato);
                        JOptionPane.showMessageDialog(null, "candidato foi cadastrado");
                    }else{
                        JOptionPane.showMessageDialog(null, "O Candidato que deseja cadastrar já existe no Sistema");
                    }     
            }else{
                JOptionPane.showMessageDialog(null, "O cpf do candidato é Invalido!");
            }
            
            }else{
                JOptionPane.showMessageDialog(null, "Alguns dos campos estão vazio! Tente Novamente");
            
            }*/
            if (validaCpf(candidato)) {
                if (dao.validaCadastroCandidato(candidato) == false) {
                    dao.cadastrar(candidato);
                    JOptionPane.showMessageDialog(null, "candidato foi cadastrado");
                } else {
                    JOptionPane.showMessageDialog(null, "O Candidato que deseja cadastrar já existe no Sistema");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O cpf do candidato é Invalido!");
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir informação no banco de dados");
        }

    }

    public void deletar(Cadidato candidato) {

        CandidatoDAO dao = new CandidatoDAO();
        try {
            dao.excluir(candidato);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir a informação no banco de dados");
        }

    }

    public void atualizar(Cadidato candidato) {
        CandidatoDAO dao = new CandidatoDAO();

        try {
            dao.alterar(candidato);
        } catch (Exception e) {
            throw new RuntimeException("Ops parece que ocorreu um erro no momento de atualizar as informações no banco");
        }

    }

    public List<Cadidato> pesquisaCandidato(String nomePesq) {

        CandidatoDAO candidatodao = new CandidatoDAO();
        List<Cadidato> candidatos = new ArrayList<Cadidato>();

        try {
            candidatos = candidatodao.pesquisaCandidato(nomePesq);

        } catch (Exception e) {

            throw new RuntimeException("Erro ao inserir recuperar no banco de dados");
        }

        return candidatos;
    }

    public boolean validaCpf(Cadidato candidato) {
        String cpf = candidato.getCpf();
        // classe do API do Stella CPFValidator 
        CPFValidator cpfvalidator = new CPFValidator();
        java.util.List<ValidationMessage> erros = cpfvalidator.invalidMessagesFor(cpf);
        //lista que pode retornar um pilha caso o cpf seja invalido, se for valido, a lista é vazia
        if (erros.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificaCampoVazio(Cadidato candidato) {
        if (candidato.getNome().isEmpty() && candidato.getEmail().isEmpty() && candidato.getCpf().isEmpty()) {
            return true;
        }
        if (candidato.getNiversario().isEmpty() && candidato.getGenero().isEmpty() && candidato.getFormacao().isEmpty()) {
            return true;
        }

        if (candidato.getTelefone().isEmpty() && candidato.getEndereco().isEmpty() && candidato.getNumero().isEmpty()) {
            return true;
        }

        if (candidato.getCep().isEmpty() && candidato.getUf().isEmpty() && candidato.getCursos().isEmpty()) {
            return true;
        }

        if (candidato.getEsperiecia().isEmpty()) {
            return true;
        }

        return false;
    }

}
