import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow extends JFrame {
    private static int total;
    private static int x;
    private static int y;
    private static int scope;
    private static JTextField jTextField;
    private static JLabel jLabel;

    SimpleWindow(int total) {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        SimpleWindow.total = total;

        JButton button = new JButton("refresh");
        button.setSize(100, 30);
        button.setLocation(430, 300);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                check(jTextField.getText());
            }
        });
        JLabel jImage = new JLabel(new ImageIcon("batman.jpg"));
        jImage.setSize(400, 450);
        jImage.setLocation(0, -50);

        jTextField = new JTextField();
        jTextField.setSize(100, 30);
        jTextField.setLocation(430, 100);

        jLabel = new JLabel();
        jLabel.setSize(100, 50);
        jLabel.setLocation(430, 10);

        panel.add(jTextField);
        panel.add(button);
        panel.add(jImage);
        panel.add(jLabel);

        setContentPane(panel);
        setSize(250, 150);
        setBounds(650, 400, 600, 400);
    }

    static void update() {
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        String labelText = x + " * " + y;
        jLabel.setText(labelText);
    }

    static void check(String text) {
        int a = Integer.parseInt(text);
        Icon icon;
        if (a == x * y) {
            scope++;
            if (scope <= total) {
                icon = new ImageIcon("ok.jpg");
                JOptionPane.showMessageDialog(new JFrame(), "Ты молодец!", "", 1, icon);
                jTextField.setText("");
                jTextField.grabFocus();
                update();

            } else {
                icon = new ImageIcon("end.jpg");
                int result = JOptionPane.showConfirmDialog(new JFrame(), "Еще одну битву?",
                        "Конец битвы!", JOptionPane.YES_NO_OPTION, 2, icon);
                if (result == JOptionPane.YES_OPTION) {
                    jTextField.setText("");
                    jTextField.grabFocus();
                    scope = 0;
                    update();
                } else {
                    System.exit(0);
                }
            }
        } else {
            icon = new ImageIcon("wrong2.jpg");
            JOptionPane.showMessageDialog(new JFrame(), "Попробуй еще раз!", "Не правильно!", 0, icon);
            jTextField.setText("");
            jTextField.grabFocus();
        }
    }
}

