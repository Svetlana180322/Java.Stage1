/**
  * Java level 1. Homework - 8
  *
  *@author Svetlana Budzinskaia
  *@version 21.04.2022
  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
  
public class App extends JFrame {
    
    int counter = 0;
    
    public App() {
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        
        Font font = new Font("Arrial", Font.BOLD, 30);
        
        JTextField counterText = new JTextField("GENERATOR");
        add(counterText, BorderLayout.CENTER);
        counterText.setFont(font);
        counterText.setHorizontalAlignment(0);
        
        counterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterText.setText(generateData());
            }
        });
        
        setVisible(true);
    }
    public static void main(String[] args) {
        App app = new App();
        System.out.println(15);
    }
    
    public String generateData() {
        Random random = new Random();
        return "8999" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
    }
}
