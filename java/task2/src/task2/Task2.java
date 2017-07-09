
package task2;
import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args) {
        Info info=new Info();
        CollegeAssigner c=new CollegeAssigner();
        
      ArrayList<Info.infoptmp> student=info.setinfo();
      for(int i=0;i<student.size();i++){
         
      System.out.println("name : "+student.get(i).name
                        +" birthday : "+student.get(i).birthday
                        +" type : " +student.get(i).type
                        +" av : "+student.get(i).av
                        +" your CollegeAssigner : "+ c.assigner(student.get(i).av));
     }
   }
}
