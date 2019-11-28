/*     */ package javaapplication12;
/*     */ import java.awt.Color;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Admin {
/*     */   Admin() {
/*  11 */     final JFrame f = new JFrame("Converter");
/*     */     
/*  13 */     JLabel l1 = new JLabel();
/*  14 */     JLabel l2 = new JLabel();
/*  15 */     JLabel l3 = new JLabel();
/*  16 */     JLabel l4 = new JLabel();
/*  17 */     JLabel l5 = new JLabel("User Name:");
/*  18 */     JLabel l6 = new JLabel("Password:");
/*     */     
/*  20 */     JTextField t1 = new JTextField();
/*  21 */     JPasswordField t2 = new JPasswordField();
/*     */ 
/*     */     
/*  24 */     final JButton btn1 = new JButton("MONEY CONVERT");
/*  25 */     final JButton btn2 = new JButton("DOCUMENT CONVERT");
/*  26 */     final JButton btn3 = new JButton("AUDIO CONVERT");
/*  27 */     final JButton btn4 = new JButton("UNIT CONVERT");
/*  28 */     final JButton btn5 = new JButton("Admin Panel");
/*  29 */     JButton btn6 = new JButton("Login");
/*  30 */     JButton btn7 = new JButton("Reset");
/*  31 */     JSeparator js = new JSeparator(1);
/*     */     
/*  33 */     f.add(btn1); f.add(btn2); f.add(btn3); f.add(btn4);
/*  34 */     f.add(l1); f.add(btn5); f.add(l3); f.add(l4);
/*  35 */     f.add(js); f.add(btn6); f.add(btn7); f.add(l5); f.add(l6);
/*  36 */     f.add(t1); f.add(t2);
/*     */     
/*  38 */     l1.setBounds(55, 15, 250, 75);
/*  39 */     btn1.setBounds(18, 100, 250, 50);
/*  40 */     btn2.setBounds(18, 150, 250, 50);
/*  41 */     btn3.setBounds(18, 200, 250, 50);
/*  42 */     btn4.setBounds(18, 250, 250, 50);
/*  43 */     btn5.setBounds(18, 300, 250, 50);
/*  44 */     l3.setBounds(600, 460, 120, 50);
/*  45 */     l4.setBounds(600, 480, 200, 50);
/*  46 */     js.setBounds(275, 0, 800, 550);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     t1.setEditable(false);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     l1.setFont(l1.getFont().deriveFont(34.0F));
/*     */     
/*  60 */     l1.setText("E-CONVERT");
/*  61 */     l3.setText("Raman Preet Singh");
/*  62 */     l4.setText("Aks Minor Project Bsc(IT.)(H.)");
/*     */ 
/*     */     
/*  65 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  68 */             super.mouseClicked(e);
/*  69 */             new unit_convert();
/*  70 */             f.dispose();
/*     */           }
/*     */         });
/*  73 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  76 */             super.mouseClicked(e);
/*  77 */             new doc();
/*  78 */             f.dispose();
/*     */           }
/*     */         });
/*  81 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  84 */             super.mouseClicked(e);
/*  85 */             new audio_convter();
/*  86 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/*  90 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  93 */             super.mouseClicked(e);
/*  94 */             new JavaApplication12();
/*  95 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/*  99 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 102 */             super.mouseEntered(e);
/* 103 */             btn1.setBackground(Color.green);
/* 104 */             btn1.setContentAreaFilled(true);
/* 105 */             btn1.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 109 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 112 */             super.mouseExited(e);
/* 113 */             btn1.setBackground(null);
/* 114 */             btn1.setContentAreaFilled(true);
/* 115 */             btn1.setOpaque(false);
/*     */           }
/*     */         });
/* 118 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 121 */             super.mouseEntered(e);
/* 122 */             btn2.setBackground(Color.green);
/* 123 */             btn2.setContentAreaFilled(true);
/* 124 */             btn2.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 128 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 131 */             super.mouseExited(e);
/* 132 */             btn2.setBackground(null);
/* 133 */             btn2.setContentAreaFilled(true);
/* 134 */             btn2.setOpaque(false);
/*     */           }
/*     */         });
/* 137 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 140 */             super.mouseEntered(e);
/* 141 */             btn3.setBackground(Color.green);
/* 142 */             btn3.setContentAreaFilled(true);
/* 143 */             btn3.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 147 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 150 */             super.mouseExited(e);
/* 151 */             btn3.setBackground(null);
/* 152 */             btn3.setContentAreaFilled(true);
/* 153 */             btn3.setOpaque(false);
/*     */           }
/*     */         });
/* 156 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 159 */             super.mouseEntered(e);
/* 160 */             btn4.setBackground(Color.green);
/* 161 */             btn4.setContentAreaFilled(true);
/* 162 */             btn4.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 166 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 169 */             super.mouseExited(e);
/* 170 */             btn4.setBackground(null);
/* 171 */             btn4.setContentAreaFilled(true);
/* 172 */             btn4.setOpaque(false);
/*     */           }
/*     */         });
/* 175 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 178 */             super.mouseEntered(e);
/* 179 */             btn5.setBackground(Color.red);
/* 180 */             btn5.setContentAreaFilled(true);
/* 181 */             btn5.setOpaque(true);
/* 182 */             btn5.setEnabled(false);
/*     */           }
/*     */         });
/*     */     
/* 186 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 189 */             super.mouseExited(e);
/* 190 */             btn5.setBackground(null);
/* 191 */             btn5.setContentAreaFilled(true);
/* 192 */             btn5.setOpaque(false);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     f.setSize(new Dimension(800, 550));
/* 201 */     f.setResizable(false);
/* 202 */     f.setLocationRelativeTo(null);
/* 203 */     f.setDefaultCloseOperation(3);
/*     */     
/* 205 */     f.setLayout(null);
/* 206 */     f.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 211 */   public static void main(String[] args) { new Admin(); }
/*     */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/Admin.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */