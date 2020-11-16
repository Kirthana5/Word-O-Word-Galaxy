/*
 * To change this license header, choose License Headers in level_1 Properties.
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
 * @author Kirthana Balasubramanian
 */
public class level_1 extends MouseAdapter implements ActionListener{

    /**
     * @param args the command line arguments
     */
    int i=1;
    String tt="";
    JLabel l1,l2,l3;
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,next,prev,home;
    JTextField t1,t2,t3,t4,t5,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    correct_wrong_audio a=new correct_wrong_audio();
    public level_1() 
    {
        f=new JFrame();
        
        //Font
        Font ff=new Font("Georgia",Font.BOLD+Font.ITALIC,14);
        Font f1=new Font("Didot",Font.BOLD+Font.ITALIC,32);
        
        l2=new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\levelbackground.png"));
        l2.setBounds(0,0,1286,957);
        
      
        //Level number
        
        l1=new JLabel("LEVEL 1");
        l1.setBounds(420,150,300,70);
        l1.setFont(f1);
        l1.setForeground(new Color(0,0,139));
        
        //level name
        l3=new JLabel("PICTOWORD");
        l3.setBounds(380,221,500,70);
        l3.setFont(f1);
        l3.setForeground(new Color(0,0,139));
        
        //puzzle buttons
        b1=new JButton(new ImageIcon("b1.jpg"));
        b1.setBounds(275,300,200,200);
        
        b2=new JButton("UNLOCK");
        b2.setBounds(475,300,200,200);
        b2.setBackground(Color.lightGray);
        b2.setForeground(Color.black);
        
        b3=new JButton("UNLOCK");
        b3.setBounds(275,500,200,200);
        b3.setBackground(Color.lightGray);
        b3.setForeground(Color.black);
        
        b4=new JButton("UNLOCK");
        b4.setBounds(475,500,200,200);
        b4.setBackground(Color.lightGray);
        b4.setForeground(Color.black);
        
        b5=new JButton("DONE");
        b5.setBounds(520,760,80,30);
        b5.setBackground(Color.green);
        b5.setForeground(Color.white);
        
        b6=new JButton("RETRY");
        b6.setBounds(300,760,80,30);
        b6.setBackground(Color.red);
        b6.setForeground(Color.white);
        
        
        prev=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\prev_button.jpg"));
        prev.setBounds(120,475,145,30); 
        
        next=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\next_button.jpg"));
        next.setBounds(690,475,145,30);
        next.setEnabled(false);
        
        home=new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Project\\src\\project\\home_button.jpg"));
        home.setBounds(120,700,73,85);
        Border b=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan);
        home.setBorder(b);
        
        
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        next.addActionListener(this);
        prev.addActionListener(this);
        home.addActionListener(this);
        
        //answer boxes
        t1=new JTextField();
        t1.setBounds(395,720,30,30);
        t1.setFont(ff);
        t2=new JTextField();
        t2.setBounds(426,720,30,30);
        t2.setFont(ff);
        t3=new JTextField();
        t3.setBounds(457,720,30,30);
        t3.setFont(ff);
        t4=new JTextField();
        t4.setBounds(488,720,30,30);
        t4.setFont(ff);
        t5=new JTextField();
        t5.setBounds(519,720,30,30);
        t5.setFont(ff);
        t5.addActionListener(this);
        
        //shuffled boxes 
        s1=new JTextField("N");
        s1.setBounds(343,810,30,30);
        s1.setFont(ff);
        
        s2=new JTextField("Y");
        s2.setBounds(374,810,30,30);
        s2.setFont(ff);
        
        s3=new JTextField("I");
        s3.setBounds(405,810,30,30);
        s3.setFont(ff);
        
        s4=new JTextField("J");
        s4.setBounds(436,810,30,30);
        s4.setFont(ff);
        
        s5=new JTextField("G");
        s5.setBounds(467,810,30,30);
        s5.setFont(ff);
        
        s6=new JTextField("A");
        s6.setBounds(498,810,30,30);
        s6.setFont(ff);
        
        s7=new JTextField("T");
        s7.setBounds(529,810,30,30);
        s7.setFont(ff);
        
        s8=new JTextField("N");
        s8.setBounds(405,841,30,30);
        s8.setFont(ff);
        
        s9=new JTextField("R");
        s9.setBounds(436,841,30,30);
        s9.setFont(ff);
        
        s10=new JTextField("Z");
        s10.setBounds(467,841,30,30);
        s10.setFont(ff);
        
