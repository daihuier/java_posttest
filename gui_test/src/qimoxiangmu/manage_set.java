/*
 * Created by JFormDesigner on Fri Mar 24 11:52:26 CST 2023
 */

package qimoxiangmu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class manage_set extends JFrame  {
    public manage_set() {

        initComponents();
    }

    private void addmanage(ActionEvent e) {
        this.dispose();
        // TODO add your code here
        new add_manage().setVisible(true);
    }

    private void delete_manage(ActionEvent e) {
        // TODO add your code here
        this.dispose();
        new del_manage().setVisible(true);
    }

    private void button3() {//返回bosspage
        // TODO add your code here
        new theBossPage(a).setVisible(true);
    }

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        addmanage = new JButton();
        panel2 = new JPanel();
        label3 = new JLabel();
        delete_manage = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {68, 302, 68, 11, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {26, 33, 51, 37, 44, 37, 40, 29, 12, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_3"));
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        contentPane.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {27, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_3"));
            label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            panel1.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- addmanage ----
            addmanage.setText(bundle.getString("addmanage.text_4"));
            addmanage.setFont(new Font("\u6977\u4f53", Font.BOLD, 20));
            addmanage.addActionListener(e -> addmanage(e));
            panel1.add(addmanage, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.NONE,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel2 ========
        {
            panel2.setLayout(new GridBagLayout());
            ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0, 0};
            ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- label3 ----
            label3.setText(bundle.getString("label3.text_3"));
            label3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
            panel2.add(label3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- delete_manage ----
            delete_manage.setText(bundle.getString("delete_manage.text_3"));
            delete_manage.setFont(new Font("\u6977\u4f53", Font.BOLD, 20));
            delete_manage.addActionListener(e -> delete_manage(e));
            panel2.add(delete_manage, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel2, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button3 ----
        button3.setText(bundle.getString("button3.text_3"));
        button3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        button3.addActionListener(e -> button3());
        contentPane.add(button3, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JButton addmanage;
    private JPanel panel2;
    private JLabel label3;
    private JButton delete_manage;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
