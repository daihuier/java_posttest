/*
 * Created by JFormDesigner on Sat Mar 25 17:28:30 CST 2023
 */

package qimoxiangmu;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class managepage extends JFrame {
    public managepage(String a) {
        initComponents(a);
    }

//    private void manageset(ActionEvent e) {
//        // TODO add your code here
//    }

    private void button2() {
        // TODO add your code here
        new add_book().setVisible(true);
    }
    

    private void button3() {
        // TODO add your code here
        new del_book().setVisible(true);
    }

    private void button4(String a) {//借书
        // TODO add your code here
        new borrow_book(a).setVisible(true);
    }

    private void button5(String a) {
        // TODO add your code here
        new back_book(a).setVisible(true);
    }

    private void initComponents(String a) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label1 = new JLabel();
        label2 = new JLabel();
        panel2 = new JPanel();
        label4 = new JLabel();
        button2 = new JButton();
        panel3 = new JPanel();
        label5 = new JLabel();
        button3 = new JButton();
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
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {25, 41, 32, 23, 34, 34, 34, 34, 35, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_9"));
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
        contentPane.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText(bundle.getString("label2.text_9"));
        label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel2 ========
        {
            panel2.setLayout(new GridBagLayout());
            ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {23, 133, 0};
            ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label4 ----
            label4.setText(bundle.getString("label4.text_3"));
            label4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel2.add(label4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_7"));
            button2.setFont(new Font("\u6977\u4f53", Font.BOLD, 16));
            button2.setBorderPainted(false);
            button2.addActionListener(e -> {
			button2();
			button2();
		});
            panel2.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel2, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel3 ========
        {
            panel3.setLayout(new GridBagLayout());
            ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {23, 133, 0};
            ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label5 ----
            label5.setText(bundle.getString("label5.text_2"));
            label5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel3.add(label5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_8"));
            button3.setFont(new Font("\u6977\u4f53", Font.BOLD, 16));
            button3.setBorderPainted(false);
            button3.addActionListener(e -> {
			button3();
			button3();
		});
            panel3.add(button3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel3, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel4 ========
        {
            panel4.setLayout(new GridBagLayout());
            ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {23, 133, 0};
            ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label6 ----
            label6.setText(bundle.getString("label6.text_2"));
            label6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel4.add(label6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button4 ----
            button4.setText(bundle.getString("button4.text_2"));
            button4.setFont(new Font("\u6977\u4f53", Font.BOLD, 16));
            button4.setBorderPainted(false);
            button4.addActionListener(e -> {
			button4(a);
		});
            panel4.add(button4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel4, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
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
            label7.setText(bundle.getString("label7.text_2"));
            label7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel5.add(label7, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button5 ----
            button5.setText(bundle.getString("button5.text_2"));
            button5.setFont(new Font("\u6977\u4f53", Font.BOLD, 16));
            button5.setBorderPainted(false);
            button5.addActionListener(e -> button5(a));
            panel5.add(button5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel5, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JPanel panel2;
    private JLabel label4;
    private JButton button2;
    private JPanel panel3;
    private JLabel label5;
    private JButton button3;
    private JPanel panel4;
    private JLabel label6;
    private JButton button4;
    private JPanel panel5;
    private JLabel label7;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
