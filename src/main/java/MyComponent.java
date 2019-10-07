import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Image image = new ImageIcon("batman.jpg").getImage();
        JLabel jLabel = new JLabel();

        g2.drawImage(image, 10, 10, 450, 300, null);

       // g2.drawImage(image, 220, 50, null);
    }
}
