/*
 * Created by JFormDesigner on Thu Mar 23 16:42:12 CST 2023
 */

package test;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;

/**
 * @author 86155
 */
public class test_button extends JFrame {
    private static Connection conn;
    public test_button() throws SQLException {
        database_conext.getConnection();
        this.conn= database_conext.conn;
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        Statement stmt= null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        ResultSet rs=null;
        String sql="select student_sname from studen where student_scno=2021405214";
        try {
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


        while (true)
        {
            try {
                if (!rs.next()) break;
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            try {
                JOptionPane.showMessageDialog(null, rs.getString("student_sname"));
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
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- button1 ----
        button1.setText(bundle.getString("button1.text_2"));
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1, new GridBagConstraints(6, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
