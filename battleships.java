import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class menu  {
    JFrame mainMenu;
    menu(){
        mainMenu=new JFrame();
        JButton play = new JButton("Start Game");
        play.setBounds(130,50,100, 40);

        JButton exit = new JButton("Quit Game");
        exit.setBounds(130,100,100, 40);

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainMenu.add(play);
        mainMenu.add(exit);

        mainMenu.setSize(400,500);//400 width and 500 height
        mainMenu.setLayout(null);//using no layout managers
        mainMenu.setVisible(true);//making the frame visible
    }

}
public class Main {
    public static void main(String[] args) {

        new menu();
    }
}
