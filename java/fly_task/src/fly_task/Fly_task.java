
package fly_task;
import fly_task.Reservation.info;
import java.util.ArrayList;
import java.util.Scanner;

public class Fly_task {

    public static void main(String[] args) {
        Reservation reservation=new Reservation();
        
      ArrayList<info> ReservationList=new ArrayList<info>();
      
        Scanner in =new Scanner(System.in);
        
        while (true) {   
            
       reservation.new_reservation();
        System.out.println("done to exit : and press any key to add new Reservation !");
            
            if("done".equals(in.next()))
            break;         
        }      
        
        reservation.printallreservation();
        reservation.printcount();
        
         
    }
    
}
