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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author SUBHAHARINI
 */
public class level_4 extends MouseAdapter implements ActionListener{

    /**
     * @param args the command line arguments
     */
    int i=1;
    JFrame f;
    JLabel l1,l2,l3,s;
    JButton s1,s2,s3,s4,s5,s6,s7,s8,s9,prev,next,home;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    correct_wrong_audio a=new correct_wrong_audio();
    
    level_4()
    { 
         f=new JFrame();
        
        //Font
        Font ff=new Font("Georgia",Font.BOLD,16);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,32);
        
        l1=new JLabel("LEVEL 4");
        l1.setBounds(600,150,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
   
        l2=new JLabel("JUMPING JUMBLES");
        l2.setBounds(500,190,400,50);
        l2.setFont(f1);
        l2.setForeground(new Color(0,0,139));
        
        l3=new JLabel("Rearrange the following sequence and reveal a short & sweet story and its moral");
        l3.setBounds(100,250,1300,50);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        s=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelback4.png"));
        s.setBounds(0,0,1500,957);
        
    
        s1=new JButton("All animals decided that daily one of them will come for lion's meal");
        s1.setBounds(100,300,600,50);
        s1.setBackground(Color.blue);
        s1.setForeground(Color.black);
        s1.setFont(ff);
        
        s2=new JButton("It was rabbit's turn .He decided to kill the lion and to save himself");
        s2.setBounds(100,350,600,50);
        s2.setBackground(Color.blue);
        s2.setForeground(Color.black);
        s2.setFont(ff);
        
        s3=new JButton("Once there was a lion in jungle who used to kill 2 to 3 animals daily");
        s3.setBounds(100,400,600,50);
        s3.setBackground(Color.blue);
        s3.setForeground(Color.black);
        s3.setFont(ff);
        
        s4=new JButton("Rabbit takes lion to well and shows his reflection.Lion fells and dies");
        s4.setBounds(100,450,600,50);
        s4.setBackground(Color.blue);
        s4.setForeground(Color.black);
        s4.setFont(ff);
        
        s5=new JButton("Lion agreed to that decision , this way started going for many days");
        s5.setBounds(100,500,600,50);
        s5.setBackground(Color.blue);
        s5.setForeground(Color.black);
        s5.setFont(ff);
        
        s6=new JButton("He went and told that another lion is powerful than him in jungle");
        s6.setBounds(100,550,600,50);
        s6.setBackground(Color.blue);
        s6.setForeground(Color.black);
        s6.setFont(ff);
        
        s7=new JButton("DONE");
        s7.setBounds(1150,650,150,50);
        s7.setBackground(Color.green);
        s7.setForeground(Color.black);
        s7.setFont(ff);
        
        s8=new JButton("RETRY");
        s8.setBounds(100,650,100,50);
        s8.setBackground(Color.red);
        s8.setForeground(Color.black);
        s8.setFont(ff);
        
        s9=new JButton("Click to reveal the moral !!");
        s9.setBounds(200,650,980,50);
        s9.setBackground(Color.gray);
        s9.setForeground(Color.black);
        Font f2=new Font("Georgia",Font.BOLD,18);
        s9.setFont(f2);
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(2,475,85,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(1326,475,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(10,740,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
        
        t1=new JTextField();
        t1.setBounds(720,300,600,50);
        t1.setFont(ff);
        t2=new JTextField();
        t2.setBounds(720,350,600,50);
        t2.setFont(ff);
        t3=new JTextField();
        t3.setBounds(720,400,600,50);
        t3.setFont(ff);
        t4=new JTextField();
        t4.setBounds(720,450,600,50);
        t4.setFont(ff);
        t5=new JTextField();
        t5.setBounds(720,500,600,50);
        t5.setFont(ff);
        t6=new JTextField();
        t6.setBounds(720,550,600,50);
        t6.setFont(ff);
        t6.addActionListener(this);
        
        
        f.add(l1);
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
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        
        f.add(prev);
        f.add(next);
        f.add(home);
        
        f.add(s);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        s5.addActionListener(this);
        s6.addActionListener(this);
        s7.addActionListener(this);
        s8.addActionListener(this);
        
        
        prev.addActionListener(this);
        next.addActionListener(this);
        home.addActionListener(this);
        
        s1.addMouseListener(this);
        s2.addMouseListener(this);
        s3.addMouseListener(this);
        s4.addMouseListener(this);
        s5.addMouseListener(this);
        s6.addMouseListener(this);
        s7.addMouseListener(this);
        s8.addMouseListener(this);
     
      
       
        
        
        f.setSize(1500,957);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(s7))
        {
            if(t1.getText().equals("Once there was a lion in jungle who used to kill 2 to 3 animals daily") && t2.getText().equals("All animals decided that daily one of them will come for lion's meal") && t3.getText().equals("Lion agreed to that decision , this way started going for many days") && t4.getText().equals("It was rabbit's turn .He decided to kill the lion and to save himself") && t5.getText().equals("He went and told that another lion is powerful than him in jungle") && t6.getText().equals("Rabbit takes lion to well and shows his reflection.Lion fells and dies"))
            {
                a.correct_music();
                
                t1.setForeground(Color.black);
                t2.setForeground(Color.black);
                t3.setForeground(Color.black);
                t4.setForeground(Color.black);
                t5.setForeground(Color.black);
                t6.setForeground(Color.black);
                
                t1.setBackground(Color.green);
                t2.setBackground(Color.green);
                t3.setBackground(Color.green);
                t4.setBackground(Color.green);
                t5.setBackground(Color.green);
                t6.setBackground(Color.green);
                
                
                s9.setEnabled(true);
                s9.addActionListener(this);
                s9.setBackground(new Color(102,0,153));
                s9.setForeground(Color.white);
                
                next.setEnabled(true);
                
            }
            else
            {
                a.wrong_music();
                
                t1.setForeground(Color.white);
                t2.setForeground(Color.white);
                t3.setForeground(Color.white);
                t4.setForeground(Color.white);
                t5.setForeground(Color.white);
                t6.setForeground(Color.white);
                
                t1.setBackground(Color.red);
                t2.setBackground(Color.red);
                t3.setBackground(Color.red);
                t4.setBackground(Color.red);
                t5.setBackground(Color.red);
                t6.setBackground(Color.red);
                s7.setEnabled(false);
              
            }
        }
        
        if(e.getSource().equals(s9))
        {
            s9.setText("Wisdom wins might !!");
            
        }
        if(e.getSource().equals(s8))
        {
            if(i<=3)
            {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            
            t1.setForeground(Color.black);
            t2.setForeground(Color.black);
            t3.setForeground(Color.black);
            t4.setForeground(Color.black);
            t5.setForeground(Color.black);
            t6.setForeground(Color.black);
            
            t1.setBackground(Color.white);
            t2.setBackground(Color.white);
            t3.setBackground(Color.white);
            t4.setBackground(Color.white);
            t5.setBackground(Color.white);
            t6.setBackground(Color.white);
            
            s7.setEnabled(true);
            
            s1.setEnabled(true);
            s2.setEnabled(true);
            s3.setEnabled(true);
            s4.setEnabled(true);
            s5.setEnabled(true);
            s6.setEnabled(true);
            
            i++;
            }
            else
               JOptionPane.showMessageDialog(f,"Chances are over(>_<)","Alert",JOptionPane.WARNING_MESSAGE);
            
        }
        
        if(e.getSource().equals(next))
        {
            f.setVisible(false);
            thd1 t1=new thd1();
            thd2 t2=new thd2();
            thd3 t3=new thd3();
            
            t3.start();
            t1.start();
            
            t2.start();
        }
        if(e.getSource().equals(prev))
        {
            f.setVisible(false);
            new level_3().next.setEnabled(true);
            
        }
        if(e.getSource().equals(home))
        {
            f.setVisible(false);
            new home_pg().setVisible(true);
        }
    }
     public void mouseClicked(MouseEvent e)
        {
            if(e.getSource().equals(s1))
            {
            s1.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s1.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s1.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s1.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s1.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s1.getText());
                return;
            }
            if(t6.getText().equals(""))
            {   
                t6.setText(s1.getText());
                return;
            }
            
            
        }
        if(e.getSource().equals(s2))
        {
            s2.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s2.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s2.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s2.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s2.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s2.getText());
                return;
            }
            if(t6.getText().equals(""))
            {   
                t6.setText(s2.getText());
                return;
            }
            
        }
        if(e.getSource().equals(s3))
        {
            s3.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s3.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s3.getText());
                return;
            }
            if(t3.getText().equals(""))                                                                                                  
            {
                t3.setText(s3.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s3.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s3.getText());
                return;
            }
            if(t6.getText().equals(""))
            {   
                t6.setText(s3.getText());
                return;
            }
            
        }
        if(e.getSource().equals(s4))
        {
            s4.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s4.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s4.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s4.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s4.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s4.getText());
                return;
            }
            if(t6.getText().equals(""))
            {   
                t6.setText(s4.getText());
                return;
            }
            
        }
        if(e.getSource().equals(s5))
        {
            s5.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s5.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s5.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s5.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s5.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s5.getText());
                return;
            }
            if(t6.getText().equals(""))
            {   
                t6.setText(s5.getText());
                return;
            }
            
        }
        if(e.getSource().equals(s6))
        {
            s6.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s6.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s6.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s6.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s6.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s6.getText());
                return;
            }
            if(t6.getText().equals(""))
            {   
                t6.setText(s6.getText());
                return;
            }
            
        }
        
        
        }
    public static void main(String[] args) {
        // TODO code application logic here
        level_4 ff=new level_4();
    }
        
}
class thd1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            
        }
        new rocket_gif(5);
    }
}

class thd2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException ex) 
        {
            
        }
        new level_5().setVisible(true);
    }
}

class thd3 extends Thread
{
    public void run()
    {
        new coins(4);
    }
}