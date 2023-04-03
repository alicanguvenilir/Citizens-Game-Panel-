




import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Region {
    
     public static int minimumRate=10000;
     public static int maximumRate=12000;
     public static String month;
     public static int dayofMonth;
     public static int year;
     public static int foodMinimum;
     public static int foodMaximum;
     public static int totalFood;
     public static int gatheredFood;
    
     Thread riverRateGeneratorThread = new Thread(new Runnable(){
         
         @Override
           public void run() {
              
          while(true){
              
              try {
                  Thread.sleep(1000);
               
                   if(month == "Ocak"){
                   
                      minimumRate = 8000;
                      maximumRate = 10000;
                     
                }
                   if(month == "Şubat"){
                   
                      minimumRate = 8500;
                      maximumRate = 10500;
                     
                }
                  if(month == "Mart"){
                   
                      minimumRate = 9000;
                      maximumRate = 11000;
                     
                } 
                  if(month == "Nisan"){
                   
                      minimumRate = 11000;
                      maximumRate = 12200;
                     
                } 
                  if(month == "Mayıs"){
                   
                      minimumRate = 12000;
                      maximumRate = 13000;
                     
                } 
                  if(month == "Haziran"){
                   
                      minimumRate = 10000;
                      maximumRate = 12000;
                     
                } 
                  if(month == "Temmuz"){
                   
                      minimumRate = 8500;
                      maximumRate = 10000;
                     
                } 
                  if(month == "Ağustos"){
                   
                      minimumRate = 7000;
                      maximumRate = 9000;
                     
                } 
                  if(month == "Eylül"){
                   
                      minimumRate = 7500;
                      maximumRate = 9500;
                     
                } 
                  if(month == "Ekim"){
                   
                      minimumRate = 9000;
                      maximumRate = 11000;
                     
                } 
                  if(month == "Kasım"){
                   
                      minimumRate = 9000;
                      maximumRate = 11000;
                     
                } 
                  if(month == "Aralık"){
                   
                      minimumRate = 9000;
                      maximumRate = 11000;
                     
                } 
                  
                   
                  
                  int randomNum = ThreadLocalRandom.current().nextInt(minimumRate, maximumRate);
                  main.riverFlowRateGenerator.setText(Integer.toString(randomNum));
              } catch (InterruptedException ex) {
                  Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
              }

         
         }
         
         
               
          }
         });
     
     
     
     Thread foodRateGenerator = new Thread(new Runnable(){
         
         @Override
           public void run() {
              
          while(true){
              
              try {
                 
                  Thread.sleep(1000);
               
                  if(month == "Mart" && dayofMonth==5){
                   
                      foodMinimum = 1000;
                      foodMaximum = 2000;
                      
                      int randomNum = ThreadLocalRandom.current().nextInt(foodMinimum, foodMaximum);
                      totalFood += randomNum;
                      main.foodRateGenerator.setText(Integer.toString(totalFood));
                      
                     
                } 
                   
              } catch (InterruptedException ex) {
                  Logger.getLogger(Region.class.getName()).log(Level.SEVERE, null, ex);
              }

         
         }
         
         
               
          }
         });
     
     
}
   
