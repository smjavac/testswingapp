
import javax.swing.*;
import java.awt.*;

public class Lesson {
    public static void main(String[] args) {
        MyComponent myComponent = new MyComponent();
      //  Button button = new Button("refresh");
      //  JLabel gImage = new JLabel(new ImageIcon("batman.jpg"));


        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
     //   jPanel.add(new Button("button"));
     //   jPanel.add(gImage);
        jFrame.add(jPanel);
       // jFrame.add(button);
        jFrame.add(myComponent);

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-150, 750, 400);
        return jFrame;
    }
}
