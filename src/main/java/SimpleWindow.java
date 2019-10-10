import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {

    SimpleWindow(){
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton button = new JButton("Кнопка");
        button.setSize(80, 30);
        button.setLocation(20,20);
        panel.add(button);
        button = new JButton("Кнопка с длинной надписью");
        button.setSize(120, 40);
        button.setLocation(70,50);
        JLabel jImage = new JLabel(new ImageIcon("batman.jpg"));
        jImage.setSize(300,150);
        jImage.setLocation(150,100);
        panel.add(button);
        panel.add(jImage);
        setContentPane(panel);
        setSize(250, 150);
        setBounds(500,500,750,400);

    }

}

