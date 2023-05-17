/*
 * Created by JFormDesigner on Wed May 17 21:52:33 CST 2023
 */

package qimoxiangmu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author 86155
 */
public class themain extends JFrame {
    public themain() {
        initComponents();
    }

    private void button2(ActionEvent e) {
        // TODO add your code here
    }

    private void button3() {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label3 = new JLabel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        panel1 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setMaximumSize(null);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {70, 0, 287, 90, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 26, 0, 0, 29, 0, 25, 25, 27, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label3 ----
        label3.setText(bundle.getString("label3.text_7"));
        label3.setFont(new Font("\u6977\u4f53", Font.BOLD, 24));
        contentPane.add(label3, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_12"));
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        contentPane.add(label1, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- textField1 ----
        textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(textField1, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- label2 ----
        label2.setText(bundle.getString("label2.text_12"));
        label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        contentPane.add(label2, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        contentPane.add(passwordField1, new GridBagConstraints(2, 5, 1, 1, 20.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 60, 0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_8"));
            button2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            button2.addActionListener(e -> button2(e));
            panel1.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_9"));
            button3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            button3.addActionListener(e -> button3());
            panel1.add(button3, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(2, 7, 1, 2, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label3;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
