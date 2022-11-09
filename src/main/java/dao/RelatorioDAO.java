/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Ezeks
 */
public class RelatorioDAO {
    
    public void geraRelatorio(){
        Connection con = Conexao.getConexao();
        String src = "RelatorioPerguntas.jasper";
        JasperPrint jasperprint = null;
        try {
            jasperprint = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            System.out.println("Erro: " + ex);
        }
        finally{
            Conexao.fechaConexao(con);
        }
        JasperViewer view = new JasperViewer(jasperprint,false);
        view.setVisible(true);
   }
}
