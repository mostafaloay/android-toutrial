
package task3;
public class Gymregesteration {
    private static int count=0;
    //information
    public String name;
    public int age;
    public String day;
    public boolean av;

    public Gymregesteration(  String name , int age , String day , boolean av ){
        if(av){
            this.name=name;
            this.age=age;
            this.day=day;
            this.av=av; 
            count ++;
            System.out.println("you have been regestration");

        }
        else{
          System.out.println("today is " + day + " sorry we are closing today");
        }
      } 
    public static int getcount(){
    return count;    
   }
}
