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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

/**
 *
 * @author SUBHAHARINI
 */
public class level_8 implements ActionListener{

    /**
     * @param args the command line arguments
     */
    int i=1;
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,s,l;
    JButton s1,s2,s3,s4,s5,s6,s7,s8,s9,next,prev,home;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9;
    ButtonGroup bg,bg1,bg2;
    correct_wrong_audio a=new correct_wrong_audio();
    
    level_8()
    {
        f=new JFrame();
        Font ff=new Font("Didot",Font.BOLD,16);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,24);
        
        l1=new JLabel("LEVEL 8");
        l1.setBounds(550,20,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
        l2=new JLabel("PICK THE ANSWER FROM PIC");
        l2.setBounds(420,60,450,50);
        l2.setFont(f1);
        l2.setForeground(new Color(0,0,139));
        
        l3=new JLabel("Look at the picture and choose the correct answer for the questions");
        l3.setBounds(200,90,1000,50);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        s=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level8_img.png"));
        s.setBounds(300,130,600,230);
        
        l=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelback8.png"));
        l.setBounds(0,0,1386,1150);
        
        l4=new JLabel("1.How many human beings and animals in this picture?");
        l4.setBounds(200,350,1000,50);
        l4.setFont(f1);
        l4.setForeground(new Color(0,0,139));
        
        r1=new JRadioButton("4,8");
        r1.setBounds(200,400,100,30);
        r1.setFont(ff);
        r2=new JRadioButton("8,4");
        r2.setBounds(200,450,100,30);
        r2.setFont(ff);
        r3=new JRadioButton("4,5");
        r3.setBounds(200,500,100,30);
        r3.setFont(ff);
        
        
        l5=new JLabel("2.In this picture,which object the girl sitting away from the truck holding in her hand?");
        l5.setBounds(200,530,1050,50);
        l5.setFont(f1);
        l5.setForeground(new Color(0,0,139));
        
        r4=new JRadioButton("Hand Bag");
        r4.setBounds(200,580,200,30);
        r4.setFont(ff);
        r5=new JRadioButton("Book");
        r5.setBounds(200,630,100,30);
        r5.setFont(ff);
        r6=new JRadioButton("Camera");
        r6.setBounds(200,680,300,30);
        r6.setFont(ff);
        
        
        
        l6=new JLabel("3.What is the monkey which is sitting up on the truck right from first,left from second doing?");
        l6.setBounds(200,730,1200,70);
        l6.setFont(f1);
        l6.setForeground(new Color(0,0,139));
        
        r7=new JRadioButton("Capturing image");
        r7.setBounds(200,780,600,50);
        r7.setFont(ff);
        r8=new JRadioButton("Trying to open the bag");
        r8.setBounds(200,830,600,50);
        r8.setFont(ff);
        r9=new JRadioButton("playing with another monkey");
        r9.setBounds(200,880,600,50);
        r9.setFont(ff);
        
        
        
        s1=new JButton("RETRY");
        s1.setBounds(200,930,150,50);
        s1.setBackground(Color.RED);
        s1.setForeground(Color.WHITE);
        s1.setFont(ff);
        
        s2 = new JButton("DONE");
        s2.setBounds(1100,920,150,50);
        s2.setForeground(Color.BLACK);
        s2.setBackground(Color.GREEN);
        s2.setFont(ff);
        
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        bg1 = new ButtonGroup();
        bg1.add(r4);
        bg1.add(r5);
        bg1.add(r6);
        
        bg2 = new ButtonGroup();
        bg2.add(r7);
        bg2.add(r8);
        bg2.add(r9);
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(40,520,145,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(1180,530,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(40,800,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
        f.add(s);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(r5);
        f.add(r6);
        f.add(r7);
        f.add(r8);
        f.add(r9);
        f.add(l1);
        f.add(l3);
        f.add(l2);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(s1);
        f.add(s2);
        
        f.add(prev);
        f.add(next);
        f.add(home);
        
        f.add(l);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        
        next.addActionListener(this);
        prev.addActionListener(this);
        home.addActionListener(this);
        
        f.setSize(1386,1150);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(s2))
        {
            if(r1.isSelected())
                r1.setForeground(Color.green);
            if(r6.isSelected())
                r6.setForeground(Color.green);
            if(r8.isSelected())
                r8.setForeground(Color.green);
     
             if(r9.isSelected())
                r9.setForeground(Color.red);
            if(r2.isSelected())
                r2.setForeground(Color.red);
            if(r3.isSelected())
                r3.setForeground(Color.red);
             if(r4.isSelected())
                r4.setForeground(Color.red);
            if(r5.isSelected())
                r5.setForeground(Color.red);
            if(r7.isSelected())
                r7.setForeground(Color.red);
            
        
            
            if(r1.isSelected() && r6.isSelected() && r8.isSelected())
            {
                next.setEnabled(true);
                a.correct_music();
            }
            else
                a.wrong_music();
        }
         if(e.getSource().equals(s1))
        {
            if(i<=3)
            {
            if(r1.isSelected())
                r1.setForeground(Color.black);
            if(r6.isSelected())
                r6.setForeground(Color.black);
            if(r8.isSelected())
                r8.setForeground(Color.black);
             if(r9.isSelected())
                r9.setForeground(Color.black);
            if(r2.isSelected())
                r2.setForeground(Color.black);
            if(r3.isSelected())
                r3.setForeground(Color.black);
             if(r4.isSelected())
                r4.setForeground(Color.black);
            if(r5.isSelected())
                r5.setForeground(Color.black);
            if(r7.isSelected())
                r7.setForeground(Color.black);
            i++;
            }
            else
              JOptionPane.showMessageDialog(f,"Chances are over(>_<)","Alert",JOptionPane.WARNING_MESSAGE);
        }
       if(e.getSource().equals(next))
        {
            f.setVisible(false);
            thrd1 t1=new thrd1();
            thrd2 t2=new thrd2();
            thrd3 t3=new thrd3();
            
            t3.start();
            t1.start();
            
            t2.start();
        }
      
      if(e.getSource().equals(prev))
        {
            f.setVisible(false);
            new level_7().next.setEnabled(true);
            
        }
        if(e.getSource().equals(home))
        {
           f.setVisible(false);
           new home_pg().setVisible(true);
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new level_8();
    }    
}

class thrd1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            
        }
        new rocket_gif(9);
    }
}

class thrd2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException ex) 
        {
            
        }
        new level_9().setVisible(true);
    }
}

class thrd3 extends Thread
{
    public void run()
    {
        new coins(8);
    }
}