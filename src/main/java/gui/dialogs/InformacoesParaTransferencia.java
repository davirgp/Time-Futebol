/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.dialogs;

import classes.Jogador;
import gerentes.GerenteElenco;

public class InformacoesParaTransferencia extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InformacoesParaTransferencia.class.getName());

    private final Jogador jogador;
    private CentralTransferencia centralTransferencia;
    private final GerenteElenco gerenteElenco;
    
    public InformacoesParaTransferencia(java.awt.Frame parent, boolean modal, Jogador jogador, GerenteElenco gerenteElenco, CentralTransferencia centralTransferencia) {
        super(parent, modal);
        
        this.gerenteElenco = gerenteElenco;
        this.jogador = jogador;
        this.centralTransferencia = centralTransferencia;
        
        initComponents();
        
        setAtributos(jogador);
        
        getContentPane().setBackground(new java.awt.Color(70,70,70));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblInformacoes = new javax.swing.JLabel();
        lblGolAssist = new javax.swing.JLabel();
        lblNomeJogador = new javax.swing.JLabel();
        javax.swing.JPanel pnlOver = new javax.swing.JPanel();
        lblSetOver = new javax.swing.JLabel();
        lblOver = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAtributos = new javax.swing.JLabel();
        lblPotencial = new javax.swing.JLabel();
        lblContrato = new javax.swing.JLabel();
        lblHumor = new javax.swing.JLabel();
        lblValorTransferencia = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblSetValorTransferencia = new javax.swing.JLabel();
        lblSetSalario = new javax.swing.JLabel();
        lblSetPotencial = new javax.swing.JLabel();
        lblSetHumor = new javax.swing.JLabel();
        lblSetContrato = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblInformacoes.setForeground(new java.awt.Color(250, 250, 250));
        lblInformacoes.setText("PE | Real Madrid | 26 anos");

        lblGolAssist.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblGolAssist.setForeground(new java.awt.Color(250, 250, 250));
        lblGolAssist.setText("500 Gols | 200 Assistencias");
        lblGolAssist.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblNomeJogador.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblNomeJogador.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeJogador.setText("Vincius Junior");

        pnlOver.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlOverLayout = new javax.swing.GroupLayout(pnlOver);
        pnlOver.setLayout(pnlOverLayout);
        pnlOverLayout.setHorizontalGroup(
            pnlOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        pnlOverLayout.setVerticalGroup(
            pnlOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblSetOver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSetOver.setForeground(new java.awt.Color(250, 250, 250));
        lblSetOver.setText("99");

        lblOver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOver.setForeground(new java.awt.Color(204, 0, 204));
        lblOver.setText("Overall:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInformacoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSetOver)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGolAssist, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlOver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInformacoes)
                        .addGap(18, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOver)
                            .addComponent(lblSetOver)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlOver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGolAssist)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(70, 70, 70));

        lblAtributos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblAtributos.setForeground(new java.awt.Color(204, 0, 204));
        lblAtributos.setText("Atributos");

        lblPotencial.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPotencial.setForeground(new java.awt.Color(255, 255, 255));
        lblPotencial.setText("Potencial:");

        lblContrato.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblContrato.setForeground(new java.awt.Color(255, 255, 255));
        lblContrato.setText("Contrato:");

        lblHumor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHumor.setForeground(new java.awt.Color(255, 255, 255));
        lblHumor.setText("Humor:");

        lblValorTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblValorTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        lblValorTransferencia.setText("Valor Transferencia:");

        lblSalario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(255, 255, 255));
        lblSalario.setText("Salario:");

        lblSetValorTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSetValorTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        lblSetValorTransferencia.setText("€ 1.000.000");

        lblSetSalario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSetSalario.setForeground(new java.awt.Color(255, 255, 255));
        lblSetSalario.setText("€ 50.000");

        lblSetPotencial.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSetPotencial.setForeground(new java.awt.Color(255, 255, 255));
        lblSetPotencial.setText("75-80");

        lblSetHumor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSetHumor.setForeground(new java.awt.Color(255, 255, 255));
        lblSetHumor.setText("Feliz/Neutro/Triste");

        lblSetContrato.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSetContrato.setForeground(new java.awt.Color(255, 255, 255));
        lblSetContrato.setText("12 Semanas");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Fazer Proposta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSetSalario))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblValorTransferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSetValorTransferencia))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHumor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSetHumor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblContrato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSetContrato))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPotencial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSetPotencial))
                            .addComponent(lblAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorTransferencia)
                    .addComponent(lblSetValorTransferencia))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(lblSetSalario))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencial)
                    .addComponent(lblSetPotencial))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSetContrato))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHumor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSetHumor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void setAtributos(Jogador jogador){
        lblNomeJogador.setText(jogador.getNome());
        lblSetOver.setText(String.valueOf(jogador.calculaOverall()));
        
        if(gerenteElenco.buscarTimeDoJogador(jogador.getId()) != null){
            lblInformacoes.setText(jogador.getPosicao() + " | " + gerenteElenco.buscarTimeDoJogador(jogador.getId()).getNome() + " | " + jogador.getIdade() + " anos");
        }
        else{
            lblInformacoes.setText(jogador.getPosicao() + " | " + "Sem time" + " | " + jogador.getIdade() + " anos");
        }
        lblGolAssist.setText(jogador.getQtdGols() + " Gols | " + jogador.getQtdAssistencias() + " Assistencias");
        
        lblSetValorTransferencia.setText(String.format("€ %,.0f", jogador.getValorTransferencia()));
        lblSetSalario.setText(String.format("€ %,.0f / mês", jogador.getSalario()));
        lblSetPotencial.setText("Potencial nao identificado");
        lblSetContrato.setText("Contrato nao identificado");
        lblSetHumor.setText("Humor nao identificado");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAtributos;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblGolAssist;
    private javax.swing.JLabel lblHumor;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblNomeJogador;
    private javax.swing.JLabel lblOver;
    private javax.swing.JLabel lblPotencial;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSetContrato;
    private javax.swing.JLabel lblSetHumor;
    private javax.swing.JLabel lblSetOver;
    private javax.swing.JLabel lblSetPotencial;
    private javax.swing.JLabel lblSetSalario;
    private javax.swing.JLabel lblSetValorTransferencia;
    private javax.swing.JLabel lblValorTransferencia;
    // End of variables declaration//GEN-END:variables
}
