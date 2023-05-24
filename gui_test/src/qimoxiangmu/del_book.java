/*
 * Created by JFormDesigner on Fri Mar 24 20:23:06 CST 2023
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
public class del_book extends JFrame {
    public del_book() {
        initComponents();
    }

    private void button1() throws SQLException {
        // TODO add your code here
        String book_id=textField1.getText();
        String sql="select *from book where book_id=?";
       String sql2="delete from book where book_id =?";
        PreparedStatement stmt = null;
        stmt = database_conext.getConnection().prepareStatement(sql);
        stmt.setString(1,book_id);
        ResultSet rs=null;
         rs=stmt.executeQuery();
        while (true) {
            if (rs.next()) {
                if (rs.getInt("book_nowsum")!=rs.getInt("book_sum")) {
                    JOptionPane.showMessageDialog(null, "无法删除，有书本未归还");//有书本没有归还不许删除
                    break;
                }
                else
                {
                    Object[] options = {"确认删除", "取消删除"};
                    int result = JOptionPane.showOptionDialog(//弹出选择对话框
                            null,
                            "你确定要删除，书号为："+rs.getString("book_id")+" 书名为："+rs.getString("book_name")+" 作者为："+rs.getString("book_author")+" 出版社"+rs.getString("book_publish")+"的书吗？",
                            "删除书籍",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0]);//弹出一个提示框
                    if(result==0)
                    {
                        PreparedStatement stmt2 = null;
                        stmt2 = database_conext.getConnection().prepareStatement(sql2);
                        stmt2.setString(1,book_id);
                        int result2 = stmt2.executeUpdate();
                        if (result2==1)
                            JOptionPane.showMessageDialog(null, "删除成功");
                        else
                            JOptionPane.showMessageDialog(null, "删除失败");
                        stmt2.close();
                    }
                    else
                    {
                        JOptionPane.getRootFrame().dispose();
                    }
                    break;
                }


            } else {
                JOptionPane.showMessageDialog(null, "登录失败，请重新输入");
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
        panel1 = new JPanel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {100, 51, 158, 18, 58, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {31, 29, 0, 19, 28, 38, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_4"));
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(label1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
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
            button1.setText(bundle.getString("button1.text_5"));
            button1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
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
        contentPane.add(panel1, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
