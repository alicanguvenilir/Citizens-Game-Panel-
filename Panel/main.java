
import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class main extends javax.swing.JFrame {

     public main() {
        initComponents();
    }
    
      public static int totalDay;
      public static int dayofYear;
      public static int dayofMonth;
      public static int year;
      public static String month = "Ocak";
      public static boolean foodISlow;
      public static boolean waterISlow;
      public static int randomStartFood = ThreadLocalRandom.current().nextInt(300,600);
      public static int minimumCitizenBirthingRate;
      public static int maximumCitizenBirthingRate;       
      
     
      public static javax.swing.JLabel gameOverLabel;
      public static javax.swing.JLabel Date;
      public static javax.swing.JLabel dateGenerator;
      public static javax.swing.JLabel riverFlow;
      public static javax.swing.JLabel riverFlowRateGenerator;         
      public static javax.swing.JTable CitizenTable;
      public static javax.swing.JScrollPane jScrollPane2;
      public static javax.swing.JLabel foodRate;
      public static javax.swing.JLabel foodRateGenerator;
      public static javax.swing.JLabel gatheredFood;
      public static javax.swing.JLabel gatheredFoodGenerator;
      private javax.swing.JButton foodGathererButton;
      public static javax.swing.JLabel consumedFood;
      public static javax.swing.JLabel consumedFoodGenerator;
      public static javax.swing.JLabel consumedWater;
      public static javax.swing.JLabel consumedWaterGenerator;
      public static javax.swing.JLabel warningLabel;

      
       private void foodGathererButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
      
           if(CitizenTable.getValueAt(CitizenTable.getSelectedRow(),1) == "idle" && Integer.parseInt(CitizenTable.getValueAt(CitizenTable.getSelectedRow(),2).toString()) > 10 ){
           
                  CitizenTable.setValueAt("Gathering Food",CitizenTable.getSelectedRow(),1);

           }
           else if(CitizenTable.getValueAt(CitizenTable.getSelectedRow(),1) == "Gathering Food"){
           
                  CitizenTable.setValueAt("idle",CitizenTable.getSelectedRow(),1);

           }
                
              

       } 
       
    private void initComponents() {

        Date = new javax.swing.JLabel();
        dateGenerator = new javax.swing.JLabel();
        riverFlow = new javax.swing.JLabel();
        riverFlowRateGenerator = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CitizenTable = new javax.swing.JTable();
        foodRate = new javax.swing.JLabel();
        foodRateGenerator = new javax.swing.JLabel();
        gatheredFood = new javax.swing.JLabel();
        gatheredFoodGenerator = new javax.swing.JLabel();
        foodGathererButton = new javax.swing.JButton();
        consumedFood = new javax.swing.JLabel();
        consumedWater = new javax.swing.JLabel();
        consumedFoodGenerator = new javax.swing.JLabel();
        consumedWaterGenerator = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        gameOverLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Date.setText("Date:");

        dateGenerator.setText(" ");

        riverFlow.setText("River Flow: ");

        riverFlowRateGenerator.setText(" ");

        CitizenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Citizen Name", "Citizen Situation", "Age"
            }
        ));
        jScrollPane2.setViewportView(CitizenTable);

        foodRate.setText("Food:");

        foodRateGenerator.setText("0");

        gatheredFood.setText("Gathered Food:");

        gatheredFoodGenerator.setText("0");

        foodGathererButton.setText("Gather Food");
        foodGathererButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodGathererButtonActionPerformed(evt);
            }
        });

        consumedFood.setText("Daily Consumed Food: ");

        consumedWater.setText("Daily Consumed Water:");

        consumedFoodGenerator.setText("0");

        consumedWaterGenerator.setText("0");

        warningLabel.setForeground(new java.awt.Color(255, 0, 51));
        warningLabel.setText(" ");

        gameOverLabel.setForeground(new java.awt.Color(255, 0, 51));
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setText(" ");
        gameOverLabel.setMaximumSize(new java.awt.Dimension(14, 14));
        gameOverLabel.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(riverFlow)
                                                .addComponent(foodRate)
                                                .addComponent(Date))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(dateGenerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(riverFlowRateGenerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(foodRateGenerator, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(consumedFood)
                                                .addComponent(consumedWater, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(consumedWaterGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(consumedFoodGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(foodGathererButton)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(gatheredFood)
                                            .addGap(18, 18, 18)
                                            .addComponent(gatheredFoodGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(gameOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(dateGenerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riverFlow)
                    .addComponent(riverFlowRateGenerator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodRate)
                    .addComponent(foodRateGenerator)
                    .addComponent(gatheredFood)
                    .addComponent(gatheredFoodGenerator))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodGathererButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consumedFood)
                            .addComponent(consumedFoodGenerator))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consumedWater)
                            .addComponent(consumedWaterGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(gameOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(warningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    
    public static void main(String[] args) {

          Thread timeFlowThread = new Thread(new Runnable(){
         
         @Override
           public void run() {
                while(true){
        
           try {
               Thread.sleep(1000);
               totalDay++;
               dayofYear++;
               dayofMonth++;
           } catch (InterruptedException ex) {
               Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           dateGenerator.setText(dayofMonth + " " + month + " " + year + "     Total Day:" + totalDay);
           
           if(dayofYear==366){
               dayofMonth = 0;
               dayofYear = 0;
              }
           if(dayofYear==0){
              year++;
              month = "Ocak";
              dayofMonth=0;
              
           }
           if(dayofYear==31){
              month = "Şubat";
              dayofMonth=0;
           }
           
           if(dayofYear==59){
               month = "Mart";
               dayofMonth=0;
           }
           if(dayofYear==90){
               month = "Nisan";
               dayofMonth=0;
           }
            if(dayofYear==120){
               month = "Mayıs";
               dayofMonth=0;
           }
            if(dayofYear==151){
               month = "Haziran";
               dayofMonth=0;
           }
            if(dayofYear==181){
               month = "Temmuz";
               dayofMonth=0;
           }
            if(dayofYear==212){
               month = "Ağustos";
               dayofMonth=0;
           }
            if(dayofYear==243){
               month = "Eylül";
               dayofMonth=0;
           }
            if(dayofYear==273){
               month = "Ekim";
               dayofMonth=0;
           }
            if(dayofYear==304){
               month = "Kasım";
               dayofMonth=0;
           }
            if(dayofYear==335){
               month = "Aralık";
               dayofMonth=0;
            }
            
    
    }
               
                  
          }
         });

          timeFlowThread.start();
          Region region = new Region();
          region.riverRateGeneratorThread.start();
          region.foodRateGenerator.start();
          
          ArrayList<Citizen> population = new ArrayList<Citizen>();
         
          Thread citizenGenerator = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
              
               while(true){
               
                   
                   for(int i = 4; i<100 ;i++){
                        
                       try {
                       
                        //yemeğe bağla 
                       
                        minimumCitizenBirthingRate = 70000 / (Integer.parseInt(gatheredFoodGenerator.getText()) * population.size());
                        maximumCitizenBirthingRate = 100000 / (Integer.parseInt(gatheredFoodGenerator.getText()) * population.size());
                        int randomCitizen = ThreadLocalRandom.current().nextInt(minimumCitizenBirthingRate,maximumCitizenBirthingRate);
                        Thread.sleep(randomCitizen);
                       
                       
                       
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                       DefaultTableModel model = (DefaultTableModel) CitizenTable.getModel();
                      
                       
                       Citizen citizen = new Citizen("deneme " + i, "idle", 0);
                       population.add(citizen);
                       String tempCitName = population.get(i).Name;
                       String tempCitJob = population.get(i).Job;
                       int tempCitAge = population.get(i).age;
                       
                       Object[] eklenecek = {tempCitName,tempCitJob,Integer.toString(tempCitAge)};
                       model.addRow(eklenecek);
                      
                       
                   }
                   
               }
                  
          }
         });
          
          Thread citizenFoodGatherThread = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
              
               while(true){
               
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   

                  if(!population.isEmpty() && Integer.parseInt(foodRateGenerator.getText()) > 0) {
                      
                   for(int i=0; i<population.size();i++){
                         
                        
                         
                        if(CitizenTable.getValueAt(i, 1) == "Gathering Food" && Integer.parseInt(foodRateGenerator.getText()) >0) {
                         
                            int randomNum = ThreadLocalRandom.current().nextInt(3,5);
                            region.totalFood -= randomNum;
                            foodRateGenerator.setText(Integer.toString(region.totalFood));
                            region.gatheredFood += randomNum;
                            gatheredFoodGenerator.setText(Integer.toString(region.gatheredFood));

                        }
                         
                         
                   }
                   
                  }
                  else if(Integer.parseInt(foodRateGenerator.getText()) <= 0){
                  
                        region.gatheredFood += Integer.parseInt(foodRateGenerator.getText());
                        gatheredFoodGenerator.setText(Integer.toString(region.gatheredFood));

                        
                        foodRateGenerator.setText("0");
                        
                        for(int i = 0; i<population.size();i++){
                            
                            if(CitizenTable.getValueAt(i, 1) == "died"){
                            
                            }
                            else{
                                 
                                CitizenTable.setValueAt("idle",i,1);

                            }

                        }      

                  
                  
                  }
                  
                   
               }
                  
          }
         });
          
          citizenFoodGatherThread.start();
          
          Thread citizenFoodConsumingThread = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
               int consmFood = 0;
              
               while(true){
                   
                    try {
                       Thread.sleep(1000);
                       consmFood = 0;
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   

                      if(population.size()>0 && Integer.parseInt(gatheredFoodGenerator.getText()) > 0){
                       
                        warningLabel.setText(" ");
                        foodISlow = false;
                        int diedPop = 0;
                        
                        for(int i=0 ; i<population.size(); i++){
                           
                            if(CitizenTable.getValueAt(i, 1) == "died"){
                                diedPop++;
                                System.out.println(diedPop);
                            }
                            
                        
                        }
                        
                        
                        int livingPop = population.size();
                        livingPop -= diedPop;
                        
                        for(int i=0; i<livingPop; i++){
                              
                            int randomNum = ThreadLocalRandom.current().nextInt(1,3);
                            
                            consmFood += randomNum;
                            consumedFoodGenerator.setText(Integer.toString(consmFood));
                            region.gatheredFood = Integer.parseInt(gatheredFoodGenerator.getText()) - randomNum;
                            gatheredFoodGenerator.setText(Integer.toString(region.gatheredFood));
                            
                        }

                      }
                     
                      if(population.size()>0 && Integer.parseInt(consumedFoodGenerator.getText()) <= 0){
                      
                          warningLabel.setText("Your food is dangerously low");
                          foodISlow = true;
                          
                      }
                   
               }
                  
          }
         });
          
          citizenFoodConsumingThread.start();
          
          Thread citizenWaterConsumingThread = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
               int randomWaterCons =0;
              
               while(true){
                   
                    try {
                       Thread.sleep(1000);
                       randomWaterCons = 0;
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   

                      if(population.size()>0){
                      
                          warningLabel.setText(" ");
                          waterISlow = false;
                          int diedPop = 0;
                        
                        for(int i=0 ; i<population.size(); i++){
                           
                            if(CitizenTable.getValueAt(i, 1) == "died"){
                                diedPop++;
                            }
                            
                        
                        }
                        
                        
                        int livingPop = population.size();
                        livingPop -= diedPop;
                          
                            for(int i=0; i<livingPop; i++){
                              
                            int randomNum = ThreadLocalRandom.current().nextInt(4,7);
                            randomWaterCons += randomNum;
                            consumedWaterGenerator.setText(Integer.toString(randomWaterCons));
                            
                        }
                           
                            if(diedPop == population.size()){
                            
                                 consumedWaterGenerator.setText(Integer.toString(0));
                                 gameOverLabel.setText("GAME OVER");
                                 citizenGenerator.stop();
                                
                            }

        
                       }
                     
                      if(population.size()>0 && Integer.parseInt(consumedWaterGenerator.getText()) == 0){
                      
                          warningLabel.setText("Your water is dangerously low");
                          waterISlow = true;
                          
                      }
                      
                   
               }
                  
          }
         });
          
          citizenWaterConsumingThread.start();
          
          Thread famineControl = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
               int dayWithoutFood = 0;
               double dyingPossibility = 0;

               while(true){
                   
                   
                    try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
                     if(foodISlow){
                     
                           dayWithoutFood++;
                          
                     }
                     else{
                          
                          dayWithoutFood = 0;

                     }
                     
                     
                     if(dayWithoutFood > 10){
                         
                         
                      
                           dyingPossibility = 0.3;
                           double randomPos = ThreadLocalRandom.current().nextDouble(0,1);
                           if(randomPos < dyingPossibility){
                             
                               int randomCit = ThreadLocalRandom.current().nextInt(0,population.size());
                               CitizenTable.setValueAt("died",randomCit,1);

                           }
                           
                           if(dayWithoutFood > 14){
                           
                            dyingPossibility = 0.9;
                            double randomPosib = ThreadLocalRandom.current().nextDouble(0,1);
                            if(randomPosib < dyingPossibility){
                             
                               int randomCit = ThreadLocalRandom.current().nextInt(0,population.size());
                               CitizenTable.setValueAt("died",randomCit,1);

                           }
                           
                           }
                           
                   }
                     
               }
                  
                   
               
               
          }
         });
          
          famineControl.start();
          
          Thread isGatheringorwhat = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
              
               while(true){
                   
                    try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
             //yemeklikontrol
          
                if(Integer.parseInt(gatheredFoodGenerator.getText()) <= 0){
          
                 consumedFoodGenerator.setText("0");
           
               }
                
               }
                  
          }
         });
          
          isGatheringorwhat.start();
          
          Thread dyingOfAging = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
                double dyingPers = 0.000001;
              
               while(true){
                   
                    try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
                  for(int i=0; i<population.size();i++){
                  
                      if(Integer.parseInt(CitizenTable.getValueAt(i, 2).toString()) > 50){
                      
                             dyingPers = 0.003;
                           
                            if(Integer.parseInt(CitizenTable.getValueAt(i, 2).toString()) > 70){
                      
                             dyingPers = 0.01;
                           
                      }  
                           
                      
                      
                      }
                      
                     double randomNum = ThreadLocalRandom.current().nextDouble(0,1);
 
                     if(randomNum<dyingPers){
                         CitizenTable.setValueAt("died", i, 1);
                      }
                     
                  }
                
               }
                  
          }
         });
          
          dyingOfAging.start();
          
        //set visible kısmı
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
               
                foodRateGenerator.setText(Integer.toString(randomStartFood));
                region.totalFood += randomStartFood;
                
                for(int i=0; i<4; i++){
                    
                DefaultTableModel model = (DefaultTableModel) CitizenTable.getModel();
                int randomNum = ThreadLocalRandom.current().nextInt(13, 21);
                Citizen citizen = new Citizen("Citizen " + i, "idle", randomNum);
                population.add(citizen);
                String tempCitName = population.get(i).Name;
                String tempCitJob = population.get(i).Job;
                int tempCitAge = population.get(i).age;
                Object[] eklenecek = {tempCitName,tempCitJob,Integer.toString(tempCitAge)};
                model.addRow(eklenecek);
                
                }
            }
        });
         
        
        //herşeyin kontrol edilişi 
         while(true){

            
              try {
                  //tick fonksiyonu
                  Thread.sleep(1);
              } catch (InterruptedException ex) {
                  Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
              }
             
          region.month = month;
          region.dayofMonth=dayofMonth;
          region.year=year;  
          
          //yaş hesap
          if(dayofMonth== 1 && month== "Ocak"){
                    for(int i = 0; i<population.size() ;i++){
                        
                       
                       DefaultTableModel model = (DefaultTableModel) CitizenTable.getModel();
                      int a = Integer.parseInt(CitizenTable.getValueAt(i, 2).toString());
                       a++;
                       CitizenTable.setValueAt(a ,i, 2);
                        
                   }
                   
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                  }
                     
               }
       
          
        
          //
         
         
         }        
    }
    
}
