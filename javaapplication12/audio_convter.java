/*     */ package javaapplication12;
/*     */ import com.xuggle.mediatool.IMediaReader;
/*     */ import com.xuggle.mediatool.event.IAddStreamEvent;
/*     */ import com.xuggle.mediatool.event.IAudioSamplesEvent;
/*     */ import com.xuggle.xuggler.IStreamCoder;
/*     */ import java.awt.Color;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JProgressBar;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.JTextField;
/*     */ import org.apache.commons.io.FilenameUtils;
/*     */ 
/*     */ public class audio_convter {
/*     */   audio_convter() {
/*  23 */     final JFrame f = new JFrame("Converter");
/*     */     
/*  25 */     JLabel l1 = new JLabel();
/*  26 */     JLabel l2 = new JLabel();
/*  27 */     JLabel l3 = new JLabel();
/*  28 */     JLabel l6 = new JLabel();
/*  29 */     JLabel l5 = new JLabel();
/*  30 */     JLabel l4 = new JLabel();
/*  31 */     JLabel l7 = new JLabel();
/*     */     
/*  33 */     final JButton btn1 = new JButton("MONEY CONVERT");
/*  34 */     final JButton btn2 = new JButton("DOCUMENT CONVERT");
/*  35 */     final JButton btn3 = new JButton("AUDIO CONVERT");
/*  36 */     final JButton btn4 = new JButton("UNIT CONVERT");
/*  37 */     final JButton btn5 = new JButton("Admin Panel");
/*  38 */     JButton btn6 = new JButton("Download");
/*  39 */     JButton btn7 = new JButton("MP4 TO MP3");
/*  40 */     JButton btn8 = new JButton("FLV TO MP3");
/*  41 */     JButton btn9 = new JButton("WAM TO MP3");
/*  42 */     final JProgressBar jp = new JProgressBar(0, 0, 100);
/*  43 */     jp.setValue(0);
/*  44 */     jp.setStringPainted(true);
/*     */     
/*  46 */     JSeparator js1 = new JSeparator();
/*     */ 
/*     */     
/*  49 */     JSeparator js = new JSeparator(1);
/*  50 */     JTextField t1 = new JTextField();
/*  51 */     JRadioButton rbtn1 = new JRadioButton("mp3");
/*  52 */     JRadioButton rbtn2 = new JRadioButton("mp4");
/*  53 */     ButtonGroup bg = new ButtonGroup();
/*  54 */     bg.add(rbtn1); bg.add(rbtn2);
/*  55 */     f.add(btn1); f.add(btn2); f.add(btn3); f.add(btn4);
/*  56 */     f.add(l1); f.add(btn5); f.add(l3); f.add(l4);
/*  57 */     f.add(js); f.add(t1); f.add(rbtn1); f.add(rbtn2); f.add(js1);
/*  58 */     f.add(l2); f.add(btn6); f.add(l5); f.add(l6); f.add(jp);
/*  59 */     f.add(btn7); f.add(btn8); f.add(btn9); f.add(l7); f.add(jp);
/*  60 */     ImageIcon i1 = new ImageIcon("/Users/ramanpreetsingh/Desktop/AKS_University_logo_50x50.png");
/*  61 */     l6.setIcon(i1);
/*  62 */     l5.setBounds(70, 480, 200, 35);
/*  63 */     l6.setBounds(10, 470, 50, 50);
/*  64 */     l5.setText("AKS UNIVERSITY");
/*  65 */     l5.setFont(l1.getFont().deriveFont(24.0F));
/*  66 */     l7.setText("AUDIO CONVERT");
/*  67 */     l1.setBounds(55, 15, 250, 75);
/*  68 */     jp.setBounds(18, 400, 250, 50);
/*  69 */     btn1.setBounds(18, 100, 250, 50);
/*  70 */     btn2.setBounds(18, 150, 250, 50);
/*  71 */     btn3.setBounds(18, 200, 250, 50);
/*  72 */     btn4.setBounds(18, 250, 250, 50);
/*  73 */     btn5.setBounds(18, 300, 250, 50);
/*  74 */     l3.setBounds(600, 460, 120, 50);
/*  75 */     l4.setBounds(600, 480, 200, 50);
/*  76 */     js.setBounds(275, 0, 800, 550);
/*  77 */     btn7.setBounds(450, 150, 125, 35);
/*  78 */     btn8.setBounds(450, 250, 125, 35);
/*  79 */     btn9.setBounds(450, 350, 125, 35);
/*  80 */     l7.setBounds(400, 10, 300, 75);
/*  81 */     js1.setBounds(279, 100, 800, 500);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     l7.setFont(l1.getFont().deriveFont(34.0F));
/*  89 */     l1.setFont(l1.getFont().deriveFont(34.0F));
/*     */     
/*  91 */     l1.setText("E-CONVERT");
/*  92 */     l3.setText("Raman Preet Singh");
/*  93 */     l4.setText("CS DEPARTMENT Bsc(IT)(H)");
/*     */     
/*  95 */     btn1.addActionListener(new AbstractAction()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  98 */             new JavaApplication12();
/*  99 */             f.dispose();
/*     */           }
/*     */         });
/* 102 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 105 */             super.mouseClicked(e);
/* 106 */             new unit_convert();
/* 107 */             f.dispose();
/*     */           }
/*     */         });
/* 110 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 113 */             super.mouseClicked(e);
/* 114 */             new Admin();
/* 115 */             f.dispose();
/*     */           }
/*     */         });
/* 118 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 121 */             super.mouseClicked(e);
/* 122 */             new doc();
/* 123 */             f.dispose();
/*     */           }
/*     */         });
/* 126 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 129 */             super.mouseEntered(e);
/* 130 */             btn1.setBackground(Color.green);
/* 131 */             btn1.setContentAreaFilled(true);
/* 132 */             btn1.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 136 */     btn1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 139 */             super.mouseExited(e);
/* 140 */             btn1.setBackground(null);
/* 141 */             btn1.setContentAreaFilled(true);
/* 142 */             btn1.setOpaque(false);
/*     */           }
/*     */         });
/* 145 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 148 */             super.mouseEntered(e);
/* 149 */             btn2.setBackground(Color.green);
/* 150 */             btn2.setContentAreaFilled(true);
/* 151 */             btn2.setOpaque(true);
/*     */           }
/*     */         });
/*     */     
/* 155 */     btn2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 158 */             super.mouseExited(e);
/* 159 */             btn2.setBackground(null);
/* 160 */             btn2.setContentAreaFilled(true);
/* 161 */             btn2.setOpaque(false);
/*     */           }
/*     */         });
/* 164 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 167 */             super.mouseEntered(e);
/* 168 */             btn3.setBackground(Color.red);
/* 169 */             btn3.setContentAreaFilled(true);
/* 170 */             btn3.setOpaque(true);
/* 171 */             btn3.setEnabled(false);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 176 */     btn3.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 179 */             super.mouseExited(e);
/* 180 */             btn3.setBackground(null);
/* 181 */             btn3.setContentAreaFilled(true);
/* 182 */             btn3.setOpaque(false);
/*     */           }
/*     */         });
/* 185 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 188 */             super.mouseEntered(e);
/* 189 */             btn4.setBackground(Color.green);
/* 190 */             btn4.setContentAreaFilled(true);
/* 191 */             btn4.setOpaque(true);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 196 */     btn4.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 199 */             super.mouseExited(e);
/* 200 */             btn4.setBackground(null);
/* 201 */             btn4.setContentAreaFilled(true);
/* 202 */             btn4.setOpaque(false);
/*     */           }
/*     */         });
/* 205 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 208 */             super.mouseEntered(e);
/* 209 */             btn5.setBackground(Color.green);
/* 210 */             btn5.setContentAreaFilled(true);
/* 211 */             btn5.setOpaque(true);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 216 */     btn5.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseExited(MouseEvent e) {
/* 219 */             super.mouseExited(e);
/* 220 */             btn5.setBackground(null);
/* 221 */             btn5.setContentAreaFilled(true);
/* 222 */             btn5.setOpaque(false);
/* 223 */             btn5.setEnabled(true);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 229 */     f.setSize(new Dimension(800, 550));
/* 230 */     f.setResizable(false);
/* 231 */     f.setLocationRelativeTo(null);
/* 232 */     f.setDefaultCloseOperation(3);
/*     */     
/* 234 */     f.setLayout(null);
/* 235 */     f.setVisible(true);
/*     */     
/* 237 */     btn7.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 240 */             super.mouseClicked(e);
/* 241 */             jp.setValue(0);
/* 242 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 243 */             int i = jf.showOpenDialog(null);
/* 244 */             if (i == 0) {
/* 245 */               String st = new String(jf.getSelectedFile().getPath());
/* 246 */               String output = new String();
/* 247 */               System.out.println(st);
/* 248 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 250 */               if ("mp4".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 252 */                   audio_convter.this.convert(st, output);
/* 253 */                   for (int x = 0; x <= 100; x++) {
/* 254 */                     jp.setValue(x);
/*     */                   }
/*     */                 }
/* 257 */                 catch (Exception q) {
/* 258 */                   System.out.println("error occured");
/*     */                 }
/*     */               
/*     */               } else {
/*     */                 
/* 263 */                 JOptionPane.showMessageDialog(f, "error not a mp4 file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 268 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 273 */     btn8.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 276 */             super.mouseClicked(e);
/* 277 */             jp.setValue(0);
/* 278 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 279 */             int i = jf.showOpenDialog(null);
/* 280 */             if (i == 0) {
/* 281 */               String st = new String(jf.getSelectedFile().getPath());
/* 282 */               String output = new String();
/* 283 */               System.out.println(st);
/* 284 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 286 */               if ("flv".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 288 */                   audio_convter.this.convert(st, output);
/* 289 */                   for (int x = 0; x <= 100; x++) {
/* 290 */                     jp.setValue(x);
/*     */                   }
/* 292 */                 } catch (Exception q) {
/* 293 */                   System.out.println("error occured");
/*     */                 }
/*     */               
/*     */               } else {
/*     */                 
/* 298 */                 JOptionPane.showMessageDialog(f, "error not a mp4 file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 303 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/* 307 */     btn9.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 310 */             super.mouseClicked(e);
/* 311 */             jp.setValue(0);
/* 312 */             JFileChooser jf = new JFileChooser("/Users/ramanpreetsingh/Desktop/");
/* 313 */             int i = jf.showOpenDialog(null);
/* 314 */             if (i == 0) {
/* 315 */               String st = new String(jf.getSelectedFile().getPath());
/* 316 */               String output = new String();
/* 317 */               System.out.println(st);
/* 318 */               String ext = FilenameUtils.getExtension(st);
/*     */               
/* 320 */               if ("wam".equalsIgnoreCase(ext)) {
/*     */                 try {
/* 322 */                   audio_convter.this.convert(st, output);
/* 323 */                   for (int x = 0; x <= 100; x++) {
/* 324 */                     jp.setValue(x);
/*     */                   }
/* 326 */                 } catch (Exception q) {
/* 327 */                   System.out.println("error occured");
/*     */                 }
/*     */               
/*     */               } else {
/*     */                 
/* 332 */                 JOptionPane.showMessageDialog(f, "error not a mp4 file");
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 337 */               JOptionPane.showMessageDialog(f, "Cancelled by User");
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   String convert(String pt, String outp) {
/* 348 */     final String to = pt + ".mp3";
/* 349 */     IMediaReader mediaReader = ToolFactory.makeReader(pt);
/* 350 */     int mySampleRate = 44100;
/* 351 */     int myChannels = 2;
/*     */     
/* 353 */     mediaReader.addListener((IMediaListener)new MediaToolAdapter()
/*     */         {
/*     */           private IContainer container;
/*     */           
/*     */           private IMediaWriter mediaWriter;
/*     */           
/*     */           public void onOpenCoder(IOpenCoderEvent event) {
/* 360 */             this.container = event.getSource().getContainer();
/* 361 */             this.mediaWriter = null;
/*     */           }
/*     */ 
/*     */           
/*     */           public void onAudioSamples(IAudioSamplesEvent event) {
/* 366 */             if (this.container != null) {
/* 367 */               if (this.mediaWriter == null) {
/* 368 */                 this.mediaWriter = ToolFactory.makeWriter(to);
/*     */                 
/* 370 */                 this.mediaWriter.addListener((IMediaListener)new MediaListenerAdapter()
/*     */                     {
/*     */                       public void onAddStream(IAddStreamEvent event)
/*     */                       {
/* 374 */                         IStreamCoder streamCoder = event.getSource().getContainer().getStream(event.getStreamIndex().intValue()).getStreamCoder();
/* 375 */                         streamCoder.setFlag(IStreamCoder.Flags.FLAG_QSCALE, false);
/* 376 */                         streamCoder.setBitRate(128);
/* 377 */                         streamCoder.setChannels(2);
/* 378 */                         streamCoder.setSampleRate(44100);
/* 379 */                         streamCoder.setBitRateTolerance(0);
/*     */                       }
/*     */                     });
/*     */                 
/* 383 */                 this.mediaWriter.addAudioStream(0, 0, 2, 44100);
/*     */               } 
/* 385 */               this.mediaWriter.encodeAudio(0, event.getAudioSamples());
/* 386 */               System.out.println(event.getTimeStamp().longValue() / 1000L);
/*     */             } 
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void onClose(ICloseEvent event) {
/* 393 */             if (this.mediaWriter != null) {
/* 394 */               this.mediaWriter.close();
/*     */             }
/*     */           }
/*     */         });
/*     */     
/* 399 */     while (mediaReader.readPacket() == null);
/*     */ 
/*     */     
/* 402 */     String outpp = new String("test progress bar");
/* 403 */     return outpp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 409 */   public static void main(String[] args) { new audio_convter(); }
/*     */ }


/* Location:              /Users/ramanpreetsingh/MEGAsync Downloads/JavaApplication12/JavaApplication12.jar!/javaapplication12/audio_convter.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.2
 */