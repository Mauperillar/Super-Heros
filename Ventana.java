/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Estudiantes
 */
public class Ventana extends JFrame{
    public Ventana(){
        setTitle("Super Heroes");
        setSize(1800,800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void initComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(null);//Desactivar diseño por default
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);
        
        JLabel title = new JLabel("SUPER HEROES", SwingConstants.CENTER);
        //title.setText("Titulo");
        //title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setOpaque(true); // Permitir cambiar fondo de label
        title.setBackground(Color.RED);
        title.setForeground(Color.WHITE); // COLOR LETRA
        title.setFont(new Font("arial", Font.BOLD, 20));
        title.setBounds(0, 0, this.getWidth(), 50);
        panel.add(title);
        
        ImageIcon tanos = new ImageIcon("tanos.jpg");
        JLabel imgTanos = new JLabel();
        imgTanos.setBounds(20, 100, 100, 100);
        imgTanos.setIcon(new ImageIcon(tanos.getImage().getScaledInstance(imgTanos.getWidth(), imgTanos.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(imgTanos);
    }
    
}
