/*
 * Created by JFormDesigner on Thu Mar 23 16:49:53 CST 2023
 */

package test;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class test_readtext extends JFrame {
    public test_readtext() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        String sql="select * from studen where student_Acount= ?and student_password=? ";//
        PreparedStatement stmt = null;
        try {
            stmt = database_conext.getConnection().prepareStatement(sql);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
       String text = textField1.getText();
        char[] password = passwordField1.getPassword();
        String passwordStr = new String(password);

        try {
            stmt.setString(1,text);
            stmt.setString(2,passwordStr);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        ResultSet rs=null;
        try {
            rs=stmt.executeQuery();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        while (true) {
            try {
                if (rs.next())
                {
                    JOptionPane.showMessageDialog(null, "登录成功");
                    break;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "登录失败，请重新输入");
                    break;
                }

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }




                }

        try {
            rs.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {

            stmt.clearParameters();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        textField1 = new JTextField();
        button1 = new JButton();
        passwordField1 = new JPasswordField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 198, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        contentPane.add(textField1, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- button1 ----
        button1.setText(bundle.getString("button1.text_3"));
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        contentPane.add(passwordField1, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField textField1;
    private JButton button1;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
