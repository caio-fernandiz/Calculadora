import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Dapraver extends JFrame{

    private Color fnd;

    private Font fntBts, fntRsltd;

    private JButton jbBtRslt, jbBtSmr, jbBtSbtr, jbBtMltplcr, jbBtDvdr;
    
    private JButton  jbBtNm0, jbBtNm1, jbBtNm2, jbBtNm3, jbBtNm4, jbBtNm5,
    jbBtNm6, jbBtNm7, jbBtNm8, jbBtNm9;

    private JLabel jlClcl;

    public Dapraver(){

        setBounds(800, 200 , 400, 600);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        fnd = new Color(211, 211, 211);

        fntBts = new Font("Arial",Font.BOLD,30);
        fntRsltd = new Font("Arial", Font.BOLD, 50);

        jbBtRslt = new JButton("=");
        jbBtRslt.setFont(fntBts);
        jbBtRslt.setBounds(90, 470, 130, 60);
        add(jbBtRslt);

        jbBtSmr = new JButton("+");
        jbBtSmr.setFont(fntBts);
        jbBtSmr.setBounds(230, 470, 130,60);
        add(jbBtSmr);

        jbBtSbtr = new JButton("-");
        jbBtSbtr.setFont(fntBts);
        jbBtSbtr.setBounds(230, 400, 130, 60);
        add(jbBtSbtr);

        jbBtMltplcr = new JButton("X");
        jbBtMltplcr.setFont(fntBts);
        jbBtMltplcr.setBounds(230, 330, 130, 60);
        add(jbBtMltplcr);

        jbBtDvdr = new JButton("÷");
        jbBtDvdr.setFont(fntBts);
        jbBtDvdr.setBounds(230, 260, 130, 60);
        add(jbBtDvdr);

        jbBtNm0 = new JButton("0");
        jbBtNm0.setFont(fntBts);
        jbBtNm0.setBounds(20, 470, 60, 60);
        add(jbBtNm0);

        jbBtNm1 = new JButton("1");
        jbBtNm1.setFont(fntBts);
        jbBtNm1.setBounds(20, 400, 60, 60);
        add(jbBtNm1);

        jbBtNm2 = new JButton("2");
        jbBtNm2.setFont(fntBts);
        jbBtNm2.setBounds(90, 400, 60, 60);
        add(jbBtNm2);

        jbBtNm3 = new JButton("3");
        jbBtNm3.setFont(fntBts);
        jbBtNm3.setBounds(160, 400, 60, 60);
        add(jbBtNm3);
        
        jbBtNm4 = new JButton("4");
        jbBtNm4.setFont(fntBts);
        jbBtNm4.setBounds(20, 330, 60, 60);
        add(jbBtNm4);
        
        jbBtNm5 = new JButton("5");
        jbBtNm5.setFont(fntBts);
        jbBtNm5.setBounds(90, 330, 60, 60);
        add(jbBtNm5);

        jbBtNm6 = new JButton("6");
        jbBtNm6.setFont(fntBts);
        jbBtNm6.setBounds(160, 330, 60, 60);
        add(jbBtNm6);

        jbBtNm7 = new JButton("7");
        jbBtNm7.setFont(fntBts);
        jbBtNm7.setBounds(20, 260, 60, 60);
        add(jbBtNm7);

        jbBtNm8 = new JButton("8");
        jbBtNm8.setFont(fntBts);
        jbBtNm8.setBounds(90, 260, 60, 60);
        add(jbBtNm8);

        jbBtNm9 = new JButton("9");
        jbBtNm9.setFont(fntBts);
        jbBtNm9.setBounds(160, 260, 60, 60);
        add(jbBtNm9);

        jlClcl = new JLabel();
        jlClcl.setFont(fntRsltd);
        jlClcl.setOpaque(true);
        jlClcl.setBackground(fnd);
        jlClcl.setBounds(20, 20, 340 , 100);
        add(jlClcl);

        setVisible(true);
    }

}
