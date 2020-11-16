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
public class level_2 implements ActionListener{

    /**
     * @param args the command line arguments
     */
    int i=1;
    JFrame f;
    JLabel l1,l2,l3,s;
    JButton s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,prev,next,home;
    correct_wrong_audio a=new correct_wrong_audio();
    public level_2()
    { 
         f=new JFrame();
        
        //Font
        Font ff=new Font("Georgia",Font.BOLD,16);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,32);
        l1=new JLabel("LEVEL 2");
        l1.setBounds(600,150,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
        l3=new JLabel("PICK FROM GRID");
        l3.setBounds(530,190,300,70);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        
        l2=new JLabel("Hint:Most pleasing thing to be worn!!!!.Check your hand for number of letters of the word (@_@)");
        l2.setBounds(320,240,800,50);
        l2.setFont(ff);
        l2.setForeground(new Color(0,0,139));
        
        s=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelbackground.png"));
        s.setBounds(0,0,1286,957);
    
        s1=new JButton("M");
        s1.setBounds(400,300,100,100);
        s1.setBackground(Color.blue);
        s1.setForeground(Color.white);
        s1.setFont(ff);
        
        s2=new JButton("D");
        s2.setBounds(500,300,100,100);
        s2.setBackground(Color.blue);
        s2.setForeground(Color.white);
        s2.setFont(ff);
        
        s3=new JButton("B");
        s3.setBounds(600,300,100,100);
        s3.setBackground(Color.blue);
        s3.setForeground(Color.white);
        s3.setFont(ff);
        
        s4=new JButton("F");
        s4.setBounds(700,300,100,100);
        s4.setBackground(Color.blue);
        s4.setForeground(Color.white);
        s4.setFont(ff);
        
        s5=new JButton("C");
        s5.setBounds(800,300,100,100);
        s5.setBackground(Color.blue);
        s5.setForeground(Color.white);
        s5.setFont(ff);
        
        s6=new JButton("E");
        s6.setBounds(400,400,100,100);
        s6.setBackground(Color.blue);
        s6.setForeground(Color.white);
        s6.setFont(ff);
        
        s7=new JButton("S");
        s7.setBounds(500,400,100,100);
        s7.setBackground(Color.blue);
        s7.setForeground(Color.white);
        s7.setFont(ff);
        
        s8=new JButton("U");
        s8.setBounds(600,400,100,100);
        s8.setBackground(Color.blue);
        s8.setForeground(Color.white);
        s8.setFont(ff);
        
        s9=new JButton("A");
        s9.setBounds(700,400,100,100);
        s9.setBackground(Color.blue);
        s9.setForeground(Color.white);
        s9.setFont(ff);
        
        s10=new JButton("Z");
        s10.setBounds(800,400,100,100);
        s10.setBackground(Color.blue);
        s10.setForeground(Color.white);
        s10.setFont(ff);
        
        s11=new JButton("H");
        s11.setBounds(400,500,100,100);
        s11.setBackground(Color.blue);
        s11.setForeground(Color.white);
        s11.setFont(ff);
        
        s12=new JButton("N");
        s12.setBounds(500,500,100,100);
        s12.setBackground(Color.blue);
        s12.setForeground(Color.white);
        s12.setFont(ff);
        
        s13=new JButton("I");
        s13.setBounds(600,500,100,100);
        s13.setBackground(Color.blue);
        s13.setForeground(Color.white);
        s13.setFont(ff);
        
        s14=new JButton("X");
        s14.setBounds(700,500,100,100);
        s14.setBackground(Color.blue);
        s14.setForeground(Color.white);
        s14.setFont(ff);
        
        s15=new JButton("K");
        s15.setBounds(800,500,100,100);
        s15.setBackground(Color.blue);
        s15.setForeground(Color.white);
        s15.setFont(ff);
        
        s16=new JButton("V");
        s16.setBounds(400,600,100,100);
        s16.setBackground(Color.blue);
        s16.setForeground(Color.white);
        s16.setFont(ff);
        
        s17=new JButton("G");
        s17.setBounds(500,600,100,100);
        s17.setBackground(Color.blue);
        s17.setForeground(Color.white);
        s17.setFont(ff);
        
        s18=new JButton("L");
        s18.setBounds(600,600,100,100);
        s18.setBackground(Color.blue);
        s18.setForeground(Color.white);
        s18.setFont(ff);
        
        s19=new JButton("R");
        s19.setBounds(700,600,100,100);
        s19.setBackground(Color.blue);
        s19.setForeground(Color.white);
        s19.setFont(ff);
        
        s20=new JButton("A");
        s20.setBounds(800,600,100,100);
        s20.setBackground(Color.blue);
        s20.setForeground(Color.white);
        s20.setFont(ff);
        
        s21=new JButton("W");
        s21.setBounds(400,700,100,100);
        s21.setBackground(Color.blue);
        s21.setForeground(Color.white);
        s21.setFont(ff);
        
        s22=new JButton("O");
        s22.setBounds(500,700,100,100);
        s22.setBackground(Color.blue);
        s22.setForeground(Color.white);
        s22.setFont(ff);
        
        s23=new JButton("Q");
        s23.setBounds(600,700,100,100);
        s23.setBackground(Color.blue);
        s23.setForeground(Color.white);
        s23.setFont(ff);
        
        s24=new JButton("P");
        s24.setBounds(700,700,100,100);
        s24.setBackground(Color.blue);
        s24.setForeground(Color.white);
        s24.setFont(ff);
        
        s25=new JButton("D");
        s25.setBounds(800,700,100,100);
        s25.setBackground(Color.blue);
        s25.setForeground(Color.white);
        s25.setFont(ff);
        
        s26=new JButton("DONE");
        s26.setBounds(800,830,100,50);
        s26.setBackground(Color.green);
        s26.setForeground(Color.black);
        
        s27=new JButton("RETRY");
        s27.setBounds(400,830,100,50);
        s27.setBackground(Color.RED);
        s27.setForeground(Color.black);
        
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(200,475,145,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(935,475,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(200,800,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        s5.addActionListener(this);
        s6.addActionListener(this);
        s7.addActionListener(this);
        s8.addActionListener(this);
        s9.addActionListener(this);
        s10.addActionListener(this);
        s11.addActionListener(this);
        s12.addActionListener(this);
        s13.addActionListener(this);
        s14.addActionListener(this);
        s15.addActionListener(this);
        s16.addActionListener(this);
        s17.addActionListener(this);
        s18.addActionListener(this);
        s19.addActionListener(this);
        s20.addActionListener(this);
        s21.addActionListener(this);
        s22.addActionListener(this);
        s23.addActionListener(this);
        s24.addActionListener(this);
        s25.addActionListener(this);
        s26.addActionListener(this);
        s27.addActionListener(this);
        
        next.addActionListener(this);
        prev.addActionListener(this);
        home.addActionListener(this);
        
        
        
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
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
        f.add(s11);
        f.add(s12);
        f.add(s13);
        f.add(s14);
        f.add(s15);
        f.add(s16);
        f.add(s17);
        f.add(s18);
        f.add(s19);
        f.add(s20);
        f.add(s21);
        f.add(s22);
        f.add(s23);
        f.add(s24);
        f.add(s25);
        f.add(s26);
        f.add(s27);
        
        f.add(prev);
        f.add(next);
        f.add(home);
       
        f.add(s);
        
        f.setSize(1286,957);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        //s26.setEnabled(true);
        
        if(e.getSource().equals(s1))
          s1.setBackground(Color.black);
        if(e.getSource().equals(s2))
          s2.setBackground(Color.black);
        if(e.getSource().equals(s3))
          s3.setBackground(Color.black);
        if(e.getSource().equals(s4))
          s4.setBackground(Color.black);
        if(e.getSource().equals(s5))
          s5.setBackground(Color.black);
        if(e.getSource().equals(s6))
          s6.setBackground(Color.black);
        if(e.getSource().equals(s7))
          s7.setBackground(Color.black);
        if(e.getSource().equals(s8))
          s8.setBackground(Color.black);
        if(e.getSource().equals(s9))
          s9.setBackground(Color.black);
        if(e.getSource().equals(s10))
          s10.setBackground(Color.black);
        if(e.getSource().equals(s11))
          s11.setBackground(Color.black);
        if(e.getSource().equals(s12))
          s12.setBackground(Color.black);
        if(e.getSource().equals(s13))
          s13.setBackground(Color.black);
        if(e.getSource().equals(s14))
          s14.setBackground(Color.black);
        if(e.getSource().equals(s15))
          s15.setBackground(Color.black);
        if(e.getSource().equals(s16))
          s16.setBackground(Color.black);
        if(e.getSource().equals(s17))
          s17.setBackground(Color.black);
        if(e.getSource().equals(s18))
          s18.setBackground(Color.black);
        if(e.getSource().equals(s19))
          s19.setBackground(Color.black);
        if(e.getSource().equals(s20))
          s20.setBackground(Color.black);
        if(e.getSource().equals(s21))
          s21.setBackground(Color.black);
        if(e.getSource().equals(s22))
          s22.setBackground(Color.black);
        if(e.getSource().equals(s23))
          s23.setBackground(Color.black);
        if(e.getSource().equals(s24))
          s24.setBackground(Color.black);
        if(e.getSource().equals(s25))
          s25.setBackground(Color.black);
        if(e.getSource().equals(s26))
        {
        
        if(s1.getBackground().equals(Color.black) && s7.getBackground().equals(Color.black) && s13.getBackground().equals(Color.black) && s18.getBackground().equals(Color.black) && s6.getBackground().equals(Color.black) )
        {
            a.correct_music();
        
            s1.setBackground(Color.green);
            s1.setForeground(Color.black);
            s7.setBackground(Color.green);
            s7.setForeground(Color.black);
            s13.setBackground(Color.green);
            s13.setForeground(Color.black);
            s18.setBackground(Color.green);
            s18.setForeground(Color.black);
            s6.setBackground(Color.green);
            s6.setForeground(Color.black);
            
            next.setEnabled(true);
        }
        else
        {
            a.wrong_music();
            
            if(s1.getBackground().equals(Color.black))
                s1.setBackground(Color.red);
            if(s2.getBackground().equals(Color.black))
                s2.setBackground(Color.red);
            if(s3.getBackground().equals(Color.black))
                s3.setBackground(Color.red);
            if(s4.getBackground().equals(Color.black))
                s4.setBackground(Color.red);
            if(s5.getBackground().equals(Color.black))
                s5.setBackground(Color.red);
            if(s6.getBackground().equals(Color.black))
                s6.setBackground(Color.red);
            if(s7.getBackground().equals(Color.black))
                s7.setBackground(Color.red);
            if(s8.getBackground().equals(Color.black))
                s8.setBackground(Color.red);
            if(s9.getBackground().equals(Color.black))
                s9.setBackground(Color.red);
            if(s10.getBackground().equals(Color.black))
                s10.setBackground(Color.red);
            if(s11.getBackground().equals(Color.black))
                s11.setBackground(Color.red);
            if(s12.getBackground().equals(Color.black))
                s12.setBackground(Color.red);
            if(s13.getBackground().equals(Color.black))
                s13.setBackground(Color.red);
            if(s14.getBackground().equals(Color.black))
                s14.setBackground(Color.red);
            if(s15.getBackground().equals(Color.black))
                s15.setBackground(Color.red);
            if(s16.getBackground().equals(Color.black))
                s16.setBackground(Color.red);
            if(s17.getBackground().equals(Color.black))
                s17.setBackground(Color.red);
            if(s18.getBackground().equals(Color.black))
                s18.setBackground(Color.red);
            if(s19.getBackground().equals(Color.black))
                s19.setBackground(Color.red);
            if(s20.getBackground().equals(Color.black))
                s20.setBackground(Color.red);
            if(s21.getBackground().equals(Color.black))
                s21.setBackground(Color.red);
            if(s22.getBackground().equals(Color.black))
                s22.setBackground(Color.red);
            if(s23.getBackground().equals(Color.black))
                s23.setBackground(Color.red);
            if(s24.getBackground().equals(Color.black))
                s24.setBackground(Color.red);
            if(s25.getBackground().equals(Color.black))
                s25.setBackground(Color.red);
        }
      }
      if(e.getSource().equals(s27)) 
      {
          if(i<=3)
          {
            if(s1.getBackground().equals(Color.green) || s1.getBackground().equals(Color.red)){
                s1.setBackground(Color.blue);
                s1.setForeground(Color.white);
            }
            if(s2.getBackground().equals(Color.green) || s2.getBackground().equals(Color.red)){
                s2.setBackground(Color.blue);
                s2.setForeground(Color.white);
            }
            if(s3.getBackground().equals(Color.green) || s3.getBackground().equals(Color.red)){
                s3.setBackground(Color.blue);
                s1.setForeground(Color.white);
            }
            if(s4.getBackground().equals(Color.green) || s4.getBackground().equals(Color.red)){
                s4.setBackground(Color.blue);
                s4.setForeground(Color.white);
            }
            if(s5.getBackground().equals(Color.green) || s5.getBackground().equals(Color.red)){
                s5.setBackground(Color.blue);
                s5.setForeground(Color.white);
            }
            if(s6.getBackground().equals(Color.green) || s6.getBackground().equals(Color.red)){
                s6.setBackground(Color.blue);
                s6.setForeground(Color.white);
            }
            if(s7.getBackground().equals(Color.green) || s7.getBackground().equals(Color.red)){
                s7.setBackground(Color.blue);
                s7.setForeground(Color.white);
            }
            if(s8.getBackground().equals(Color.green) || s8.getBackground().equals(Color.red)){
                s8.setBackground(Color.blue);
                s8.setForeground(Color.white);
            }
            if(s9.getBackground().equals(Color.green) || s9.getBackground().equals(Color.red)){
                s9.setBackground(Color.blue);
                s9.setForeground(Color.white);
            }
              
            if(s10.getBackground().equals(Color.green) || s10.getBackground().equals(Color.red)){
                s10.setBackground(Color.blue);
                s10.setForeground(Color.white);
            }
              
            if(s11.getBackground().equals(Color.green) || s11.getBackground().equals(Color.red)){
                s11.setBackground(Color.blue);
                s11.setForeground(Color.white);
            }
             
            if(s12.getBackground().equals(Color.green) || s12.getBackground().equals(Color.red)){
                s12.setBackground(Color.blue);
                s12.setForeground(Color.white);
            }
              
            if(s13.getBackground().equals(Color.green) || s13.getBackground().equals(Color.red)){
                s13.setBackground(Color.blue);
                s13.setForeground(Color.white);
            }
            
            if(s14.getBackground().equals(Color.green) || s14.getBackground().equals(Color.red)){
                s14.setBackground(Color.blue);
                s14.setForeground(Color.white);
            }
            
            if(s15.getBackground().equals(Color.green) || s15.getBackground().equals(Color.red)){
                s15.setBackground(Color.blue);
                s15.setForeground(Color.white);
            }
          
            if(s16.getBackground().equals(Color.green) || s16.getBackground().equals(Color.red)){
                s16.setBackground(Color.blue);
                s16.setForeground(Color.white);
            }
           
            if(s17.getBackground().equals(Color.green) || s17.getBackground().equals(Color.red)){
                s17.setBackground(Color.blue);
                s17.setForeground(Color.white);
            }
    
            if(s18.getBackground().equals(Color.green) || s18.getBackground().equals(Color.red)){
                s18.setBackground(Color.blue);
                s18.setForeground(Color.white);
            }
        
            if(s19.getBackground().equals(Color.green) || s19.getBackground().equals(Color.red)){
                s19.setBackground(Color.blue);
                s19.setForeground(Color.white);
            }
         
            if(s20.getBackground().equals(Color.green) || s20.getBackground().equals(Color.red)){
                s20.setBackground(Color.blue);
                s20.setForeground(Color.white);
            }
           
            if(s21.getBackground().equals(Color.green) || s21.getBackground().equals(Color.red)){
                s21.setBackground(Color.blue);
                s21.setForeground(Color.white);
            }
            
            if(s22.getBackground().equals(Color.green) || s22.getBackground().equals(Color.red)){
                s22.setBackground(Color.blue);
                s22.setForeground(Color.white);
            }
            
            if(s23.getBackground().equals(Color.green) || s23.getBackground().equals(Color.red)){
                s23.setBackground(Color.blue);
                s23.setForeground(Color.white);
            }
               
            if(s24.getBackground().equals(Color.green) || s24.getBackground().equals(Color.red)){
                s24.setBackground(Color.blue);
                s24.setForeground(Color.white);
            }
           
            if(s25.getBackground().equals(Color.green) || s25.getBackground().equals(Color.red)){
                s25.setBackground(Color.blue);
                s25.setForeground(Color.white);
            }
            i++;
          }
          else
            JOptionPane.showMessageDialog(f,"Chances are over(>_<)","Alert",JOptionPane.WARNING_MESSAGE);
                
      }
      
      if(e.getSource().equals(next))
        {
            f.setVisible(false);
            th1 t1=new th1();
            th2 t2=new th2();
            th3 t3=new th3();
            
            t3.start();
            t1.start();
            t2.start();
        }
        
        if(e.getSource().equals(prev))
        {
            f.setVisible(false);
            new level_1().next.setEnabled(true);
          
        }
        
        if(e.getSource().equals(home))
        {
            f.setVisible(false);
            new home_pg().setVisible(true);
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
       new level_2();
    }   
}

class th1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            
        }
        new rocket_gif(3);
    }
}

class th2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException ex) 
        {
            
        }
        new level_3();
    }
}

class th3 extends Thread
{
    public void run()
    {
         new coins(2);
    }
}