package calculatorSwing;

import javax.swing.*;
import java.awt.*;

public class Controller extends JFrame{
    private Calculator calculator;
    private Cbutton btn0;
    private Cbutton btn1;
    private Cbutton btn2;
    private Cbutton btn3;
    private Cbutton btn4;
    private Cbutton btn5;
    private Cbutton btn6;
    private Cbutton btn7;
    private Cbutton btn8;
    private Cbutton btn9;

    private Cbutton add;
    private Cbutton sub;
    private Cbutton mul;
    private Cbutton div;
    private Cbutton clr;
    private Cbutton equ;
    private Cbutton del;
    private Cbutton point;

    private JPanel buttonPanel;
    private JPanel viewPanel;
    private CTextField cTextField;

    public Controller(){

        super("Calculator");
        setSize(450,600);
        setResizable(false);
        setLocation(50,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        calculator = new Calculator();
        buttonPanel = new JPanel();
        viewPanel = new JPanel();
        cTextField = new CTextField();


        btn0 = new Cbutton();
        btn1 = new Cbutton();
        btn2 = new Cbutton();
        btn3 = new Cbutton();
        btn4 = new Cbutton();
        btn5 = new Cbutton();
        btn6 = new Cbutton();
        btn7 = new Cbutton();
        btn8 = new Cbutton();
        btn9 = new Cbutton();
        add = new Cbutton();
        sub = new Cbutton();
        mul = new Cbutton();
        div = new Cbutton();
        clr = new Cbutton();
        equ = new Cbutton();
        del = new Cbutton();
        point = new Cbutton();

        btn0.setText("0");
        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        add.setText("+");
        sub.setText("-");
        mul.setText("x");
        div.setText("/");
        clr.setText("c");
        equ.setText("=");
        del.setText("DEl");
        point.setText(".");

        

        btn0.setNum("0");
        btn1.setNum("1");
        btn2.setNum("2");
        btn3.setNum("3");
        btn4.setNum("4");
        btn5.setNum("5");
        btn6.setNum("6");
        btn7.setNum("7");
        btn8.setNum("8");
        btn9.setNum("9");        
        add.setSign("+");
        sub.setSign("-");
        mul.setSign("*");
        div.setSign("/");
        clr.setSign("C");
        equ.setSign("=");
        del.setSign("D");
        point.setNum(".");
     
        viewPanel.setBackground(Color.decode("#221111"));
        buttonPanel.setBackground(Color.decode("#221111"));
        add(buttonPanel, BorderLayout.CENTER);
        add(viewPanel, BorderLayout.NORTH);
        viewPanel.add(cTextField);

        buttonPanel.setLayout(new GridLayout(5, 4));
        buttonPanel.add(btn9);
        buttonPanel.add(btn8);
        buttonPanel.add(btn7);
        buttonPanel.add(add);
        buttonPanel.add(btn6);
        buttonPanel.add(btn5);
        buttonPanel.add(btn4);
        buttonPanel.add(sub);
        buttonPanel.add(btn3);
        buttonPanel.add(btn2);
        buttonPanel.add(btn1);        
        buttonPanel.add(mul);        
        buttonPanel.add(btn0);
        buttonPanel.add(clr);
        buttonPanel.add(equ);
        buttonPanel.add(div);
        buttonPanel.add(del);
        buttonPanel.add(point);

        btn0.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn1.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn2.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            } 
        });
        btn3.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn4.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn5.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn6.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn7.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn8.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
        btn9.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);
            }
        });
         add.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String operator){
                if (!cTextField.getText().equals("")){
                calculator.setNum1(Double.valueOf(cTextField.getText()));
                calculator.setOperator("+");
                cTextField.clear();
                }
            }
         });
         sub.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String operator){
                if (!cTextField.getText().equals("")){
                calculator.setNum1(Double.valueOf(cTextField.getText()));
                calculator.setOperator("-");
                cTextField.clear();
                }
            }
         });
         mul.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String operator){
                if (!cTextField.getText().equals("")){
                calculator.setNum1(Double.valueOf(cTextField.getText()));
                calculator.setOperator("*");
                cTextField.clear();
                }
            }
         });
         div.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String operator){
                if (!cTextField.getText().equals("")){
                    calculator.setNum1(Double.valueOf(cTextField.getText()));
                    calculator.setOperator("/");
                    cTextField.clear();}
            }
         });
         clr.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String oprator){
                cTextField.clear();
                calculator.setNum1(0);
                calculator.setNum2(0);
                calculator.setOperator("");
            }
         });
         equ.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String oprator){

                if (calculator.getNum1() != 0) {
                    calculator.setNum2(Double.valueOf(cTextField.getText()));
                    cTextField.setText(String.valueOf(calculator.calculate()));
                    calculator.setNum1(0);
                    calculator.setNum2(0);
                    calculator.setOperator("");
                }

            }
         });
         del.setOperatorListener(new OperatorListener() {
            public void operatorEmitted(String oprator){
                if (!cTextField.getText().equals("")) {
                    String[] temp = cTextField.getText().split("");
                    cTextField.setText("");
                    for (int i = 0; i < temp.length-1; i++) {
                        cTextField.append(temp[i]);
                    }
                }
            }
         });

         point.setNumberListener(new NumberListener() {
            @Override
            public void numberEmitted(String num) {
                cTextField.append(num);               
            }
        });

    }
}