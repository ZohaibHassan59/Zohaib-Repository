import javax.swing.*;
import java.awt.event.*;
public class calculator {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Advance Calculator");
        frame.setSize(270,400);
        JTextField field = new JTextField(); // Correct type
        field.setBounds(15, 15,230,100);
        JButton button1=new JButton("1");
        button1.setBounds(15,125,50,50);
        JButton button2=new JButton("2");
        button2.setBounds(70,125,50,50);
        JButton button3=new JButton("3");
        button3.setBounds(130,125,50,50);
        JButton button4=new JButton("4");
        button4.setBounds(15,185,50,50);
        JButton button5=new JButton("5");
        button5.setBounds(70,185,50,50);
        JButton button6=new JButton("6");
        button6.setBounds(130,185,50,50);
        JButton button7=new JButton("7");
        button7.setBounds(15,245,50,50);
        JButton button8=new JButton("8");
        button8.setBounds(70,245,50,50);
        JButton button9=new JButton("9");
        button9.setBounds(130,245,50,50);
        JButton button0=new JButton("0");
        button0.setBounds(15,305,50,50);
        JButton add=new JButton("+");
        add.setBounds(130,125,50,50);
        JButton sub=new JButton("-");
        sub.setBounds(190,125,50,50);
        JButton mul=new JButton("*");
        mul.setBounds(130,185,50,50);
        JButton div=new JButton("/");
        div.setBounds(190,185,50,50);
        JButton equal=new JButton("=");
        equal.setBounds(190,245,50,50);
        JButton clear=new JButton("C");
        clear.setBounds(15,305,50,50);
        frame.add(button7);

      frame.add(field);
      frame.add(button1);
      frame.add(button2);
      frame.add(button3);
      frame.add(button4);
      frame.add(button5);
      frame.add(button6);
      frame.add(button8);
      frame.add(button9);
      frame.add(button0);
      frame.add(add);
      frame.add(sub);
      frame.add(mul);
      frame.add(div);
      frame.add(equal);
      frame.add(clear);
      button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"3");}
            });
            button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"4");}
            });
            button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"5");}
            });
            button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"6");}
            });
            button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"7");}
            });
            button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"8");}
            });
            button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"9");}
            });
            button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"0");}
            });
            add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"+");}
            });
            sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"-");}
            });
            mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                field.setText(field.getText()+"*");}
            });
            div.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent event){
                    field.setText(field.getText() + "/");}
             });
                
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}