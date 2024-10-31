import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesNumeros {

    private Dapraver dapraver;

    public BotoesNumeros(Dapraver dapraver){
        this.dapraver = dapraver;

        dapraver.getJbBtNm1().addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                dapraver.getJlClclr().setText("1");
            }

        });
    
    }

    
    
}
