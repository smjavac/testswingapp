import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SimpleWindow extends JFrame {

    private int total;


    private int x;
    private int y;
    private int scope;
    private JTextField jTextField;
    private JLabel jLabel;

    SimpleWindow(int total) {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JFXPanel panel = new JFXPanel();
        panel.setLayout(null);
        this.total = total;

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
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setSize(250, 150);
        setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 600, 400);
    }

    void update() {

        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        String labelText = x + " * " + y;
        jLabel.setText(labelText);
    }


    void check(String text) {

        int a = Integer.parseInt(text);
        Icon icon;
        if (a == x * y) {
            scope++;
            if (scope <= total) {
                icon = new ImageIcon("ok.jpg");
                playSound("ok.wav");
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
             try {
                File f = new File("error2.mp3");
                Media hit = new Media(f.toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(hit);
                mediaPlayer.play();
            } catch(Exception ex) {
                ex.printStackTrace();
                System.out.println("Exception: " + ex.getMessage());
            }
          //  playSound("wrong.wav");
            JOptionPane.showMessageDialog(new JFrame(), "Попробуй еще раз!", "Не правильно!", 0, icon);
            jTextField.setText("");
            jTextField.grabFocus();
        }
    }

    void playSound(String path) {
        try (AudioInputStream inAudio = AudioSystem.getAudioInputStream(new File(path))){
            Clip clip = AudioSystem.getClip();
            clip.open(inAudio);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Thread() {
            public void run() {
                SimpleWindow myWindow = new SimpleWindow(1);
                myWindow.setVisible(true);
                myWindow.update();
            }
        });
    }
}



