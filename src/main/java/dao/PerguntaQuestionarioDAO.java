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
import modelos.Cadidato;
import modelos.Pergunta;
import modelos.PerguntaQuestionario;

/**
 *
 * @author Ezeks
 */
public class PerguntaQuestionarioDAO {

    public java.util.List<PerguntaQuestionario> listarPerguntasFormulario() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        java.util.List<PerguntaQuestionario> perguntas = new ArrayList<PerguntaQuestionario>();
        try {
            stmt = con.prepareStatement("SELECT id, pergunta FROM perguntas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                PerguntaQuestionario pergunta = new PerguntaQuestionario(rs.getString("pergunta"), rs.getInt("id"));

                //pergunta.setP1(rs.getString("nome"));
                perguntas.add(pergunta);

            }

        } catch (SQLException s) {
            s.printStackTrace();

        } finally {
            Conexao.fecharConexao(con, stmt);

        }

        return perguntas;

    }

    public java.util.List<Cadidato> consultaTabelaCandidatos() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        //variavel que vai guardar todos os dados vindo do banco de dados
        ResultSet rs = null;

        //criando lista
        java.util.List<Cadidato> candidatos = new ArrayList<Cadidato>();

        try {

            stmt = con.prepareStatement("SELECT id, nome, email, cpf, Entrevistador_id FROM candidatos;");
            //
            //stmt vai executar a query e em seguinda vai jogar o resultado na variavel que vai receber todo o resultado
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cadidato candidato = new Cadidato();
                candidato.setIdCandidato(rs.getInt("id"));
                candidato.setNome(rs.getString("nome"));
                candidato.setEmail(rs.getString("email"));

                candidato.setCpf(rs.getString("cpf"));
                candidato.setIdEntrevistador(rs.getInt("Entrevistador_id"));

                candidatos.add(candidato);

            }

        } catch (SQLException s) {
            s.printStackTrace();

        } finally {
            Conexao.fecharConexao(con, stmt);

        }

        return candidatos;

    }

}
