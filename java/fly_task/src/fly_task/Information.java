
package fly_task;

import java.util.ArrayList;

public class Information {
    // ariline company
    public ArrayList<String> Airline=new ArrayList<String>();
    Information(){Airline.add("Fly Baghdad"); Airline.add("Fly Not Baghdad");Airline.add("Fly Baghdad Not");
                  Airline.add("Don't Fly With Us"); }
     // days
    enum Day{  SATURDAY(1), SUNDAY(2), MONDAY(3), TUESDAY(4), WEDNESDAY(5),THURSDAY(6), FRIDAY(7);
       private int day_no;
     Day(int day_no){ this.day_no=day_no;}
     public int getday_no(){return day_no;}
     
     public static String getvalue(int day_no){
         String tmp=null;
         for (Day day :Day.values()){
           if(day.getday_no()==day_no){
               tmp=day.toString();
           break;
           }
        }
         return tmp;
      }
    }
    
   //months
    enum Months{
    January(1),
    February (2),
    March (3),
    April (4),
    May (5),
    June(6),
    July (7),
    August (8),
    September (9),
    October (10),
    November (11),
    December (12);
    
        private int month_no;
     Months(int month_no){ this.month_no=month_no;}
          public int getmonth_no(){return month_no;}
          
            public static String getvalue(int month_no){
         String tmp=null;
         for (Months month :Months.values()){
           if(month.getmonth_no()==month_no){
               tmp=month.toString();
           break;
           }
        }
         return tmp;
      }

    }
    
    public  String Select_Airline(int no){
        return Airline.get(no-1);
    
    }
    public  void printAirline(){
        for(int i=0; i<Airline.size();i++){
            System.out.println(i+1 + "=" + Airline.get(i).toString() );
        
        }
    }
}

