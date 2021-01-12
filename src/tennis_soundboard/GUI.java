package tennis_soundboard;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI implements ActionListener{
    
    private final JButton button1 = new JButton("Angle Volley");
    private final JButton button2 = new JButton("Bam!");
    private final JButton button3 = new JButton("Bombs Away!");
    private final JButton button4 = new JButton("Excellent Forehand!");
    private final JButton button5 = new JButton("Excellent Volley");
    private final JButton button6 = new JButton("Good Tennis!");
    private final JButton button7 = new JButton("Move Up");
    private final JButton button8 = new JButton("Wow!");
    private final JButton button9 = new JButton("Oh My Goodness!");
    private final JButton button10 = new JButton("Drop Shot");
    private final JButton button11 = new JButton("The KILLER SHOT");
    private final JButton button12 = new JButton("To The Bars");
    
    private String ButtonChoice;
    public String mp3Choice;
    SoundHandler sounds = new SoundHandler();
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    GUI(int height, int width) throws IOException {
        
        frame.setTitle("Tennis Soundboard");
        frame.setResizable(false);
        frame.setSize(height,width);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(3, 3));
        frame.setIconImage(ImageIO.read(new File("res/icon.png")));

    }
    
    public void addElements() {
        button1.setFocusPainted(false);
        button1.setContentAreaFilled(false);
        
        button2.setFocusPainted(false);
        button2.setContentAreaFilled(false);
        
        
        button3.setFocusPainted(false);
        button3.setContentAreaFilled(false);
        
        button4.setFocusPainted(false);
        button4.setContentAreaFilled(false);
        
        button5.setFocusPainted(false);
        button5.setContentAreaFilled(false);
        
        button6.setFocusPainted(false);
        button6.setContentAreaFilled(false);
        
        button7.setFocusPainted(false);
        button7.setContentAreaFilled(false);
        
        button8.setFocusPainted(false);
        button8.setContentAreaFilled(false);
        
        button9.setFocusPainted(false);
        button9.setContentAreaFilled(false);
        
        button10.setFocusPainted(false);
        button10.setContentAreaFilled(false);
        
        button11.setFocusPainted(false);
        button11.setContentAreaFilled(false);
        
        button12.setFocusPainted(false);
        button12.setContentAreaFilled(false);
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        
        frame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) throws UnsupportedOperationException {
        ButtonChoice = e.getActionCommand();
        System.out.println(ButtonChoice);
        switch(ButtonChoice) {
            case "Angle Volley":
                mp3Choice = "AngleVolley"; break;
            case "Bam!":
                mp3Choice = "Bam"; break;
            case "Bombs Away!":
                mp3Choice = "BombsAway"; break;
            case "Excellent Forehand!":
                mp3Choice = "ExcellentForehand"; break;
            case "Excellent Volley":
                mp3Choice = "ExcellentVolley"; break;
            case "Good Tennis!":
                mp3Choice = "GoodTennis"; break;
            case "Move Up":
                mp3Choice = "MoveUp"; break;
            case "Wow!":
                mp3Choice = "Wow"; break;
            case "Oh My Goodness!":
                mp3Choice = "ohMYGOODNESS"; break;
            case "Drop Shot":
                mp3Choice = "theDropShot"; break;
            case "The KILLER SHOT":
                mp3Choice = "theKillerShot"; break;
            case "To The Bars":
                mp3Choice = "toTheBars"; break;
        }
        sounds.playSound(mp3Choice);
    }
    
}