        s1.addMouseListener(this);
        s2.addMouseListener(this);
        s3.addMouseListener(this);
        s4.addMouseListener(this);
        s5.addMouseListener(this);
        s6.addMouseListener(this);
        s7.addMouseListener(this);
        s8.addMouseListener(this);
        s9.addMouseListener(this);
        s10.addMouseListener(this);
        
        s1.setEditable(false);
        s2.setEditable(false);
        s3.setEditable(false);
        s4.setEditable(false);
        s5.setEditable(false);
        s6.setEditable(false);
        s7.setEditable(false);
        s8.setEditable(false);
        s9.setEditable(false);
        s10.setEditable(false);
        
        f.add(l1);
        f.add(l3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(b5);
        f.add(b6);
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
        
        f.add(l2);
        
        f.setSize(1286,957);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource().equals(b2))
        {
            b2.setIcon(new ImageIcon("b2.jpg"));
        }
        if(e.getSource().equals(b3))
        {
             b3.setIcon(new ImageIcon("b3.jpg"));
        }
        if(e.getSource().equals(b4))
        {
             b4.setIcon(new ImageIcon("b4.jpg"));
        }
        if(e.getSource().equals(b5))
        {
            if(t1.getText().equals("N") && t2.getText().equals("I") && t3.getText().equals("N") && t4.getText().equals("J") && t5.getText().equals("A"))
            {
                a.correct_music();
                
                t1.setForeground(Color.black);
                t2.setForeground(Color.black);
                t3.setForeground(Color.black);
                t4.setForeground(Color.black);
                t5.setForeground(Color.black);
                
                t1.setBackground(Color.green);
                t2.setBackground(Color.green);
                t3.setBackground(Color.green);
                t4.setBackground(Color.green);
                t5.setBackground(Color.green);
                
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
                
                t1.setBackground(Color.red);
                t2.setBackground(Color.red);
                t3.setBackground(Color.red);
                t4.setBackground(Color.red);
                t5.setBackground(Color.red);               
                
                b5.setEnabled(false);
                
                
            }   
        }
        if(e.getSource().equals(b6))
        {
            if(i<=3)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            
                t1.setForeground(Color.black);
                t2.setForeground(Color.black);
                t3.setForeground(Color.black);
                t4.setForeground(Color.black);
                t5.setForeground(Color.black);
            
                t1.setBackground(Color.white);
                t2.setBackground(Color.white);
                t3.setBackground(Color.white);
                t4.setBackground(Color.white);
                t5.setBackground(Color.white);
            
                b5.setEnabled(true);
            
                s1.setEnabled(true);
                s2.setEnabled(true);
                s3.setEnabled(true);
                s4.setEnabled(true);
                s5.setEnabled(true);
                s6.setEnabled(true);
                s7.setEnabled(true);
                s8.setEnabled(true);
                s9.setEnabled(true);
                s10.setEnabled(true);
                
                i++;
            }
            else
               JOptionPane.showMessageDialog(f,"Chances are over(>_<)","Alert",JOptionPane.WARNING_MESSAGE);
            
            
        }
        
        if(e.getSource().equals(next))
        {
            f.setVisible(false);
            thread1 t1=new thread1();
            thread2 t2=new thread2();
            thread3 t3=new thread3();
            
            t3.start();
            t1.start();
            t2.start();
        }
        
        if(e.getSource().equals(prev))
        {
            f.setVisible(false);
            new level_pg().setVisible(true);
            
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
            
        }
        if(e.getSource().equals(s7))
        {
            s7.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s7.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s7.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s7.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s7.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s7.getText());
                return;
            }
            
        }
        if(e.getSource().equals(s8))
        {
            s8.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s8.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s8.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s8.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s8.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s8.getText());
                return;
            }
            
        }
        if(e.getSource().equals(s9))
        {
            s9.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s9.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s9.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s9.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s9.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s9.getText());
                return;
            }
        }
        if(e.getSource().equals(s10))
        {
            s10.setEnabled(false);
            if(t1.getText().equals(""))
            {
                t1.setText(s10.getText());
                return;
            }
            if(t2.getText().equals(""))
            {
                t2.setText(s10.getText());
                return;
            }
            if(t3.getText().equals(""))
            {
                t3.setText(s10.getText());
                return;
            }
            if(t4.getText().equals(""))
            {
                t4.setText(s10.getText());
                return;
            }
            if(t5.getText().equals(""))
            {   
                t5.setText(s10.getText());
                return;
            }
        }
        
        
            
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       new level_1();

    }

    
    
}

class thread1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            
        }
        new rocket_gif(2);
    }
}

class thread2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException ex) 
        {
            
        }
        
        new level_2();
    }
}

class thread3 extends Thread
{
    public void run()
    {
        new coins(1);
    }
    
}