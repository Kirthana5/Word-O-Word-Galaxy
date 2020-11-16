/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author SUBHAHARINI
 */
public class level_7pic implements ActionListener{

    /**
     * @param args the command line arguments
     */
     int i=1;
     JFrame f;
     JLabel s,s1,l1,l2,l3,l;
     JButton s6,s7,s8,s9,next,prev,home;
     level_7pic()
     {
        f=new JFrame();
        s1=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level7egyptpyramid.jpg"));
        s1.setBounds(400,300,500,500);
        
        Font ff=new Font("Georgia",Font.BOLD,16);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,32);
        
        s=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level7audiopic.gif"));
        s.setBounds(100,50,200,200);
        
        JLabel s10 = new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level7playgif.gif"));
        s10.setBounds(400,180,500,50);
        
        l=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelbackground.png"));
        l.setBounds(0,0,1286,957);
        
        l1 = new JLabel("LEVEL 7");
        l1.setBounds(600,50,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
        l3 = new JLabel("TRACE WITH TRACK");
        l3.setBounds(530,90,450,70);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        l2 = new JLabel("Hear the audio and choose the correct answer");
        l2.setBounds(350,120,900,70);
        l2.setFont(f1);
        l2.setForeground(new Color(0,0,139));
        
        s9 = new JButton("PLAY");
        s9.setBounds(400,240,150,50);
        s9.setFont(f1);
        s9.setForeground(Color.black);
        s9.setBackground(Color.green);
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(120,475,145,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(1010,475,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(120,700,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
        
        s8 = new JButton("STOP");
        s8.setBounds(740,240,150,50);
        s8.setFont(f1);
        s8.setForeground(Color.white);
        s8.setBackground(Color.red);
        
        s6 = new JButton("RETRY");
        s6.setBounds(400,830,150,50);
        s6.setBackground(Color.RED);
        s6.setForeground(Color.WHITE);
        s6.setFont(ff);
        
        s7 = new JButton("DONE");
        s7.setBounds(750,830,150,50);
        s7.setForeground(Color.BLACK);
        s7.setBackground(Color.GREEN);
        s7.setFont(ff);
        f.add(s);
        f.add(s1);
        f.add(l1);
        f.add(l3);
        f.add(l2);
        f.add(s8);
        f.add(s9);
        f.add(s7);
        f.add(s6);
        f.add(s10);
        
        f.add(next);
        f.add(prev);
        f.add(home);
        
        f.add(l);
        
        s6.addActionListener(this);
        s8.addActionListener(this);
        s9.addActionListener(this);
        s7.addActionListener(this);
        
        next.addActionListener(this);
        prev.addActionListener(this);
        home.addActionListener(this);
        
        f.setSize(1286,957);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
      @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource().equals(s6))
      {
          if(i<=3)
          {
              new level_7();
              i++;
          }
          else
            JOptionPane.showMessageDialog(f,"Chances are over(>_<)","Alert",JOptionPane.WARNING_MESSAGE);
      }
      
      if(e.getSource().equals(next))
        {
            f.setVisible(false);
            thdd1 t1=new thdd1();
            thdd2 t2=new thdd2();
            thdd3 t3=new thdd3();
            
            t3.start();
            t1.start();
            
            t2.start();
        }
      
      if(e.getSource().equals(prev))
        {
            f.setVisible(false);
            level_6 ll=new level_6();
            ll.jButton4.setEnabled(true);
            ll.setVisible(true);
            
        }
        if(e.getSource().equals(home))
        {
            f.setVisible(false);
            new home_pg().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

   
}

