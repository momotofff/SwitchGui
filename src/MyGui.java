import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class MyGui extends JLabel
{
    public static void createGui()
    {
        JFrame frame = new JFrame("Название окна Test JFrame");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setPreferredSize(new Dimension(640,480));
        frame.pack();
        frame.setVisible(true);

        JLabel label = new JLabel("Текст в окне Test JLable");
        label.setHorizontalAlignment(CENTER);
        frame.getContentPane().add(label);


    }

    public void windowClosing(WindowEvent event)
    {
        JOptionPane exitPanel = new JOptionPane();
        String[] yesNo = {"YES", "NO"};

        System.exit(0);
    }

    public static void main(String[]args)
    {
        createGui();
    }
}
