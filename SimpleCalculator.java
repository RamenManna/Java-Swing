import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    private Container c;
    private JLabel lebel1, lebel2, result;
    private JTextField t1 ,t2;
    private JButton add, sub, mul, div, clear;

    MyFrame(){
        setTitle("Ramen's Java Calculator");
        setSize(320,320);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);
        
        lebel1 = new JLabel("First Number : ");
        lebel1.setBounds(10,20,100,20);
        c.add(lebel1);

        t1 = new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);

        lebel2 = new JLabel("Second Number : ");
        lebel2.setBounds(10,50,100,20);
        c.add(lebel2);

        t2 = new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add = new JButton("+");
        add.setBounds(20,80,50,30);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(80,80,50,30);
        c.add(sub);

        mul = new JButton("x");
        mul.setBounds(140,80,50,30);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(200,80,50,30);
        c.add(div);

        result = new JLabel(" Result : ");
        result.setBounds(10,120,150,30);
        c.add(result);

        clear = new JButton("Clear");
        clear.setBounds(100,150,70,40);
        c.add(clear);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        try{
            if(e.getSource()==add){
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double  c = a + b;
            result.setText("Result : " +c);
        }
        if(e.getSource()==sub){
            double a = Double.parseDouble(t1.getText());
            double b =Double.parseDouble(t2.getText());
            double  c = a - b;
            result.setText("Result : " +c);
        }
        if(e.getSource()==mul){
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double  c = a * b;
            result.setText("Result : " +c);
        }
        if(e.getSource()==div){
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double  c = a / b;
            result.setText("Result : " +c);
        }
        if(e.getSource()==clear){
            result.setText(null);
            t1.setText(null);
            t2.setText(null);
        }
        }catch(NumberFormatException e1){
            result.setText("Please Input Integer Only");
        }/*catch(ArithmeticException e2){
            result.setText("Undefiend");
        }*/
    }
}

public class SimpleCalculator{
    public static void main(String args[]){
        MyFrame frame = new MyFrame();
    }
}