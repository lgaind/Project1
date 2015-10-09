import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Laurenz Gaind on 09.10.2015.
 */
public class Menu {
    public static void main(String[] args){

        //Create Frame
        JFrame menu = new JFrame("Project1");

        //Create Panel
        JLayeredPane menupanel = new JLayeredPane();

        //Create TextField
        JTextField namefield = new JTextField("Name");

        //Create Button
        JButton startbutton = new JButton("Start Game");

        //Frame
        menu.setSize(800, 600);
        menu.add(menupanel);

        //Panel
        menupanel.add(namefield);
        menupanel.add(startbutton);

        //Visible
        menu.setVisible(true);

        //TextField
        namefield.setBounds(300, 200, 200, 30);

        //Button
        startbutton.setBounds(300, 300, 200, 50);
        startbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Project1 p1 = new Project1();
                p1.startgame(namefield.getText());
            }
        });

    }
}
