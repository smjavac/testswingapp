
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson {
   static private int total;
   static private int x;
   static private int y;
   static private int scope;
    //static private String labelText;
    static String text;
    private  static JTextField jTextField;
    private static JLabel jLabel = new JLabel();
    static JFrame jFrame;

    public Lesson(int total){
        this.total = total;
    }

    public static void main(String[] args) {
        new Lesson(1);
        update();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        JButton button = new JButton("refresh");
        button.setSize(100,30);
        button.setLocation(430,300);
        JLabel gImage = new JLabel(new ImageIcon("batman.jpg"));
        gImage.setSize(400,450);
        gImage.setLocation(0,-50);
        jTextField = new JTextField();
        jTextField.setSize(100,30);
        jTextField.setLocation(430,100);
      // text = jTextField.getText();

        //jLabel.setText(labelText);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                check(jTextField.getText());
            }
        });



        jLabel.setSize(100,50);
        jLabel.setLocation(430,10);
        jFrame = getFrame();

        jPanel.add(button);
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

    static void update() {
        x  = (int) (Math.random() * 10);
        y =  (int) (Math.random() * 10);
        String labelText = x + " * " +  y;
        jLabel.setText(labelText);
    }

    static void check(String text){
        int a = Integer.parseInt(text);
        if (a == x * y){
            scope ++;
            if (scope <= total){
                JOptionPane.showMessageDialog  (new JFrame(),"Ты молодец!", "Правильно!", 1);
                jTextField.setText("");
                jTextField.grabFocus();
                update();

            }
            else {
                JOptionPane.showMessageDialog  (new JFrame(),"Игра окончена!", "Конец!", 0);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        } else {
            JOptionPane.showMessageDialog  (new JFrame(),"Попробуй еще раз!", "Не правильно!", 0);
            jTextField.setText("");
            jTextField.grabFocus();
        }
    }
}
