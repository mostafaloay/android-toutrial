
package task3;
public class Task3 {
    public static void main(String[] args) {
      
      Gymregesteration member1=new Gymregesteration("mostafa", 
              21, 
              String.valueOf(Day.SUNDAY),
              Day.SUNDAY.get_status());
      
        System.out.println("member until now = " + Gymregesteration.getcount());
        
        Gymregesteration member2=new Gymregesteration("ibrahim", 
              23, 
              String.valueOf(Day.FRIDAY),
              Day.FRIDAY.get_status());
        System.out.println("member until now = " + Gymregesteration.getcount());  
        
          Gymregesteration member3=new Gymregesteration("ahmed", 
              20, 
              String.valueOf(Day.THURSDAY),
              Day.THURSDAY.get_status());
              System.out.println("member until now = " + Gymregesteration.getcount());  
 }
}