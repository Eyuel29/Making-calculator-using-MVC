package calculatorSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Cbutton extends JButton implements ActionListener{
    private String num;
    private String sign;
    private NumberListener numberListener;
    private OperatorListener operatorListener;

    public Cbutton(){
        setFont(new Font("JetBrains Mono", 2, 16));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.decode("#221111"),5));
        setBackground(Color.decode("#442222"));
        addActionListener(this);
    }

    public void setNumberListener(NumberListener numberListener) {
        this.numberListener = numberListener;
    }

    public void setOperatorListener(OperatorListener operatorListener) {
        this.operatorListener = operatorListener;
    }
    
    public Cbutton(String num){
        this.num = num;
    }

    public void setNum(String num){
        this.num = num;
    }

    public void setSign(String sign){
        this.sign = sign;
    }

    public String getSign(){
        return this.sign;
    }

    public String getNum(){
        return num;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cbutton cbutton = (Cbutton)e.getSource();
        if (numberListener != null) {
                numberListener.numberEmitted(cbutton.getNum());    
        }else if (operatorListener != null) {
            operatorListener.operatorEmitted(cbutton.getSign());
        }
    }
}