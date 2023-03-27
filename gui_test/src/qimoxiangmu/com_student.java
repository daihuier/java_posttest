/*
 * Created by JFormDesigner on Sat Mar 25 18:10:32 CST 2023
 */

package qimoxiangmu;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class com_student extends JFrame {
    public com_student(String a) {
        initComponents(a);
    }

    private void button4(String a) {//借书
        // TODO add your code here
        new borrow_book(a).setVisible(true);

    }

    private void button5(String a) {//还书
        // TODO add your code here
        new back_book(a).setVisible(true);
    }

    private void initComponents(String a) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label1 = new JLabel();
        label2 = new JLabel();
        panel4 = new JPanel();
        label6 = new JLabel();
        button4 = new JButton();
        panel5 = new JPanel();
        label7 = new JLabel();
        button5 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {93, 439, 72, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {25, 41, 32, 23, 34, 34, 35, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_10"));
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
        contentPane.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText(bundle.getString("label2.text_10"));
        label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel4 ========
        {
            panel4.setLayout(new GridBagLayout());
            ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {23, 133, 0};
            ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label6 ----
            label6.setText(bundle.getString("label6.text_3"));
            label6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel4.add(label6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button4 ----
            button4.setText(bundle.getString("button4.text_3"));
            button4.setFont(new Font("\u6977\u4f53", Font.BOLD, 16));
            button4.setBorderPainted(false);
            button4.addActionListener(e -> button4(a));
            panel4.add(button4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel4, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel5 ========
        {
            panel5.setLayout(new GridBagLayout());
            ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {23, 133, 0};
            ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label7 ----
            label7.setText(bundle.getString("label7.text_3"));
            label7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel5.add(label7, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button5 ----
            button5.setText(bundle.getString("button5.text_3"));
            button5.setFont(new Font("\u6977\u4f53", Font.BOLD, 16));
            button5.setBorderPainted(false);
            button5.addActionListener(e -> button5(a));
            panel5.add(button5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel5, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JPanel panel4;
    private JLabel label6;
    private JButton button4;
    private JPanel panel5;
    private JLabel label7;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
