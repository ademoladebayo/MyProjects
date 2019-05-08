package RandoBet ;
        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADEBAYO ADEMOLA
 */ 
import java.util.Random;
import javax.swing.JOptionPane;


public class FinalRando extends javax.swing.JFrame { 
    //GAMES VARIABLES  
    
    String status =null , result = null , prediction = null , game = null, gametype = null; 
    double odd = 0.0 , stake = 0.0 , pw = 0.0 , aw = 0.0;
    //randonumbers 
    int r1,r2,r3,r4,r5; 
    //randocolours 
    int c1,c2,c3,c4,c5; 
    int rc,bc,gc,wc,yc;
      //randodice  
    int di1,di2;
    int d1 = 0,d2 = 0;  
      //randodograce 
    int do1,do2,do3,do4,do5; 
    int fp,sp,tp,fi,si,ti; 
    int [] d  = new int [5];
    
    
    //STOP WATCH VARIABLES 
    static int mins = 0;  
    static int secs = 30;  
    static int millisecs = 1000; 
    static boolean state = true; 

    /**
     * Creates new form FinalRando
     */
    public FinalRando() {
        initComponents(); 
        intialCondition();
         stopWatch();
    }  
    public void intialCondition(){ 
    milliseconds.setVisible(false);
    //RANDO NUMBERS
    num1.setEnabled(false); 
    num2.setEnabled(false); 
    num3.setEnabled(false); 
    num4.setEnabled(false); 
    num5.setEnabled(false);  
     //RANDO COLOURS
    red.setEnabled(false); 
    blue.setEnabled(false); 
    yellow.setEnabled(false); 
    green.setEnabled(false); 
    white.setEnabled(false);   
     //RANDO DICES
    dice1.setEnabled(false); 
   dice2.setEnabled(false); 
     //RANDO DOG RACE
    fpd.setEnabled(false); 
   tpd.setEnabled(false); 
   // RECEIPT BUTTON 
    send.setEnabled(false);
    reset.setEnabled(false); 
    print.setEnabled(true);   
    
    
    
     randoNumbers.setSelected(false); 
     randoColours.setSelected(false); 
    randoDices.setSelected(false); 
    randoDR.setSelected(false);  
    
  
       RN.setSelected(false);  
      SH.setSelected(false);
      onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false); 
     fourdir.setSelected(false); 
     fivedir.setSelected(false); 
    
    //INTIAL TEXTS 
     num1.setText(null); 
    num2.setText(null);  
    num3.setText(null); 
    num4.setText(null); 
    num5.setText(null);  
     //RANDO COLOURS
    red.setText(null); 
    blue.setText(null); 
    yellow.setText(null); 
    green.setText(null); 
    white.setText(null); 
     //RANDO DICES
    dice1.setText(null); 
    dice2.setText(null); 
     //RANDO DOG RACE
    fpd.setText(null);  
    spd.setText(null);  
   tpd.setText(null);  
  
