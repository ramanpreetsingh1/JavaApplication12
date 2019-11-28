/*     */ package javaapplication12;
/*     */ import com.aspose.slides.Presentation;
/*     */ import com.aspose.slides.export.SaveFormat;
/*     */ import com.aspose.words.Document;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JSeparator;
/*     */ import org.apache.commons.io.FilenameUtils;
/*     */ 
/*     */ public class doc {
/*     */   public doc() {
/*  22 */     final JFrame f = new JFrame("Converter");
/*     */     
/*  24 */     JLabel l1 = new JLabel();
/*  25 */     JLabel l2 = new JLabel();
/*  26 */     JLabel l3 = new JLabel();
/*  27 */     JLabel l4 = new JLabel();
/*  28 */     JLabel l5 = new JLabel();
/*  29 */     JLabel l6 = new JLabel();
/*  30 */     JLabel l15 = new JLabel();
/*  31 */     JLabel l16 = new JLabel();
/*     */ 
/*     */     
/*  34 */     final JButton btn1 = new JButton("MONEY CONVERT");
/*  35 */     final JButton btn2 = new JButton("DOCUMENT CONVERT");
/*  36 */     final JButton btn3 = new JButton("AUDIO CONVERT");
/*  37 */     final JButton btn4 = new JButton("UNIT CONVERT");
/*  38 */     final JButton btn5 = new JButton("Admin Panel");
/*  39 */     JButton btn6 = new JButton("DOCX TO PDF");
/*  40 */     JButton btn7 = new JButton("DOC TO PDF");
/*  41 */     JButton btn8 = new JButton("TEST TO PDF");
/*  42 */     JButton btn9 = new JButton("PDF TO DOC");
/*  43 */     JButton btn10 = new JButton("PDF TO DOCX");
/*  44 */     JButton btn11 = new JButton("PDF TO TEXT");
/*  45 */     JButton btn12 = new JButton("");
/*  46 */     JButton btn13 = new JButton("");
/*  47 */     JButton btn14 = new JButton("");
/*     */     
/*  49 */     JSeparator js = new JSeparator(1);
/*  50 */     JSeparator js1 = new JSeparator(0);
/*  51 */     JSeparator js2 = new JSeparator(1);
/*  52 */     JSeparator js3 = new JSeparator(0);
/*     */     
/*  54 */     ImageIcon i1 = new ImageIcon("/Users/ramanpreetsingh/Desktop/AKS_University_logo_50x50.png");
/*  55 */     l16.setIcon(i1);
/*  56 */     l15.setBounds(70, 480, 200, 35);
/*  57 */     l16.setBounds(10, 470, 50, 50);
/*  58 */     l15.setText("AKS UNIVERSITY");
/*  59 */     l15.setFont(l1.getFont().deriveFont(24.0F));
/*  60 */     f.add(btn1); f.add(btn2); f.add(btn3); f.add(btn4); f.add(l2);
/*  61 */     f.add(l1); f.add(btn5); f.add(l3); f.add(l4); f.add(js3);
/*  62 */     f.add(js); f.add(btn6); f.add(js1); f.add(js2); f.add(l5); f.add(l6);
/*  63 */     f.add(btn5); f.add(btn6); f.add(btn7); f.add(btn8); f.add(btn9);
/*  64 */     f.add(btn10); f.add(btn11); f.add(btn12); f.add(btn13); f.add(btn14); f.add(l15); f.add(l16);
/*     */     
/*  66 */     l1.setBounds(55, 15, 250, 75);
/*  67 */     btn1.setBounds(18, 100, 250, 50);
/*  68 */     btn2.setBounds(18, 150, 250, 50);
/*  69 */     btn3.setBounds(18, 200, 250, 50);
/*  70 */     btn4.setBounds(18, 250, 250, 50);
/*  71 */     btn5.setBounds(18, 300, 250, 50);
/*  72 */     l2.setBounds(400, 10, 300, 75);
/*  73 */     l3.setBounds(600, 460, 120, 50);
/*  74 */     l4.setBounds(600, 480, 200, 50);
/*  75 */     l5.setBounds(290, 73, 150, 40);
/*  76 */     l6.setBounds(600, 73, 150, 40);
/*  77 */     js.setBounds(275, 0, 800, 550);
/*  78 */     btn6.setBounds(300, 150, 125, 35);
/*  79 */     btn7.setBounds(300, 250, 125, 35);
/*  80 */     btn8.setBounds(300, 350, 125, 35);
/*  81 */     btn9.setBounds(610, 150, 125, 35);
/*  82 */     btn10.setBounds(610, 250, 125, 35);
/*  83 */     btn11.setBounds(610, 350, 125, 35);
/*  84 */     btn12.setBounds(450, 150, 125, 35);
/*  85 */     btn13.setBounds(450, 250, 125, 35);
/*  86 */     btn14.setBounds(450, 350, 125, 35);
/*  87 */     js1.setBounds(279, 100, 800, 500);
/*  88 */     js2.setBounds(590, 104, 800, 500);
/*  89 */     js3.setBounds(279, 70, 800, 550);
/*     */ 
/*     */     
/*  92 */     l1.setFont(l1.getFont().deriveFont(24.0F));
/*  93 */     l2.setFont(l1.getFont().deriveFont(24.0F));
/*  94 */     l5.setFont(l1.getFont().deriveFont(24.0F));
/*  95 */     l6.setFont(l1.getFont().deriveFont(24.0F));
/*     */     
/*  97 */     l1.setText("E-CONVERT");
/*  98 */     l3.setText("Raman Preet Singh");
/*  99 */     l4.setText("CS DEPARTMENT Bsc(IT)(H)");
/* 100 */     l2.setText("DOCUMENT CONVERT");
/* 101 */     l5.setText("DOC TO PDF");
/* 102 */     l6.setText("PDF TO DOC");
/* 103 */     btn12.setEnabled(false);
/* 104 */     btn13.setEnabled(false);
/* 105 */     btn14.setEnabled(false);
/* 106 */     btn9.setEnabled(false);
/* 107 */     btn10.setEnabled(false);
/* 108 */     btn11.setEnabled(false);
/* 109 */     btn12.setEnabled(false);
/* 110 */     btn12.setVisible(false);
/* 111 */     btn13.setVisible(false);
/* 112 */     btn14.setVisible(false);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 117 */     btn6.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 120 */             super.mouseClicked(e);
/* 121 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 122 */             int i = jf.showOpenDialog(null);
/* 123 */             if (i == 0) {
/* 124 */               String st = new String(jf.getSelectedFile().getPath());
/* 125 */               String output = new String();
/* 126 */               System.out.println(st);
/* 127 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 129 */               if ("docx".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 131 */                   doc.this.convert(st, output);
/* 132 */                 } catch (Exception q) {
/* 133 */                   System.out.println("error occured");
/*     */                 }
/*     */               
/*     */               } else {
/*     */                 
/* 138 */                 JOptionPane.showMessageDialog(f, "error not a docx file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 143 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 149 */     btn7.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 152 */             super.mouseClicked(e);
/* 153 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 154 */             int i = jf.showOpenDialog(null);
/* 155 */             if (i == 0) {
/* 156 */               String st = new String(jf.getSelectedFile().getPath());
/* 157 */               String output = new String();
/* 158 */               System.out.println(st);
/* 159 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 161 */               if ("doc".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 163 */                   doc.this.convert(st, output);
/*     */                 }
/* 165 */                 catch (Exception q) {
/* 166 */                   System.out.println("Again error");
/*     */                 } 
/*     */               } else {
/*     */                 
/* 170 */                 JOptionPane.showMessageDialog(f, "error not a doc file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 175 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 180 */     btn8.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 183 */             super.mouseClicked(e);
/* 184 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 185 */             int i = jf.showOpenDialog(null);
/* 186 */             if (i == 0) {
/* 187 */               String st = new String(jf.getSelectedFile().getPath());
/* 188 */               String output = new String();
/* 189 */               System.out.println(st);
/* 190 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 192 */               if ("ppt".equalsIgnoreCase(ext) || "pptx".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 194 */                   doc.this.convertppt(st, output);
/*     */                 }
/* 196 */                 catch (Exception q) {
/* 197 */                   System.out.println("Again error");
/*     */                 } 
/*     */               } else {
/*     */                 
/* 201 */                 JOptionPane.showMessageDialog(f, "error not a doc file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 206 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/* 210 */     btn9.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 213 */             super.mouseClicked(e);
/* 214 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 215 */             int i = jf.showOpenDialog(null);
/* 216 */             if (i == 0) {
/* 217 */               String st = new String(jf.getSelectedFile().getPath());
/* 218 */               String output = new String();
/* 219 */               System.out.println(st);
/* 220 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 222 */               if ("pdf".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 224 */                   doc.this.convertpdftodoc(st, output);
/*     */                 }
/* 226 */                 catch (Exception q) {
/* 227 */                   System.out.println("Again error");
/*     */                 } 
/*     */               } else {
/*     */                 
/* 231 */                 JOptionPane.showMessageDialog(f, "error not a doc file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 236 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/* 240 */     btn1.addActionListener(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 243 */             new Currencyconvert();
/* 244 */             f.dispose();
/*     */           }
/*     */         });
/* 247 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 250 */             super.mouseClicked(e);
/* 251 */             new unit_convert();
/* 252 */             f.dispose();
/*     */           }
/*     */         });
/* 255 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 258 */             super.mouseClicked(e);
/* 259 */             new Admin();
/* 260 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/* 264 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 267 */             super.mouseClicked(e);
/* 268 */             new audio_convter();
/* 269 */             f.dispose();
/*     */           }
/*     */         });
/* 272 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 275 */             super.mouseEntered(e);
/* 276 */             btn1.setBackground(Color.green);
/* 277 */             btn1.setContentAreaFilled(true);
/* 278 */             btn1.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 282 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 285 */             super.mouseExited(e);
/* 286 */             btn1.setBackground(null);
/* 287 */             btn1.setContentAreaFilled(true);
/* 288 */             btn1.setOpaque(false);
/*     */           }
/*     */         });
/* 291 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 294 */             super.mouseEntered(e);
/* 295 */             btn2.setBackground(Color.red);
/* 296 */             btn2.setContentAreaFilled(true);
/* 297 */             btn2.setOpaque(true);
/* 298 */             btn2.setEnabled(false);
/*     */           }
/*     */         });
/*     */     
/* 302 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 305 */             super.mouseExited(e);
/* 306 */             btn2.setBackground(null);
/* 307 */             btn2.setContentAreaFilled(true);
/* 308 */             btn2.setOpaque(false);
/*     */           }
/*     */         });
/* 311 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 314 */             super.mouseEntered(e);
/* 315 */             btn3.setBackground(Color.green);
/* 316 */             btn3.setContentAreaFilled(true);
/* 317 */             btn3.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 321 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 324 */             super.mouseExited(e);
/* 325 */             btn3.setBackground(null);
/* 326 */             btn3.setContentAreaFilled(true);
/* 327 */             btn3.setOpaque(false);
/*     */           }
/*     */         });
/* 330 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 333 */             super.mouseEntered(e);
/* 334 */             btn4.setBackground(Color.green);
/* 335 */             btn4.setContentAreaFilled(true);
/* 336 */             btn4.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 340 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 343 */             super.mouseExited(e);
/* 344 */             btn4.setBackground(null);
/* 345 */             btn4.setContentAreaFilled(true);
/* 346 */             btn4.setOpaque(false);
/*     */           }
/*     */         });
/* 349 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 352 */             super.mouseEntered(e);
/* 353 */             btn5.setBackground(Color.green);
/* 354 */             btn5.setContentAreaFilled(true);
/* 355 */             btn5.setOpaque(true);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 360 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 363 */             super.mouseExited(e);
/* 364 */             btn5.setBackground(null);
/* 365 */             btn5.setContentAreaFilled(true);
/* 366 */             btn5.setOpaque(false);
/* 367 */             btn5.setEnabled(true);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 376 */     f.setSize(new Dimension(800, 550));
/* 377 */     f.setResizable(false);
/* 378 */     f.setLocationRelativeTo(null);
/* 379 */     f.setDefaultCloseOperation(3);
/*     */     
/* 381 */     f.setLayout(null);
/* 382 */     f.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   String convert(String pt, String output) throws Exception {
/* 388 */     Document soc = new Document(pt);
/* 389 */     String qw = pt + ".pdf";
/* 390 */     soc.save(qw);
/*     */     
/* 392 */     return null;
/*     */   }
/*     */   
/*     */   String convertppt(String pt, String output) throws Exception {
/* 396 */     Presentation pres = new Presentation(pt);
/* 397 */     String qw = pt + ".pdf";
/*     */     
/* 399 */     pres.save(qw, SaveFormat.PDF);
/*     */     
/* 401 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 406 */   String convertpdftodoc(String pt, String output) throws Exception { return null; }
/*     */ 
/*     */ 
/*     */   
/* 410 */   String convertpdftotext(String pt, String output) throws Exception { return null; }
/*     */ 
/*     */ 
/*     */   
/* 414 */   String converttexttopdf(String pt, String output) throws Exception { return null; }
/*     */ 
/*     */ 
/*     */   
/* 418 */   String convertpdftodocx(String pt, String output) throws Exception { return null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 510 */   public static void main(String[] agrs) { new doc(); }
/*     */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/doc.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */