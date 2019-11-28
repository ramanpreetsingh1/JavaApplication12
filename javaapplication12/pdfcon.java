/*    */ package javaapplication12;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JComboBox;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ public class pdfcon {
/*    */   pdfcon() {
/*  9 */     JFrame f = new JFrame("Document conversion");
/*    */ 
/*    */     
/* 12 */     JLabel l1 = new JLabel();
/* 13 */     JLabel l2 = new JLabel();
/* 14 */     JLabel l3 = new JLabel();
/* 15 */     JLabel l4 = new JLabel();
/* 16 */     JLabel l5 = new JLabel();
/* 17 */     JLabel l6 = new JLabel();
/*    */     
/* 19 */     JComboBox cb1 = new JComboBox();
/* 20 */     JComboBox cb2 = new JComboBox();
/*    */     
/* 22 */     JButton btn = new JButton("Choose File");
/*    */     
/* 24 */     f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5);
/* 25 */     f.add(l6); f.add(cb1); f.add(cb2); f.add(btn);
/*    */ 
/*    */ 
/*    */     
/* 29 */     cb1.setBounds(50, 150, 50, 75);
/* 30 */     cb2.setBounds(50, 200, 50, 75);
/* 31 */     btn.setBounds(50, 250, 50, 75);
/*    */ 
/*    */     
/* 34 */     f.setDefaultCloseOperation(3);
/* 35 */     f.setSize(new Dimension(550, 400));
/* 36 */     f.setResizable(false);
/* 37 */     f.setLocationRelativeTo(null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 48 */   public static void main(String[] args) { new pdfcon(); }
/*    */   
/*    */   public static class document
/*    */   {
/*    */     document() {
/* 53 */       JFrame f = new JFrame("Documnet converter");
/*    */       
/* 55 */       f.setSize(550, 250);
/*    */       
/* 57 */       f.setVisible(true);
/* 58 */       f.setDefaultCloseOperation(3);
/* 59 */       f.setLayout(null);
/* 60 */       f.setResizable(false);
/* 61 */       f.setLocationRelativeTo(null);
/*    */     }
/*    */     
/* 64 */     public static void main() { new document(); }
/*    */   }
/*    */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/pdfcon.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */