package pack1;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCalculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2,10);

    //now add 17 buttons in calculator
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonAdd = new JButton("+");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonDot = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonClear = new JButton("C");

    double num1,num2,result;
    int addc=0,subc=0,mulc=0,divc=0;
    public MainCalculator(){
        frame.setSize(350,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");

        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createLineBorder(Color.pink,4);
        panel.setBorder(border);

        panel.add(textarea);
        textarea.setBackground(Color.black);
        Border tborder = BorderFactory.createLineBorder(Color.black,3);
        textarea.setBorder(tborder);

        Font font = new Font("arial",Font.BOLD,35);
        textarea.setFont(font);
        textarea.setForeground(Color.white);
        textarea.setPreferredSize(new Dimension(2,10));
        textarea.setLineWrap(true);

        //now adjust the dimensions of the buttons
        //then add icons of 17 buttons from their respective locations

        button1.setPreferredSize(new Dimension(100,43));
        //button1.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number1.PNG"));

        button2.setPreferredSize(new Dimension(100,43));
        //button2.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number2.PNG"));

        button3.setPreferredSize(new Dimension(100,43));
        //button3.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number3.PNG"));

        button4.setPreferredSize(new Dimension(100,43));
        //button4.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number4.PNG"));

        button5.setPreferredSize(new Dimension(100,43));
        //button5.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number5.PNG"));

        button6.setPreferredSize(new Dimension(100,43));
        //button6.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number6.PNG"));

        button7.setPreferredSize(new Dimension(100,43));
        //button7.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number7.PNG"));

        button8.setPreferredSize(new Dimension(100,43));
        //button8.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number8.PNG"));

        button9.setPreferredSize(new Dimension(100,43));
        //button9.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number9.PNG"));

        button0.setPreferredSize(new Dimension(100,43));
        //button0.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\number0.PNG"));

        buttonAdd.setPreferredSize(new Dimension(100,43));
        //buttonAdd.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\add.PNG"));

        buttonSub.setPreferredSize(new Dimension(100,43));
        //buttonSub.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\eksi.PNG"));

        buttonMul.setPreferredSize(new Dimension(100,43));
        //buttonMul.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\mult.PNG"));

        buttonDiv.setPreferredSize(new Dimension(100,43));
        //buttonDiv.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\div.PNG"));

        buttonDot.setPreferredSize(new Dimension(100,43));
        //buttonDot.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\dot.PNG"));

        buttonEqual.setPreferredSize(new Dimension(200,56));
        //buttonEqual.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\equal.PNG"));

        buttonClear.setPreferredSize(new Dimension(100,56));
        //buttonClear.setIcon(new ImageIcon("C:\\Users\\Gizem\\IdeaProjects\\Calculator\\imagess\\clear.PNG"));

        //now add those 17 buttons in the panel of the JFrame

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(buttonMul);
        panel.add(buttonDiv);
        panel.add(buttonDot);
        panel.add(buttonEqual);
        panel.add(buttonClear);

        //now add action listener for each buttons

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == buttonClear){
            num1 = 0.0;
            num2 = 0.0;
            textarea.setText("");
        }
        if(source == button1){
            textarea.append("1");
        }
        if(source == button2){
            textarea.append("2");
        }
        if(source == button3){
            textarea.append("3");
        }
        if(source == button4){
            textarea.append("4");
        }
        if(source == button5){
            textarea.append("5");
        }
        if(source == button6){
            textarea.append("6");
        }
        if(source == button7){
            textarea.append("7");
        }
        if(source == button8){
            textarea.append("8");
        }
        if(source == button9){
            textarea.append("9");
        }
        if(source==button0){
            textarea.append("0");
        }
        if(source==buttonDot){
            textarea.append(".");
        }

        if(source == buttonAdd){
            num1 = number_reader();
            textarea.setText("");

            addc = 1;
            subc = 0;
            mulc = 0;
            divc = 0;
        }
        if(source==buttonSub){
            num1 = number_reader();
            textarea.setText("");
            //textarea.append("-");
            subc=1;
            addc=0;
            mulc=0;
            divc=0;
        }
        if(source==buttonMul){
            num1 = number_reader();
            textarea.setText("");
            //textarea.append("*");
            mulc=1;
            addc=0;
            subc=0;
            divc=0;
        }
        if(source==buttonDiv){
            num1 = number_reader();
            textarea.setText("");
            //textarea.append("/");
            divc = 1;
            addc=0;
            subc=0;
            mulc=0;
        }
        //now if user press EQUAL SIGN(=) to get result perform following action

        if(source==buttonEqual)
        {
            //first read number2 before performing any operation
            num2 = number_reader();

            if(addc>0){
                //to do addition
                result = num1 + num2;
                textarea.setText(Double.toString(result));
            }
            if(subc>0){
                //to do subtraction
                result = num1 - num2;
                textarea.setText(Double.toString(result));
            }
            if(mulc>0){
                //to do multiplication
                result = num1 * num2;
                textarea.setText(Double.toString(result));
            }
            if(divc>0){
                //for performing division operation
                result  = num1/num2;
                textarea.setText(Double.toString(result));
            }

        }

    }
    public double number_reader(){
        double num1;
        String s;
        s = textarea.getText();
        num1 = Double.valueOf(s);
        return  num1;
    }

    public static void main(String[] args) {
        MainCalculator cals = new MainCalculator();
    }


}
