/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import modelos.Cadidato;
/**
 *
 * @author Ezeks
 */
public class CandidatoDAO {
    public List<Cadidato> consulta(){
        
        List<Cadidato> candidatos = new ArrayList<>();
        
        Cadidato c1 = new Cadidato();
        c1.setNome("Ezequiel");
        c1.setEmail("ezequiel.infor.motta2020@gmail.com");
        c1.setCpf("123.321.654-31");
        c1.setNiversario("18/08/2022");
        c1.setTelefone("73982319469");
        c1.setEndereco("Rua Don Pedro 1");
        c1.setCep("123456");
        //c1.setNumero(1010);
        c1.setGenero("Masculine");
        c1.setNumero(12);
        c1.setUf("BA");
        c1.setCursos("Computing");
        c1.setEsperiecia("10 years as a Technician");
        
        
        Cadidato c2 = new Cadidato();
        c2.setNome("Thiago");
        c2.setEmail("thiago.infor.motta2020@gmail.com");
        c2.setCpf("123.000.654-31");
        c2.setNiversario("13/07/2022");
        c2.setTelefone("7398231000");
        c2.setEndereco("Rua Don Pedro 2");
        c2.setCep("0004");
        //c1.setNumero(1010);
        c2.setGenero("Masculine");
        c2.setUf("BH");
        c2.setCursos("psychology");
        c2.setEsperiecia("6 years as a Technician");
        
        Cadidato c3 = new Cadidato();
        c3.setNome("Evelin");
        c3.setEmail("evelin.infor.motta2020@gmail.com");
        c3.setCpf("000.000.654-31");
        c3.setNiversario("13/07/2000");
        c3.setTelefone("7334231000");
        c3.setEndereco("Rua Don Pedro 3");
        c3.setCep("0005");
        //c1.setNumero(1010);
        c3.setGenero("Feminine");
        c3.setUf("BH");
        c3.setCursos("Medicina");
        c3.setEsperiecia("2 years as a Technician");
        
        Cadidato c4 = new Cadidato();
        c4.setNome("Dany");
        c4.setEmail("Dany.infor.motta2020@gmail.com");
        c4.setCpf("000.000.000-31");
        c4.setNiversario("10/07/2001");
        c4.setTelefone("73342314560");
        c4.setEndereco("Rua Don Pedro 6");
        c4.setCep("0006");
        //c1.setNumero(1010);
        c4.setGenero("Feminine");
        c4.setUf("SA");
        c4.setCursos("Veterinary");
        c4.setEsperiecia("10 years as a Technician");
        
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
        candidatos.add(c4);
        
    
        
        return candidatos;
    }
}