   randoNumbers.setEnabled(false); 
   randoColours.setEnabled(false); 
    randoDices.setEnabled(false); 
    randoDR.setEnabled(false);  
    }
    
    public void stopWatch(){ 
        mins = 0;  
        secs = 30;  
       millisecs = 1000; 
       state = true; 
        Thread t = new Thread(){
         public void run(){
        for( ; ; ){
        
        if (state==true){  
            try{
            sleep(1);
           
            if (millisecs < 1){  
            secs--;
            millisecs = 1000; 
            
            
            } if(secs < 1){ 
            millisecs = 1000; 
            secs = 30;
            mins--;
            }
            
            
            }catch(Exception e){
            
            
            
            }
         millisecs --;  
        minutes.setText( "0"+mins + " : ");    
        seconds.setText( +secs + "");      
        
         
         } 
         if(mins == 0 && secs == 20){  
          Games();
    
        } 
        
        
        if(mins == 0 && secs == 15){  
     randoNumbers.setEnabled(true); 
    randoColours.setEnabled(true); 
    randoDices.setEnabled(true); 
    randoDR.setEnabled(true);  
    
        send.setEnabled(true);
        reset.setEnabled(true);
        print.setEnabled(true);  
    
        } 
        
        if(mins == 0 && secs == 1){ 
        state = false;
        minutes.setText( "00:");    
        seconds.setText( "00");     
        new  RandoResult(r1,r2,r3,r4,r5,c1,c2,c3,c4,c5,d1,d2,fi,si,ti).setVisible(true); 
        
        
        break;
        } 
        
        }
        
        
        
        } 
         
        };
        
        
        
  t.start();  
    } 
    
    
    
    public  void Games(){ 
        
    Random r = new Random();  
    // RANDONUMBERS
    r1 = r.nextInt(20) + 1; do2 = r.nextInt(20) + 1;  c4 =  r.nextInt(5) + 1; d2 =r.nextInt(6) + 1;    r5 =  r.nextInt(20) + 1;   
    // RANDOCOLOURS
    c1 = r.nextInt(5) + 1;  do5 =r.nextInt(20) + 1;  c5 =  r.nextInt(5) + 1;     r3 =  r.nextInt(20) + 1;     do3 =r.nextInt(20) + 1; 
    // RANDODICE
     do1 = r.nextInt(20) + 1;       r4 =  r.nextInt(20) + 1;
   // RANDO DOGRACE
     d1 = r.nextInt(6) + 1;  r2 =  r.nextInt(20) + 1;  c3 =  r.nextInt(5) + 1;        do4 =r.nextInt(20) + 1;     c2 =  r.nextInt(5) + 1;
    
     
     
        if (do1 == do2 || do1 == do3 || do1 == do4 || do1 ==  do5) {
        do1 = do1 +1;
        }
    if (do2 == do1 ||do2 ==do3 ||do2 ==do4 ||do2 == do5) {
        do2 =do2 + 2;
        }
    if (do3 == r1 || do3 ==do2|| do3 == do4 || do1 == do5) {
       do3 = do3 + 3;
        }
     if (do4 == do1 || do4 == do2|| do4== do3 || do4 ==  do5) {
         do4 = do4 + 4;
        }
     if (do5 == do1 || do5 == do2||do5 == do4 || do5 == do3) {
         do5 = do5 +5;
        }  
     
    
     
     // MODIFICATION CONDITIONS
     if (r1 == r2 || r1 == r3 || r1 == r4 || r1 ==  r5) {
         r1 = r1 - 1;
        }
    if (r2 == r1 || r2 == r3 || r2 == r4 || r2 == r5) {
         r2 = r2 - 2;
        }
    if (r3 == r1 || r3 == r2|| r3 == r4 || r1 ==  r5) {
        r3 = r3 - 1;
        }
     if (r4 == r1 || r4 == r2|| r4== r3 || r4 ==  r5) {
         r4 = r4 - 2;
        }
     if (r5 == r1 || r5 == r2|| r5 == r4 || r5 ==  r3) {
         r5 = r5 - 1;
        }   
     
     
      
      
     
     if(r1 < 1){ 
     r1+=3;
     }
      if(r2 < 1){ 
     r2+=4;
     }
      if(r3 < 1){ 
     r3+=5;
     }
      if(r4 < 1){ 
     r4+=6;
     }
      if(r5 < 1){ 
     r5+=7;
     }
   
      while(true){
      fi= r.nextInt(5) + 1; si= r.nextInt(5) + 1; ti= r.nextInt(5) + 1;
      
      if(fi != si && fi != ti && ti !=si){ 
      break;
      }
      
      } 
     

      
      
      
  /*   receiptArea.setText( "NUMBERS         :" +  r1 + " " + r2 + " " + r3 +" " +  r4 + " " + r5   +"\n"
                                 + "COLOUR           :"  +  c1 + " " + c2 + " " + c3 +" " +  c4 + " " + c5 +"\n"
                                 + "DICES RESULT   :" + d1  + " " + d2 +"\n"
                                 +   "DOG RACE         :" +(fi) + " " + (si)+ " " + (ti) + "\n"
                                                                
                                 + "DOG PROBLEM   :" + do1 + " " + do2 + " " + do3 +" " +  do4 + " " + do5 +"\n"
                                
                     );*/
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fpdl = new javax.swing.JLabel();
        fpd = new javax.swing.JTextField();
        lpdl = new javax.swing.JLabel();
        tpd = new javax.swing.JTextField();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        num3 = new javax.swing.JTextField();
        num4 = new javax.swing.JTextField();
        num5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        dice1 = new javax.swing.JTextField();
        dice2 = new javax.swing.JTextField();
        dice2l = new javax.swing.JLabel();
        dice1l = new javax.swing.JLabel();
        red = new javax.swing.JTextField();
        blue = new javax.swing.JTextField();
        green = new javax.swing.JTextField();
        white = new javax.swing.JTextField();
        yellow = new javax.swing.JTextField();
        redl = new javax.swing.JLabel();
        bluel = new javax.swing.JLabel();
        greenl = new javax.swing.JLabel();
        whitel = new javax.swing.JLabel();
        yellowl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fpdl1 = new javax.swing.JLabel();
        spd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        stk = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        print = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        randoNumbers = new javax.swing.JCheckBox();
        randoColours = new javax.swing.JCheckBox();
        randoDices = new javax.swing.JCheckBox();
        randoDR = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        RN = new javax.swing.JCheckBox();
        twodir = new javax.swing.JCheckBox();
        threedir = new javax.swing.JCheckBox();
        fourdir = new javax.swing.JCheckBox();
        fivedir = new javax.swing.JCheckBox();
        seconds = new javax.swing.JLabel();
        minutes = new javax.swing.JLabel();
        milliseconds = new javax.swing.JLabel();
        SH = new javax.swing.JCheckBox();
        onedir = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setText("3");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel26.setText("BLUE");

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel29.setText("WHITE");

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jCheckBox6.setText("RANDO NUMBERS");

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        jCheckBox11.setText("1-direct");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 141, 852, -1));

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/LO.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/num.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/b.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/dog.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/di.png"))); // NOI18N

        fpdl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fpdl.setText("FIRST PLACE DOG");

        fpd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fpd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fpd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));

        lpdl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lpdl.setText("THIRD PLACE DOG");

        tpd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tpd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tpd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        num1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        num2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        num3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        num3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        num4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        num4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        num5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        num5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("1st");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("2nd");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("3nd");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("4th");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setText("5th");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/r1.png"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/y.png"))); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/g1.png"))); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dice1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dice1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        dice2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dice2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dice2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        dice2l.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dice2l.setText("DICE2");

        dice1l.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dice1l.setText("DICE1");

        red.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        red.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        red.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));

        blue.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        blue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        blue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));

        green.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        green.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        green.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 3));

        white.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        white.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        white.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });

        yellow.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        yellow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yellow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3));
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });

        redl.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        redl.setText("RED");

        bluel.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        bluel.setText("BLUE");

        greenl.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        greenl.setText("GREEN");

        whitel.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        whitel.setText("WHITE");

        yellowl.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        yellowl.setText("YELLOW");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("GAMES SECTION");

        fpdl1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fpdl1.setText("SECOND PLACE DOG");

        spd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        spd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        spd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/w.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(redl)
                        .addGap(18, 18, 18)
                        .addComponent(bluel)
                        .addGap(18, 18, 18)
                        .addComponent(greenl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whitel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yellowl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yellow, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dice1l))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dice2l, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lpdl)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fpdl)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fpdl1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fpd, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(tpd)
                            .addComponent(spd, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tpd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fpdl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fpd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fpdl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dice1l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dice2l))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lpdl)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bluel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greenl)
                            .addComponent(whitel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yellowl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1020, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("STAKE(NGN)");

        stk.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        stk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stk.setText("jTextField1");
        stk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        stk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stkActionPerformed(evt);
            }
        });
        stk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stkKeyPressed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 51, 51));
        reset.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(0, 153, 153));
        print.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        send.setBackground(new java.awt.Color(0, 153, 51));
        send.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setText("SEND");
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
        });
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        receiptArea.setColumns(20);
        receiptArea.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        receiptArea.setRows(5);
        jScrollPane1.setViewportView(receiptArea);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("TICKET ID");

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("jTextField2");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton4.setBackground(new java.awt.Color(0, 153, 51));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SEARCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(send)
                        .addGap(10, 10, 10)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 135, 330, 550));

        randoNumbers.setBackground(new java.awt.Color(255, 0, 0));
        randoNumbers.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        randoNumbers.setForeground(new java.awt.Color(255, 255, 255));
        randoNumbers.setText("RANDO NUMBERS");
        randoNumbers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randoNumbersMouseClicked(evt);
            }
        });
        jPanel6.add(randoNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 11, -1, -1));

        randoColours.setBackground(new java.awt.Color(255, 0, 0));
        randoColours.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        randoColours.setForeground(new java.awt.Color(255, 255, 255));
        randoColours.setText("RANDO COLOURS");
        randoColours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randoColoursMouseClicked(evt);
            }
        });
        jPanel6.add(randoColours, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 11, -1, -1));

        randoDices.setBackground(new java.awt.Color(255, 0, 0));
        randoDices.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        randoDices.setForeground(new java.awt.Color(255, 255, 255));
        randoDices.setText("RANDO DICES");
        randoDices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randoDicesMouseClicked(evt);
            }
        });
        jPanel6.add(randoDices, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 11, -1, -1));

        randoDR.setBackground(new java.awt.Color(255, 0, 0));
        randoDR.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        randoDR.setForeground(new java.awt.Color(255, 255, 255));
        randoDR.setText("RANDO DOG RACE");
        randoDR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randoDRMouseClicked(evt);
            }
        });
        jPanel6.add(randoDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 11, -1, -1));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("<html> \n<B><h1> RANDO NUMBERS </h1></B> \n<table>\n<tr>\n<th></th>\n<th scope=\"col\">RANDOM</th>\n<th scope=\"col\"> SAMEHOLE </th>\n</tr>\n<tr>\n<th scope=\"row\">1 - DIRECT:</th>\n<td>1.5</td>\n<td>2.5</td>\n</tr>\n<tr>\n<th scope=\"row\">2 - DIRECT :</th>\n<td>2.0</td>\n<td>3.0</td>\n</tr>\n<tr>\n<th scope=\"row\">3 - DIRECT :</th>\n<td>2.5</td>\n<td>3.5</td>\n</tr> \n<tr>\n<th scope=\"row\">4 - DIRECT :</th>\n<td>3.5</td>\n<td>4.0</td>\n</tr> \n<tr>\n<th scope=\"row\">5 - DIRECT :</th>\n<td>4.0</td>\n<td>5.0</td>\n</tr>\n</table>\n</html>");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 209));

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("<html>\n<B><h1> RANDO  DOG RACE </h1></B>  CORRECT PREDICTION <br/><br/>ONE DOG(RANDOM DOG)   2.0<br/><br/>TWO DOGS(TWO RANDOM)  3.0<br/><br/>THREE DOGS 5.0\n\n\n</html>");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 260, 190));

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("<html>\n<B><h1> RANDO COLOURS </h1></B>\n1 RANDOM COLOUR   1.5 <br/>  2  RANDOM COLOURS 2.5 <br/>3 RANDOM COLOURS 3.0 <br/>4  RANDOM COLOURS 4.0 <br/>5 COLOURS 5.0 <br/>\n</html> \n\n\n");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 210, 160));

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("<html>\n<B><h1> RANDO  DICES </h1></B>  PREDICTION OF  CORRECT RESULT OF DICE 3.0<br/><br/> ONE CORRECT PREDICTION , YOU GET HALF OF YOUR STAKE BACK.\n\n\n</html>");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 212, 220));

        RN.setBackground(new java.awt.Color(255, 0, 0));
        RN.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        RN.setForeground(new java.awt.Color(255, 255, 255));
        RN.setText("RANDOM");
        RN.setEnabled(false);
        RN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RNMouseClicked(evt);
            }
        });
        jPanel6.add(RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 38, -1, -1));

        twodir.setBackground(new java.awt.Color(255, 0, 0));
        twodir.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        twodir.setForeground(new java.awt.Color(255, 255, 255));
        twodir.setText("2-direct");
        twodir.setEnabled(false);
        twodir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twodirMouseClicked(evt);
            }
        });
        twodir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twodirActionPerformed(evt);
            }
        });
        jPanel6.add(twodir, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 59, -1, -1));

        threedir.setBackground(new java.awt.Color(255, 0, 0));
        threedir.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        threedir.setForeground(new java.awt.Color(255, 255, 255));
        threedir.setText("3-direct");
        threedir.setEnabled(false);
        threedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threedirMouseClicked(evt);
            }
        });
        jPanel6.add(threedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 80, -1, -1));

        fourdir.setBackground(new java.awt.Color(255, 0, 0));
        fourdir.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        fourdir.setForeground(new java.awt.Color(255, 255, 255));
        fourdir.setText("4-direct");
        fourdir.setEnabled(false);
        fourdir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourdirMouseClicked(evt);
            }
        });
        jPanel6.add(fourdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 80, -1, -1));

        fivedir.setBackground(new java.awt.Color(255, 0, 0));
        fivedir.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        fivedir.setForeground(new java.awt.Color(255, 255, 255));
        fivedir.setText("5-direct");
        fivedir.setEnabled(false);
        fivedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fivedirMouseClicked(evt);
            }
        });
        jPanel6.add(fivedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 101, -1, -1));

        seconds.setBackground(new java.awt.Color(255, 0, 0));
        seconds.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70)); // NOI18N
        seconds.setForeground(new java.awt.Color(255, 255, 255));
        seconds.setText("00");
        jPanel6.add(seconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, -1, 63));

        minutes.setBackground(new java.awt.Color(255, 0, 0));
        minutes.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70)); // NOI18N
        minutes.setForeground(new java.awt.Color(255, 255, 255));
        minutes.setText("00:");
        minutes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minutesMouseClicked(evt);
            }
        });
        jPanel6.add(minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, -1, -1));

        milliseconds.setBackground(new java.awt.Color(255, 0, 0));
        milliseconds.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        milliseconds.setForeground(new java.awt.Color(255, 255, 255));
        milliseconds.setText("00");
        jPanel6.add(milliseconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 20, 20));

        SH.setBackground(new java.awt.Color(255, 0, 0));
        SH.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        SH.setForeground(new java.awt.Color(255, 255, 255));
        SH.setText("SAMEHOLE");
        SH.setEnabled(false);
        SH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHMouseClicked(evt);
            }
        });
        jPanel6.add(SH, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 38, -1, -1));

        onedir.setBackground(new java.awt.Color(255, 0, 0));
        onedir.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        onedir.setForeground(new java.awt.Color(255, 255, 255));
        onedir.setText("1-direct");
        onedir.setEnabled(false);
        onedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onedirMouseClicked(evt);
            }
        });
        onedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedirActionPerformed(evt);
            }
        });
        jPanel6.add(onedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 59, -1, -1));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("ODDS");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 120, 27));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 704));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stkActionPerformed
        // TODO add your handling code here: 
        
        if(stk.getText().equals("")){ 
         JOptionPane.showMessageDialog(null,"PLEASE ENTER YOUR STAKE");    
        } else{
          int Stk = Integer.parseInt(stk.getText()); 
         if (Stk < 50 || Stk > 1000){ 
        JOptionPane.showMessageDialog(null,"STAKE SHOULD NOT BE LESS 50(NGN) AND GREATER THAN 1000(NGN)");   
        
        
        } else{ 
         stake = Integer.parseInt(stk.getText()); 
        
        
        if(randoNumbers.isSelected()){ 
         int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3 = Integer.parseInt(num3.getText());
        int n4 = Integer.parseInt(num4.getText());
        int n5 = Integer.parseInt(num5.getText()); 
        
      if(n1 > 30 || n2> 30 || n3 > 30 || n4 > 30 || n5 > 30) { 
      
      JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD BE GREATER THAN 30");
      
      } 
      else{
          //SAME HOLE ONE DIRECT
        if(SH.isSelected() && onedir.isSelected()){

            if (n1 == r1 || n2 == r2 || n3 == r3 || n4 == r4 || n5 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/1-DIRECT"; 
            odd = 2.5;
            pw = odd * stake; 
            aw= pw;

            }
            else {
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/1-DIRECT"; 
            odd = 2.5;
            pw = odd * stake; 
            aw= 0.0;

            } // SAME HOLE ONE DIRECT ENDED
        }

        //RANDOM ONE DIRECCT
        if(RN.isSelected() && onedir.isSelected()){

            if (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
            odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }

            else if (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
              odd = 1.5;
            pw = odd * stake;
            aw= pw;

            }

            else if (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
            odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }

            else if (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
             odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }

            else  if (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIREC"; 
            odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }
            else {
            status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
             odd = 1.5;
            pw = odd * stake;
            aw= 0.0;
            }

        } // END OF RANDOM ONE DIRECT
       



  
        
        // SAME HOLE 2 DIRECT

        if (SH.isSelected() && twodir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 ) {
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }
            else if (n1 == r1  &&  n3 == r3){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }    
             
        
            else if (n1 == r1  &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }
            
             else if (n1 == r1  &&  n5 == r5){ 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }  
            
            
           
             else if (n2 == r2  &&  n3 == r3){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }   
             
             
             
               else if (n2 == r2  &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
           odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }  
            
             
               else if (n2 == r2  &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }  
             
               else if (n3 == r3  &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }   
               
                 else if (n3 == r3  &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
             odd = 3.0;
            pw = odd * stake;
            }   
                 
                 
                 
                else if (n4 == r4  &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }     
             
             
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = 0.0;
            }

        } // END OF SAME HOLE TWO DIRECT   
        
        
        
        
        
         // SAMEHOLE 3 DIRECT
      
        if (SH.isSelected() && threedir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 && n3 == r3) {
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;

            }
            else if (n1 == r1  &&  n2 == r2 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
            
            
             else if (n1 == r1  &&  n2 == r2 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }  
            
            
           
             else if (n1 == r1  &&  n3 == r3 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
             
             
             
               else if (n1 == r1  &&  n3 == r3 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }  
            
             
               else if (n1 == r1  &&  n4 == r4 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }  
             
               else if (n2 == r2  &&  n3 == r3 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
               
                 else if (n2 == r2  &&  n3 == r3 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
                 
                 
                 
                else if (n2 == r2  &&  n4 == r4 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
               odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }     
                
                   else if (n3 == r3  &&  n4 == r4 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            } 
             
             
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = 0.0;
            }

        } // END OF SAMEHOLE 3 DIRECT   
        
        
        
      //SAMEHOLE 4 DIRECT
      
        if (SH.isSelected() && fourdir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 && n3 == r3  &&  n4 == r4) {
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }
            else if (n1 == r1  &&  n2 == r2 &&  n3 == r3 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }   
            
            
             else if (n1 == r1  &&  n2 == r2  &&  n4 == r4 &&  n5 == r5) { 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
            odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }  
            
            
           
             else if (n5 == r5 &&  n2 == r2 && n3 == r3  &&  n4 == r4) { 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }   
             
             
             
               else if (n1 == r1  &&  n3 == r3 &&  n5 == r5 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
            odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }  
            
             
  
             
            else{
            status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= 0.0;
            }

        } // END OF SAMEHOLE 4 DIRECT   
        
           
        
        
        
           if (SH.isSelected() && fivedir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 && n3 == r3  &&  n4 == r4 &&  n5 == r5) {
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/5-DIRECT"; 
              odd = 5.0;
            pw = odd * stake; 
            aw = pw;

            }
             
  
             
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/5-DIRECT"; 
             odd = 5.0;
            pw = odd * stake; 
            aw = 0.0;
            }

        } // END OF SAMEHOLE 5 DIRECT   
        
        
           //RANDOM AND FIVE DIRECT 
           
         if (RN.isSelected() && fivedir.isSelected()){ 
               if ((n1 == r1 || n1 == r2 || n1 == r3 ||n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 ||n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 ||n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 ||n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 ||n5 == r4 || n5 == r5)) { 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/5-DIRECT"; 
               odd = 4.0;
            pw = odd * stake;
            aw = pw;  
               }
                 
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/5-DIRECT"; 
                odd = 4.0;
            pw = odd * stake;
            aw = 0.0;  
            } 
         }
               
               
       // RANDOM AND TWO DIRECT 
               
      if (RN.isSelected() && twodir.isSelected()){ 
         if ((n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5)){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
               odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
         else if ( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
              odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
        else if ( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
              odd = 2.0;
            pw = odd * stake; 
            aw = pw;
        }
        else if ( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
            odd = 2.0;
            pw = odd * stake; 
            aw = pw;
        }
          else if ( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r3 || n3 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
        else if ( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
            odd = 2.0;
            pw = odd * stake; 
            aw = pw;
        }
      
       else if ( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
              odd = 2.0;
            pw = odd * stake; 
            aw = pw;
       }
        else if ( (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) ){ 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
            odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
      
       else if ( (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
      
      
       else if ( (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         
         }
      
         else{
            status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw =0.0;
                
            }
      
      
      }       
        
        
      
        // RANDOM AND THREE DIRECT 
               
      if (RN.isSelected() && threedir.isSelected()){ 
      
          if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          }
      
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) &&  (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
          
           }
          
          
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
               odd = 2.5;
            pw = odd * stake; 
            aw =pw;
           }
     
           
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
           status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
           }
      
          
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
           }
            else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
            }     
      
          
           else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
           }
      
           else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
           }
      
        else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
        }
      
       else if( (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
       } 
          
           else{
               status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            aw =0.0;
            }
      }
      
      
       if (RN.isSelected() && fourdir.isSelected()){ 
      
          if ((n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                 odd = 3.5;
            pw = odd * stake; 
            aw = pw;
           
          }          
          else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                 odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }

         else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }
       else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS"; 
            gametype = "RANDOM/4-DIRECT"; 
                  odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }
       
       else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                 odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }
       
        else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                odd = 3.5;
            pw = odd * stake; 
            aw = 0.0;
                
            }
       
       }    
        }
        prediction =   n1 + " "  + n2 + " "  + n3 + " "  +  n4 + " "  + n5;
        result        =   r1 + " "  + r2 + " "  + r3 + " "  +  r4 + " "  + r5;
        }   
        
        
        
       if(randoDices.isSelected()){ 
         int dc1 = Integer.parseInt(dice1.getText());
         int dc2 = Integer.parseInt(dice2.getText());
 
      if(dc1 > 6 || dc2 >6){
      
      JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR DICE PREDICTION , IT SHOULD NOT BE GREATER THAN 6");
      }else{
           if((d1 == dc1)  && (d2 == dc2)){
            status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                  odd = 3.0;
            pw = odd * stake;
           aw = pw;
               
                      
           }
           else if((d1 == dc2)  && (d2 == dc1) ){ 
             status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                   odd = 3.0;
            pw = odd * stake;
           aw = pw;
                   } 
           
           else  if((d1 == dc1)  && (d2 != dc2)){ 
             status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                 odd = 3.0; 
            pw = odd * stake;     
            aw =stake/2.0;
          
           } 
            else  if((d1 != dc1)  && (d2 == dc2)){ 
             status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                  odd = 3.0; 
            pw = odd * stake;     
            aw =stake/2.0;
           
           }
           else{  
             status = "BET LOST"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                  odd = 3.0; 
            pw = odd * stake;     
            aw = 0.0;
           } 
           
          
           
           
        
         prediction = "PREDICTION : " + dc1 + " "  + dc2;
          result = "DICE RESULT : " + d1  + " " + d2; 
      }
    }                                    
   
    
    if (randoDR.isSelected()) { 
    
  
       if (!fpd.getText().equals("") && spd.getText().equals("") && tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
              if(f > 5){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
          if(f == fi){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "FIRST PLACE";
            prediction = "DOG " + f + "FIRST PLACE";
            result =  "DOG " + fi + "FIRST PLACE"; 
            odd = 2.0;
            pw = stake * odd;  
            aw= pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "FIRST PLACE";
            prediction = "DOG " + f + "FIRST PLACE";
            result =  "DOG " + fi + "FIRST PLACE"; 
            odd = 2.0;
            pw = stake * odd; 
           aw = 0.0;
          }
              } 
       }
       
       
      if (fpd.getText().equals("") && !spd.getText().equals("") && tpd.getText() .equals("")){ 
            int s = Integer.parseInt(spd.getText()); 
            
            
              if(s>5){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
          if(s == si){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "SECOND PLACE";
            prediction = "DOG " + s + "SECOND PLACE";
            result =  "DOG " + si + "SECOND PLACE"; 
            odd = 2.0;
            pw = stake * odd; 
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "SECOND PLACE";
            prediction = "DOG " + s + "SECOND PLACE";
            result =  "DOG " + si + "SECOND PLACE"; 
             odd = 2.0;
            pw = stake * odd; 
            aw = 0.0;
          
          }
              }
       } 
       
       if (fpd.getText().equals("") && spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
          if(t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "THIRD PLACE";
            prediction = "DOG " + t + " THIRD PLACE";
            result =  "DOG " + ti + " THIRD PLACE"; 
            odd = 2.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "THIRD PLACE";
            prediction = "DOG " + t + " THIRD PLACE"; 
            result =  "DOG " + ti + " THIRD PLACE"; 
             odd = 2.0;
            pw = stake * odd; 
            aw = 0.0;
          
          }
              }
       } 
       
        if (!fpd.getText().equals("") && !spd.getText().equals("") && tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
            int s = Integer.parseInt(spd.getText()); 
            
              if(f >5 || s>5){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(f == fi && s == si){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 2ND PLACE";
            prediction = "DOG " + f  + " DOG " + s + " 1ST AND 2ND " ;
            result =  "DOG " + fi + " DOG " + si + " 1ST AND 2ND " ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 2ND PLACE";
            prediction = "DOG " + f  + " AND DOG " + s + " 1ST AND 2ND " ;
            result =  "DOG " + fi + " AND DOG " + si + " 1ST AND 2ND " ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = 0.0;
          
          }
              }  
       } 
        
        
      if (!fpd.getText().equals("") && spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(f >5 || t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(f == fi && t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 3RD PLACE";
            prediction = "DOG " + f  + "AND  DOG " + t + " 1ST AND 3RD " ;
            result =  "DOG " + fi + " AND DOG " + ti + " 1ST AND 3RD" ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 3RD PLACE";
            prediction = "DOG " + f  + "AND  DOG " + t + " 1ST AND 3RD " ;
            result =  "DOG " + fi + " AND DOG " + ti + " 1ST AND 3RD" ;
          odd = 3.0;
            pw = stake * odd;  
            aw = 0.0;
          }
              }
       } 
     
       if (fpd.getText().equals("") && !spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int s = Integer.parseInt(spd.getText()); 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(s >5 || t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(s == si && t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "2ND AND 3RD PLACE";
            prediction = "DOG " + s  + "AND  DOG " + t + " 2ND AND 3RD " ;
            result =  "DOG " + si + " AND DOG " + ti + " 2ND AND 3RD" ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "2ND AND 3RD PLACE";
            prediction = "DOG " + s  + "AND  DOG " + t + " 2ND AND 3RD " ;
            result =  "DOG " + si + " AND DOG " + ti + " 2ND AND 3RD" ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = 0.0;
          
          }
              }
       } 
       
       
       if (!fpd.getText().equals("") && !spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
            int s = Integer.parseInt(spd.getText()); 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(f >5 || s>5 || t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(f == fi && s == si && t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST , 2ND AND 3RD PLACE";
            prediction = "DOG " + f  + ", DOG " + s + " AND  DOG " + t + "1ST , 2ND AND 3RD " ;
            result =  "DOG " + fi  + ", DOG " + si + " AND  DOG " + ti + "1ST , 2ND AND 3RD " ; 
            odd = 5.0;
            pw = stake * odd;  
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST , 2ND AND 3RD PLACE";
            prediction = "DOG " + f  + ", DOG " + s + " AND  DOG " + t + "1ST , 2ND AND 3RD " ;
            result =  "DOG " + fi  + ", DOG " + si + " AND  DOG " + ti + "1ST , 2ND AND 3RD " ; 
             odd = 5.0;
            pw = stake * odd;  
            aw =0.0; 
            
          }
          
       
              }
    
    } 
    }
    
   
    if(randoColours.isSelected()){ 
        rc = 0; bc = 0; gc = 0; wc = 0; yc = 0;
          d[0] = c1; d[1] = c2 ; d[2] = c3; d[3] = c4; d[4] = c5;
      for(int i=0; i<5; i++){
      if(d[i] == 1){ 
      rc++;
      
      }
      else if(d[i] == 2){ 
          
       bc++;   
      }
      
     else if(d[i] == 3){ 
        gc++;  
          
      } 
      
      
      else if(d[i] == 4){ 
         wc++; 
          
      } 
      
      else if(d[i] == 5){ 
          yc++;
          
      }
      
      } 
        
    
 
      if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
            int r = Integer.parseInt(red.getText());
            if( r > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{   
            if(rc <= r){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED OCCURENCE";
            prediction = "RED X" + r ;
            result = "RED X" + rc ; 
              odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED OCCURENCE";
            prediction = "RED X" + r ;
            result = "RED X" + rc ; 
                odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          }
            
            }       
      
      }
      
      if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
               if( b > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{  
            if(bc <= b){ 
             status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE OCCURENCE";
            prediction = "BLUE X" + b ;
            result = "BLUE X" + bc ; 
              odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE OCCURENCE";
            prediction = "BLUE X" + b ;
            result = "BLUE X" + bc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          }
      
      } 
      }
      
      if(red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
            int g = Integer.parseInt(green.getText()); 
                    if( g > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(gc <= g){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN OCCURENCE";
            prediction = "GREEN X" + g ;
            result = "GREEN X" + gc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN OCCURENCE";
            prediction = "GREEN X" + g ;
            result = "GREEN X" + gc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw =0.0;  
          }
      
      } 
      }
      
      if(red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
           int w = Integer.parseInt(white.getText()); 
                   if( w > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(wc <= w){ 
             status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE OCCURENCE";
            prediction = "WHITE X" + w ;
            result = "WHITE X" + wc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw = pw;  
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE OCCURENCE";
            prediction = "WHITE X" + w ;
            result = "WHITE X" + wc ; 
              odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          } 
      
      } 
      }
      
       if(red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
          int y = Integer.parseInt(yellow.getText()); 
                 if( y > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{ 
            if(yc <= y){ 
             status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "YELLOW OCCURENCE";
            prediction = "YELLOW X" + y ;
            result = "YELLOW X" + yc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "YELLOW OCCURENCE";
            prediction = "YELLOW X" + y ;
            result ="YELLOW X" + yc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          } 
                 }
      }
     
      
      if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText()); 
                 if( r > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && bc <= b ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND BLUE OCCURENCE";
            prediction = "RED X" + r +" AND BLUE X" + b ;
            result ="RED X" + rc +" AND BLUE X" + bc ; 
              odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND BLUE OCCURENCE";
            prediction = "RED X" + r +" AND BLUE X" + b ;
            result ="RED X" + rc +" AND BLUE X" + bc ; 
               odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }  
                 }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int g = Integer.parseInt(green.getText()); 
         
                   if( r > 5 || g >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && gc <= g ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND GREEN OCCURENCE";
            prediction = "RED X" + r +" AND GREEN X" + g ;
            result ="RED X" + rc +" AND GREEN X" + gc ; 
               odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND GREEN OCCURENCE";
            prediction = "RED X" + r +" AND GREEN X" + g ;
            result ="RED X" + rc +" AND GREEN X" + gc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          } 
      
      } 
      }
      
       if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int w = Integer.parseInt(white.getText());
                   if( r > 5 || w >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && wc <= w ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND WHITE OCCURENCE";
            prediction = "RED X" + r +" AND WHITE X" + w ;
            result ="RED X" + rc +" AND WHITE X" +wc ;  
                 odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND WHITE OCCURENCE";
            prediction = "RED X" + r +" AND WHITE X" + w ;
            result ="RED X" + rc +" AND WHITE X" +wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0; 
            
          }
                   }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
            int r = Integer.parseInt(red.getText());
            int y = Integer.parseInt(yellow.getText()); 
                      if( r > 5 || y >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && yc <= y ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" AND YELLOW X" + y ;
            result ="RED X" + rc +" AND YELLOW X" +yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" AND YELLOW X" + y ;
            result ="RED X" + rc +" AND YELLOW X" +yc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
      
      if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
            int b = Integer.parseInt(blue.getText());
            int g = Integer.parseInt(green.getText()); 
                      if( g > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(bc <= b && gc <= g ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND GREEN OCCURENCE";
            prediction = "BLUE X" + b +" AND GREEN X" + g ;
            result ="BLUE X" + bc +" AND GREEN X" + gc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND GREEN OCCURENCE";
            prediction = "BLUE X" + b +" AND GREEN X" + g ;
            result ="BLUE X" + bc +" AND GREEN X" + gc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
         if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
            int b = Integer.parseInt(blue.getText());
            int w = Integer.parseInt(white.getText()); 
            
                      if( w > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(bc <= b && wc <= w){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" AND WHITE X" + w ;
            result ="BLUE X" + bc +" AND WHITE X" + wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" AND WHITE X" + w ;
            result ="BLUE X" + bc +" AND WHITE X" + wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
      
      
      if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
            int b = Integer.parseInt(blue.getText());
            int y = Integer.parseInt(yellow.getText()); 
                      if( y > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(bc <= b && yc <= y ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" AND YELLOW X" + y ;
            result ="BLUE X" + bc +" AND YELLOW X" + yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" AND YELLOW X" + y ;
            result ="BLUE X" + bc +" AND YELLOW X" + yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
       if(red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
            int g = Integer.parseInt(green.getText());
            int w= Integer.parseInt(white.getText()); 
            
            
                      if( g > 5 || w >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(gc <= g && wc <= w){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN AND WHITE OCCURENCE";
            prediction = "GREEN X" + g  +" AND WHITE X" + w ;
            result = "GREEN X" + gc  +" AND WHITE X" + wc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN AND WHITE OCCURENCE";
            prediction = "GREEN X" + g  +" AND WHITE X" + w ;
            result = "GREEN X" + gc  +" AND WHITE X" + wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
      
      if(red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
            int w = Integer.parseInt(white.getText());
            int y= Integer.parseInt(yellow.getText()); 
            
                              if( y > 5 || w >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(wc <= w && yc <= y){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +" AND YELLOW X" + y ;
            result = "WHITE X" + wc  +" AND YELLOW X" + yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +" AND YELLOW X" + y ;
            result = "WHITE X" + wc  +" AND YELLOW X" + yc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                              }
      }
     if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText());
         int g = Integer.parseInt(green.getText());  
                           if( r > 5 || b >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && bc <= b && gc <= g ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , BLUE AND GREEN OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND GREEN X" + g;
            result ="RED X" + rc +" , BLUE X" + bc +" AND GREEN X" + gc; 
               odd = 3.0;
            pw = stake * odd; 
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
             gametype = "RED , BLUE AND GREEN OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND GREEN X" + g;
            result ="RED X" + rc +" , BLUE X" + bc +" AND GREEN X" + gc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                           }
      }
      
       if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText());
         int w = Integer.parseInt(white.getText());  
         
         
                                if( r > 5 || b >5  || w >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && bc <= b && wc <= w ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , BLUE AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND WHITE X" + w;
            result ="RED X" + rc +" , BLUE X" + bc +" AND WHITE X" + gc; 
                odd = 3.0;
            pw = stake * odd; 
            aw =pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
           gametype = "RED , BLUE AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND WHITE X" + w;
            result ="RED X" + rc +" , BLUE X" + bc +" AND WHITE X" + gc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText());
         int y = Integer.parseInt(yellow.getText());  
         
                                if( r > 5 || b >5  || y >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && bc <= b && yc <= y ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , BLUE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND YELLOW X" + y;
            result ="RED X" + rc +" , BLUE X" + bc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , BLUE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND YELLOW X" + y;
            result ="RED X" + rc +" , BLUE X" + bc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      
     if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int g = Integer.parseInt(green.getText());
         int w = Integer.parseInt(white.getText());  
                                if( r > 5 || w >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && gc <= g && wc <= w ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0; 
           
          }  
                                }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                if( r > 5 || y >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && gc <= g && yc <= y ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc +" , GREEN X" + gc +" AND YELLOW X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc +" , GREEN X" + gc +" AND YELLOW X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      
        if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
         int g = Integer.parseInt(green.getText());
         int w = Integer.parseInt(white.getText());  
         
                                if( w > 5 || b >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(bc <= b && gc <= g && wc <= w ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE , GREEN AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND WHITE X" + w;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "BLUE , GREEN AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND WHITE X" + w;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
              odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                if( y > 5 || b >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(bc <= b && gc <= g && yc <= y ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE , GREEN AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "BLUE , GREEN AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0; 
            
          }  
                                }
      }
      
         if(red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
         int g = Integer.parseInt(green.getText()); 
         int w = Integer.parseInt(white.getText());
         int y = Integer.parseInt(yellow.getText()); 
         
                                if( w > 5 || y >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(yc <= y && gc <= g && wc <= w ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN , WHITE AND YELLOW OCCURENCE";
            prediction = "GREEN X" + g +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "GREEN X" + gc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw =pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN , WHITE AND YELLOW OCCURENCE";
            prediction = "GREEN X" + g +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "GREEN X" + gc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int w = Integer.parseInt(white.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
         
                                if( r > 5 || w >5  || y >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && yc <= y && wc <= w){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , WHITE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "RED X" + rc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , WHITE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "RED X" + rc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      
        if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
         int w = Integer.parseInt(white.getText()); 
          int y = Integer.parseInt(yellow.getText()); 
          
          
                                 if( w > 5 || b >5  || y >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(bc <= b && yc <= y && wc <= w ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE , WHITE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "BLUE , WHITE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
               odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                 }
      }
      if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
      int r = Integer.parseInt(red.getText());
       int b = Integer.parseInt(blue.getText()); 
         int g = Integer.parseInt(green.getText());
         int w = Integer.parseInt(white.getText());  
         
         
                                if( r > 5 || b >5  || g >5 || w>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && gc <= g && wc <= w && bc<=b ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
         status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
          }  
      
                                }
      }
      
     if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
      int r = Integer.parseInt(red.getText());
       int b = Integer.parseInt(blue.getText()); 
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                if( r > 5 || b >5  || g >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && gc <= g && yc <= y && bc<=b ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
           status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
          }  
      
                                }
      }
       if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int b = Integer.parseInt(blue.getText()); 
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                       if( w > 5 || b >5  || g >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(wc <= w && gc <= g && yc <= y && bc<=b ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
            
          }  
      
                                       }
      }
      
       if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int r = Integer.parseInt(red.getText()); 
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                       if( r > 5 || w >5  || g >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && gc <= g && wc <= w && yc<=y){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 4.0;
            pw = stake * odd;  
            aw = 0.0; 
            
          }  
      
                                       }
      }
        if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int r = Integer.parseInt(red.getText()); 
         int b = Integer.parseInt(blue.getText());
         int y = Integer.parseInt(yellow.getText());  
         
                                       if( r > 5 || b >5  || w >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(rc <= r && yc <= y && wc <= w && bc<=b ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" + b +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" + b +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
            
          }  
                                       }
        }
      
           if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int r = Integer.parseInt(red.getText()); 
         int b = Integer.parseInt(blue.getText());
         int y = Integer.parseInt(yellow.getText()); 
          int g = Integer.parseInt(green.getText());  
          
                                        if( r > 5 || b >5  || g >5 || y>5 || w>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(wc <= w && bc <= b && yc <= y && rc<=r && gc<=g ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE,GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" +b+  "GREEN X" +g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +"GREEN X" +gc+" AND YELLOW X" + yc; 
                 odd = 5.0;
            pw = stake * odd; 
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE,GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" +b+  "GREEN X" +g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +"GREEN X" +gc+" AND YELLOW X" + yc; 
                 odd = 5.0;
            pw = stake * odd; 
            aw = 0.0;
          }  
        }
           }
      
        
      
    
        
        }
        }  
        
        }
         receiptArea.setText( "                 RANDO BET       "+" \n" +  
                                   "--------------------------------------------------------"+ " \n" +
                                   "                    GAME        " + " \n" +
                                   "GAME-TYPE :       " + gametype + " \n" +
                                   "PREDICTION :     " + prediction + "\n" + 
                                   "STAKE :           " + stake + "(NGN)"+ "\n" + 
                                   "TOTAL ODD :       " + odd + "\n" + 
                                   "--------------------------------------------------------"+ "\n" +
                                   "POSSIBLE WINNING : " + pw + "(NGN)"+"\n"  + 
                                   "--------------------------------------------------------"+ "\n" + 
                                   "--------------------------------------------------------"+ "\n" 
    );  
    }//GEN-LAST:event_stkActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here: 
     intialCondition(); 
     send.setEnabled(true);
    reset.setEnabled(true); 
    print.setEnabled(true);    
    
    randoNumbers.setEnabled(true); 
   randoColours.setEnabled(true); 
    randoDices.setEnabled(true); 
    randoDR.setEnabled(true);  
    
    }//GEN-LAST:event_resetActionPerformed

    private void twodirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twodirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twodirActionPerformed

    private void randoNumbersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randoNumbersMouseClicked
        // TODO add your handling code here: 
     
     num1.setEnabled(true); 
    num2.setEnabled(true); 
    num3.setEnabled(true); 
    num4.setEnabled(true); 
    num5.setEnabled(true);  
        
     randoColours.setSelected(false); 
    randoDices.setSelected(false); 
    randoDR.setSelected(false);  
    
    if(randoNumbers.isSelected()){
       RN.setEnabled(true);  
      SH.setEnabled(true);
      onedir.setEnabled(true);  
      twodir.setEnabled(true);
     threedir.setEnabled(true); 
     fourdir.setEnabled(true); 
     fivedir.setEnabled(true); 
     
  
     //RANDO COLOURS
    red.setEnabled(false); 
    blue.setEnabled(false); 
    yellow.setEnabled(false); 
    green.setEnabled(false); 
    white.setEnabled(false);   
     //RANDO DICES
   dice1.setEnabled(false); 
   dice2.setEnabled(false); 
     //RANDO DOG RACE
    fpd.setEnabled(false); 
   tpd.setEnabled(false); 
   //INTIAL TEXTS 
     //RANDO COLOURS
    red.setText(null); 
    blue.setText(null); 
    yellow.setText(null); 
    green.setText(null); 
    white.setText(null); 
     //RANDO DICES
    dice1.setText(null); 
    dice2.setText(null); 
     //RANDO DOG RACE
    fpd.setText(null); 
    spd.setText(null);  
    tpd.setText(null);  
    } else{  
      RN.setSelected(false);  
      SH.setSelected(false);
      onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false); 
     fourdir.setSelected(false); 
     fivedir.setSelected(false);    
     RN.setEnabled(false);  
      SH.setEnabled(false);
      onedir.setEnabled(false);  
      twodir.setEnabled(false);
     threedir.setEnabled(false); 
     fourdir.setEnabled(false); 
     fivedir.setEnabled(false); 
      //RANDO NUMBERS
    num1.setEnabled(false); 
    num2.setEnabled(false); 
    num3.setEnabled(false); 
    num4.setEnabled(false); 
    num5.setEnabled(false);  
    
    num1.setText(null); 
    num2.setText(null);  
    num3.setText(null);  
    num4.setText(null);   
    num5.setText(null); 
  
    }
    }//GEN-LAST:event_randoNumbersMouseClicked
     
   

    private void randoColoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randoColoursMouseClicked
        // TODO add your handling code here:  
        if(randoColours.isSelected()){
     red.setEnabled(true); 
    blue.setEnabled(true); 
    yellow.setEnabled(true); 
    green.setEnabled(true); 
    white.setEnabled(true);   
        
        randoNumbers.setSelected(false); 
    randoDices.setSelected(false); 
    randoDR.setSelected(false);  
     RN.setSelected(false);  
      SH.setSelected(false);
      onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false); 
     fourdir.setSelected(false); 
     fivedir.setSelected(false); 
    RN.setEnabled(false);  
      SH.setEnabled(false);
      onedir.setEnabled(false);  
      twodir.setEnabled(false);
     threedir.setEnabled(false); 
     fourdir.setEnabled(false); 
     fivedir.setEnabled(false);  
     
     
     num1.setEnabled(false); 
    num2.setEnabled(false); 
    num3.setEnabled(false); 
    num4.setEnabled(false); 
    num5.setEnabled(false);  
    
     //RANDO DICES
   dice1.setEnabled(false); 
    dice2.setEnabled(false); 
     //RANDO DOG RACE
    fpd.setEnabled(false); 
    spd.setEnabled(false); 
   tpd.setEnabled(false); 
   
   //INTIAL TEXTS 
     num1.setText(null); 
    num2.setText(null);  
    num3.setText(null); 
    num4.setText(null); 
    num5.setText(null);  
     //RANDO DICES
   dice1.setText(null); 
   dice2.setText(null); 
     //RANDO DOG RACE
    fpd.setText(null); 
    spd.setText(null); 
   tpd.setText(null);  
        }else{ 
       
     //RANDO COLOURS
    red.setEnabled(false); 
    blue.setEnabled(false); 
    yellow.setEnabled(false); 
    green.setEnabled(false); 
    white.setEnabled(false);    
    
     red.setText(null); 
    blue.setText(null); 
    yellow.setText(null); 
    green.setText(null); 
    white.setText(null);  
    
   
        }
    }//GEN-LAST:event_randoColoursMouseClicked

    private void randoDicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randoDicesMouseClicked
        // TODO add your handling code here: 
        
  if(randoDices.isSelected()){      
   dice1.setEnabled(true); 
   dice2.setEnabled(true);  
    randoNumbers.setSelected(false); 
    randoColours.setSelected(false); 
    randoDR.setSelected(false);  
     RN.setSelected(false);  
      SH.setSelected(false);
      onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false); 
     fourdir.setSelected(false); 
     fivedir.setSelected(false); 
    RN.setEnabled(false);  
      SH.setEnabled(false);
      onedir.setEnabled(false);  
      twodir.setEnabled(false);
     threedir.setEnabled(false); 
     fourdir.setEnabled(false); 
     fivedir.setEnabled(false);  
     
     num1.setEnabled(false); 
    num2.setEnabled(false); 
    num3.setEnabled(false); 
    num4.setEnabled(false); 
    num5.setEnabled(false);  
     //RANDO COLOURS
    red.setEnabled(false); 
    blue.setEnabled(false); 
    yellow.setEnabled(false); 
    green.setEnabled(false); 
    white.setEnabled(false);   
  
     //RANDO DOG RACE
    fpd.setEnabled(false); 
    spd.setEnabled(false); 
   tpd.setEnabled(false); 
   
   //INTIAL TEXTS 
     num1.setText(null); 
    num2.setText(null); 
    num3.setText(null); 
    num4.setText(null); 
    num5.setText(null); 
     //RANDO COLOURS
    red.setText(null); 
    blue.setText(null); 
    yellow.setText(null); 
    green.setText(null); 
    white.setText(null); 
   
     //RANDO DOG RACE
    fpd.setText(null); 
    spd.setText(null); 
   tpd.setText(null);  
  }else{ 
  
     //RANDO DICES
   dice1.setEnabled(false); 
   dice2.setEnabled(false);  
   
   dice1.setText(null); 
   dice2.setText(null); 
  
  
  }
    }//GEN-LAST:event_randoDicesMouseClicked

    private void randoDRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randoDRMouseClicked
        // TODO add your handling code here:  
    if(randoDR.isSelected()){    
    fpd.setEnabled(true);
    spd.setEnabled(true);
   tpd.setEnabled(true); 
        
      randoNumbers.setSelected(false);  
      randoColours.setSelected(false);
      randoDices.setSelected(false);   
       RN.setSelected(false);  
      SH.setSelected(false);
      onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false); 
     fourdir.setSelected(false); 
     fivedir.setSelected(false);
      RN.setEnabled(false);  
      SH.setEnabled(false);
      onedir.setEnabled(false);  
      twodir.setEnabled(false);
     threedir.setEnabled(false); 
     fourdir.setEnabled(false); 
     fivedir.setEnabled(false);  
     
     num1.setEnabled(false); 
    num2.setEnabled(false); 
    num3.setEnabled(false); 
    num4.setEnabled(false); 
    num5.setEnabled(false);  
     //RANDO COLOURS
    red.setEnabled(false); 
    blue.setEnabled(false); 
    yellow.setEnabled(false); 
    green.setEnabled(false); 
    white.setEnabled(false);   
     //RANDO DICES
    dice1.setEnabled(false); 
    dice2.setEnabled(false); 
  
    //INTIAL TEXTS 
     num1.setText(null); 
    num2.setText(null);  
    num3.setText(null); 
    num4.setText(null); 
    num5.setText(null);  
     //RANDO COLOURS
    red.setText(null); 
    blue.setText(null); 
    yellow.setText(null); 
    green.setText(null); 
    white.setText(null); 
   //RANDO DICE
   dice1.setText(null); 
   dice2.setText(null); 
   
    }else { 
     //RANDO DOG RACE
    fpd.setEnabled(false); 
    spd.setEnabled(false); 
   tpd.setEnabled(false); 
   
   fpd.setText(null); 
    spd.setText(null); 
   tpd.setText(null); 
        
    
    }
    }//GEN-LAST:event_randoDRMouseClicked

    private void RNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RNMouseClicked
        // TODO add your handling code here:
         SH.setSelected(false); 
    }//GEN-LAST:event_RNMouseClicked

    private void SHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHMouseClicked
        // TODO add your handling code here: 
        RN.setSelected(false); 
    }//GEN-LAST:event_SHMouseClicked

    private void onedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onedirMouseClicked
        // TODO add your handling code here: 
      twodir.setSelected(false);  
      threedir.setSelected(false);
     fourdir.setSelected(false);  
     fivedir.setSelected(false); 
    }//GEN-LAST:event_onedirMouseClicked

    private void twodirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twodirMouseClicked
        // TODO add your handling code here: 
        onedir.setSelected(false);  
      threedir.setSelected(false);
     fourdir.setSelected(false);  
     fivedir.setSelected(false);
    }//GEN-LAST:event_twodirMouseClicked

    private void threedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threedirMouseClicked
        // TODO add your handling code here: 
        onedir.setSelected(false);  
      twodir.setSelected(false);
     fourdir.setSelected(false);  
     fivedir.setSelected(false);
    }//GEN-LAST:event_threedirMouseClicked

    private void fourdirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourdirMouseClicked
        // TODO add your handling code here: 
        onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false);  
     fivedir.setSelected(false);
    }//GEN-LAST:event_fourdirMouseClicked

    private void fivedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fivedirMouseClicked
        // TODO add your handling code here:  
           onedir.setSelected(false);  
      twodir.setSelected(false);
     threedir.setSelected(false);  
     fourdir.setSelected(false);
    }//GEN-LAST:event_fivedirMouseClicked

    private void minutesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutesMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_minutesMouseClicked

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_sendMouseClicked

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:   
        if(randoNumbers.isSelected()){ 
            if(!RN.isSelected() || !SH.isSelected()){
            JOptionPane.showMessageDialog(null,"PLEASE CHOOSE YOUR RANDOM NUMBER TYPE!!! EITHER RANDOM OR SAMEHOLE");
            
            }
            else if (RN.isSelected() || SH.isSelected()) { 
              if(  !onedir.isSelected() || !twodir.isSelected() || !threedir.isSelected() || !fourdir.isSelected() || !fivedir.isSelected()){ 
              
              JOptionPane.showMessageDialog(null,"PLEASE CHOOSE YOUR RANDOM OR SAMEHOLE TYPE!!! EITHER ONE,TWO,.... OR FIVE DIRECT");
              
              }
            }
        }
        else { 
              stake = Integer.parseInt(stk.getText()); 
        
        
        if(randoNumbers.isSelected()){ 
         int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3 = Integer.parseInt(num3.getText());
        int n4 = Integer.parseInt(num4.getText());
        int n5 = Integer.parseInt(num5.getText()); 
        
      if(n1 > 30 || n2> 30 || n3 > 30 || n4 > 30 || n5 > 30) { 
      
      JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD BE GREATER THAN 30");
      
      } 
      else{
          //SAME HOLE ONE DIRECT
        if(SH.isSelected() && onedir.isSelected()){

            if (n1 == r1 || n2 == r2 || n3 == r3 || n4 == r4 || n5 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/1-DIRECT"; 
            odd = 2.5;
            pw = odd * stake; 
            aw= pw;

            }
            else {
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/1-DIRECT"; 
            odd = 2.5;
            pw = odd * stake; 
            aw= 0.0;

            } // SAME HOLE ONE DIRECT ENDED
        }

        //RANDOM ONE DIRECCT
        if(RN.isSelected() && onedir.isSelected()){

            if (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
            odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }

            else if (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
              odd = 1.5;
            pw = odd * stake;
            aw= pw;

            }

            else if (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
            odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }

            else if (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
             odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }

            else  if (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIREC"; 
            odd = 1.5;
            pw = odd * stake;
            aw= pw;
            }
            else {
            status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/1-DIRECT"; 
             odd = 1.5;
            pw = odd * stake;
            aw= 0.0;
            }

              
              }     
           
            
     
        
        
            
            
            
            
        
         
        } // END OF RANDOM ONE DIRECT
       



  
        
        // SAME HOLE 2 DIRECT

        if (SH.isSelected() && twodir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 ) {
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }
            else if (n1 == r1  &&  n3 == r3){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }    
             
        
            else if (n1 == r1  &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }
            
             else if (n1 == r1  &&  n5 == r5){ 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }  
            
            
           
             else if (n2 == r2  &&  n3 == r3){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }   
             
             
             
               else if (n2 == r2  &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
           odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }  
            
             
               else if (n2 == r2  &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }  
             
               else if (n3 == r3  &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }   
               
                 else if (n3 == r3  &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
             odd = 3.0;
            pw = odd * stake;
            }   
                 
                 
                 
                else if (n4 == r4  &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = pw;
            }     
             
             
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/2-DIRECT"; 
            odd = 3.0;
            pw = odd * stake; 
            aw = 0.0;
            }

        } // END OF SAME HOLE TWO DIRECT   
        
        
        
        
        
         // SAMEHOLE 3 DIRECT
      
        if (SH.isSelected() && threedir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 && n3 == r3) {
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;

            }
            else if (n1 == r1  &&  n2 == r2 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
            
            
             else if (n1 == r1  &&  n2 == r2 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }  
            
            
           
             else if (n1 == r1  &&  n3 == r3 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
             
             
             
               else if (n1 == r1  &&  n3 == r3 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }  
            
             
               else if (n1 == r1  &&  n4 == r4 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }  
             
               else if (n2 == r2  &&  n3 == r3 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
               
                 else if (n2 == r2  &&  n3 == r3 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }   
                 
                 
                 
                else if (n2 == r2  &&  n4 == r4 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
               odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            }     
                
                   else if (n3 == r3  &&  n4 == r4 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
              odd = 3.5;
            pw = odd * stake; 
            aw = pw;
            } 
             
             
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/3-DIRECT"; 
             odd = 3.5;
            pw = odd * stake; 
            aw = 0.0;
            }

        } // END OF SAMEHOLE 3 DIRECT   
        
        
        
      //SAMEHOLE 4 DIRECT
      
        if (SH.isSelected() && fourdir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 && n3 == r3  &&  n4 == r4) {
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }
            else if (n1 == r1  &&  n2 == r2 &&  n3 == r3 &&  n5 == r5){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }   
            
            
             else if (n1 == r1  &&  n2 == r2  &&  n4 == r4 &&  n5 == r5) { 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
            odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }  
            
            
           
             else if (n5 == r5 &&  n2 == r2 && n3 == r3  &&  n4 == r4) { 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }   
             
             
             
               else if (n1 == r1  &&  n3 == r3 &&  n5 == r5 &&  n4 == r4){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
            odd = 4.0;
            pw = odd * stake; 
            aw= pw;
            }  
            
             
  
             
            else{
            status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/4-DIRECT"; 
             odd = 4.0;
            pw = odd * stake; 
            aw= 0.0;
            }

        } // END OF SAMEHOLE 4 DIRECT   
        
           
        
        
        
           if (SH.isSelected() && fivedir.isSelected()) {
            if( n1 == r1  &&  n2 == r2 && n3 == r3  &&  n4 == r4 &&  n5 == r5) {
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/5-DIRECT"; 
              odd = 5.0;
            pw = odd * stake; 
            aw = pw;

            }
             
  
             
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "SAMEHOLE/5-DIRECT"; 
             odd = 5.0;
            pw = odd * stake; 
            aw = 0.0;
            }

        } // END OF SAMEHOLE 5 DIRECT   
        
        
           //RANDOM AND FIVE DIRECT 
           
         if (RN.isSelected() && fivedir.isSelected()){ 
               if ((n1 == r1 || n1 == r2 || n1 == r3 ||n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 ||n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 ||n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 ||n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 ||n5 == r4 || n5 == r5)) { 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/5-DIRECT"; 
               odd = 4.0;
            pw = odd * stake;
            aw = pw;  
               }
                 
            else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/5-DIRECT"; 
                odd = 4.0;
            pw = odd * stake;
            aw = 0.0;  
            } 
         }
               
               
       // RANDOM AND TWO DIRECT 
               
      if (RN.isSelected() && twodir.isSelected()){ 
         if ((n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5)){
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
               odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
         else if ( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
              odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
        else if ( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
              odd = 2.0;
            pw = odd * stake; 
            aw = pw;
        }
        else if ( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
            odd = 2.0;
            pw = odd * stake; 
            aw = pw;
        }
          else if ( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r3 || n3 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
        else if ( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
            odd = 2.0;
            pw = odd * stake; 
            aw = pw;
        }
      
       else if ( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
              odd = 2.0;
            pw = odd * stake; 
            aw = pw;
       }
        else if ( (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) ){ 
             status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
            odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
      
       else if ( (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         }
      
      
       else if ( (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw = pw;
         
         }
      
         else{
            status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/2-DIRECT"; 
             odd = 2.0;
            pw = odd * stake; 
            aw =0.0;
                
            }
      
      
      }       
        
        
      
        // RANDOM AND THREE DIRECT 
               
      if (RN.isSelected() && threedir.isSelected()){ 
      
          if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          }
      
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) &&  (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
          
           }
          
          
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
               odd = 2.5;
            pw = odd * stake; 
            aw =pw;
           }
     
           
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
           status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
           }
      
          
           else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
           }
            else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
            }     
      
          
           else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
           }
      
           else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
           }
      
        else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) &&  (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
        }
      
       else if( (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) &&  (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            aw =pw;
          
       } 
          
           else{
               status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/3-DIRECT"; 
                 odd = 2.5;
            pw = odd * stake; 
            aw =0.0;
            }
      }
      
      
       if (RN.isSelected() && fourdir.isSelected()){ 
      
          if ((n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5)){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                 odd = 3.5;
            pw = odd * stake; 
            aw = pw;
           
          }          
          else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                 odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }

         else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }
       else if( (n1 == r1 || n1 == r2 || n1 == r3 || n1 == r4 || n1 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS"; 
            gametype = "RANDOM/4-DIRECT"; 
                  odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }
       
       else if( (n2 == r1 || n2 == r2 || n2 == r3 || n2 == r4 || n2 == r5) && (n3 == r1 || n3 == r2 || n3 == r3 || n3 == r4 || n3 == r5) && (n4 == r1 || n4 == r2 || n4 == r3 || n4 == r4 || n4 == r5) && (n5 == r1 || n5 == r2 || n5 == r3 || n5 == r4 || n5 == r5) ){ 
            status = "BET WON"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                 odd = 3.5;
            pw = odd * stake; 
            aw = pw;
          }
       
        else{
             status = "BET LOST"; 
            game = "RANDO-NUMBERS";
            gametype = "RANDOM/4-DIRECT"; 
                odd = 3.5;
            pw = odd * stake; 
            aw = 0.0;
                
            }
       
       }    
        prediction =   n1 + " "  + n2 + " "  + n3 + " "  +  n4 + " "  + n5;
        result        =   r1 + " "  + r2 + " "  + r3 + " "  +  r4 + " "  + r5;
        }
       
        }   
        
        
        
       if(randoDices.isSelected()){ 
         int dc1 = Integer.parseInt(dice1.getText());
         int dc2 = Integer.parseInt(dice2.getText());
 
      if(dc1 > 6 || dc2 >6){
      
      JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR DICE PREDICTION , IT SHOULD NOT BE GREATER THAN 6");
      }else{
           if((d1 == dc1)  && (d2 == dc2)){
            status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                  odd = 3.0;
            pw = odd * stake;
           aw = pw;
               
                      
           }
           else if((d1 == dc2)  && (d2 == dc1) ){ 
             status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                   odd = 3.0;
            pw = odd * stake;
           aw = pw;
                   } 
           
           else  if((d1 == dc1)  && (d2 != dc2)){ 
             status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                 odd = 3.0; 
            pw = odd * stake;     
            aw =stake/2.0;
          
           } 
            else  if((d1 != dc1)  && (d2 == dc2)){ 
             status = "BET WON"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                  odd = 3.0; 
            pw = odd * stake;     
            aw =stake/2.0;
           
           }
           else{  
             status = "BET LOST"; 
            game = "RANDO-DICE";
            gametype = "DICES OUTPUT PREDICTION"; 
                  odd = 3.0; 
            pw = odd * stake;     
            aw = 0.0;
           } 
           
          
           
           
        
         prediction = "PREDICTION : " + dc1 + " "  + dc2;
          result = "DICE RESULT : " + d1  + " " + d2; 
      }
    }//GEN-LAST:event_sendActionPerformed
   
    
    if (randoDR.isSelected()) { 
    
  
       if (!fpd.getText().equals("") && spd.getText().equals("") && tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
              if(f > 5){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
          if(f == fi){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "FIRST PLACE";
            prediction = "DOG " + f + "FIRST PLACE";
            result =  "DOG " + fi + "FIRST PLACE"; 
            odd = 2.0;
            pw = stake * odd;  
            aw= pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "FIRST PLACE";
            prediction = "DOG " + f + "FIRST PLACE";
            result =  "DOG " + fi + "FIRST PLACE"; 
            odd = 2.0;
            pw = stake * odd; 
           aw = 0.0;
          }
              } 
       }
       
       
      if (fpd.getText().equals("") && !spd.getText().equals("") && tpd.getText() .equals("")){ 
            int s = Integer.parseInt(spd.getText()); 
            
            
              if(s>5){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
          if(s == si){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "SECOND PLACE";
            prediction = "DOG " + s + "SECOND PLACE";
            result =  "DOG " + si + "SECOND PLACE"; 
            odd = 2.0;
            pw = stake * odd; 
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "SECOND PLACE";
            prediction = "DOG " + s + "SECOND PLACE";
            result =  "DOG " + si + "SECOND PLACE"; 
             odd = 2.0;
            pw = stake * odd; 
            aw = 0.0;
          
          }
              }
       } 
       
       if (fpd.getText().equals("") && spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
          if(t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "THIRD PLACE";
            prediction = "DOG " + t + " THIRD PLACE";
            result =  "DOG " + ti + " THIRD PLACE"; 
            odd = 2.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "THIRD PLACE";
            prediction = "DOG " + t + " THIRD PLACE"; 
            result =  "DOG " + ti + " THIRD PLACE"; 
             odd = 2.0;
            pw = stake * odd; 
            aw = 0.0;
          
          }
              }
       } 
       
        if (!fpd.getText().equals("") && !spd.getText().equals("") && tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
            int s = Integer.parseInt(spd.getText()); 
            
              if(f >5 || s>5){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(f == fi && s == si){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 2ND PLACE";
            prediction = "DOG " + f  + " DOG " + s + " 1ST AND 2ND " ;
            result =  "DOG " + fi + " DOG " + si + " 1ST AND 2ND " ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 2ND PLACE";
            prediction = "DOG " + f  + " AND DOG " + s + " 1ST AND 2ND " ;
            result =  "DOG " + fi + " AND DOG " + si + " 1ST AND 2ND " ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = 0.0;
          
          }
              }  
       } 
        
        
      if (!fpd.getText().equals("") && spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(f >5 || t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(f == fi && t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 3RD PLACE";
            prediction = "DOG " + f  + "AND  DOG " + t + " 1ST AND 3RD " ;
            result =  "DOG " + fi + " AND DOG " + ti + " 1ST AND 3RD" ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST AND 3RD PLACE";
            prediction = "DOG " + f  + "AND  DOG " + t + " 1ST AND 3RD " ;
            result =  "DOG " + fi + " AND DOG " + ti + " 1ST AND 3RD" ;
          odd = 3.0;
            pw = stake * odd;  
            aw = 0.0;
          }
              }
       } 
     
       if (fpd.getText().equals("") && !spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int s = Integer.parseInt(spd.getText()); 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(s >5 || t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(s == si && t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "2ND AND 3RD PLACE";
            prediction = "DOG " + s  + "AND  DOG " + t + " 2ND AND 3RD " ;
            result =  "DOG " + si + " AND DOG " + ti + " 2ND AND 3RD" ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "2ND AND 3RD PLACE";
            prediction = "DOG " + s  + "AND  DOG " + t + " 2ND AND 3RD " ;
            result =  "DOG " + si + " AND DOG " + ti + " 2ND AND 3RD" ; 
            odd = 3.0;
            pw = stake * odd;  
            aw = 0.0;
          
          }
              }
       } 
       
       
       if (!fpd.getText().equals("") && !spd.getText().equals("") && !tpd.getText() .equals("")){ 
            int f = Integer.parseInt(fpd.getText()); 
            int s = Integer.parseInt(spd.getText()); 
            int t = Integer.parseInt(tpd.getText()); 
            
              if(f >5 || s>5 || t>5 ){ 
     JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    
    }else{
            
          if(f == fi && s == si && t == ti){ 
            status = "BET WON"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST , 2ND AND 3RD PLACE";
            prediction = "DOG " + f  + ", DOG " + s + " AND  DOG " + t + "1ST , 2ND AND 3RD " ;
            result =  "DOG " + fi  + ", DOG " + si + " AND  DOG " + ti + "1ST , 2ND AND 3RD " ; 
            odd = 5.0;
            pw = stake * odd;  
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-DOG RACE";
            gametype = "1ST , 2ND AND 3RD PLACE";
            prediction = "DOG " + f  + ", DOG " + s + " AND  DOG " + t + "1ST , 2ND AND 3RD " ;
            result =  "DOG " + fi  + ", DOG " + si + " AND  DOG " + ti + "1ST , 2ND AND 3RD " ; 
             odd = 5.0;
            pw = stake * odd;  
            aw =0.0; 
            
          }
          
       
              }
    
    } 
    }
    
   
    if(randoColours.isSelected()){ 
        rc = 0; bc = 0; gc = 0; wc = 0; yc = 0;
          d[0] = c1; d[1] = c2 ; d[2] = c3; d[3] = c4; d[4] = c5;
      for(int i=0; i<5; i++){
      if(d[i] == 1){ 
      rc++;
      
      }
      else if(d[i] == 2){ 
          
       bc++;   
      }
      
     else if(d[i] == 3){ 
        gc++;  
          
      } 
      
      
      else if(d[i] == 4){ 
         wc++; 
          
      } 
      
      else if(d[i] == 5){ 
          yc++;
          
      }
      
      } 
        
    
 
      if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
            int r = Integer.parseInt(red.getText());
            if( r > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{   
            if(r == rc){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED OCCURENCE";
            prediction = "RED X" + r ;
            result = "RED X" + rc ; 
              odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED OCCURENCE";
            prediction = "RED X" + r ;
            result = "RED X" + rc ; 
                odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          }
            
            }       
      
      }
      
      if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
               if( b > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{  
            if(b == bc){ 
             status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE OCCURENCE";
            prediction = "BLUE X" + b ;
            result = "BLUE X" + bc ; 
              odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE OCCURENCE";
            prediction = "BLUE X" + b ;
            result = "BLUE X" + bc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          }
      
      } 
      }
      
      if(red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
            int g = Integer.parseInt(green.getText()); 
                    if( g > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(g == gc){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN OCCURENCE";
            prediction = "GREEN X" + g ;
            result = "GREEN X" + gc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN OCCURENCE";
            prediction = "GREEN X" + g ;
            result = "GREEN X" + gc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw =0.0;  
          }
      
      } 
      }
      
      if(red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
           int w = Integer.parseInt(white.getText()); 
                   if( w > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc){ 
             status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE OCCURENCE";
            prediction = "WHITE X" + w ;
            result = "WHITE X" + wc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw = pw;  
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE OCCURENCE";
            prediction = "WHITE X" + w ;
            result = "WHITE X" + wc ; 
              odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          } 
      
      } 
      }
      
       if(red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
          int y = Integer.parseInt(yellow.getText()); 
                 if( y > 5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{ 
            if(y == yc){ 
             status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "YELLOW OCCURENCE";
            prediction = "YELLOW X" + y ;
            result = "YELLOW X" + yc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE OCCURENCE";
            prediction = "YELLOW X" + y ;
            result ="YELLOW X" + yc ; 
               odd = 1.5;
            pw = stake * odd;    
            aw =0.0; 
          } 
                 }
      }
     
      
      if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText()); 
                 if( r > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && b == bc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND BLUE OCCURENCE";
            prediction = "RED X" + r +" AND BLUE X" + b ;
            result ="RED X" + rc +" AND BLUE X" + bc ; 
              odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND BLUE OCCURENCE";
            prediction = "RED X" + r +" AND BLUE X" + b ;
            result ="RED X" + rc +" AND BLUE X" + bc ; 
               odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }  
                 }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int g = Integer.parseInt(green.getText()); 
         
                   if( r > 5 || g >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && g == gc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND GREEN OCCURENCE";
            prediction = "RED X" + r +" AND GREEN X" + g ;
            result ="RED X" + rc +" AND GREEN X" + gc ; 
               odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND GREEN OCCURENCE";
            prediction = "RED X" + r +" AND GREEN X" + g ;
            result ="RED X" + rc +" AND GREEN X" + gc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          } 
      
      } 
      }
      
       if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int w = Integer.parseInt(white.getText());
                   if( r > 5 || w >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && w == wc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND WHITE OCCURENCE";
            prediction = "RED X" + r +" AND WHITE X" + w ;
            result ="RED X" + rc +" AND WHITE X" +wc ;  
                 odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND WHITE OCCURENCE";
            prediction = "RED X" + r +" AND WHITE X" + w ;
            result ="RED X" + rc +" AND WHITE X" +wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0; 
            
          }
                   }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
            int r = Integer.parseInt(red.getText());
            int y = Integer.parseInt(yellow.getText()); 
                      if( r > 5 || y >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" AND YELLOW X" + y ;
            result ="RED X" + rc +" AND YELLOW X" +yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
             status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" AND YELLOW X" + y ;
            result ="RED X" + rc +" AND YELLOW X" +yc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
      
      if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
            int b = Integer.parseInt(blue.getText());
            int g = Integer.parseInt(green.getText()); 
                      if( g > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(b == bc && g == gc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND GREEN OCCURENCE";
            prediction = "BLUE X" + b +" AND GREEN X" + g ;
            result ="BLUE X" + bc +" AND GREEN X" + gc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND GREEN OCCURENCE";
            prediction = "BLUE X" + b +" AND GREEN X" + g ;
            result ="BLUE X" + bc +" AND GREEN X" + gc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
         if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
            int b = Integer.parseInt(blue.getText());
            int w = Integer.parseInt(white.getText()); 
            
                      if( w > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(b == bc && w == gc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" AND WHITE X" + w ;
            result ="BLUE X" + bc +" AND WHITE X" + wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" AND WHITE X" + w ;
            result ="BLUE X" + bc +" AND WHITE X" + wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
      
      
      if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
            int b = Integer.parseInt(blue.getText());
            int y = Integer.parseInt(yellow.getText()); 
                      if( y > 5 || b >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(b == bc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" AND YELLOW X" + y ;
            result ="BLUE X" + bc +" AND YELLOW X" + yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" AND YELLOW X" + y ;
            result ="BLUE X" + bc +" AND YELLOW X" + yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
       if(red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
            int g = Integer.parseInt(green.getText());
            int w= Integer.parseInt(white.getText()); 
            
            
                      if( g > 5 || w >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(g == gc && w == wc){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN AND WHITE OCCURENCE";
            prediction = "GREEN X" + g  +" AND WHITE X" + w ;
            result = "GREEN X" + gc  +" AND WHITE X" + wc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN AND WHITE OCCURENCE";
            prediction = "GREEN X" + g  +" AND WHITE X" + w ;
            result = "GREEN X" + gc  +" AND WHITE X" + wc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                      }
      }
      
      if(red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
            int w = Integer.parseInt(white.getText());
            int y= Integer.parseInt(yellow.getText()); 
            
                              if( y > 5 || w >5){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc && y == yc){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +" AND YELLOW X" + y ;
            result = "WHITE X" + wc  +" AND YELLOW X" + yc ; 
                odd = 2.5;
            pw = stake * odd;  
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +" AND YELLOW X" + y ;
            result = "WHITE X" + wc  +" AND YELLOW X" + yc ; 
                 odd = 2.5;
            pw = stake * odd;  
            aw = 0.0;
            
          }
                              }
      }
     if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText());
         int g = Integer.parseInt(green.getText());  
                           if( r > 5 || b >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && b == bc && g == gc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , BLUE AND GREEN OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND GREEN X" + g;
            result ="RED X" + rc +" , BLUE X" + bc +" AND GREEN X" + gc; 
               odd = 3.0;
            pw = stake * odd; 
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
             gametype = "RED , BLUE AND GREEN OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND GREEN X" + g;
            result ="RED X" + rc +" , BLUE X" + bc +" AND GREEN X" + gc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                           }
      }
      
       if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText());
         int w = Integer.parseInt(white.getText());  
         
         
                                if( r > 5 || b >5  || w >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && b == bc && w == wc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , BLUE AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND WHITE X" + w;
            result ="RED X" + rc +" , BLUE X" + bc +" AND WHITE X" + gc; 
                odd = 3.0;
            pw = stake * odd; 
            aw =pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
           gametype = "RED , BLUE AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND WHITE X" + w;
            result ="RED X" + rc +" , BLUE X" + bc +" AND WHITE X" + gc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int b = Integer.parseInt(blue.getText());
         int y = Integer.parseInt(yellow.getText());  
         
                                if( r > 5 || b >5  || y >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && b == bc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , BLUE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND YELLOW X" + y;
            result ="RED X" + rc +" , BLUE X" + bc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , BLUE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , BLUE X" + b +" AND YELLOW X" + y;
            result ="RED X" + rc +" , BLUE X" + bc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      
     if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int g = Integer.parseInt(green.getText());
         int w = Integer.parseInt(white.getText());  
                                if( r > 5 || w >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && g == gc && w == wc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0; 
           
          }  
                                }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                if( r > 5 || y >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && g == gc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc +" , GREEN X" + gc +" AND YELLOW X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc +" , GREEN X" + gc +" AND YELLOW X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      
        if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
         int g = Integer.parseInt(green.getText());
         int w = Integer.parseInt(white.getText());  
         
                                if( w > 5 || b >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(b == bc && g == gc && w == wc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE , GREEN AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND WHITE X" + w;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "BLUE , GREEN AND WHITE OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND WHITE X" + w;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
              odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                if( y > 5 || b >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(b == bc && g == gc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE , GREEN AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "BLUE , GREEN AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , GREEN X" + g +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0; 
            
          }  
                                }
      }
      
         if(red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
         int g = Integer.parseInt(green.getText()); 
         int w = Integer.parseInt(white.getText());
         int y = Integer.parseInt(yellow.getText()); 
         
                                if( w > 5 || y >5  || g >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc && g == gc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN , WHITE AND YELLOW OCCURENCE";
            prediction = "GREEN X" + g +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "GREEN X" + gc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw =pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "GREEN , WHITE AND YELLOW OCCURENCE";
            prediction = "GREEN X" + g +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "GREEN X" + gc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      if(!red.getText().equals("") && blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
         int r = Integer.parseInt(red.getText());
         int w = Integer.parseInt(white.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
         
                                if( r > 5 || w >5  || y >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && w == wc && y == yc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED , WHITE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "RED X" + rc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "RED , WHITE AND YELLOW OCCURENCE";
            prediction = "RED X" + r +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "RED X" + rc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                 odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                }
      }
      
        if(red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
         int b = Integer.parseInt(blue.getText());
         int w = Integer.parseInt(white.getText()); 
          int y = Integer.parseInt(yellow.getText()); 
          
          
                                 if( w > 5 || b >5  || y >5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(b == bc && y == yc && w == wc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "BLUE , WHITE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
                odd = 3.0;
            pw = stake * odd; 
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
          gametype = "BLUE , WHITE AND YELLOW OCCURENCE";
            prediction = "BLUE X" + b +" , WHITE X" + w +" AND YELLOW X" + y;
            result = "BLUE X" + bc +" , WHITE X" + wc +" AND YELLOW X" + yc; 
               odd = 3.0;
            pw = stake * odd; 
            aw = 0.0;
            
          }  
                                 }
      }
      if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && yellow.getText().equals("")){ 
      int r = Integer.parseInt(red.getText());
       int b = Integer.parseInt(blue.getText()); 
         int g = Integer.parseInt(green.getText());
         int w = Integer.parseInt(white.getText());  
         
         
                                if( r > 5 || b >5  || g >5 || w>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && g == gc && w == wc && b==bc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
         status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND WHITE OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND WHITE X" + w;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND WHITE X" + wc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
          }  
      
                                }
      }
      
     if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && white.getText().equals("") && !yellow.getText().equals("")){ 
      int r = Integer.parseInt(red.getText());
       int b = Integer.parseInt(blue.getText()); 
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                if( r > 5 || b >5  || g >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(r == rc && g == gc && y == yc && b==bc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
           status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "RED ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "RED X" + r +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "RED X" + rc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
          }  
      
                                }
      }
       if(red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int b = Integer.parseInt(blue.getText()); 
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                       if( w > 5 || b >5  || g >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc && g == gc && y == yc && b==bc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = pw; 
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,BLUE, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"BLUE X" +b +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc + "BLUE X" +bc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
            
          }  
      
                                       }
      }
      
       if(!red.getText().equals("") && blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int r = Integer.parseInt(red.getText()); 
         int g = Integer.parseInt(green.getText());
         int y = Integer.parseInt(yellow.getText());  
         
         
                                       if( r > 5 || w >5  || g >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc && g == gc && y == yc && r==rc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "GREEN X" + g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" , GREEN X" + gc +" AND YELLOW X" + yc; 
                 odd = 4.0;
            pw = stake * odd;  
            aw = 0.0; 
            
          }  
      
                                       }
      }
        if(!red.getText().equals("") && !blue.getText().equals("") && green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int r = Integer.parseInt(red.getText()); 
         int b = Integer.parseInt(blue.getText());
         int y = Integer.parseInt(yellow.getText());  
         
                                       if( r > 5 || b >5  || w >5 || y>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc && b == bc && y == yc && r==rc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" + b +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw =pw;
            
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" + b +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +" AND YELLOW X" + yc; 
                odd = 4.0;
            pw = stake * odd;  
            aw = 0.0;
            
          }  
                                       }
        }
      
           if(!red.getText().equals("") && !blue.getText().equals("") && !green.getText().equals("") && !white.getText().equals("") && !yellow.getText().equals("")){ 
      int w = Integer.parseInt(white.getText());
       int r = Integer.parseInt(red.getText()); 
         int b = Integer.parseInt(blue.getText());
         int y = Integer.parseInt(yellow.getText()); 
          int g = Integer.parseInt(green.getText());  
          
                                        if( r > 5 || b >5  || g >5 || y>5 || w>5 ){
         JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR COLOUR PREDICTION , IT SHOULD NOT BE GREATER THAN 5");
    } else{
            if(w == wc && b == bc && y == yc && r==rc && g==gc ){ 
            status = "BET WON"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE,GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" +b+  "GREEN X" +g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +"GREEN X" +gc+" AND YELLOW X" + yc; 
                 odd = 5.0;
            pw = stake * odd; 
            aw = pw;
       }else{ 
            status = "BET LOST"; 
            game = "RANDO-COLOURS";
            gametype = "WHITE ,RED, BLUE,GREEN AND YELLOW OCCURENCE";
            prediction = "WHITE X" + w +"RED X" +r +  "BLUE X" +b+  "GREEN X" +g +" AND YELLOW X" + y;
            result = "WHITE X" + wc +"RED X" +rc +" BLUE X" + bc +"GREEN X" +gc+" AND YELLOW X" + yc; 
                 odd = 0.0;
            pw = stake * odd; 
            aw = 0.0;
          }  
        }
           }
      
        
      
    

   

    } 
      
   /* receiptArea.setText( "GAME STATUS " +status + " \n " + 
                                   "GAME        " + game + " \n " +
                                   "GAME-TYPE   " + gametype + " \n " +
                                    "RESULT      " + result + " \n " +
                                    "PREDICTION  " + prediction + "\n"  );  
*/
    receiptArea.setText( "                 RANDO BET       "+" \n " +  
                                   "--------------------------------------------------------"+ " \n " +
                                   "                    GAME        " + " \n " +
                                   "GAME-TYPE :       " + gametype + " \n " +
                                   "PREDICTION :     " + prediction + "\n" + 
                                   "STAKE :           " + stake + "(NGN)"+ "\n" + 
                                   "TOTAL ODD :       " + odd + "\n" + 
                                   "--------------------------------------------------------"+ " \n " +
                                   "POSSIBLE WINNING : " + pw + "(NGN)"+"\n"  + 
                                   "--------------------------------------------------------"+ " \n " + 
                                   "--------------------------------------------------------"+ " \n " 
    );  
    
    }
   
 

    
    
     
 

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:

       Games();

    }//GEN-LAST:event_printActionPerformed

    private void stkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stkKeyPressed
        // TODO add your handling code here:  
       
    }//GEN-LAST:event_stkKeyPressed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellowActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteActionPerformed

    private void onedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onedirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalRando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalRando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalRando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalRando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalRando().setVisible(true);  
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox RN;
    private javax.swing.JCheckBox SH;
    private javax.swing.JTextField blue;
    private javax.swing.JLabel bluel;
    private javax.swing.JTextField dice1;
    private javax.swing.JLabel dice1l;
    private javax.swing.JTextField dice2;
    private javax.swing.JLabel dice2l;
    private javax.swing.JCheckBox fivedir;
    private javax.swing.JCheckBox fourdir;
    private javax.swing.JTextField fpd;
    private javax.swing.JLabel fpdl;
    private javax.swing.JLabel fpdl1;
    private javax.swing.JTextField green;
    private javax.swing.JLabel greenl;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lpdl;
    static javax.swing.JLabel milliseconds;
    static javax.swing.JLabel minutes;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num3;
    private javax.swing.JTextField num4;
    private javax.swing.JTextField num5;
    private javax.swing.JCheckBox onedir;
    static javax.swing.JButton print;
    static javax.swing.JCheckBox randoColours;
    static javax.swing.JCheckBox randoDR;
    static javax.swing.JCheckBox randoDices;
    static javax.swing.JCheckBox randoNumbers;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JTextField red;
    private javax.swing.JLabel redl;
    static javax.swing.JButton reset;
    static javax.swing.JLabel seconds;
    static javax.swing.JButton send;
    private javax.swing.JTextField spd;
    private javax.swing.JTextField stk;
    private javax.swing.JCheckBox threedir;
    private javax.swing.JTextField tpd;
    private javax.swing.JCheckBox twodir;
    private javax.swing.JTextField white;
    private javax.swing.JLabel whitel;
    private javax.swing.JTextField yellow;
    private javax.swing.JLabel yellowl;
    // End of variables declaration//GEN-END:variables
}
