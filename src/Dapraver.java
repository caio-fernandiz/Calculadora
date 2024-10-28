import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Dapraver extends JFrame{

    private Color fnd;

    private Font fnt, fntNmrs;

    private JButton jbBtSmr;

    private JTextField jtfNmr1, jtfNmr2;

    private JLabel jlRsltd;

    public Dapraver(){

        setBounds(800, 200 , 400, 600);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        fnd = new Color(211, 211, 211);

        fnt = new Font("Arial",Font.BOLD,30);
        fntNmrs = new Font("Arial", Font.BOLD, 20);

        jbBtSmr = new JButton("=");
        jbBtSmr.setFont(fnt);
        jbBtSmr.setBounds(280, 150, 90, 30);
        add(jbBtSmr);
        
        jlRsltd = new JLabel("111111111");
        jlRsltd.setFont(fntNmrs);
        jlRsltd.setOpaque(true);
        jlRsltd.setBackground(fnd);
        jlRsltd.setBounds(230, 60, 100 , 40);
        add(jlRsltd);

        jtfNmr1 = new JTextField();
        jtfNmr2 = new JTextField();



        setVisible(true);
    }

}
