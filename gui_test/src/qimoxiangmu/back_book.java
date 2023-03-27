/*
 * Created by JFormDesigner on Sat Mar 25 15:50:52 CST 2023
 */

package qimoxiangmu;

import test.database_conext;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author 86155
 */
public class back_book extends JFrame {
    public back_book(String a) {
        initComponents(a);
    }

    private void button1(String a) throws SQLException {
        // TODO add your code here
        String book_name=textField1.getText();
        // String book_autor=textField2.getText();
        PreparedStatement stmt = null;
        String sql="SELECT book.book_id,book.book_name,book.book_author,book.book_publish,theborrow.back_time FROM theborrow,  book WHERE theborrow.student_id = ? AND theborrow.book_id = book.book_id;";
        stmt = test.database_conext.getConnection().prepareStatement(sql);
        stmt.setString(1,a);
        //stmt.setString(2,book_autor);
        ResultSet rs=null;
        rs=stmt.executeQuery();
        // List<List<Object>> data = new ArrayList<>();
        int flag=0;
        while (true)
        {
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "查到书籍");
                flag=1;
                DefaultTableModel model = (DefaultTableModel) table1.getModel();//获取表格的数据模型，即 DefaultTableModel 对象
                Object[] data = {rs.getString("book.book_id"),rs.getString("book.book_name"),rs.getString("book.book_author"),rs.getString("book.book_publish"),rs.getDate("theborrow.back_time")};
                model.addRow(data);
            }
            else {
                if (flag!=1)
                JOptionPane.showMessageDialog(null, "没查到书籍");
                break;
            }

        }
        rs.close();
        stmt.close();
    }

    private void button2(String a) throws SQLException {
        // TODO add your code here
        back_mysql(a);

    }

    private  void  back_mysql(String a) throws SQLException {
        String sql="select *from theborrow where book_id=?and student_id=?";
        String sql2="delete from theborrow where book_id =?and student_id=?;";
        String sql3="update book set book_nowsum =book_nowsum+1 where book_id =?";
        //; insert to book values('22',?,NOW(),DATE_ADD(NOW(), INTERVAL ? DAY));
        PreparedStatement stmt = null;
        stmt = test.database_conext.getConnection().prepareStatement(sql);
        String book_id=textField2.getText();
        stmt.setString(1,book_id);
        stmt.setString(2,a);
        ResultSet rs=null;
        rs=stmt.executeQuery();
        while (true) {
            if (rs.next()) {
                Date date = java.sql.Date.valueOf(LocalDate.now());
                if (rs.getDate("back_time").compareTo(date)<0) {
                    JOptionPane.showMessageDialog(null, "无法还书，请及时联系柜台缴纳罚款");
                    break;
                }
                else
                {//弹出一个输入框

                   // int result = Integer.parseInt(JOptionPane.showInputDialog(null,"请输入你要借阅的天数"));
                    PreparedStatement stmt2 = null;
                    stmt2 = test.database_conext.getConnection().prepareStatement(sql2);
                    stmt2.setString(1,book_id);
                    stmt2.setString(2,a);//执行删除借书表操作
                    PreparedStatement stmt3 = null;
                    stmt3 = database_conext.getConnection().prepareStatement(sql3);
                    stmt3.setString(1,book_id);
                 //   stmt3.setInt(3,result);
                    int result2 = stmt2.executeUpdate();
                    int result3=stmt3.executeUpdate();
                    if (result2==1&&result3==1)
                        JOptionPane.showMessageDialog(null, "还书成功");
                    else
                        JOptionPane.showMessageDialog(null, "还书失败");
                    stmt2.close();
                    stmt3.close();
                    break;
                }


            } else {
                JOptionPane.showMessageDialog(null, "请输入正确的书号");
                break;
            }
        }
        rs.close();
        stmt.close();
    }
    private void initComponents(String a) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("six");
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {40, 38, 150, 203, 147, 90, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {32, 36, 35, 18, 224, 21, 31, 30, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_8"));
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(label1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText(bundle.getString("button1.text_8"));
        button1.addActionListener(e -> {
            try {
                button1(a);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        contentPane.add(button1, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 454, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {304, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "\u4e66\u53f7", "\u4e66\u540d", "\u4f5c\u8005", "\u51fa\u7248\u793e", "\u8fd8\u4e66\u65e5\u671f"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, Object.class, String.class, Date.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(2, 4, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText(bundle.getString("label2.text_8"));
        label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(label2, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField2, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button2 ----
        button2.setText(bundle.getString("button2.text_6"));
        button2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        button2.addActionListener(e -> {
            try {
                button2(a);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        contentPane.add(button2, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JTextField textField2;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
