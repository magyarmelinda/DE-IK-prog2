/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_04;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class IdoAtalakito extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12;
    
    JPanel pl1, pl2, pl3, pl4;
    
    JButton bt;

    public IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf5 = new JTextField(5);
        tf6 = new JTextField(5);
        tf7 = new JTextField(5);
        tf8 = new JTextField(5);
        tf9 = new JTextField(5);
        tf10 = new JTextField(5);
        tf11 = new JTextField(5);
        tf12 = new JTextField(5);
        
        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");
        
        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        pl4 = new JPanel();
        
        bt = new JButton("Számol");
        
        pl1.add(tf1);
        pl1.add(lb1);
        pl1.add(tf2);
        pl1.add(lb2);
        pl1.add(tf3);
        pl1.add(lb3);
        pl1.add(tf4);
        pl1.add(lb4);
        
        pl2.add(tf5);
        pl2.add(lb5);
        pl2.add(tf6);
        pl2.add(lb6);
        pl2.add(tf7);
        pl2.add(lb7);
        pl2.add(tf8);
        pl2.add(lb8);
        
        pl3.add(bt);
        
        pl4.add(tf9);
        pl4.add(lb9);
        pl4.add(tf10);
        pl4.add(lb10);
        pl4.add(tf11);
        pl4.add(lb11);
        pl4.add(tf12);
        pl4.add(lb12);
        
        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        this.add(pl4);
        
        GridLayout gr = new GridLayout(4, 1);
        setLayout(gr);
        
        GridLayout gr1 = new GridLayout(1, 1);
        
        pl3.setLayout(gr1);
       
        bt.addActionListener(this);
        
        pack();
    }
    
    public static void main(String[] args) {
        IdoAtalakito i = new IdoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.bt) {
            int masodperc = Integer.parseInt(this.tf4.getText()) + Integer.parseInt(this.tf8.getText());
            int perc = Integer.parseInt(this.tf3.getText()) + Integer.parseInt(this.tf7.getText());
            int ora = Integer.parseInt(this.tf2.getText()) + Integer.parseInt(this.tf6.getText());
            int nap =  Integer.parseInt(this.tf1.getText()) + Integer.parseInt(this.tf5.getText());
            
            if (masodperc >= 60) {
                perc++;
                masodperc -= 60;
            }
            
            if (perc >= 60) {
                ora++;
                perc -= 60;
            }
            
            if (ora >= 24) {
                nap++;
                ora -= 24;
            }
            
            this.tf12.setText(Integer.toString(masodperc));
            this.tf11.setText(Integer.toString(perc));
            this.tf10.setText(Integer.toString(ora));
            this.tf9.setText(Integer.toString(nap));
        }
    }
}
