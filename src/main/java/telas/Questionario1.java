/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import conexao.Conexao;
import java.awt.Font;
import java.util.ArrayList;
import modelos.Pergunta;
import dao.PerguntaDAO;
import modelos.PerguntaQuestionario;
import dao.PerguntaQuestionarioDAO;
import dao.RelatorioDAO;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelos.Cadidato;
import modelos.CandidatoBO;
import modelos.PerguntaQuestionarioBO;
import modelos.RelatorioBO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ezeks
 */
public class Questionario1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Questionario1
     */
    java.util.List<PerguntaQuestionario> perguntas = new ArrayList<PerguntaQuestionario>();
    public Questionario1() {
        initComponents();
        DefaultTableModel modeltable = (DefaultTableModel) tabelacandidatos.getModel();
        tabelacandidatos.setRowSorter(new TableRowSorter(modeltable));
        preencherTabela();
        
        PerguntaQuestionario questionario = new PerguntaQuestionario();
        
        
        
        
        PerguntaQuestionarioDAO dao = new PerguntaQuestionarioDAO();
        
        perguntas = dao.listarPerguntasFormulario();

        pergunta1.setText(perguntas.get(0).getPergunta());
        pergunta1.setBackground(new java.awt.Color(0,0,0,1));
        pergunta2.setText(perguntas.get(1).getPergunta());
        pergunta2.setBackground(new java.awt.Color(0,0,0,1));
        pergunta3.setText(perguntas.get(2).getPergunta());
        pergunta3.setBackground(new java.awt.Color(0,0,0,1));
        pergunta4.setText(perguntas.get(3).getPergunta());
        pergunta4.setBackground(new java.awt.Color(0,0,0,1));
        
        pergunta5.setText(perguntas.get(4).getPergunta());
        pergunta5.setBackground(new java.awt.Color(0,0,0,1));
        pergunta6.setText(perguntas.get(5).getPergunta());
        pergunta6.setBackground(new java.awt.Color(0,0,0,1));
        pergunta7.setText(perguntas.get(6).getPergunta());
        pergunta7.setBackground(new java.awt.Color(0,0,0,1));

    }
    
    public void preencherTabela(){
        
        DefaultTableModel modeltable = (DefaultTableModel) tabelacandidatos.getModel();
         modeltable.setNumRows(0);
         PerguntaQuestionarioBO bo = new PerguntaQuestionarioBO();
         
         for (Cadidato candidato: bo.consulta()){
             modeltable.addRow(new Object[]{
             candidato.getIdCandidato() ,candidato.getNome(), candidato.getCpf(), candidato.getIdEntrevistador()
             });
         }
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slide = new diu.swe.habib.JPanelSlider.JPanelSlider();
        painel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pergunta2 = new javax.swing.JTextField();
        pergunta1 = new javax.swing.JTextField();
        resposta2 = new javax.swing.JTextField();
        resposta1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelacandidatos = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pergunta3 = new javax.swing.JTextField();
        pergunta4 = new javax.swing.JTextField();
        pergunta6 = new javax.swing.JTextField();
        pergunta5 = new javax.swing.JTextField();
        resposta3 = new javax.swing.JTextField();
        resposta6 = new javax.swing.JTextField();
        resposta4 = new javax.swing.JTextField();
        resposta5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        painel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pergunta7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        resposta7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Questionario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(728, 570));

        painel1.setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(242, 242, 242));
        kGradientPanel1.setkStartColor(new java.awt.Color(215, 215, 215));
        kGradientPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Questions for the Interviewed");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 325, 32);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(403, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel4);
        jPanel4.setBounds(40, 60, 403, 3);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Select the candidate you wish to interview:");
        kGradientPanel1.add(jLabel7);
        jLabel7.setBounds(40, 80, 420, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Answer:");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(40, 320, 57, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Question 2");
        kGradientPanel1.add(jLabel9);
        jLabel9.setBounds(40, 380, 75, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Answer:");
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(40, 420, 57, 17);

        pergunta2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta2.setForeground(new java.awt.Color(102, 102, 102));
        pergunta2.setBorder(null);
        kGradientPanel1.add(pergunta2);
        pergunta2.setBounds(130, 380, 530, 22);

        pergunta1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta1.setForeground(new java.awt.Color(102, 102, 102));
        pergunta1.setBorder(null);
        kGradientPanel1.add(pergunta1);
        pergunta1.setBounds(130, 280, 530, 22);

        resposta2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta2.setForeground(new java.awt.Color(51, 51, 51));
        resposta2.setBorder(null);
        kGradientPanel1.add(resposta2);
        resposta2.setBounds(128, 420, 530, 21);

        resposta1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta1.setForeground(new java.awt.Color(51, 51, 51));
        resposta1.setBorder(null);
        kGradientPanel1.add(resposta1);
        resposta1.setBounds(130, 320, 530, 21);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Proximo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1);
        jButton1.setBounds(550, 470, 110, 26);

        tabelacandidatos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tabelacandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Email", "Id Entrevistador"
            }
        ));
        tabelacandidatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelacandidatos.setMinimumSize(new java.awt.Dimension(80, 80));
        tabelacandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelacandidatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelacandidatos);
        if (tabelacandidatos.getColumnModel().getColumnCount() > 0) {
            tabelacandidatos.getColumnModel().getColumn(1).setMinWidth(160);
            tabelacandidatos.getColumnModel().getColumn(1).setPreferredWidth(160);
            tabelacandidatos.getColumnModel().getColumn(1).setMaxWidth(160);
            tabelacandidatos.getColumnModel().getColumn(2).setMinWidth(300);
            tabelacandidatos.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabelacandidatos.getColumnModel().getColumn(2).setMaxWidth(300);
            tabelacandidatos.getColumnModel().getColumn(3).setMinWidth(90);
            tabelacandidatos.getColumnModel().getColumn(3).setPreferredWidth(90);
            tabelacandidatos.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        kGradientPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 120, 620, 110);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Question 1");
        kGradientPanel1.add(jLabel21);
        jLabel21.setBounds(40, 280, 75, 17);

        painel1.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 710, 570);

        slide.add(painel1, "card2");

        kGradientPanel2.setkEndColor(new java.awt.Color(233, 231, 231));
        kGradientPanel2.setkStartColor(new java.awt.Color(215, 215, 215));
        kGradientPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Questions for the Interviewed");
        kGradientPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 325, 32);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(403, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        kGradientPanel2.add(jPanel5);
        jPanel5.setBounds(40, 60, 403, 3);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Question 3");
        kGradientPanel2.add(jLabel11);
        jLabel11.setBounds(40, 80, 75, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Answer:");
        kGradientPanel2.add(jLabel12);
        jLabel12.setBounds(40, 120, 57, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Question 4");
        kGradientPanel2.add(jLabel13);
        jLabel13.setBounds(40, 180, 75, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Answer:");
        kGradientPanel2.add(jLabel14);
        jLabel14.setBounds(40, 220, 57, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Question 5");
        kGradientPanel2.add(jLabel15);
        jLabel15.setBounds(40, 280, 75, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Answer:");
        kGradientPanel2.add(jLabel16);
        jLabel16.setBounds(40, 320, 57, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Question 6");
        kGradientPanel2.add(jLabel17);
        jLabel17.setBounds(40, 380, 75, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Answer:");
        kGradientPanel2.add(jLabel18);
        jLabel18.setBounds(40, 420, 57, 17);

        pergunta3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta3.setForeground(new java.awt.Color(102, 102, 102));
        pergunta3.setBorder(null);
        kGradientPanel2.add(pergunta3);
        pergunta3.setBounds(140, 80, 518, 22);

        pergunta4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta4.setForeground(new java.awt.Color(102, 102, 102));
        pergunta4.setBorder(null);
        kGradientPanel2.add(pergunta4);
        pergunta4.setBounds(140, 180, 518, 22);

        pergunta6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta6.setForeground(new java.awt.Color(102, 102, 102));
        pergunta6.setBorder(null);
        kGradientPanel2.add(pergunta6);
        pergunta6.setBounds(140, 380, 518, 22);

        pergunta5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta5.setForeground(new java.awt.Color(102, 102, 102));
        pergunta5.setBorder(null);
        kGradientPanel2.add(pergunta5);
        pergunta5.setBounds(140, 280, 518, 22);

        resposta3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta3.setForeground(new java.awt.Color(51, 51, 51));
        resposta3.setBorder(null);
        kGradientPanel2.add(resposta3);
        resposta3.setBounds(140, 120, 518, 21);

        resposta6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta6.setForeground(new java.awt.Color(51, 51, 51));
        resposta6.setBorder(null);
        kGradientPanel2.add(resposta6);
        resposta6.setBounds(140, 420, 518, 21);

        resposta4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta4.setForeground(new java.awt.Color(51, 51, 51));
        resposta4.setBorder(null);
        kGradientPanel2.add(resposta4);
        resposta4.setBounds(140, 220, 518, 21);

        resposta5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta5.setForeground(new java.awt.Color(51, 51, 51));
        resposta5.setBorder(null);
        kGradientPanel2.add(resposta5);
        resposta5.setBounds(140, 320, 518, 21);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Proximo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton6);
        jButton6.setBounds(538, 500, 120, 27);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton2);
        jButton2.setBounds(400, 500, 100, 27);

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        slide.add(painel2, "card3");

        painel3.setBackground(new java.awt.Color(205, 205, 205));
        painel3.setLayout(null);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        painel3.add(jButton4);
        jButton4.setBounds(20, 430, 94, 27);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cadastrar Relatorio");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painel3.add(jButton5);
        jButton5.setBounds(360, 470, 206, 27);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Question 8");
        painel3.add(jLabel19);
        jLabel19.setBounds(40, 100, 75, 17);

        pergunta7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pergunta7.setForeground(new java.awt.Color(102, 102, 102));
        pergunta7.setBorder(null);
        painel3.add(pergunta7);
        pergunta7.setBounds(131, 98, 510, 22);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Answer:");
        painel3.add(jLabel20);
        jLabel20.setBounds(40, 140, 57, 17);

        resposta7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        resposta7.setForeground(new java.awt.Color(51, 51, 51));
        resposta7.setBorder(null);
        painel3.add(resposta7);
        resposta7.setBounds(119, 140, 520, 21);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Questions for the Interviewed");
        painel3.add(jLabel3);
        jLabel3.setBounds(40, 20, 325, 32);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(403, 3));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(403, 3));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
        );

        painel3.add(jPanel6);
        jPanel6.setBounds(40, 60, 403, 3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quest.jpg"))); // NOI18N
        painel3.add(jLabel4);
        jLabel4.setBounds(40, 190, 597, 210);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Gerar Relatorio");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        painel3.add(jButton7);
        jButton7.setBounds(130, 470, 206, 27);

        slide.add(painel3, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        slide.nextPanel(15, painel2, slide.right);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        slide.nextPanel(15, painel3, slide.right);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        slide.nextPanel(15, painel1, slide.left);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        //quando ele apertar em cadastrar questionario
        
        int linha = this.tabelacandidatos.getSelectedRow();
        int id = (int) tabelacandidatos.getModel().getValueAt(linha, 0);
        int idEntrevistado = (int) tabelacandidatos.getModel().getValueAt(linha, 3);
        
        System.out.println("o id da candidato é: " + id);
        System.out.println("o id da entrevistador é: " + idEntrevistado);
                
        perguntas.get(0).setResposta(resposta1.getText());
        perguntas.get(1).setResposta(resposta2.getText());
        perguntas.get(2).setResposta(resposta3.getText());
        perguntas.get(3).setResposta(resposta4.getText());
        perguntas.get(4).setResposta(resposta5.getText());
        perguntas.get(5).setResposta(resposta6.getText());
        perguntas.get(6).setResposta(resposta7.getText());
        
        //PerguntaQuestionarioDAO dao = new PerguntaQuestionarioDAO();
        

        
        //dao.cadastrarResposta(perguntas, id);
        PerguntaQuestionarioBO bo = new PerguntaQuestionarioBO();
        
        
        try {
            bo.cadastrarResposta(perguntas, id);
            JOptionPane.showMessageDialog(null, "Questionario Cadastrado com Sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um erro no momento de cadastrar o questionario");
        }
        

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabelacandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacandidatosMouseClicked
        // TODO add your handling code here:
        //quando o o entrevistador clicar em uma linha da tabela
        int linha = this.tabelacandidatos.getSelectedRow();
        int id = (int) tabelacandidatos.getModel().getValueAt(linha, 0);
        int idEntrevistado = (int) tabelacandidatos.getModel().getValueAt(linha, 3);


    }//GEN-LAST:event_tabelacandidatosMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        slide.nextPanel(30, painel2, slide.left);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        try {
            RelatorioBO bo = new RelatorioBO();
            JOptionPane.showMessageDialog(null, "Aguarde alguns segundos, seu relatorio está sendo gerado");
            bo.geraRelatorio();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Parece que houve um erro na geração do relatorio!" + e);
            
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JTextField pergunta1;
    private javax.swing.JTextField pergunta2;
    private javax.swing.JTextField pergunta3;
    private javax.swing.JTextField pergunta4;
    private javax.swing.JTextField pergunta5;
    private javax.swing.JTextField pergunta6;
    private javax.swing.JTextField pergunta7;
    private javax.swing.JTextField resposta1;
    private javax.swing.JTextField resposta2;
    private javax.swing.JTextField resposta3;
    private javax.swing.JTextField resposta4;
    private javax.swing.JTextField resposta5;
    private javax.swing.JTextField resposta6;
    private javax.swing.JTextField resposta7;
    private diu.swe.habib.JPanelSlider.JPanelSlider slide;
    private javax.swing.JTable tabelacandidatos;
    // End of variables declaration//GEN-END:variables
}
