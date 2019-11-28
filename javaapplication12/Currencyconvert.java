/*     */ package javaapplication12;
/*     */ import java.awt.*;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.io.InputStream;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.Date;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JProgressBar;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Currencyconvert {
/*     */   public Currencyconvert() {
/*  23 */     final JFrame f = new JFrame("Currency Conveter");
/*     */ 
/*     */     
/*  26 */     final JTextField t1 = new JTextField("Amount");
/*     */ 
/*     */     
/*  29 */     JLabel l1 = new JLabel();
/*  30 */     final JLabel l2 = new JLabel();
/*  31 */     JLabel l3 = new JLabel();
/*  32 */     JLabel l4 = new JLabel();
/*  33 */     JLabel l5 = new JLabel();
/*  34 */     JLabel l6 = new JLabel();
/*  35 */     final JLabel l7 = new JLabel();
/*  36 */     JLabel l8 = new JLabel();
/*  37 */     JLabel l9 = new JLabel();
/*  38 */     final JLabel l10 = new JLabel();
/*  39 */     final JLabel l22 = new JLabel();
/*  40 */     final JLabel l23 = new JLabel();
/*  41 */     JLabel l15 = new JLabel();
/*  42 */     JLabel l16 = new JLabel();
/*  43 */     final JButton btn1 = new JButton("Convert");
/*  44 */     JButton btn2 = new JButton("Back");
/*  45 */     final JProgressBar jp = new JProgressBar(0, 0, 100);
/*  46 */     jp.setValue(0);
/*  47 */     jp.setStringPainted(true);
/*     */     
/*  49 */     f.setDefaultCloseOperation(3);
/*     */     
/*  51 */     String[] Country = { "INR", "AED", "AUD", "AFN", "ALL", "ANG", "AOA", "ARS", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BOB", "BRL", "CAD", "CDF", "CHF", "CNY", "CZK", "DJF", "ERN", "ETN", "FJD", "FKP", "GBP", "GMP", "GNF", "GTQ", "GYD", "HKD", "HRK", "HTG", "HUF", "IDR", "IRK", "ISK", "JMD", "JOG", "JPY", "KES", "KGS", "KPW", "KRW", "KZT", "LAK", "LBP", "LKR", "LAL", "LYD", "MAD", "MKD", "MMK", "MUR", "MYR", "MXN", "NAD", "NIO", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PEN", "PKR", "PLN", "PYG", "USD", "QAR", "RON", "RSP", "SEK", "STP", "THB", "TOP", "YUN", "EURO", "TRY", "TTD", "UAH", "UGX", "UZS", "WST", "XCD", "XPF", "XOF", "YER", "ZAR", "ZMW" };
/*  52 */     final JComboBox<String> cb1 = new JComboBox<>(Country);
/*  53 */     final JComboBox<String> cb2 = new JComboBox<>(Country);
/*     */     
/*  55 */     Date date = new Date();
/*  56 */     String s = date.toString();
/*     */ 
/*     */     
/*  59 */     JLabel l11 = new JLabel();
/*  60 */     JLabel l12 = new JLabel();
/*  61 */     JLabel l13 = new JLabel();
/*  62 */     JLabel l14 = new JLabel();
/*     */     
/*  64 */     final JButton btn11 = new JButton("MONEY CONVERT");
/*  65 */     final JButton btn12 = new JButton("DOCUMENT CONVERT");
/*  66 */     final JButton btn13 = new JButton("AUDIO CONVERT");
/*  67 */     final JButton btn14 = new JButton("UNIT CONVERT");
/*  68 */     final JButton btn15 = new JButton("Admin Panel");
/*  69 */     JSeparator js = new JSeparator(1);
/*  70 */     JSeparator js1 = new JSeparator(0);
/*     */     
/*  72 */     f.add(btn11); f.add(btn12); f.add(btn13); f.add(btn14);
/*  73 */     f.add(l11); f.add(btn15); f.add(l13); f.add(l14); f.add(jp);
/*  74 */     f.add(js); f.add(js1); f.add(l22); f.add(l23); f.add(l15); f.add(l16);
/*  75 */     jp.setBounds(18, 400, 250, 50);
/*  76 */     l11.setBounds(55, 15, 250, 75);
/*  77 */     btn11.setBounds(18, 100, 250, 50);
/*  78 */     btn12.setBounds(18, 150, 250, 50);
/*  79 */     btn13.setBounds(18, 200, 250, 50);
/*  80 */     btn14.setBounds(18, 250, 250, 50);
/*  81 */     btn15.setBounds(18, 300, 250, 50);
/*  82 */     l13.setBounds(600, 460, 120, 50);
/*  83 */     l14.setBounds(600, 480, 200, 50);
/*  84 */     js.setBounds(275, 0, 800, 550);
/*  85 */     js1.setBounds(279, 80, 800, 500);
/*  86 */     l22.setFont(l2.getFont().deriveFont(18.0F));
/*  87 */     l23.setFont(l2.getFont().deriveFont(18.0F));
/*  88 */     l7.setFont(l2.getFont().deriveFont(18.0F));
/*  89 */     l2.setFont(l2.getFont().deriveFont(28.0F));
/*  90 */     ImageIcon i1 = new ImageIcon("/Users/ramanpreetsingh/Desktop/AKS_University_logo_50x50.png");
/*  91 */     l16.setIcon(i1);
/*  92 */     l15.setBounds(70, 480, 200, 35);
/*  93 */     l16.setBounds(10, 470, 50, 50);
/*  94 */     l15.setText("AKS UNIVERSITY");
/*  95 */     l15.setFont(l1.getFont().deriveFont(24.0F));
/*     */     
/*  97 */     l11.setFont(l2.getFont().deriveFont(34.0F));
/*     */ 
/*     */ 
/*     */     
/* 101 */     l2.setSize(200, 200);
/* 102 */     l1.setText(s);
/* 103 */     l3.setText("MONEY CONVERT");
/* 104 */     l3.setFont(l3.getFont().deriveFont(34.0F));
/* 105 */     l3.setSize(50, 50);
/* 106 */     l4.setText("From convert");
/* 107 */     l5.setText("Enter Amount");
/* 108 */     l6.setText("To Convert");
/* 109 */     l8.setText("Raman Preet Singh");
/* 110 */     l9.setText("Aks Minor Project Bsc(IT.)(H.)");
/* 111 */     cb1.setEditable(true);
/* 112 */     cb1.setSelectedItem("select");
/* 113 */     cb1.setEditable(false);
/* 114 */     cb2.setEditable(true);
/* 115 */     cb2.setSelectedItem("select");
/* 116 */     cb2.setEditable(false);
/* 117 */     l11.setText("E-CONVERT");
/* 118 */     l13.setText("Raman Preet Singh");
/* 119 */     l14.setText("CS DEPARTMENT Bsc(IT)(H)");
/*     */ 
/*     */     
/* 122 */     l1.setBounds(320, 480, 200, 25);
/* 123 */     l2.setBounds(500, 300, 250, 75);
/* 124 */     l3.setBounds(320, 15, 350, 50);
/* 125 */     l4.setBounds(400, 120, 150, 35);
/* 126 */     l5.setBounds(400, 160, 150, 35);
/* 127 */     l6.setBounds(400, 200, 150, 35);
/* 128 */     cb1.setBounds(500, 120, 170, 40);
/* 129 */     t1.setBounds(500, 160, 170, 35);
/* 130 */     cb2.setBounds(500, 200, 170, 35);
/* 131 */     btn1.setBounds(500, 240, 75, 35);
/* 132 */     l7.setBounds(500, 290, 250, 35);
/* 133 */     l22.setBounds(320, 290, 200, 56);
/* 134 */     l23.setBounds(320, 320, 200, 50);
/*     */ 
/*     */     
/* 137 */     l10.setBounds(650, 15, 200, 50);
/* 138 */     btn2.setBounds(580, 240, 75, 35);
/* 139 */     l10.setText("Internet Connected");
/*     */     
/* 141 */     f.add(t1); f.add(cb2); f.add(cb1); f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); f.add(l7); f.add(l8); f.add(btn1); f.add(l9); f.add(l10); f.add(btn2);
/*     */     
/* 143 */     t1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 146 */             super.mouseClicked(e);
/* 147 */             t1.setText("");
/* 148 */             l2.setText("000.00");
/* 149 */             jp.setValue(0);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 155 */     int z = internetcheck();
/* 156 */     if (z == 0) { l10.setText("Internet Connected"); l10.setForeground(Color.green); } else { l10.setText("Internet Disconnected"); btn1.setEnabled(false); t1.setEnabled(false); l10.setForeground(Color.red); }
/* 157 */      btn1.addActionListener(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e)
/*     */           {
/* 161 */             String nameCurrency1 = cb1.getSelectedItem().toString();
/* 162 */             String nameCurrency2 = cb2.getSelectedItem().toString();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 169 */             Double Amount = Double.valueOf(0.0D);
/* 170 */             Double value = Double.valueOf(0.0D);
/*     */ 
/*     */             
/* 173 */             DecimalFormat format = new DecimalFormat("#0.000");
/* 174 */             value = Currencyconvert.this.api(nameCurrency1, nameCurrency2);
/*     */             
/* 176 */             Amount = Double.valueOf(Double.parseDouble(t1.getText()));
/*     */             
/* 178 */             Double price = Currencyconvert.this.CurrencyConvert(nameCurrency1, nameCurrency2, Amount, value);
/*     */             
/* 180 */             String formattedAmount = format.format(Amount);
/* 181 */             String formattedprice = format.format(price);
/*     */             
/* 183 */             t1.setText(formattedAmount);
/* 184 */             String res = "1  " + nameCurrency1;
/* 185 */             String rs = nameCurrency2 + "  " + nameCurrency2;
/* 186 */             String result = formattedAmount + "  " + formattedAmount + "  equal to  " + nameCurrency1;
/* 187 */             String result1 = formattedprice;
/* 188 */             l22.setText(res);
/* 189 */             l23.setText(rs);
/* 190 */             l7.setText(result);
/* 191 */             l2.setText(result1);
/* 192 */             jp.setValue(100);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 197 */     l10.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 200 */             int z = Currencyconvert.this.internetcheck();
/* 201 */             if (z == 0) { t1.setEnabled(true); btn1.setEnabled(true); l10.setText("Internet Connected"); l10.setForeground(Color.green); }
/*     */           
/*     */           }
/*     */         });
/*     */     
/* 206 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 209 */             super.mousePressed(e);
/* 210 */             new Mainwin();
/* 211 */             f.dispose();
/*     */           }
/*     */         });
/* 214 */     btn11.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 217 */             super.mouseEntered(e);
/* 218 */             btn11.setBackground(Color.red);
/* 219 */             btn11.setContentAreaFilled(true);
/* 220 */             btn11.setOpaque(true);
/* 221 */             btn11.setEnabled(false);
/*     */           }
/*     */         });
/*     */     
/* 225 */     btn12.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 228 */             super.mouseClicked(e);
/* 229 */             new doc();
/* 230 */             f.dispose();
/*     */           }
/*     */         });
/* 233 */     btn13.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 236 */             super.mouseClicked(e);
/* 237 */             new audio_convter();
/* 238 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/* 242 */     btn15.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 245 */             super.mouseClicked(e);
/* 246 */             new Admin();
/* 247 */             f.dispose();
/*     */           }
/*     */         });
/*     */     
/* 251 */     btn14.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 254 */             super.mouseClicked(e);
/* 255 */             new unit_convert();
/* 256 */             f.dispose();
/*     */           }
/*     */         });
/* 259 */     btn11.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 262 */             super.mouseExited(e);
/* 263 */             btn11.setBackground(null);
/* 264 */             btn11.setContentAreaFilled(true);
/* 265 */             btn11.setOpaque(false);
/*     */           }
/*     */         });
/* 268 */     btn12.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 271 */             super.mouseEntered(e);
/* 272 */             btn12.setBackground(Color.green);
/* 273 */             btn12.setContentAreaFilled(true);
/* 274 */             btn12.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 278 */     btn12.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 281 */             super.mouseExited(e);
/* 282 */             btn12.setBackground(null);
/* 283 */             btn12.setContentAreaFilled(true);
/* 284 */             btn12.setOpaque(false);
/*     */           }
/*     */         });
/* 287 */     btn13.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 290 */             super.mouseEntered(e);
/* 291 */             btn13.setBackground(Color.green);
/* 292 */             btn13.setContentAreaFilled(true);
/* 293 */             btn13.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 297 */     btn13.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 300 */             super.mouseExited(e);
/* 301 */             btn13.setBackground(null);
/* 302 */             btn13.setContentAreaFilled(true);
/* 303 */             btn13.setOpaque(false);
/*     */           }
/*     */         });
/* 306 */     btn14.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 309 */             super.mouseEntered(e);
/* 310 */             btn14.setBackground(Color.green);
/* 311 */             btn14.setContentAreaFilled(true);
/* 312 */             btn14.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 316 */     btn14.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 319 */             super.mouseExited(e);
/* 320 */             btn14.setBackground(null);
/* 321 */             btn14.setContentAreaFilled(true);
/* 322 */             btn14.setOpaque(false);
/*     */           }
/*     */         });
/* 325 */     btn15.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 328 */             super.mouseEntered(e);
/* 329 */             btn15.setBackground(Color.green);
/* 330 */             btn15.setContentAreaFilled(true);
/* 331 */             btn15.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 335 */     btn15.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 338 */             super.mouseExited(e);
/* 339 */             btn15.setBackground(null);
/* 340 */             btn15.setContentAreaFilled(true);
/* 341 */             btn15.setOpaque(false);
/*     */           }
/*     */         });
/*     */     
/* 345 */     f.setSize(new Dimension(800, 550));
/* 346 */     f.setResizable(false);
/* 347 */     f.setLocationRelativeTo(null);
/* 348 */     f.setLayout(null);
/* 349 */     f.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int internetcheck() {
/* 355 */     int i = 5;
/*     */     try {
/* 357 */       URL url = new URL("https://www.google.com");
/* 358 */       URLConnection connection = url.openConnection();
/* 359 */       connection.connect();
/* 360 */       i = 0;
/* 361 */       System.out.println("Connection Successful");
/* 362 */     } catch (Exception e) {
/* 363 */       System.out.println("Internet Not Connected");
/* 364 */     }  return i;
/*     */   }
/*     */   public Double api(String curren1, String curren2) {
/* 367 */     double val = 0.0D;
/*     */     try {
/* 369 */       String s1 = new String(curren1);
/* 370 */       String s2 = new String(curren2);
/*     */       
/* 372 */       URL url = new URL("https://free.currencyconverterapi.com/api/v6/convert?apiKey=sample-api-key&q=" + s1 + "_" + s2 + "&compact=y");
/* 373 */       URLConnection urlcon = url.openConnection();
/* 374 */       InputStream stream = urlcon.getInputStream();
/*     */       
/* 376 */       StringBuilder inputLine = new StringBuilder(); int i;
/* 377 */       while ((i = stream.read()) != -1) {
/* 378 */         inputLine.append((char)i);
/*     */       }
/*     */       
/* 381 */       String sq = inputLine.toString();
/* 382 */       String[] arrOfStr = sq.split(",");
/* 383 */       String sw = new String(arrOfStr[0]);
/* 384 */       String[] arrOfString = sw.split(":");
/* 385 */       String st = arrOfString[2];
/* 386 */       String sy = new String();
/*     */       
/* 388 */       if (st != null && st.length() > 0 && st.charAt(st.length() - 1) == '}') {
/* 389 */         sy = st.substring(0, st.length() - 1);
/*     */       }
/* 391 */       val = Double.parseDouble(sy);
/* 392 */     } catch (Exception e) {
/* 393 */       System.out.println(e);
/*     */     } 
/* 395 */     return Double.valueOf(val);
/*     */   }
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
/*     */   Double CurrencyConvert(String Currency1, String Currency2, Double Amot, Double valu) {
/* 411 */     Double z = null;
/*     */     
/* 413 */     Double value = Amot;
/* 414 */     z = Double.valueOf(value.doubleValue() * valu.doubleValue());
/* 415 */     Double z1 = z;
/* 416 */     return z1;
/*     */   }
/*     */ 
/*     */   
/* 420 */   public static void main(String[] args) { Currencyconvert JA = new Currencyconvert(); }
/*     */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/JavaApplication12.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */