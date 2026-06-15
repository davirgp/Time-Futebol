package gui.componentes;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class BarraAtributo extends JPanel {

    private int valor;

    public BarraAtributo() {
        this.valor = 0;
        setPreferredSize(new Dimension(200, 22));
    }

    public void setValor(int valor) {

        if(valor < 0){
            valor = 0;
        }

        if(valor > 100){
            valor = 100;
        }

        this.valor = valor;

        repaint(); // redesenha
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int largura = getWidth();
        int altura = getHeight();

        // fundo
        g.setColor(new Color(45,45,45));
        g.fillRect(0, 0, largura, altura);

        // largura preenchida
        int preenchido =
                (int)((valor / 100.0) * largura);

        // cor baseada no atributo
        if(valor >= 80){
            g.setColor(new Color(0,200,0));
        }
        else if(valor >= 60){
            g.setColor(new Color(255,180,0));
        }
        else{
            g.setColor(new Color(220,50,50));
        }

        g.fillRect(0, 0, preenchido, altura);

        // texto
        g.setColor(Color.WHITE);

        g.drawString(
                valor + "",
                largura / 2 - 8,
                altura / 2 + 5
        );
    }
}