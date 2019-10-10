import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Image image = new ImageIcon("ok.jpg").getImage();
        g2.drawImage(image, 10, 10, 100, 100, null);



    }


}
