package RandoBet;


import java.util.Random;
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADEBAYO ADEMOLA
 */
public class RandoResult extends javax.swing.JFrame {
 static int mins = 0;  
    static int secs = 59;  
    static int millisecs = 1000; 
    static boolean state = true; 
    
    public  static int N1,N2,N3,N4,N5,CO1,CO2,C03,CO4,CO5,DC1,DC2,FI,SC,TH;
    
      //randonumbers 
    int r1,r2,r3,r4,r5; 
    //randocolours 
    int c1,c2,c3,c4,c5; 
    int rc,bc,gc,wc,yc;
      //randodice  
    int di1,di2;
    int dc1 = 0,dc2 = 0;  
      //randodograce 
    int do1,do2,do3,do4,do5; 
    int fp,sp,tp,fi,si,tl; 
    /**
     * Creates new form RandoResult
     */
     Random r = new Random(); 
     
     public  void Games(){ 
        
    Random r = new Random(); 
  
    // RANDONUMBERS
    r1 = r.nextInt(20) + 1; do2 = r.nextInt(20) + 1;  c4 =  r.nextInt(5) + 1; dc2 =r.nextInt(6) + 1;    r5 =  r.nextInt(20) + 1;   
    // RANDOCOLOURS
    c1 = r.nextInt(5) + 1;  do5 =r.nextInt(20) + 1;  c5 =  r.nextInt(5) + 1;     r3 =  r.nextInt(20) + 1;     do3 =r.nextInt(20) + 1; 
    // RANDODICE
     do1 = r.nextInt(20) + 1;       r4 =  r.nextInt(20) + 1;
   // RANDO DOGRACE
     dc1 = r.nextInt(6) + 1;  r2 =  r.nextInt(20) + 1;  c3 =  r.nextInt(5) + 1;        do4 =r.nextInt(20) + 1;     c2 =  r.nextInt(5) + 1;
    
     
     
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
      fi= r.nextInt(5) + 1; si= r.nextInt(5) + 1; tl= r.nextInt(5) + 1;
      
      if(fi != si && fi != tl && tl !=si){ 
      break;
      }
      
      } 
     }
    public void simpleAnimation(){ 
        n1.setVisible(true); 
        n2.setVisible(true); 
        n3.setVisible(true); 
        n4.setVisible(true); 
        n5.setVisible(true); 
        C1.setVisible(true); 
        C2.setVisible(true); 
        C3.setVisible(true); 
        C4.setVisible(true); 
        C5.setVisible(true); 
         f.setVisible(true); 
        s.setVisible(true); 
        t.setVisible(true); 
        dci1.setVisible(true); 
       dci2.setVisible(true); 
       stopWatch();
    }
    
    public RandoResult(int r1, int r2, int r3, int r4, int r5, int c1, int c2, int c3, int c4, int c5, int D1, int D2, int fp, int sp, int tp) {
        initComponents();  
        
        N1 = r1;  N2 = r2; N3 =r3; N4 = r4; N5 = r5;  CO1= c1;  CO2 = c2;   C03 = c3;  CO4 =c4; CO5 = c3; DC1 = D1;  DC2 = D2;  FI = fp; SC= sp; TH= tp;
        stopWatch2();
         SimAni();
        
        /* n1.setText(""+r1);   n2.setText(""+r2);   n3.setText(""+r3);   n4.setText(""+r4);   n5.setText(""+r5);
       
        
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c1+"c.png"))); 
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c2+"c.png")));  
        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c3+"c.png"))); 
        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c4+"c.png")));  
        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c5+"c.png")));   
       
        dci1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+D1+".png"))); 
        dci2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+D2+".png"))); 
         
       f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+fp+"d.PNG"))); 
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+sp+"d.PNG")));  
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+tp+"d.PNG")));    
        
        
        
        
        milliseconds.setVisible(false);  
        
        stopWatch(); */
     /*   n1.setVisible(false); 
        n2.setVisible(false); 
        n3.setVisible(false); 
        n4.setVisible(false); 
        n5.setVisible(false); 
        
        C1.setVisible(false); 
        C2.setVisible(false); 
        C3.setVisible(false); 
        C4.setVisible(false); 
        C5.setVisible(false); 
        
        
         f.setVisible(false); 
        s.setVisible(false); 
        t.setVisible(false); 
        
         dci1.setVisible(false); 
        dci2.setVisible(false); */
       
        
      //  stopWatch2();
        
        
        
        
         
    } 
    public void SimAni(){ 
   while (secs > 55 && mins ==0){
         Games();
         n1.setText(""+r1);   n2.setText(""+r2);   n3.setText(""+r3);   n4.setText(""+r4);   n5.setText(""+r5);
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c1+"c.png"))); 
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c2+"c.png")));  
        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c3+"c.png"))); 
        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c4+"c.png")));  
        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c5+"c.png")));   
       
        dci1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+dc1+".png"))); 
        dci2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+dc2+".png"))); 
         
       f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+fi+"d.PNG"))); 
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+si+"d.PNG")));  
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+tl+"d.PNG"))); 
        
        
     
    }
       n1.setVisible(false); 
        n2.setVisible(false); 
        n3.setVisible(false); 
        n4.setVisible(false); 
        n5.setVisible(false); 
        
        C1.setVisible(false); 
        C2.setVisible(false); 
        C3.setVisible(false); 
        C4.setVisible(false); 
        C5.setVisible(false); 
        
        
         f.setVisible(false); 
        s.setVisible(false); 
        t.setVisible(false); 
        
         dci1.setVisible(false); 
        dci2.setVisible(false); 
       
        
        n1.setText(""+N1);   n2.setText(""+N2);   n3.setText(""+N3);   n4.setText(""+N4);   n5.setText(""+N5);
       
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+CO1+"c.png"))); 
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+CO2+"c.png")));  
        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+C03+"c.png"))); 
        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+CO4+"c.png")));  
        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+CO5+"c.png")));   
       
        dci1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+DC1+".png"))); 
        dci2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+DC2+".png"))); 
         
       f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+FI+"d.PNG"))); 
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+SC+"d.PNG")));  
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+TH+"d.PNG")));    
        
        
        
        
        milliseconds.setVisible(false);  

    }
    
    
    
         public void stopWatch(){ 
       mins = 0;  
        secs = 59;  
       millisecs = 1000; 
       state = true;  
        Thread ti = new Thread(){
         public void run(){
        for( ; ; ){
      /*      Games();
         n1.setText(""+r1);   n2.setText(""+r2);   n3.setText(""+r3);   n4.setText(""+r4);   n5.setText(""+r5);
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c1+"c.png"))); 
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c2+"c.png")));  
        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c3+"c.png"))); 
        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c4+"c.png")));  
        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+c5+"c.png")));   
       
        dci1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+dc1+".png"))); 
        dci2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+dc2+".png"))); 
         
       f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+fi+"d.PNG"))); 
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+si+"d.PNG")));  
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/"+tl+"d.PNG"))); */
        if (state==true){  
            try{
            sleep(1);
           
            if (millisecs < 1){  
            secs--;
            millisecs = 1000; 
            
            
            } if(mins !=0 && secs < 1){ 
            millisecs = 1000; 
            secs = 59;
            mins--;
            } 
            
            
     if(mins ==0 && secs >50){ 
            SimAni();
            } 
            
            
            }catch(Exception e){
            
            
            
            }
         millisecs --;   
         milliseconds.setText(""+millisecs);    
        minutes.setText( "0"+mins + " : ");    
        seconds.setText( +secs + "");      
        
         
         } 
        
      if(mins == 0 && secs < 1){ 
      state= false;
       new FinalRando().setVisible(true); 
      break;
      }
        
        }
        
        
        
        } 
         
        };
        
        
        
  ti.start();  
    }  
             public void stopWatch2(){ 
        mins = 0;  
        secs = 59;  
       millisecs = 1000; 
       state = true;  
        Thread ti = new Thread(){
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
            secs = 59;
            mins--;
            }
            
            
            }catch(Exception e){
            
            
            
            }
         millisecs --;   
         milliseconds.setText(""+millisecs);    
        minutes.setText( "0"+mins + " : ");    
        seconds.setText( +secs + "");      
        
         
         } 
         if(mins == 0 && secs == 57){  
          n1.setVisible(true); 
        
        C1.setVisible(true); 
        
    
        } 
        
        
        if(mins == 0 && secs == 55){  
       
        n2.setVisible(true); 
        
        C2.setVisible(true); 
    
        
        }   
        
         if(mins == 0 && secs == 53){  
         
        n3.setVisible(true); 
       
        C3.setVisible(true); 
       
        
        } 
        
        
        if(mins == 0 && secs == 51){  
       
        n4.setVisible(true); 
       
        C4.setVisible(true); 
       
        
        }  
         if(mins == 0 && secs == 59){  
        
        n5.setVisible(true); 
         C5.setVisible(true); 
      
        
        
    
        } 
        
        
        if(mins == 0 && secs == 57){  
     
         t.setVisible(true); 
        
        dci1.setVisible(true); 
        }  
        
        
       
        if(mins == 0 && secs == 55){  
           s.setVisible(true); 
        
        
        }  
         if(mins == 0 && secs == 53){  
           f.setVisible(true); 
        
        dci2.setVisible(true); 
    
        } 
        
     
        
        
        if(mins == 0 && secs == 54){  
  
        }   
        
        if(mins == 0 && secs == 1){ 
        state = false;
        minutes.setText( "00:");    
        seconds.setText( "00");     
        
        new FinalRando().setVisible(true); 
        
        break;
        } 
        
        }
        
        
        
        } 
         
        };
        
        
        
  ti.start();  
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
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        dci1 = new javax.swing.JLabel();
        dci2 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        dr3 = new javax.swing.JLabel();
        dr4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        minutes = new javax.swing.JLabel();
        milliseconds = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        jLabel21.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel21.setText("DICE");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GAMES RESULTS");

        n2.setFont(new java.awt.Font("Algerian", 1, 100)); // NOI18N
        n2.setForeground(new java.awt.Color(204, 0, 51));

        n1.setFont(new java.awt.Font("Algerian", 1, 100)); // NOI18N
        n1.setForeground(new java.awt.Color(0, 51, 51));

        n3.setFont(new java.awt.Font("Algerian", 1, 100)); // NOI18N
        n3.setForeground(new java.awt.Color(51, 0, 153));

        n4.setFont(new java.awt.Font("Algerian", 1, 100)); // NOI18N
        n4.setForeground(new java.awt.Color(204, 204, 0));

        n5.setFont(new java.awt.Font("Algerian", 1, 100)); // NOI18N
        n5.setForeground(new java.awt.Color(51, 153, 0));

        jLabel17.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel17.setText("NUMBERS");

        jLabel19.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel19.setText("COLOURS");

        jLabel20.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel20.setText("DICE");

        jLabel22.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel22.setText("DOG RACE");

        f.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        dr3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel23.setText("1st");

        jLabel24.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel24.setText("2nd");

        jLabel25.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel25.setText("3rd");

        minutes.setBackground(new java.awt.Color(255, 255, 255));
        minutes.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70)); // NOI18N
        minutes.setText("00:");
        minutes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minutesMouseClicked(evt);
            }
        });

        milliseconds.setBackground(new java.awt.Color(255, 255, 255));
        milliseconds.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        milliseconds.setText("00");

        seconds.setBackground(new java.awt.Color(255, 255, 255));
        seconds.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70)); // NOI18N
        seconds.setText("00");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RandoBet/track.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(604, 604, 604)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(517, 517, 517)
                                        .addComponent(dr3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23))
                                        .addGap(85, 85, 85)
                                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(290, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(644, 644, 644)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dci1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(dci2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dr4)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minutes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seconds)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel17)
                        .addGap(502, 502, 502)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(milliseconds)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minutes)
                            .addComponent(seconds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(milliseconds))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dci2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dci1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel22)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dr3)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel23))
                                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel24)
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel25))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dr4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minutesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minutesMouseClicked

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
            java.util.logging.Logger.getLogger(RandoResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandoResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandoResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandoResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel dci1;
    private javax.swing.JLabel dci2;
    private javax.swing.JLabel dr3;
    private javax.swing.JLabel dr4;
    private javax.swing.JLabel f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    static javax.swing.JLabel milliseconds;
    static javax.swing.JLabel minutes;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel s;
    static javax.swing.JLabel seconds;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
