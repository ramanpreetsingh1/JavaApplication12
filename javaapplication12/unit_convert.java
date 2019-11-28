/*     */ package javaapplication12;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class unit_convert {
/*     */   unit_convert() {
/*  15 */     final JFrame f = new JFrame("Unit Converter");
/*     */     
/*  17 */     JLabel l1 = new JLabel();
/*  18 */     final JLabel l2 = new JLabel();
/*  19 */     JLabel l3 = new JLabel();
/*  20 */     JLabel l4 = new JLabel();
/*  21 */     JLabel l5 = new JLabel();
/*  22 */     JLabel l6 = new JLabel();
/*  23 */     final JLabel l7 = new JLabel();
/*  24 */     JLabel l8 = new JLabel();
/*  25 */     JSeparator js1 = new JSeparator(0);
/*  26 */     f.add(js1);
/*  27 */     js1.setBounds(279, 80, 800, 500);
/*     */     
/*  29 */     final JButton btn1 = new JButton("Convert");
/*  30 */     JButton btn2 = new JButton("Back");
/*  31 */     String[] sqwe = { null };
/*     */     
/*  33 */     final JComboBox<String> cb1 = new JComboBox<>(sqwe);
/*  34 */     final JComboBox<String> cb2 = new JComboBox<>(sqwe);
/*     */     
/*  36 */     cb1.setEnabled(false);
/*  37 */     cb2.setEnabled(false);
/*  38 */     btn1.setEnabled(false);
/*  39 */     btn1.setEnabled(true);
/*     */     
/*  41 */     JLabel l11 = new JLabel();
/*  42 */     JLabel l12 = new JLabel();
/*  43 */     JLabel l13 = new JLabel();
/*  44 */     JLabel l14 = new JLabel();
/*  45 */     JLabel l15 = new JLabel();
/*  46 */     JLabel l16 = new JLabel();
/*     */     
/*  48 */     final JButton btn11 = new JButton("MONEY CONVERT");
/*  49 */     final JButton btn12 = new JButton("DOCUMENT CONVERT");
/*  50 */     final JButton btn13 = new JButton("AUDIO CONVERT");
/*  51 */     final JButton btn14 = new JButton("UNIT CONVERT");
/*  52 */     final JButton btn15 = new JButton("Admin Panel");
/*  53 */     JSeparator js = new JSeparator(1);
/*     */     
/*  55 */     f.add(btn11); f.add(btn12); f.add(btn13); f.add(btn14);
/*  56 */     f.add(l11); f.add(btn15); f.add(l13); f.add(l14);
/*  57 */     f.add(js); f.add(l15); f.add(l16);
/*  58 */     ImageIcon i1 = new ImageIcon("/Users/ramanpreetsingh/Desktop/AKS_University_logo_50x50.png");
/*  59 */     l16.setIcon(i1);
/*  60 */     l15.setBounds(70, 480, 200, 35);
/*  61 */     l16.setBounds(10, 470, 50, 50);
/*  62 */     l15.setText("AKS UNIVERSITY");
/*  63 */     l15.setFont(l1.getFont().deriveFont(24.0F));
/*     */     
/*  65 */     l11.setBounds(55, 15, 250, 75);
/*  66 */     btn11.setBounds(18, 100, 250, 50);
/*  67 */     btn12.setBounds(18, 150, 250, 50);
/*  68 */     btn13.setBounds(18, 200, 250, 50);
/*  69 */     btn14.setBounds(18, 250, 250, 50);
/*  70 */     btn15.setBounds(18, 300, 250, 50);
/*  71 */     l13.setBounds(600, 460, 120, 50);
/*  72 */     l14.setBounds(600, 480, 200, 50);
/*  73 */     js.setBounds(275, 0, 800, 550);
/*     */ 
/*     */     
/*  76 */     l11.setFont(l1.getFont().deriveFont(34.0F));
/*     */     
/*  78 */     l11.setText("E-CONVERT");
/*  79 */     l13.setText("Raman Preet Singh");
/*  80 */     l14.setText("CS DEPARTMENT Bsc(IT)(H)");
/*  81 */     btn11.addActionListener(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  84 */             new JavaApplication12();
/*  85 */             f.dispose();
/*     */           }
/*     */         });
/*  88 */     btn12.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  91 */             super.mouseClicked(e);
/*  92 */             new doc();
/*  93 */             f.dispose();
/*     */           }
/*     */         });
/*  96 */     btn13.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  99 */             super.mouseClicked(e);
/* 100 */             new audio_convter();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 105 */     btn15.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 108 */             super.mouseClicked(e);
/* 109 */             new Admin();
/*     */           }
/*     */         });
/*     */     
/* 113 */     btn11.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 116 */             super.mouseEntered(e);
/* 117 */             btn11.setBackground(Color.green);
/* 118 */             btn11.setContentAreaFilled(true);
/* 119 */             btn11.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 123 */     btn11.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 126 */             super.mouseExited(e);
/* 127 */             btn11.setBackground(null);
/* 128 */             btn11.setContentAreaFilled(true);
/*     */           }
/*     */         });
/*     */     
/* 132 */     btn12.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 135 */             super.mouseEntered(e);
/* 136 */             btn12.setBackground(Color.green);
/* 137 */             btn12.setContentAreaFilled(true);
/* 138 */             btn12.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 142 */     btn12.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 145 */             super.mouseExited(e);
/* 146 */             btn12.setBackground(null);
/* 147 */             btn12.setContentAreaFilled(true);
/* 148 */             btn12.setOpaque(false);
/*     */           }
/*     */         });
/* 151 */     btn13.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 154 */             super.mouseEntered(e);
/* 155 */             btn13.setBackground(Color.green);
/* 156 */             btn13.setContentAreaFilled(true);
/* 157 */             btn13.setOpaque(true);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 162 */     btn13.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 165 */             super.mouseExited(e);
/* 166 */             btn13.setBackground(null);
/* 167 */             btn13.setContentAreaFilled(true);
/* 168 */             btn13.setOpaque(false);
/*     */           }
/*     */         });
/* 171 */     btn14.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 174 */             super.mouseEntered(e);
/* 175 */             btn14.setBackground(Color.red);
/* 176 */             btn14.setContentAreaFilled(true);
/* 177 */             btn14.setOpaque(true);
/* 178 */             btn14.setEnabled(false);
/*     */           }
/*     */         });
/*     */     
/* 182 */     btn14.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 185 */             super.mouseExited(e);
/* 186 */             btn14.setBackground(null);
/* 187 */             btn14.setContentAreaFilled(true);
/* 188 */             btn14.setOpaque(false);
/*     */           }
/*     */         });
/* 191 */     btn15.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 194 */             super.mouseEntered(e);
/* 195 */             btn15.setBackground(Color.green);
/* 196 */             btn15.setContentAreaFilled(true);
/* 197 */             btn15.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 201 */     btn15.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 204 */             super.mouseExited(e);
/* 205 */             btn15.setBackground(null);
/* 206 */             btn15.setContentAreaFilled(true);
/* 207 */             btn15.setOpaque(false);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     final JTextField t1 = new JTextField();
/* 216 */     t1.setEnabled(false);
/* 217 */     JRadioButton Rbtn1 = new JRadioButton("Length");
/* 218 */     JRadioButton Rbtn2 = new JRadioButton("Volume");
/* 219 */     JRadioButton Rbtn3 = new JRadioButton("Area");
/* 220 */     JRadioButton Rbtn4 = new JRadioButton("Temperature");
/* 221 */     JRadioButton Rbtn5 = new JRadioButton("Weight");
/* 222 */     JRadioButton Rbtn6 = new JRadioButton("Time");
/* 223 */     JRadioButton Rbtn7 = new JRadioButton("bit");
/*     */     
/* 225 */     ButtonGroup bg = new ButtonGroup();
/* 226 */     bg.add(Rbtn1); bg.add(Rbtn2); bg.add(Rbtn3); bg.add(Rbtn4); bg.add(Rbtn5); bg.add(Rbtn6); bg.add(Rbtn6); bg.add(Rbtn7);
/*     */     
/* 228 */     f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); f.add(l7); f.add(btn1); f.add(btn2); f.add(cb1);
/* 229 */     f.add(cb2); f.add(t1); f.add(l8); f.add(Rbtn1); f.add(Rbtn2); f.add(Rbtn3); f.add(Rbtn4); f.add(Rbtn5); f.add(Rbtn6); f.add(Rbtn6); f.add(Rbtn7);
/*     */ 
/*     */     
/* 232 */     l1.setText("Unit Convert");
/* 233 */     l1.setFont(l1.getFont().deriveFont(34.0F));
/*     */ 
/*     */     
/* 236 */     l4.setText("From");
/* 237 */     l5.setText("To");
/* 238 */     l6.setText("value");
/*     */     
/* 240 */     l8.setText("Choose To Convert");
/*     */     
/* 242 */     cb1.setBounds(550, 120, 170, 40);
/* 243 */     cb2.setBounds(550, 200, 170, 35);
/* 244 */     t1.setBounds(550, 160, 170, 35);
/* 245 */     l1.setBounds(320, 15, 350, 50);
/* 246 */     l2.setBounds(500, 300, 120, 50);
/* 247 */     l3.setBounds(300, 325, 200, 50);
/* 248 */     l4.setBounds(480, 120, 150, 35);
/* 249 */     l6.setBounds(480, 200, 150, 35);
/* 250 */     l5.setBounds(480, 160, 150, 35);
/* 251 */     l7.setBounds(320, 320, 150, 150);
/* 252 */     l8.setBounds(320, 120, 170, 35);
/* 253 */     Rbtn1.setBounds(320, 150, 170, 25);
/* 254 */     Rbtn2.setBounds(320, 170, 170, 25);
/* 255 */     Rbtn3.setBounds(320, 190, 150, 25);
/* 256 */     Rbtn4.setBounds(320, 210, 150, 25);
/* 257 */     Rbtn5.setBounds(320, 230, 120, 25);
/* 258 */     Rbtn6.setBounds(320, 250, 120, 25);
/* 259 */     Rbtn7.setBounds(320, 270, 120, 25);
/* 260 */     btn2.setBounds(640, 240, 75, 35);
/* 261 */     btn1.setBounds(550, 240, 75, 35);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 268 */     f.setSize(new Dimension(800, 550));
/* 269 */     f.setResizable(false);
/* 270 */     f.setLocationRelativeTo(null);
/* 271 */     f.setDefaultCloseOperation(3);
/*     */     
/* 273 */     f.setLayout(null);
/* 274 */     f.setVisible(true);
/* 275 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 278 */             mouseClicked(e);
/* 279 */             new Mainwin();
/* 280 */             f.dispose();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 285 */     Rbtn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 288 */             super.mousePressed(e);
/*     */             
/* 290 */             super.mousePressed(e);
/* 291 */             cb1.setEnabled(true);
/* 292 */             cb2.setEnabled(true);
/* 293 */             t1.setEnabled(true);
/* 294 */             cb1.removeAllItems();
/* 295 */             cb2.removeAllItems();
/* 296 */             btn1.setEnabled(true);
/* 297 */             String[] test = { "KILLO-METER", "METER", "INCH", "CENTIMETER", "MILLIMETER", "STATUTE MILE", "FOOT" };
/* 298 */             for (int i = 0; i <= test.length; i++) {
/* 299 */               cb1.addItem(test[i]);
/* 300 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 304 */     Rbtn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 307 */             super.mousePressed(e);
/*     */             
/* 309 */             super.mousePressed(e);
/* 310 */             cb1.setEnabled(true);
/* 311 */             cb2.setEnabled(true);
/* 312 */             t1.setEnabled(true);
/* 313 */             cb1.removeAllItems();
/* 314 */             cb2.removeAllItems();
/* 315 */             String[] test = { "cubic killometer", "cubic centimeter", "cubic meter", "litre", "millilitre" };
/* 316 */             for (int i = 0; i <= test.length; i++) {
/* 317 */               cb1.addItem(test[i]);
/* 318 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 322 */     Rbtn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 325 */             super.mousePressed(e);
/*     */             
/* 327 */             super.mousePressed(e);
/* 328 */             cb1.setEnabled(true);
/* 329 */             cb2.setEnabled(true);
/* 330 */             t1.setEnabled(true);
/* 331 */             cb1.removeAllItems();
/* 332 */             cb2.removeAllItems();
/* 333 */             String[] test = { "square killometer", "square meter", "square inch", "square centimeter", "square millimeter", "square statute mile", "square foot" };
/* 334 */             for (int i = 0; i <= test.length; i++) {
/* 335 */               cb1.addItem(test[i]);
/* 336 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 340 */     Rbtn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 343 */             super.mousePressed(e);
/*     */             
/* 345 */             super.mousePressed(e);
/* 346 */             cb1.setEnabled(true);
/* 347 */             cb2.setEnabled(true);
/* 348 */             t1.setEnabled(true);
/* 349 */             cb1.removeAllItems();
/* 350 */             cb2.removeAllItems();
/* 351 */             String[] test = { "Celsius", "fahrenheit" };
/* 352 */             for (int i = 0; i <= test.length; i++) {
/* 353 */               cb1.addItem(test[i]);
/* 354 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 358 */     Rbtn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 361 */             super.mousePressed(e);
/*     */             
/* 363 */             super.mousePressed(e);
/* 364 */             cb1.setEnabled(true);
/* 365 */             cb2.setEnabled(true);
/* 366 */             t1.setEnabled(true);
/* 367 */             cb1.removeAllItems();
/* 368 */             cb2.removeAllItems();
/* 369 */             String[] test = { "killometer", "meter", "inch", "centimeter", "millimeter", "statute mile", "foot" };
/* 370 */             for (int i = 0; i <= test.length; i++) {
/* 371 */               cb1.addItem(test[i]);
/* 372 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 376 */     Rbtn6.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 379 */             super.mousePressed(e);
/*     */             
/* 381 */             super.mousePressed(e);
/* 382 */             cb1.setEnabled(true);
/* 383 */             cb2.setEnabled(true);
/* 384 */             t1.setEnabled(true);
/* 385 */             cb1.removeAllItems();
/* 386 */             cb2.removeAllItems();
/* 387 */             String[] test = { "Hours", "Minutes", "Seconds", "Days" };
/* 388 */             for (int i = 0; i <= test.length; i++) {
/* 389 */               cb1.addItem(test[i]);
/* 390 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 394 */     Rbtn7.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e) {
/* 397 */             super.mousePressed(e);
/*     */             
/* 399 */             super.mousePressed(e);
/* 400 */             cb1.setEnabled(true);
/* 401 */             cb2.setEnabled(true);
/* 402 */             t1.setEnabled(true);
/* 403 */             cb1.removeAllItems();
/* 404 */             cb2.removeAllItems();
/* 405 */             String[] test = { "" };
/* 406 */             for (int i = 0; i <= test.length; i++) {
/* 407 */               cb1.addItem(test[i]);
/* 408 */               cb2.addItem(test[i]);
/*     */             } 
/*     */           }
/*     */         });
/* 412 */     btn1.addActionListener(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 415 */             String nameCurrency1 = cb1.getSelectedItem().toString();
/* 416 */             String nameCurrency2 = cb2.getSelectedItem().toString();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 423 */             Double Amount = Double.valueOf(0.0D);
/* 424 */             Double value = Double.valueOf(0.0D);
/* 425 */             DecimalFormat format = new DecimalFormat("#0.000");
/*     */ 
/*     */             
/* 428 */             Amount = Double.valueOf(Double.parseDouble(t1.getText()));
/*     */             
/* 430 */             Double price = unit_convert.this.CurrencyConvert(nameCurrency1, nameCurrency2, Amount);
/*     */             
/* 432 */             String formattedAmount = format.format(Amount);
/* 433 */             String formattedprice = format.format(price);
/*     */             
/* 435 */             t1.setText(formattedAmount);
/*     */             
/* 437 */             String result = formattedAmount + formattedAmount + "  equal to  " + nameCurrency1;
/* 438 */             String result1 = formattedprice;
/* 439 */             l7.setText(result);
/* 440 */             l2.setText(result1);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Double CurrencyConvert(String Con1, String Con2, Double AMt) {
/* 449 */     Double z = null;
/*     */     
/* 451 */     if (Con1 == "KILLO-METER") {
/* 452 */       if (Con2 == "METER") {
/* 453 */         Double Value = AMt;
/* 454 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 457 */       else if (Con2 == "CENTIMETER") {
/* 458 */         Double Value = AMt;
/* 459 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 462 */       else if (Con2 == "MILLIMETER") {
/* 463 */         Double Value = AMt;
/* 464 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 467 */       else if (Con2 == "INCH") {
/* 468 */         Double Value = AMt;
/* 469 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 472 */       else if (Con2 == "STATUTE MILE") {
/* 473 */         Double Value = AMt;
/* 474 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 477 */       else if (Con2 == "FOOT") {
/* 478 */         Double Value = AMt;
/* 479 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 482 */       else if (Con2 == "KILLO-METER") {
/* 483 */         Double Value = AMt;
/* 484 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
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
/* 747 */     if (Con1 == "Celsius") {
/* 748 */       if (Con2 == "fahrenheit") {
/*     */         
/* 750 */         Double Value = AMt;
/* 751 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 753 */       else if (Con2 == "Celsius") {
/*     */         
/* 755 */         Double Value = AMt;
/* 756 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
/* 759 */     if (Con2 == "fahrenheit") {
/* 760 */       if (Con2 == "Celsius") {
/* 761 */         Double Value = AMt;
/* 762 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 764 */       else if (Con2 == "fahrenheit") {
/*     */         
/* 766 */         Double Value = AMt;
/* 767 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
/* 770 */     if (Con1 == "Hours")
/* 771 */       if (Con2 == "Seconds") {
/* 772 */         Double Value = AMt;
/* 773 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 776 */       else if (Con2 == "Minutes") {
/* 777 */         Double Value = AMt;
/* 778 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 780 */       else if (Con2 == "Hours") {
/* 781 */         Double Value = AMt;
/* 782 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 784 */       else if (Con2 == "Days") {
/* 785 */         Double Value = AMt;
/* 786 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 788 */       else if (Con2 == "Hours") {
/* 789 */         Double Value = AMt;
/* 790 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }  
/* 792 */     if (Con1 == "Hours") {
/* 793 */       if (Con2 == "Seconds") {
/* 794 */         Double Value = AMt;
/* 795 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 798 */       else if (Con2 == "Minutes") {
/* 799 */         Double Value = AMt;
/* 800 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 802 */       else if (Con2 == "Hours") {
/* 803 */         Double Value = AMt;
/* 804 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 806 */       else if (Con2 == "Days") {
/* 807 */         Double Value = AMt;
/* 808 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 810 */       else if (Con2 == "Hours") {
/* 811 */         Double Value = AMt;
/* 812 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
/* 815 */     if (Con1 == "Hours") {
/* 816 */       if (Con2 == "Seconds") {
/* 817 */         Double Value = AMt;
/* 818 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 821 */       else if (Con2 == "Minutes") {
/* 822 */         Double Value = AMt;
/* 823 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 825 */       else if (Con2 == "Hours") {
/* 826 */         Double Value = AMt;
/* 827 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 829 */       else if (Con2 == "Days") {
/* 830 */         Double Value = AMt;
/* 831 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 833 */       else if (Con2 == "Hours") {
/* 834 */         Double Value = AMt;
/* 835 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
/* 838 */     if (Con1 == "") {
/* 839 */       if (Con2 == "Seconds") {
/* 840 */         Double Value = AMt;
/* 841 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 844 */       else if (Con2 == "Minutes") {
/* 845 */         Double Value = AMt;
/* 846 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 848 */       else if (Con2 == "Hours") {
/* 849 */         Double Value = AMt;
/* 850 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 852 */       else if (Con2 == "Days") {
/* 853 */         Double Value = AMt;
/* 854 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 859 */     if (Con1 == "Days") {
/* 860 */       if (Con2 == "Seconds") {
/* 861 */         Double Value = AMt;
/* 862 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       
/*     */       }
/* 865 */       else if (Con2 == "Minutes") {
/* 866 */         Double Value = AMt;
/* 867 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 869 */       else if (Con2 == "Hours") {
/* 870 */         Double Value = AMt;
/* 871 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       }
/* 873 */       else if (Con2 == "Days") {
/* 874 */         Double Value = AMt;
/* 875 */         z = Double.valueOf(Value.doubleValue() * 1.0D);
/*     */       } 
/*     */     }
/*     */     
/* 879 */     Double z1 = z;
/* 880 */     return z1;
/*     */   }
/*     */   
/* 883 */   public static void main(String[] args) { new unit_convert(); }
/*     */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/unit_convert.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */