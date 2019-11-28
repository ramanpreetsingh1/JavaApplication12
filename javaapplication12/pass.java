/*    */ package javaapplication12;
/*    */ 
/*    */ import java.awt.event.KeyAdapter;
/*    */ import java.awt.event.KeyEvent;
/*    */ import java.awt.event.MouseAdapter;
/*    */ import java.awt.event.MouseEvent;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JPasswordField;
/*    */ 
/*    */ public class pass {
/*    */   pass() {
/* 14 */     final JFrame f = new JFrame("PASS_LOG");
/* 15 */     JLabel l1 = new JLabel("enter pass");
/*    */     
/* 17 */     final JPasswordField t1 = new JPasswordField();
/* 18 */     f.add(t1); f.add(l1);
/*    */     
/* 20 */     t1.setBounds(80, 100, 150, 30);
/* 21 */     l1.setBounds(80, 80, 150, 30);
/* 22 */     t1.addMouseListener(new MouseAdapter()
/*    */         {
/*    */           public void mouseClicked(MouseEvent e) {
/* 25 */             super.mouseClicked(e);
/* 26 */             t1.setText("");
/*    */           }
/*    */         });
/* 29 */     t1.addKeyListener(new KeyAdapter()
/*    */         {
/*    */           public void keyTyped(KeyEvent e) {
/* 32 */             super.keyTyped(e);
/*    */             
/* 34 */             String pass = t1.getText();
/* 35 */             int length = pass.length();
/* 36 */             if (pass.equals("12")) {
/* 37 */               new Mainwin();
/* 38 */               f.dispose();
/* 39 */             } else if (length > 1) {
/* 40 */               JOptionPane.showMessageDialog(f, "wrong pass");
/* 41 */               t1.setText("");
/*    */             } 
/*    */           }
/*    */         });
/*    */ 
/*    */     
/* 47 */     f.setSize(300, 300);
/* 48 */     f.setDefaultCloseOperation(3);
/* 49 */     f.setLocationRelativeTo(null);
/* 50 */     f.setLayout(null);
/* 51 */     f.setVisible(true);
/*    */   }
/*    */   
/* 54 */   public static void main(String[] args) { new pass(); }
/*    */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/pass.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */