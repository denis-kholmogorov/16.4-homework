import javax.swing.*;
import java.awt.*;

public class GUIExample
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);

        /*frame.setLayout(new FlowLayout());
        frame.add(new JButton("Нажми"));*/

        frame.add(new MainForm().getMainPanel());



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}
