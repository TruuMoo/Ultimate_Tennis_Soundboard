package tennis_soundboard;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI implements ActionListener{

    private String ButtonChoice;
    public String mp3Choice;
    SoundHandler sounds = new SoundHandler();
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    GUI(int height, int width) {


        frame.setTitle("Tennis Soundboard");
        frame.setResizable(false);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(3, 3));
        try {
            frame.setIconImage(ImageIO.read(new File("res/icon.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    JButton[] btnArr = new JButton[] {
            new JButton("Angle Volley"),
            new JButton("Bam!"),
            new JButton("Bombs Away!"),
            new JButton("Excellent Forehand!"),
            new JButton("Excellent Volley"),
            new JButton("Good Tennis!"),
            new JButton("Move Up"),
            new JButton("Wow!"),
            new JButton("Oh My Goodness!"),
            new JButton("Drop Shot"),
            new JButton("The KILLER SHOT"),
            new JButton("To The Bars")
    };
    
    public void addElements() {

        for (JButton jButton : btnArr) {
            jButton.setFocusPainted(false);
            jButton.setContentAreaFilled(false);
            frame.add(jButton);
            jButton.addActionListener(this);
        }

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
