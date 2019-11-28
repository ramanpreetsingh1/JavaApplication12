/*     */ package javaapplication12;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Mainwin {
/*     */   Mainwin() {
/*  11 */     final JFrame f = new JFrame("Converter");
/*     */     
/*  13 */     JLabel l1 = new JLabel();
/*  14 */     JLabel l2 = new JLabel();
/*  15 */     JLabel l3 = new JLabel();
/*  16 */     JLabel l5 = new JLabel();
/*  17 */     JLabel l4 = new JLabel();
/*  18 */     JLabel l6 = new JLabel();
/*     */     
/*  20 */     final JButton btn1 = new JButton("MONEY CONVERT");
/*  21 */     final JButton btn2 = new JButton("DOCUMENT CONVERT");
/*  22 */     final JButton btn3 = new JButton("AUDIO CONVERT");
/*  23 */     final JButton btn4 = new JButton("UNIT CONVERT");
/*  24 */     final JButton btn5 = new JButton("Admin Panel");
/*  25 */     JSeparator js = new JSeparator(1);
/*  26 */     ImageIcon i = new ImageIcon("/Users/ramanpreetsingh/Desktop/Screenshot 2019-03-21 at 9.24.02 PM.png");
/*     */     
/*  28 */     l2.setIcon(i);
/*  29 */     ImageIcon i1 = new ImageIcon("/Users/ramanpreetsingh/Desktop/AKS_University_logo_50x50.png");
/*  30 */     l6.setIcon(i1);
/*  31 */     l5.setBounds(70, 480, 200, 35);
/*  32 */     l6.setBounds(10, 470, 50, 50);
/*  33 */     l5.setText("AKS UNIVERSITY");
/*     */     
/*  35 */     l2.setBounds(279, 0, 530, 550);
/*  36 */     f.add(btn1); f.add(btn2); f.add(btn3); f.add(btn4);
/*  37 */     f.add(l1); f.add(btn5); f.add(l3); f.add(l4);
/*  38 */     f.add(js); f.add(l2); f.add(l5); f.add(l6);
/*     */     
/*  40 */     l1.setBounds(55, 15, 250, 75);
/*  41 */     btn1.setBounds(18, 100, 250, 50);
/*  42 */     btn2.setBounds(18, 150, 250, 50);
/*  43 */     btn3.setBounds(18, 200, 250, 50);
/*  44 */     btn4.setBounds(18, 250, 250, 50);
/*  45 */     btn5.setBounds(18, 300, 250, 50);
/*  46 */     l3.setBounds(600, 460, 120, 50);
/*     */ 
/*     */     
/*  49 */     l5.setFont(l1.getFont().deriveFont(24.0F));
/*  50 */     l4.setBounds(600, 480, 200, 50);
/*  51 */     js.setBounds(275, 0, 800, 550);
/*     */ 
/*     */ 
/*     */     
/*  55 */     l1.setFont(l1.getFont().deriveFont(34.0F));
/*  56 */     l1.setText("E-CONVERT");
/*  57 */     l3.setText("Raman Preet Singh");
/*  58 */     l4.setText("CS DEPARTMENT Bsc(IT)(H)");
/*     */     
/*  60 */     btn1.addActionListener(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  63 */             new Currencyconvert();
/*  64 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/*  68 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  71 */             super.mouseClicked(e);
/*  72 */             new unit_convert();
/*  73 */             f.dispose();
/*     */           }
/*     */         });
/*  76 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  79 */             super.mouseClicked(e);
/*  80 */             new doc();
/*  81 */             f.dispose();
/*     */           }
/*     */         });
/*  84 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  87 */             super.mouseClicked(e);
/*  88 */             new audio_convter();
/*  89 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/*  93 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  96 */             super.mouseClicked(e);
/*  97 */             new Currencyconvert();
/*  98 */             f.dispose();
/*     */           }
/*     */         });
/* 101 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e)
/*     */           {
/* 105 */             btn1.setBackground(Color.green);
/* 106 */             btn1.setContentAreaFilled(true);
/* 107 */             btn1.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 111 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e)
/*     */           {
/* 115 */             btn1.setBackground(null);
/* 116 */             btn1.setContentAreaFilled(true);
/* 117 */             btn1.setOpaque(false);
/*     */           }
/*     */         });
/* 120 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 123 */             super.mouseClicked(e);
/* 124 */             new Admin();
/* 125 */             f.dispose();
/*     */           }
/*     */         });
/* 128 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 131 */             super.mouseEntered(e);
/* 132 */             btn2.setBackground(Color.green);
/* 133 */             btn2.setContentAreaFilled(true);
/* 134 */             btn2.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 138 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 141 */             super.mouseExited(e);
/* 142 */             btn2.setBackground(null);
/* 143 */             btn2.setContentAreaFilled(true);
/* 144 */             btn2.setOpaque(false);
/*     */           }
/*     */         });
/* 147 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 150 */             super.mouseEntered(e);
/* 151 */             btn3.setBackground(Color.green);
/* 152 */             btn3.setContentAreaFilled(true);
/* 153 */             btn3.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 157 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 160 */             super.mouseExited(e);
/* 161 */             btn3.setBackground(null);
/* 162 */             btn3.setContentAreaFilled(true);
/* 163 */             btn3.setOpaque(false);
/*     */           }
/*     */         });
/* 166 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 169 */             super.mouseEntered(e);
/* 170 */             btn4.setBackground(Color.green);
/* 171 */             btn4.setContentAreaFilled(true);
/* 172 */             btn4.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 176 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 179 */             super.mouseExited(e);
/* 180 */             btn4.setBackground(null);
/* 181 */             btn4.setContentAreaFilled(true);
/* 182 */             btn4.setOpaque(false);
/*     */           }
/*     */         });
/* 185 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 188 */             super.mouseEntered(e);
/* 189 */             btn5.setBackground(Color.green);
/* 190 */             btn5.setContentAreaFilled(true);
/* 191 */             btn5.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 195 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 198 */             super.mouseExited(e);
/* 199 */             btn5.setBackground(null);
/* 200 */             btn5.setContentAreaFilled(true);
/* 201 */             btn5.setOpaque(false);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 207 */     f.setSize(new Dimension(800, 550));
/* 208 */     f.setResizable(false);
/* 209 */     f.setLocationRelativeTo(null);
/* 210 */     f.setDefaultCloseOperation(3);
/*     */     
/* 212 */     f.setLayout(null);
/* 213 */     f.setVisible(true);
/*     */   }
/*     */ 
/*     */   
/* 217 */   public static void main(String[] args) { Mainwin n = new Mainwin(); }
/*     */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/Mainwin.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */