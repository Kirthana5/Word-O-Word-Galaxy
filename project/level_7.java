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
public class level_7 implements ActionListener{

    /**
     * @param args the command line arguments
     */
    int i=1;
    JFrame f;
    JLabel l1,l2,l3,l,s,s10;
    JButton s1,s2,s3,s4,s5,s6,s7,s8,s9,prev,next,home;
    level_7audio lev=new level_7audio();
    correct_wrong_audio a=new correct_wrong_audio();
    
    level_7()
    {
        f=new JFrame();
        
        //Font
        Font ff=new Font("Georgia",Font.BOLD,16);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,32);
        l1=new JLabel("LEVEL 7");
        l1.setBounds(600,50,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
        l3=new JLabel("TRACE WITH TRACK");
        l3.setBounds(530,90,450,70);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        l2=new JLabel("Hear the audio and choose the correct answer");
        l2.setBounds(350,120,900,70);
        l2.setFont(f1);
        l2.setForeground(new Color(0,0,139));
        
        l=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelbackground.png"));
        l.setBounds(0,0,1286,957);
        
        
        s9=new JButton("PLAY");
        s9.setBounds(400,240,150,50);
        s9.setFont(f1);
        s9.setForeground(Color.black);
        s9.setBackground(Color.green);
        
        s8=new JButton("STOP");
        s8.setBounds(740,240,150,50);
        s8.setFont(f1);
        s8.setForeground(Color.white);
        s8.setBackground(Color.red);
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(120,475,145,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(1010,475,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(120,700,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
       
        s=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level7audiopic.gif"));
        s.setBounds(100,50,200,200);
        
        s10=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level7playgif.gif"));
        s10.setBounds(400,180,500,50);
       
    
        s1=new JButton("Tajmahal");
        s1.setBounds(400,300,500,100);
        s1.setBackground(Color.blue);
        s1.setForeground(Color.white);
        s1.setFont(ff);
        
        s2=new JButton("Eiffel Tower");
        s2.setBounds(400,400,500,100);
        s2.setBackground(Color.blue);
        s2.setForeground(Color.white);
        s2.setFont(ff);
        
        s3=new JButton("Qutubminar");
        s3.setBounds(400,500,500,100);
        s3.setBackground(Color.blue);
        s3.setForeground(Color.white);
        s3.setFont(ff);
        
        s4=new JButton("Egypt Pyramid");
        s4.setBounds(400,600,500,100);
        s4.setBackground(Color.blue);
        s4.setForeground(Color.white);
        s4.setFont(ff);
        
        s5=new JButton("Twins Towers");
        s5.setBounds(400,700,500,100);
        s5.setBackground(Color.blue);
        s5.setForeground(Color.white);
        s5.setFont(ff);
        
        s6=new JButton("RETRY");
        s6.setBounds(400,830,150,50);
        s6.setBackground(Color.RED);
        s6.setForeground(Color.WHITE);
        s6.setFont(ff);
        
        s7 = new JButton("DONE");
        s7.setBounds(750,830,150,50);
        s7.setForeground(Color.BLACK);
        s7.setBackground(Color.GREEN);
        s7.setFont(ff);
        
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        s5.addActionListener(this);
        s6.addActionListener(this);
        s7.addActionListener(this);
        s9.addActionListener(this);
        s8.addActionListener(this);
        
        prev.addActionListener(this);
        next.addActionListener(this);
        home.addActionListener(this);
        
        
        f.add(s);
        f.add(l1);
        f.add(l3);
        f.add(l2);
        f.add(s1);
        f.add(s2);
        f.add(s3);
        f.add(s4);
        f.add(s5);
        f.add(s6);
        f.add(s7);
        f.add(s8);
        f.add(s9);
        f.add(s10);
        
        f.add(prev);
        f.add(next);
        f.add(home);
        
        f.add(l);
        
        f.setSize(1286,957);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(s9))
            {
                
                lev.m.play();
                
            }
            if(e.getSource().equals(s8))
            {
                
                lev.m.stop();
            }
       
            if(e.getSource().equals(s1))
                s1.setBackground(Color.yellow);
            if(e.getSource().equals(s2))
                s2.setBackground(Color.yellow);
            if(e.getSource().equals(s3))
                s3.setBackground(Color.yellow);
            if(e.getSource().equals(s4))
                s4.setBackground(Color.yellow);
            if(e.getSource().equals(s5))
                s5.setBackground(Color.yellow);
            if(e.getSource().equals(s7))
            {
              if(s4.getBackground().equals(Color.yellow))
              {
                  next.setEnabled(true);
                  new level_7pic().next.setEnabled(true);
                  a.correct_music();
          
              }
              else
                  a.wrong_music();
     
              if(s1.getBackground().equals(Color.yellow))
              {
                 s1.setBackground(Color.red);
                 s1.setForeground(Color.white);
              }
              if(s2.getBackground().equals(Color.yellow))
              {
                 s2.setBackground(Color.red);
                 s2.setForeground(Color.white);
              }
              if(s3.getBackground().equals(Color.yellow))
              {
                 s3.setBackground(Color.red);
                 s3.setForeground(Color.white);
              }
              if(s5.getBackground().equals(Color.yellow))
              {
                 s5.setBackground(Color.red);
                 s5.setForeground(Color.white);
              }
            }
             if(e.getSource().equals(s6))
            {
             if(i<=3)
             {
             if(s1.getBackground().equals(Color.red))
              {
                 s1.setBackground(Color.blue);
                 s1.setForeground(Color.white);
              }
              if(s2.getBackground().equals(Color.red))
              {
                 s2.setBackground(Color.blue);
                 s2.setForeground(Color.white);
              }
              if(s3.getBackground().equals(Color.red))
              {
                 s3.setBackground(Color.blue);
                 s3.setForeground(Color.white);
              }
               if(s4.getBackground().equals(Color.red))
              {
                 s4.setBackground(Color.blue);
                 s4.setForeground(Color.white);
              }
              if(s5.getBackground().equals(Color.red))
              {
                 s5.setBackground(Color.blue);
                 s5.setForeground(Color.white);
              }
              
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
        new level_7();
    }   
}

class thdd1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            
        }
        new rocket_gif(8);
    }
}

class thdd2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException ex) 
        {
            
        }
        new level_8();
    }
}

class thdd3 extends Thread
{
    public void run()
    {
        new coins(7);
    }
}