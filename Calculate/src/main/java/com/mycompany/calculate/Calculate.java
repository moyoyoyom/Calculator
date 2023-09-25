/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculate;

/**
 *
 * @author moyak
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Calculate implements ActionListener
{
    static JTextField screen = new JTextField();
    static Button equal = new Button("=");
    static Button add = new Button("+");
    static Button sub = new Button("-");
    static Button mult = new Button("*");
    static Button div = new Button("/");
    static Button dec = new Button(".");
    static Button back = new Button("<");
    static Button zero = new Button("0");
    static Button one = new Button("1");
    static Button two = new Button("2");
    static Button three = new Button("3");
    static Button four = new Button("4");
    static Button five = new Button("5");
    static Button six = new Button("6");
    static Button seven = new Button("7");
    static Button eight = new Button("8");
    static Button nine = new Button("9");
    static ArrayList<Double> enteredNum = new ArrayList<>();
    static String pressed = "";
    static double num1;
    static int func;
    static double answer;
        
    public static void main(String[] args) 
    {
        //making the calculator frame and adding GridBagConstraints to it
        Frame calculator = new Frame();
        calculator.makeFrame();
        JPanel calcPanel = new JPanel();
        calcPanel.setLayout(new GridLayout(4, 4, 0, 0));
        
        equal.makeButton("=");
        add.makeButton("+");
        sub.makeButton("-");
        mult.makeButton("*");
        div.makeButton("/");
        dec.makeButton(".");
        back.makeButton("<");
        zero.makeButton("0");
        one.makeButton("1");
        two.makeButton("2");
        three.makeButton("3");
        four.makeButton("4");
        five.makeButton("5");
        six.makeButton("6");
        seven.makeButton("7");
        eight.makeButton("8");
        nine.makeButton("9");
        
        calcPanel.add(zero.getButton());
        calcPanel.add(one.getButton());
        calcPanel.add(two.getButton());
        calcPanel.add(three.getButton());
        calcPanel.add(four.getButton());
        calcPanel.add(five.getButton());
        calcPanel.add(six.getButton());
        calcPanel.add(seven.getButton());
        calcPanel.add(eight.getButton());
        calcPanel.add(nine.getButton());
        calcPanel.add(add.getButton());
        calcPanel.add(sub.getButton());
        calcPanel.add(mult.getButton());
        calcPanel.add(div.getButton());
        calcPanel.add(dec.getButton());
        calcPanel.add(equal.getButton());
        calcPanel.add(back.getButton());
        
        add.getButton().addActionListener(add);
        sub.getButton().addActionListener(sub);
        mult.getButton().addActionListener(mult);
        div.getButton().addActionListener(div);
        dec.getButton().addActionListener(dec);
        back.getButton().addActionListener(back);
        zero.getButton().addActionListener(zero);
        one.getButton().addActionListener(one);
        two.getButton().addActionListener(two);
        three.getButton().addActionListener(three);
        four.getButton().addActionListener(four);        
        five.getButton().addActionListener(five);
        six.getButton().addActionListener(six);
        seven.getButton().addActionListener(seven);
        eight.getButton().addActionListener(eight);
        nine.getButton().addActionListener(nine);
        equal.getButton().addActionListener(equal);
        
        //making the frame visible
        screen.setColumns(25);
        screen.setEditable(false);
        calculator.getFrame().getContentPane().setLayout(new BorderLayout(0, 0));
        calculator.getFrame().getContentPane().add(calcPanel, BorderLayout.CENTER);
        calculator.getFrame().getContentPane().add(screen, BorderLayout.NORTH);
        calculator.getFrame().setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        double num2 = 0;
        String temp = screen.getText();
        if (ae.getSource() == add.getButton())
        {
            num1 = Double.parseDouble(temp);
            pressed = "";
            func = 0;
        }
        else if(ae.getSource() == sub.getButton())
        {
            num1 = Double.parseDouble(temp);
            pressed = "";
            func = 1;
        }
        else if(ae.getSource() == mult.getButton())
        {
            num1 = Double.parseDouble(temp);
            pressed = "";
            func = 2;            
        }
        else if(ae.getSource() == div.getButton())
        {
            num1 = Double.parseDouble(temp);
            pressed = "";
            func = 3;
        }
        else if(ae.getSource() == dec.getButton())
        {pressed = pressed + ".";}
        else if(ae.getSource() == back.getButton())
        {pressed = pressed.substring(0, pressed.length() - 1);}
        else if(ae.getSource() == zero.getButton())
        {pressed = pressed + "0";}
        else if(ae.getSource() == one.getButton())
        {pressed = pressed + "1";}
        else if(ae.getSource() == two.getButton())
        {pressed = pressed + "2";}
        else if(ae.getSource() == three.getButton())
        {pressed = pressed + "3";}
        else if(ae.getSource() == four.getButton())
        {pressed = pressed + "4";}
        else if(ae.getSource() == five.getButton())
        {pressed = pressed + "5";}
        else if(ae.getSource() == six.getButton())
        {pressed = pressed + "6";}
        else if(ae.getSource() == seven.getButton())
        {pressed = pressed + "7";}
        else if(ae.getSource() == eight.getButton())
        {pressed = pressed + "8";}
        else if(ae.getSource() == nine.getButton())
        {pressed = pressed + "9";}
        else if (ae.getSource() == equal.getButton())
        {
            num2 = Double.parseDouble(temp);
            switch (func) {
                case 0:
                    answer = num1 + num2;
                    break;
                case 1:
                    answer = num1 - num2;
                    break;
                case 2:
                    answer = num1 * num2;
                    break;
                case 3:
                    answer = num1 / num2;
                    break;
                default:
                    break;
            }
            String answerString = Double.toString(answer);
            pressed = answerString;
        }
        
        screen.setText(pressed);        
    }
}
