/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superheros;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Estudiantes
 */
public class Ventana extends JFrame{
    private JPanel fondo;
    private JPanel titlePanel;
    private JPanel menuPanel;
    private JPanel infoPanel;
    
    public void Ventana(){
        setTitle("Super Heroes");
        setVisible(true);
        setSize(1800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initComponents();
    };
    
    public void initComponents(){
        panels();
        labels();
        buttons();
    };
    
    public void panels(){
        fondo = new JPanel();
        fondo.setBackground(Color.BLACK);
        
        titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLACK);
        fondo.add(titlePanel);
        
        menuPanel = new JPanel();
        menuPanel.setBackground(Color.BLACK);
        fondo.add(menuPanel);
        
        infoPanel = new JPanel();
        infoPanel.setBackground(Color.BLACK);
        fondo.add(infoPanel);
    };
    public void labels(){
        JLabel textTitle = new JLabel("SUPER HEROES", SwingConstants.CENTER);
        textTitle.setFont(new Font("arial",Font.BOLD, 28));
        textTitle.setForeground(Color.white);
        titlePanel.add(textTitle);
    };
    public void buttons(){};
    
    
    
}
