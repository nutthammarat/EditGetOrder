
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 59161088
 */
public class CartPage extends javax.swing.JFrame {

    /**
     * Creates new form CartPage
     */
    public CartPage() {
        initComponents();
        CartService.showList();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_Confirmorder = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        btn_Profile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        btn_Remove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sumtxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(589, 422));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ตระกร้าสินค้า");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 180, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 120, 0, 0);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 220, 0, 0);

        btn_Confirmorder.setText("ยืนยันการสั่งสินค้า");
        btn_Confirmorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmorderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Confirmorder);
        btn_Confirmorder.setBounds(440, 330, 130, 23);

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back);
        btn_Back.setBounds(30, 350, 60, 23);

        btn_Profile.setText("Profile");
        btn_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Profile);
        btn_Profile.setBounds(440, 20, 73, 23);

        jScrollPane1.setViewportView(list1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 410, 180);

        btn_Remove.setText("ลบสินค้า");
        btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Remove);
        btn_Remove.setBounds(360, 330, 73, 23);

        jLabel3.setText("ราคารวม : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 290, 60, 20);
        getContentPane().add(sumtxt);
        sumtxt.setBounds(470, 290, 100, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveActionPerformed
        
        ArrayList<Cart> list = CartService.getAllProduct(UserService.getUser(LoginForm.userCurrent));
        int i =  list1.getSelectedIndex();
        String id = list.get(i).getProduct().getId();
        CartService.deleteProduct(id);
    }//GEN-LAST:event_btn_RemoveActionPerformed

    private void btn_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfileActionPerformed
        ProfileService.showProfileForm();
    }//GEN-LAST:event_btn_ProfileActionPerformed

    private void btn_ConfirmorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmorderActionPerformed
//        CartService.addCartToOrder(UserService.getUser(LoginForm.userCurrent));
        try {
            OrderService.addToOrder();
        //OrderService.getAllOrder();
        this.hide();
//        OrderService.showOrderPage();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "กรุณาเลือกสินค้า");
        }
    
    
    }//GEN-LAST:event_btn_ConfirmorderActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    public static javax.swing.JButton btn_Confirmorder;
    private javax.swing.JButton btn_Profile;
    private javax.swing.JButton btn_Remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> list1;
    public static javax.swing.JLabel sumtxt;
    // End of variables declaration//GEN-END:variables
}
