/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ezeks
 */
public class PerguntaQuestionario {
    private String pergunta;
    private int idPergunta;
    private String resposta;

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
    public PerguntaQuestionario(){
    
        
    }

    public PerguntaQuestionario(String pergunta, int idPergunta) {
        this.pergunta = pergunta;
        this.idPergunta = idPergunta;
    }
    
    
    

    public int getIdPergunta() {
        return idPergunta;
    }

    /*public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }*/
    
   
    public String getPergunta() {
        return pergunta;
    }

    /*public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }*/
    
    
    
    
    
    
    /*private String p1, p2, p3, p4, p5, p6, p7;
    

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    public String getP6() {
        return p6;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public String getP7() {
        return p7;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }*/
}
