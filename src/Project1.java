/**
 * Created by Laurenz Gaind on 09.10.2015.
 */
import java.awt.event.ActionListener;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Project1 {
    static void startgame(String name) {

        //Create and Start Thread
        Thread worker = new Thread() {
            public void run() {
                //Create Frame
                JFrame frame = new JFrame("Project1");

                //Create Panel
                JLayeredPane panel = new JLayeredPane();

                //Create Button
                JButton button = new JButton(name);

                //Frame
                frame.setSize(800, 600);
                frame.add(panel);

                //Panel
                panel.add(button);

                //Visible
                frame.setVisible(true);

                //Button
                button.setBounds(300, 200, 200, 200);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });

                //Mouse Control
                int i = 1;
                while(i == 1) {
                    if(MouseInfo.getPointerInfo().getLocation().x > button.getX() + 200) {
                        button.setLocation(button.getX() + 1, button.getY());
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(MouseInfo.getPointerInfo().getLocation().y > button.getY() + 240) {
                        button.setLocation(button.getX(), button.getY() + 1);
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(MouseInfo.getPointerInfo().getLocation().x < button.getX() + 10) {
                        button.setLocation(button.getX() - 1, button.getY());
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(MouseInfo.getPointerInfo().getLocation().y < button.getY() + 60) {
                        button.setLocation(button.getX(), button.getY() - 1);
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        worker.start();

    }
}
