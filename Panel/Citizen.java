



import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Citizen {
     
  public static String Name;
   public static  String Job;
   public static  String Sex;
   public static  int age;
   public static  int birthday;
   public static  String birthmonth;
           
    //time parametreleri
    
   public static  int dayofMonth;
   public static  String month;

    public Citizen(String Name, String Job, int age) {
        this.Name = Name;
        this.Job = Job;
        this.age = age;
    }
    
    
    
    
        Thread gettingolderThread = new Thread(new Runnable(){
         
         @Override
           public void run() {
               
               while(true) {
               
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Citizen.class.getName()).log(Level.SEVERE, null, ex);
                   }
                    
                   if(dayofMonth==birthday && month.equals(birthmonth)){
                   
                        age++;
                        
                    }
                   
               
               }
                  
          }
         });

   


    
    
    
}
