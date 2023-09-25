/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculate;

/**
 *
 * @author moyak
 */
import javax.swing.*;

public class Button extends Calculate
{
    private String character;
    private JButton button = new JButton(character);
    
    public void setCharacter(String c)
    {
        this.character = c;
    }
    
    public String getCharacter()
    {
        return character;
    }
    
    public void setButton(JButton b)
    {
        this.button = b;
    }
    public JButton getButton()
    {
        return this.button;
    }
    
    public Button(String c)
    {
        this.character = c;
    }
    
    public JButton makeButton(String chara)
    {
        button = new JButton(chara);
        button.setFocusable(false);
        return this.button;
    }
    
    @Override
    public String toString()
    {
        return this.getCharacter();
    }

    public String getString()
    {
        return toString();
    }
}
