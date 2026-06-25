package gui.dialogs;

import classes.Jogador;
import gerentes.GerenteElenco;
import gui.componentes.BarraAtributo;
import javax.swing.JOptionPane;

public final class JogadorBusca extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JogadorBusca.class.getName());
    
    private final Jogador jogador;
    private CentralTransferencia centralTransferencia;
    
    private BarraAtributo barraVel;
    private BarraAtributo barraFin;
    private BarraAtributo barraPas;
    private BarraAtributo barraDri;
    private BarraAtributo barraFis;
    private BarraAtributo barraMar;
    private BarraAtributo barraPos;
    private BarraAtributo barraDef;
    private BarraAtributo barraRef;
    private BarraAtributo barraSai;
    
    private final GerenteElenco gerenteElenco;
    
    public JogadorBusca(java.awt.Frame parent, boolean modal, Jogador jogador, GerenteElenco gerenteElenco, CentralTransferencia centralTransferencia) {
        super(parent, modal);
        
        this.gerenteElenco = gerenteElenco;
        this.jogador = jogador;
        this.centralTransferencia = centralTransferencia;
        
        initComponents();
        
        btnAddTransferencia.setBorderPainted(false);
        btnAddTransferencia.setFocusPainted(false);
        
        getContentPane().setBackground(new java.awt.Color(70,70,70));
        
        inicializarBarras();
        
        dadosJogador(jogador);
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
        lblAtributos = new javax.swing.JLabel();
        lblVel = new javax.swing.JLabel();
        barVel = new javax.swing.JPanel();
        lblFin = new javax.swing.JLabel();
        barFin = new javax.swing.JPanel();
        lblPas = new javax.swing.JLabel();
        barPas = new javax.swing.JPanel();
        barDri = new javax.swing.JPanel();
        lblDri = new javax.swing.JLabel();
        lblFis = new javax.swing.JLabel();
        barFis = new javax.swing.JPanel();
        barMar = new javax.swing.JPanel();
        lblMar = new javax.swing.JLabel();
        lblPos = new javax.swing.JLabel();
        barPos = new javax.swing.JPanel();
        lblDef = new javax.swing.JLabel();
        barDef = new javax.swing.JPanel();
        barRef = new javax.swing.JPanel();
        lblRef = new javax.swing.JLabel();
        barSai = new javax.swing.JPanel();
        lblSai = new javax.swing.JLabel();
        btnAddTransferencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(50, 50, 50));

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

        lblAtributos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblAtributos.setForeground(new java.awt.Color(204, 0, 204));
        lblAtributos.setText("Atributos");

        lblVel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblVel.setForeground(new java.awt.Color(255, 255, 255));
        lblVel.setText("VEL");

        barVel.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barVelLayout = new javax.swing.GroupLayout(barVel);
        barVel.setLayout(barVelLayout);
        barVelLayout.setHorizontalGroup(
            barVelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barVelLayout.setVerticalGroup(
            barVelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblFin.setForeground(new java.awt.Color(255, 255, 255));
        lblFin.setText("FIN");

        barFin.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barFinLayout = new javax.swing.GroupLayout(barFin);
        barFin.setLayout(barFinLayout);
        barFinLayout.setHorizontalGroup(
            barFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barFinLayout.setVerticalGroup(
            barFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        lblPas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPas.setForeground(new java.awt.Color(255, 255, 255));
        lblPas.setText("PAS");

        barPas.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barPasLayout = new javax.swing.GroupLayout(barPas);
        barPas.setLayout(barPasLayout);
        barPasLayout.setHorizontalGroup(
            barPasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barPasLayout.setVerticalGroup(
            barPasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        barDri.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barDriLayout = new javax.swing.GroupLayout(barDri);
        barDri.setLayout(barDriLayout);
        barDriLayout.setHorizontalGroup(
            barDriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barDriLayout.setVerticalGroup(
            barDriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        lblDri.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDri.setForeground(new java.awt.Color(255, 255, 255));
        lblDri.setText("DRI");

        lblFis.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblFis.setForeground(new java.awt.Color(255, 255, 255));
        lblFis.setText("FIS");

        barFis.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barFisLayout = new javax.swing.GroupLayout(barFis);
        barFis.setLayout(barFisLayout);
        barFisLayout.setHorizontalGroup(
            barFisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barFisLayout.setVerticalGroup(
            barFisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        barMar.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barMarLayout = new javax.swing.GroupLayout(barMar);
        barMar.setLayout(barMarLayout);
        barMarLayout.setHorizontalGroup(
            barMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barMarLayout.setVerticalGroup(
            barMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        lblMar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMar.setForeground(new java.awt.Color(255, 255, 255));
        lblMar.setText("MAR");

        lblPos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPos.setForeground(new java.awt.Color(255, 255, 255));
        lblPos.setText("POS");

        barPos.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barPosLayout = new javax.swing.GroupLayout(barPos);
        barPos.setLayout(barPosLayout);
        barPosLayout.setHorizontalGroup(
            barPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barPosLayout.setVerticalGroup(
            barPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        lblDef.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDef.setForeground(new java.awt.Color(255, 255, 255));
        lblDef.setText("Def");

        barDef.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barDefLayout = new javax.swing.GroupLayout(barDef);
        barDef.setLayout(barDefLayout);
        barDefLayout.setHorizontalGroup(
            barDefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barDefLayout.setVerticalGroup(
            barDefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        barRef.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barRefLayout = new javax.swing.GroupLayout(barRef);
        barRef.setLayout(barRefLayout);
        barRefLayout.setHorizontalGroup(
            barRefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barRefLayout.setVerticalGroup(
            barRefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        lblRef.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblRef.setForeground(new java.awt.Color(255, 255, 255));
        lblRef.setText("Ref");

        barSai.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout barSaiLayout = new javax.swing.GroupLayout(barSai);
        barSai.setLayout(barSaiLayout);
        barSaiLayout.setHorizontalGroup(
            barSaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barSaiLayout.setVerticalGroup(
            barSaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        lblSai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSai.setForeground(new java.awt.Color(255, 255, 255));
        lblSai.setText("Sai");

        btnAddTransferencia.setBackground(new java.awt.Color(51, 51, 51));
        btnAddTransferencia.setForeground(new java.awt.Color(204, 0, 204));
        btnAddTransferencia.setText("Adicionar a lista de transferencia");
        btnAddTransferencia.addActionListener(this::btnAddTransferenciaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblVel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(lblFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(barFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(barVel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(lblFis)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(barDri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblPos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRef)
                                        .addGap(18, 18, 18)
                                        .addComponent(barRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDef)
                                        .addGap(18, 18, 18)
                                        .addComponent(barDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSai)
                                        .addGap(18, 18, 18)
                                        .addComponent(barSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDri)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(barPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAddTransferencia)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barVel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDri, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(barDri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(barFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(btnAddTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransferenciaActionPerformed
        
        if(centralTransferencia.adicionarJogador(jogador) == true){
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Jogador já monitorado ou lista cheia.");
        }
    }//GEN-LAST:event_btnAddTransferenciaActionPerformed
    
    public void inicializarBarras(){
        barraVel = new BarraAtributo();
        barraFin = new BarraAtributo();
        barraPas = new BarraAtributo();
        barraDri = new BarraAtributo();
        barraFis = new BarraAtributo();
        barraMar = new BarraAtributo();
        barraPos = new BarraAtributo();
        barraDef = new BarraAtributo();
        barraRef = new BarraAtributo();
        barraSai = new BarraAtributo();

        barVel.setLayout(new java.awt.BorderLayout());
        barFin.setLayout(new java.awt.BorderLayout());
        barPas.setLayout(new java.awt.BorderLayout());
        barDri.setLayout(new java.awt.BorderLayout());
        barFis.setLayout(new java.awt.BorderLayout());
        barMar.setLayout(new java.awt.BorderLayout());
        barPos.setLayout(new java.awt.BorderLayout());
        barDef.setLayout(new java.awt.BorderLayout());
        barRef.setLayout(new java.awt.BorderLayout());
        barSai.setLayout(new java.awt.BorderLayout());

        barVel.add(barraVel, java.awt.BorderLayout.CENTER);
        barFin.add(barraFin, java.awt.BorderLayout.CENTER);
        barPas.add(barraPas, java.awt.BorderLayout.CENTER);
        barDri.add(barraDri, java.awt.BorderLayout.CENTER);
        barFis.add(barraFis, java.awt.BorderLayout.CENTER);
        barMar.add(barraMar, java.awt.BorderLayout.CENTER);
        barPos.add(barraPos, java.awt.BorderLayout.CENTER);
        barDef.add(barraDef, java.awt.BorderLayout.CENTER);
        barRef.add(barraRef, java.awt.BorderLayout.CENTER);
        barSai.add(barraSai, java.awt.BorderLayout.CENTER);
        
    }
    
    public void dadosJogador(Jogador jogador){
        lblNomeJogador.setText(jogador.getNome());
        lblSetOver.setText(String.valueOf(jogador.calculaOverall()));
        
        if(gerenteElenco.buscarTimeDoJogador(jogador.getId()) != null){
            lblInformacoes.setText(jogador.getPosicao() + " | " + gerenteElenco.buscarTimeDoJogador(jogador.getId()).getNome() + " | " + jogador.getIdade() + " anos");
        }
        else{
            lblInformacoes.setText(jogador.getPosicao() + " | " + "Sem time" + " | " + jogador.getIdade() + " anos");
        }
        lblGolAssist.setText(jogador.getQtdGols() + " Gols | " + jogador.getQtdAssistencias() + " Assistencias");
        
        
        barraVel.setValor(jogador.getAtributosJogador().getVelocidade());
        barraFin.setValor(jogador.getAtributosJogador().getFinalizacao());
        barraPas.setValor(jogador.getAtributosJogador().getPasse());
        barraDri.setValor(jogador.getAtributosJogador().getDrible());
        barraFis.setValor((jogador.getAtributosJogador().getForca() + jogador.getAtributosJogador().getResistencia()) / 2);
        barraMar.setValor(jogador.getAtributosJogador().getMarcacao());
        barraPos.setValor(jogador.getAtributosJogador().getPosicionamento());
        
        if(jogador.getPosicao().equals(enums.PosicaoJogador.GOL)){
            barraDef.setValor(jogador.getAtributosJogador().getDefesa());
            barraRef.setValor(jogador.getAtributosJogador().getReflexo());
            barraSai.setValor(jogador.getAtributosJogador().getSaida());
        }
        else{
            barraDef.setVisible(false);
            barraRef.setVisible(false);
            barraSai.setVisible(false);
            
            lblDef.setVisible(false);
            lblRef.setVisible(false);
            lblSai.setVisible(false);
            
            pack();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barDef;
    private javax.swing.JPanel barDri;
    private javax.swing.JPanel barFin;
    private javax.swing.JPanel barFis;
    private javax.swing.JPanel barMar;
    private javax.swing.JPanel barPas;
    private javax.swing.JPanel barPos;
    private javax.swing.JPanel barRef;
    private javax.swing.JPanel barSai;
    private javax.swing.JPanel barVel;
    private javax.swing.JButton btnAddTransferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAtributos;
    private javax.swing.JLabel lblDef;
    private javax.swing.JLabel lblDri;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblFis;
    private javax.swing.JLabel lblGolAssist;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblMar;
    private javax.swing.JLabel lblNomeJogador;
    private javax.swing.JLabel lblOver;
    private javax.swing.JLabel lblPas;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblRef;
    private javax.swing.JLabel lblSai;
    private javax.swing.JLabel lblSetOver;
    private javax.swing.JLabel lblVel;
    // End of variables declaration//GEN-END:variables
}
