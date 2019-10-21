
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson {
   static private int total;
//   static private int x;
//   static private int y;
//   static private int scope;
//    //static private String labelText;
//    static String text;
//    private  static JTextField jTextField;
//    private static JLabel jLabel = new JLabel();
//    static JFrame jFrame;
//    static Icon icon;
//
    public Lesson(int total){
        this.total = total;
    }

    public static void main(String[] args) {
//        new Lesson(1);
//        update();
//        JPanel jPanel = new JPanel();
//        jPanel.setLayout(null);
//        JButton button = new JButton("refresh");
//        button.setSize(100,30);
//        button.setLocation(430,300);
//        JLabel gImage = new JLabel(new ImageIcon("batman.jpg"));
//        gImage.setSize(400,450);
//        gImage.setLocation(0,-50);
//        jTextField = new JTextField();
//        jTextField.setSize(100,30);
//        jTextField.setLocation(430,100);
//
//
//
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
//                check(jTextField.getText());
//            }
//        });
//
//
//
//        jLabel.setSize(100,50);
//        jLabel.setLocation(430,10);
//        jFrame = getFrame();
//
//        jPanel.add(button);
//        jPanel.add(jLabel);
//        jPanel.add(gImage);
//        jPanel.add(jTextField);
//        jFrame.add(jPanel);



        SimpleWindow myWindow = new SimpleWindow(1);
        myWindow.setVisible(true);
        myWindow.update();
    }

//    static JFrame getFrame() {
//        JFrame jFrame = new JFrame(){};
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setVisible(true);
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        jFrame.setBounds(dimension.width/2-250, dimension.height/2-150, 600, 400);
//        return jFrame;
//    }

//    static void update() {
//        x  = (int) (Math.random() * 10);
//        y =  (int) (Math.random() * 10);
//        String labelText = x + " * " +  y;
//        jLabel.setText(labelText);
//    }
//
//    static void check(String text){
//        int a = Integer.parseInt(text);
//        if (a == x * y){
//            scope ++;
//            if (scope <= total){
//                icon = new ImageIcon("ok.jpg");
//                JOptionPane.showMessageDialog  (new JFrame(),"Ты молодец!", "", 1, icon);
//                jTextField.setText("");
//                jTextField.grabFocus();
//                update();
//
//            }
//            else {
//                icon = new ImageIcon("end.jpg");
//               int result = JOptionPane.showConfirmDialog (new JFrame(), "Еще одну битву?",
//                       "Конец битвы!", JOptionPane.YES_NO_OPTION, 2, icon);
//               if (result == JOptionPane.YES_OPTION){
//                   jTextField.setText("");
//                   jTextField.grabFocus();
//                   scope = 0;
//                   update();
//               } else {
//                  jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                  jFrame.dispose();
//                  System.exit(0);
//               }
//            }
//        } else {
//            icon = new ImageIcon("wrong2.jpg");
//            JOptionPane.showMessageDialog  (new JFrame(),"Попробуй еще раз!", "Не правильно!", 0, icon);
//            jTextField.setText("");
//            jTextField.grabFocus();
//        }
//    }
}
