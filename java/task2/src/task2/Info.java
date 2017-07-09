
package task2;
import java.util.ArrayList;
import java.util.Scanner;
public class Info {
    
 class infoptmp{
    public String name;
    public String birthday;
    public String type;
    public Double av;
    
 public infoptmp(String name ,String birthday ,String type, Double av){
      this.name=name;
      this.birthday=birthday;
      this.type=type;
      this.av=av;
 }
 }
 
public ArrayList<infoptmp> al=new ArrayList<infoptmp>();

public ArrayList<infoptmp> setinfo()
{
    Scanner s =new Scanner(System.in);
    String name;  String birthday;  String type; Double av;

for (int i=0;i<5;i++)
{
    System .out.print("please enter the  "+i+" name"+"\n");
    name=s.next();
    System .out.print("please enter the  "+i+" birthday"+"\n");
    birthday=s.next();
    System .out.print("please enter the  "+i+" type"+"\n");
    type=s.next();
    System .out.print("please enter the  "+i+" av"+"\n");
    av=s.nextDouble();
    al.add(new infoptmp( name , birthday , type,  av));
}
return al;
    
}
}
