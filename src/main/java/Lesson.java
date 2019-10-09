
import javax.swing.*;
import java.awt.*;

public class Lesson {
    public static void main(String[] args) {

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        JButton button = new JButton("refresh");
        button.setSize(100,30);
        button.setLocation(430,300);
        JLabel gImage = new JLabel(new ImageIcon("batman.jpg"));
        gImage.setSize(400,450);
        gImage.setLocation(0,-50);
        JTextField jTextField = new JTextField();
        jTextField.setSize(100,30);
        jTextField.setLocation(430,100);
        JLabel jLabel = new JLabel("2 * 5");
        jLabel.setSize(100,50);
        jLabel.setLocation(430,10);
        JFrame jFrame = getFrame();

        jPanel.add(button);
      //  jPanel.add(button2);
        jPanel.add(jLabel);
        jPanel.add(gImage);
        jPanel.add(jTextField);
        jFrame.add(jPanel);

//        JFrame myWindow = new SimpleWindow();
//        myWindow.setVisible(true);

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-150, 600, 400);
        return jFrame;
    }
}
