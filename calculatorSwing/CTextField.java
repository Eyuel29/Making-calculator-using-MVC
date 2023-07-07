package calculatorSwing;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class CTextField extends JTextField{

    private String temp;

    public CTextField(){
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setColumns(15);
        setFont(new Font("open sans", 1, 25));
        setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        setBackground(Color.decode("#221111"));
        setForeground(Color.decode("#FFEEEE"));
        setEditable(false);
    }

    private boolean isNumber(String val){
        Pattern p = Pattern.compile("[-]?([0-9]+[.])?[0-9]*");
        Matcher m = p.matcher(val);
        return m.matches();
    }

    public void append(String val){

        if (isNumber(this.getText()+val)) {   
            temp = this.getText()+val;
            this.setText(temp);
        }

    }

    public void clear(){
        this.setText("");
    }
}
