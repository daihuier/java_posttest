/*
 * Created by JFormDesigner on Sat Mar 25 18:19:03 CST 2023
 */

package qimoxiangmu;

import test.database_conext;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class register extends JFrame {
    public register() {
        initComponents();
    }

    private void button1() throws SQLException {
        // TODO add your code here
        String student_scno=textField1.getText();
        String student_sname=textField2.getText();
        String student_sex=textField3.getText();
        String student_Acount=textField4.getText();
       // String student_password=passwordField1.getText();
      //  String confirm_student_password=passwordField2.getText();//确认密码
        String sql="select *from studen where student_scno=?";
        char[] password = passwordField1.getPassword();
        String student_password = new String(password);
        char[] password2 = passwordField1.getPassword();
        String confirm_student_password = new String(password2);
        if (!student_password.equals(confirm_student_password)) {
            return;
        }
        PreparedStatement stmt = null;
        stmt = database_conext.getConnection().prepareStatement(sql);
        String text = textField1.getText();
        stmt.setString(1,student_scno);
        ResultSet rs=null;
        rs=stmt.executeQuery();
        while (true) {
            if (rs.next())
               {
                    JOptionPane.showMessageDialog(null, "已经注册，不能再次注册");
                    break;
                }
                else
                { String sql2="insert into studen() values (?,?,?,0,?,?)";
                    PreparedStatement stmt2 = null;
                    stmt2 = database_conext.getConnection().prepareStatement(sql2);
                    stmt2.setString(1,student_scno);
                    stmt2.setString(2,student_sname);
                    stmt2.setString(3,student_sex);
                    stmt2.setString(4,student_Acount);
                    stmt2.setString(5,student_password);
                   // stmt2.setInt(6,book_sum);
                        int result2 = stmt2.executeUpdate();
                        if (result2==1)
                            JOptionPane.showMessageDialog(null, "注册成功");
                        else
                            JOptionPane.showMessageDialog(null, "注册失败");
                        stmt2.close();
                        break;
                    }
                }


            rs.close();
        stmt.close();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        label6 = new JLabel();
        passwordField2 = new JPasswordField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {83, 0, 209, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {23, 0, 21, 0, 20, 0, 15, 0, 20, 0, 22, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_11"));
        contentPane.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText(bundle.getString("label2.text_11"));
        contentPane.add(label2, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField2, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText(bundle.getString("label3.text_6"));
        contentPane.add(label3, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField3, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText(bundle.getString("label4.text_4"));
        contentPane.add(label4, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField4, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText(bundle.getString("label5.text_3"));
        contentPane.add(label5, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(passwordField1, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label6 ----
        label6.setText(bundle.getString("label6.text_4"));
        contentPane.add(label6, new GridBagConstraints(1, 11, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(passwordField2, new GridBagConstraints(2, 11, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText(bundle.getString("button1.text_9"));
        button1.addActionListener(e -> {
            try {
                button1();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        contentPane.add(button1, new GridBagConstraints(3, 13, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JLabel label6;
    private JPasswordField passwordField2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
