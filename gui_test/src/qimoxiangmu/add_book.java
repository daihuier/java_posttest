/*
 * Created by JFormDesigner on Fri Mar 24 18:56:15 CST 2023
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
public class add_book extends JFrame {
    public add_book() {
        initComponents();
    }

    private void button1() throws SQLException {
        // TODO add your code here
        String  book_id=thenumtext.getText();
        String  book_name=booknametext.getText();
        String book_author=authortext.getText();
        String book_publish=publishtext.getText();
        int book_sum=Integer.parseInt(booksumtext.getText());
        String sql="insert into book values (?,?,?,?,?,?)";
        PreparedStatement stmt = null;
        stmt = database_conext.getConnection().prepareStatement(sql);
        stmt.setString(1,book_id);
        stmt.setString(2,book_name);
        stmt.setString(3,book_author);
        stmt.setString(4,book_publish);
        stmt.setInt(5,book_sum);
        stmt.setInt(6,book_sum);

        int result = stmt.executeUpdate();
        if (result==1)
            JOptionPane.showMessageDialog(null, "修改成功");
        else
            JOptionPane.showMessageDialog(null, "修改失败");
        stmt.close();

    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        var thenum = new JLabel();
        thenumtext = new JTextField();
        bookname = new JLabel();
        booknametext = new JTextField();
        author = new JLabel();
        authortext = new JTextField();
        pubulis = new JLabel();
        publishtext = new JTextField();
        booksum = new JLabel();
        booksumtext = new JTextField();
        panel1 = new JPanel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {101, 50, 166, 77, 29, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {32, 0, 18, 0, 18, 0, 18, 0, 18, 0, 21, 42, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- thenum ----
        thenum.setText(bundle.getString("thenum.text_4"));
        thenum.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(thenum, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(thenumtext, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- bookname ----
        bookname.setText(bundle.getString("bookname.text_4"));
        bookname.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(bookname, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(booknametext, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- author ----
        author.setText(bundle.getString("author.text_7"));
        author.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(author, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(authortext, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- pubulis ----
        pubulis.setText(bundle.getString("pubulis.text_4"));
        pubulis.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(pubulis, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(publishtext, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- booksum ----
        booksum.setText(bundle.getString("booksum.text_2"));
        booksum.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(booksum, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(booksumtext, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_4"));
            button1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            button1.addActionListener(e -> {
                try {
                    button1();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            });
            panel1.add(button1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(2, 11, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField thenumtext;
    private JLabel bookname;
    private JTextField booknametext;
    private JLabel author;
    private JTextField authortext;
    private JLabel pubulis;
    private JTextField publishtext;
    private JLabel booksum;
    private JTextField booksumtext;
    private JPanel panel1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
