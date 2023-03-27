/*
 * Created by JFormDesigner on Fri Mar 24 18:25:44 CST 2023
 */

package qimoxiangmu;

import test.database_conext;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class del_manage extends JFrame {
    public del_manage() {
        initComponents();
    }

    private void yesdel() throws SQLException {
        // TODO add your code here
        String sql="UPDATE studen set student_power=0 where student_scno= ?";
        PreparedStatement stmt = null;
        stmt = database_conext.getConnection().prepareStatement(sql);
        String text = textField1.getText();
        stmt.setString(1,text);
        int result = stmt.executeUpdate();
        if (result==1)
            JOptionPane.showMessageDialog(null, "修改成功");
        else
            JOptionPane.showMessageDialog(null, "修改失败");
        stmt.close();
    }

    private void button3() {
        // TODO add your code here
        this.dispose();
        new manage_set().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label2 = new JLabel();
        textField1 = new JTextField();
        label1 = new JLabel();
        panel1 = new JPanel();
        yesdel = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {60, 105, 211, 116, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {30, 22, 0, 36, 38, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label2 ----
        label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        label2.setText(bundle.getString("label2.text_6"));
        contentPane.add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(label1, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 36, 76, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- yesdel ----
            yesdel.setText(bundle.getString("yesdel.text_4"));
            yesdel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
            yesdel.addActionListener(e -> {
                try {
                    yesdel();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            });
            panel1.add(yesdel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_6"));
            button3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
            button3.addActionListener(e -> button3());
            panel1.add(button3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label2;
    private JTextField textField1;
    private JLabel label1;
    private JPanel panel1;
    private JButton yesdel;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
