
package fly_task;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

public class Reservation {
    static int count;
    public class info{ 
        String day; String month;String airline;String name;
        
     info(String day, String month, String airline,String name){
       this.day=day; this.month=month;this.airline=airline; this.name=name;}
 }
    
    private void printday(){
        for (Information.Day day :Information.Day.values()){
            System.out.println(day.getday_no()+"="+ day);
        }
       }
    
    private void printmonth(){
        for (Information.Months month :Information.Months.values()){
            System.out.println(month.getmonth_no()+"="+ month);
        }
       }
    
     public ArrayList<info> ReservationList=new ArrayList<info>();
     
      public void new_reservation(){
          Scanner in=new Scanner(System.in);
          
          printday();
          System.out.println("please select  the number of day ");
          String day=Information.Day.getvalue(in.nextInt());
          
          printmonth();
          System.out.println("please select  the number of month ");
          String month=Information.Months.getvalue(in.nextInt());
          
          Information information=new Information();
          information.printAirline();
          System.out.println("please select  the number of Airline ");
          String Airline=information.Select_Airline(in.nextInt());
          
          System.out.println("please enter your name  ");
          ReservationList.add(new info(day, month, Airline, in.next()));
          count++;          
      }
           public  void printallreservation(){
           System.out.println("All Reservation of Today");

            for(int i=0; i<ReservationList.size();i++){
            System.out.println("Day: "+ReservationList.get(i).day+"   "+
                               "Month: "+ReservationList.get(i).month+"   "+
                               "Airline: "+ReservationList.get(i).airline+"   "+
                               "Name: "+ReservationList.get(i).name );
        
        }
           }
          public void printcount(){System.out.println("Reservation of Today : "+count);}

    
}
    

