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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class rocket_gif {

    /**
     * @param args the command line arguments
     */
    
    JFrame f;
    JLabel l1,l2,l3;
    
    int i;

    
    @SuppressWarnings("LeakingThisInConstructor")
    public rocket_gif(int i)
    {
        //Font
        Font ff=new Font("Bernard MT Condensed",Font.BOLD+Font.ITALIC,48);
        
        f=new JFrame();
        
        //Labels
        this.i=i;
        if(i<=9)
        {
            l1=new JLabel("LEVEL "+i);
            
            i++;
        }
        l1.setBounds(550,30,400,100);
        l1.setFont(ff);
        l1.setForeground(new Color(204,51,255));
        
        
        l2=new JLabel();
        l2.setBounds(410,100,482,683);
        l2.setIcon(new ImageIcon(this.getClass().getResource("rockett.gif")));
        
        
        l3=new JLabel();
        l3.setIcon(new ImageIcon("rocket_plain_bg.jpg"));
        l3.setBounds(0,0,1286,957);
        
        
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        
       
        
        
        
        f.setSize(1286,957);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // level_call(i-1);
    }
    
     void level_call(int i)
     {
         
         if(i==2)
             new level_pg().setVisible(true);
     }
                
       
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
