package qimoxiangmu;

import test.database_conext;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Mar 22 19:20:00 CST 2023
 */



/**
 * @author 86155
 */
public class themain extends JFrame {


    public themain()  {
        initComponents();
    }

    private void button2(ActionEvent e) throws SQLException {
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

                if (rs.next())
                {
                    JOptionPane.showMessageDialog(null, "登录成功");
                    if (rs.getInt("student_power")==2)//调用馆长的应用界面
                    {
                        this.dispose();//销毁当前页面
                        new theBossPage(rs.getString("student_scno")).setVisible(true);
                    }
                    else if (rs.getInt("student_power")==1)
                    {
                        this.dispose();//销毁当前页面
                        new managepage(rs.getString("student_scno")).setVisible(true);
                    }
                    else
                    {
                        this.dispose();//销毁当前页面
                        new com_student(rs.getString("student_scno")).setVisible(true);
                    }
                    break;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "登录失败，请重新输入");
                    break;
                }

        }

        try {
            rs.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {

            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void rigister_themain(ActionEvent e) {
        // TODO add your code here
    }

    private void register_themain(ActionEvent e) {
        // TODO add your code here
    }

    private void button3() {
        // TODO add your code here
        new register().setVisible(true);
    }








    private void initComponents()  {
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
        label3.setText(bundle.getString("label3.text"));
        label3.setFont(new Font("\u6977\u4f53", Font.BOLD, 24));
        contentPane.add(label3, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- label1 ----
        label1.setText(bundle.getString("label1.text"));
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
        label2.setText(bundle.getString("label2.text"));
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
            button2.setText(bundle.getString("button2.text"));
            button2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            button2.addActionListener(e -> {
                try {
                    button2(e);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            });
            panel1.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

            //---- button3 ----
            button3.setText(bundle.getString("button3.text"));
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
