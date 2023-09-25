/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculate;

/**
 *
 * @author moyak
 */
import java.awt.*;
import javax.swing.*;

public class Frame 
{
    private JFrame frame = new JFrame("Calculator");
    private GridBagConstraints constraints = new GridBagConstraints();
       
    
    public JFrame getFrame()
    {
        return frame;
    }
    public void setJFrame(JFrame f)
    {
        this.frame = f;
    }
    
    public GridBagConstraints getConstraints()
    {
        return this.constraints;
    }
    
    public void setConstraints(GridBagConstraints c)
    {
        this.constraints = c;
    }
    
    public JFrame makeFrame()
    {
        frame.setTitle("Calculator");
        frame.setBounds(100, 100, 220, 260);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return this.frame;
    }
}
