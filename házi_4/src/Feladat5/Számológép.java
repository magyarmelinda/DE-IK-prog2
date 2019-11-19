/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Számológép extends JFrame implements ActionListener{

    JTextField tf;
    
    JButton bt1, bt2, bt3, bt4;
    JButton bt5, bt6, bt7, bt8, bt9, bt10;
    JButton bt11, bt12, bt13, bt14, bt15, bt16;
    JButton bt17, bt18, bt19, bt20, bt21, bt22;
    JButton bt23, bt24, bt25, bt26, bt27, bt28;
    
    JPanel pl1, pl2, pl3, pl4, pl5, pl6;
    
    public Számológép() throws HeadlessException {
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        pl4 = new JPanel();
        pl5 = new JPanel();
        pl6 = new JPanel();
        
        tf = new JTextField();
        
        bt1 = new JButton();
        bt2 = new JButton("<html><body><font color=#FF0000>Backspace</font></body></html>");
        bt3 = new JButton("<html><body><font color=#FF0000>CE</font></body></html>");
        bt4 = new JButton("<html><body><font color=#FF0000>C</font></body></html>");
        bt5 = new JButton("<html><body><font color=#FF0000>MC</font></body></html>");
        bt6 = new JButton("7");
        bt7 = new JButton("8");
        bt8 = new JButton("9");
        bt9 = new JButton("<html><body><font color=#FF0000>/</font></body></html>");
        bt10 = new JButton("sqrt");
        bt11 = new JButton("<html><body><font color=#FF0000>MR</font></body></html>");
        bt12 = new JButton("4");        
        bt13 = new JButton("5");        
        bt14 = new JButton("6");
        bt15 = new JButton("<html><body><font color=#FF0000>*</font></body></html>");        
        bt16 = new JButton("%");
        bt17 = new JButton("<html><body><font color=#FF0000>MS</font></body></html>");
        bt18 = new JButton("1");   
        bt19 = new JButton("2");   
        bt20 = new JButton("3");   
        bt21 = new JButton("<html><body><font color=#FF0000>-</font></body></html>");       
        bt22 = new JButton("1/x");   
        bt23 = new JButton("<html><body><font color=#FF0000>M+</font></body></html>");  
        bt24 = new JButton("0");   
        bt25 = new JButton("+/-");   
        bt26 = new JButton(".");   
        bt27 = new JButton("<html><body><font color=#FF0000>+</font></body></html>");  
        bt28 = new JButton("<html><body><font color=#FF0000>=</font></body></html>");  
       
        pl1.add(tf);
        
        pl2.add(bt1);
        pl2.add(bt2);
        pl2.add(bt3);
        pl2.add(bt4);
        
        pl3.add(bt5);
        pl3.add(bt6);
        pl3.add(bt7);
        pl3.add(bt8);
        pl3.add(bt9);
        pl3.add(bt10);
        pl4.add(bt11);
        pl4.add(bt12);
        pl4.add(bt13);
        pl4.add(bt14);
        pl4.add(bt15);
        pl4.add(bt16);
        pl5.add(bt17);
        pl5.add(bt18);
        pl5.add(bt19);
        pl5.add(bt20);
        pl5.add(bt21);
        pl5.add(bt22);
        pl6.add(bt23);
        pl6.add(bt24);
        pl6.add(bt25);
        pl6.add(bt26);
        pl6.add(bt27);
        pl6.add(bt28);
        
        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        this.add(pl4);
        this.add(pl5);
        this.add(pl6);
        
        GridLayout gr = new GridLayout(6, 1);
        setLayout(gr);
        
        GridLayout gr1 = new GridLayout(1, 1);
        GridLayout gr2 = new GridLayout(1, 4);
        GridLayout gr3 = new GridLayout(1, 6);
        GridLayout gr4 = new GridLayout(1, 6);
        GridLayout gr5 = new GridLayout(1, 6);
        GridLayout gr6 = new GridLayout(1, 6);
        
        pl1.setLayout(gr1);
        pl2.setLayout(gr2);
        pl3.setLayout(gr3);
        pl4.setLayout(gr4);
        pl5.setLayout(gr5);
        pl6.setLayout(gr6);  
        
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt18.addActionListener(this);
        bt19.addActionListener(this);
        bt20.addActionListener(this);
        bt24.addActionListener(this);
        bt25.addActionListener(this);
        bt27.addActionListener(this);
        bt28.addActionListener(this);
        
        pack();
    }
    
    public static void main(String[] args) {
        Számológép sz = new Számológép();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.bt6)
            this.tf.setText(this.tf.getText() + Integer.toString(7));
        
        if(e.getSource() == this.bt7)
            this.tf.setText(this.tf.getText() + Integer.toString(8));
        
        if(e.getSource() == this.bt8)
            this.tf.setText(this.tf.getText() + Integer.toString(9));
        
        if(e.getSource() == this.bt12)
            this.tf.setText(this.tf.getText() + Integer.toString(4));
        
        if(e.getSource() == this.bt13)
            this.tf.setText(this.tf.getText() + Integer.toString(5));
        
        if(e.getSource() == this.bt14)
            this.tf.setText(this.tf.getText() + Integer.toString(6));
        
        if(e.getSource() == this.bt18)
            this.tf.setText(this.tf.getText() + Integer.toString(1));
        
        if(e.getSource() == this.bt19)
            this.tf.setText(this.tf.getText() + Integer.toString(2));
        
        if(e.getSource() == this.bt20)
            this.tf.setText(this.tf.getText() + Integer.toString(3));
        
        if(e.getSource() == this.bt24)
            this.tf.setText(this.tf.getText() + Integer.toString(0));
        
        if(e.getSource() == this.bt27)
            this.tf.setText(this.tf.getText() + "+");
        
        if(e.getSource() == this.bt28)
            this.tf.setText(osszead(this.tf.getText()));
    }    
    
    public String osszead(String sor) {
        int eredmeny = 0;
        String[] token = sor.split("\\+");
        
        for (int i = 0; i < token.length; i++) 
            eredmeny += Integer.parseInt(token[i]);
        
        return Integer.toString(eredmeny);
    }
}
