import java.awt.Color;

import javax.swing.*;

public class javaSwing {
    public JFrame jFrame;

    // public class JColorChooser extends Jcomponent implements accessible;
    public javaSwing() {

        // JColorChooser jColorChooser=new JColorChooser();

        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setSize(450, 260);
        jFrame.setBackground(Color.BLUE);
        jFrame.setVisible(true);

        JButton jButton1 = new JButton("Motivational");
        jButton1.setBounds(285, 156, 150, 20); // position 0f motivational box
        jFrame.add(jButton1);

        JButton jButton2 = new JButton("Korean");
        jButton2.setBounds(131,156, 150, 20);
        jFrame.add(jButton2);

        JButton jButton3 = new JButton("Classic");
        jButton3.setBounds(285, 132, 150, 20);
        jFrame.add(jButton3);

        JButton jButton4 = new JButton("Punjabi");
        jButton4.setBounds(131, 132, 150, 20);
        jFrame.add(jButton4);

        JButton jButton5 = new JButton("Romantic");
        jButton5.setBounds(285, 108, 150, 20);
        jFrame.add(jButton5);

        JButton jButton6 = new JButton("Hindi");
        jButton6.setBounds(131, 108, 150, 20);
        jFrame.add(jButton6);

        JButton jButton7 = new JButton("Pop");
        jButton7.setBounds(285, 84, 150, 20);
        jFrame.add(jButton7);

        JButton jButton8 = new JButton("English");
        jButton8.setBounds(131, 84, 150, 20);
        jFrame.add(jButton8);

        JTextField jTextField = new JTextField("🔍Search bar");
        jTextField.setBounds(128, 7, 310, 15);
        jTextField.setBorder(null);
        jFrame.add(jTextField);

        JLabel jLabel = new JLabel("Home");
        jLabel.setBounds(16, 24, 98, 20);
        jFrame.add(jLabel);

        JLabel jLabel1 = new JLabel("Liked Songs");
        jLabel1.setBounds(16, 44, 98, 20);
        jFrame.add(jLabel1);

        JLabel jLabel2 = new JLabel("Playlists");
        jLabel2.setBounds(16,64,98,20);
        jFrame.add(jLabel2);



    }

    public static void main(String[] args) {
        javaSwing ns = new javaSwing();
    }

}
