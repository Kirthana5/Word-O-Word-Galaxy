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
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author SUBHAHARINI
 */
public class level_3 implements ActionListener{

    /**
     * @param args the command line arguments
     */
    int i=1;
    JLabel l1,l2,l3,s;
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,prev,next,home;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2,t3,t4,t5,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    correct_wrong_audio a=new correct_wrong_audio();
    public level_3()
    {
        f=new JFrame();
        Font ff=new Font("Georgia",Font.BOLD,16);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,32);
        
        s=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelbackground.png"));
        s.setBounds(0,0,1286,957);
        
        l1=new JLabel("LEVEL 3");
        l1.setBounds(600,130,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
        l3=new JLabel("PLAY WITH PROVERBS");
        l3.setBounds(500,201,500,70);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        
        l2=new JLabel("Each of the proverbs are rearranged,Guess the correct one by connecting them with the clues!!");
        l2.setBounds(300,530,800,50);
        l2.setFont(ff);
        l2.setForeground(new Color(0,0,139));
        
        b1=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level3hint1.png"));
        b1.setBounds(300,300,200,200);
        
        b2=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level3hint2.png"));
        b2.setBounds(500,300,200,200);
        
        b3=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level3hint3.png"));
        b3.setBounds(700,300,200,200);
        
        b4=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\level3hint4.png"));
        b4.setBounds(900,300,200,200);
        
        b5=new JButton();
        b5.setBounds(300,800,600,50);
        b5.setFont(ff); 
        
        b6=new JButton("DONE");
        b6.setBounds(800,860,100,50);
        b6.setBackground(Color.green);
        
        b7=new JButton("RETRY");
        b7.setBounds(300,860,100,50);
        b7.setBackground(Color.red);
        b7.setForeground(Color.white);
        
 
        
        r1=new JRadioButton("WORK FAILS HARD NEVER");
        r1.setBounds(300,600,600,50);
        r1.setFont(ff);
        r2=new JRadioButton("STEPPING IS FAILURE THE SUCCESS TO STONE");
        r2.setBounds(300,650,600,50);
        r2.setFont(ff);
        r3=new JRadioButton("STONE NO ROLLING MOSS A GATHERS NO");
        r3.setBounds(300,700,600,50);
        r3.setFont(ff);
        r4=new JRadioButton("MILL STONES GRINDS THE GOOD");
        r4.setBounds(300,750,600,50);
        r4.setFont(ff);
        r1.setBackground(Color.white);
        r2.setBackground(Color.white);
        r3.setBackground(Color.white);
        r4.setBackground(Color.white);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(100,520,145,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(1090,520,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(100,800,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
        
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        prev.addActionListener(this);
        next.addActionListener(this);
        
        f.add(b7);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);        
        f.add(b6);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        
        f.add(prev);
        f.add(next);
        f.add(home);
        
        f.add(s);
        
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        prev.addActionListener(this);
        next.addActionListener(this);
        home.addActionListener(this);
        
        f.setSize(1300,970);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b6))
        {
            if(r1.isSelected())
            {
                a.correct_music();
                
                b5.setText("HARD WORK NEVER FAILS");
                b5.setBackground(Color.green);
                r1.setForeground(Color.green);
                
                next.setEnabled(true);
                  
            }
            else
            {
                a.wrong_music();
                
                if(r2.isSelected())
                   r2.setForeground(Color.red);
                if(r3.isSelected())
                   r3.setForeground(Color.red); 
                if(r4.isSelected())
                   r4.setForeground(Color.red);
                b5.setText("WRONG");
                b5.setForeground(Color.white);
                b5.setBackground(Color.red);
            }
         
        }
        if(e.getSource().equals(b7))
        {
            if(i<=3)
            {
            b5.setText("");
            b5.setBackground(Color.WHITE);
            r2.setForeground(Color.black);
            r3.setForeground(Color.black);
            r4.setForeground(Color.black);
            r1.setForeground(Color.black);
            
            i++;
            }
            else
              JOptionPane.showMessageDialog(f,"Chances are over(>_<)","Alert",JOptionPane.WARNING_MESSAGE);
        }
        
        if(e.getSource().equals(next))
        {
            f.setVisible(false);
            thr1 t1=new thr1();
            thr2 t2=new thr2();
            thr3 t3=new thr3();
            
            t3.start();
            t1.start();
            t2.start();
        }
        
        if(e.getSource().equals(prev))
        {
            f.setVisible(false);
            new level_2().next.setEnabled(true);
                      
        }
        
        if(e.getSource().equals(home))
        {
            f.setVisible(false);
            new home_pg().setVisible(true);
        }
        
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new level_3();
    }
    
}

class thr1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            
        }
        new rocket_gif(4);
    }
}

class thr2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException ex) 
        {
            
        }
        new level_4();
    }
}

class thr3 extends Thread
{
    public void run()
    {
        new coins(3);
    }
}