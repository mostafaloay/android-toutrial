
package task2;

public class CollegeAssigner {
    public String assigner(Double av){
        String tmp="";
        
        if(av>=89.5&& av<91)
            tmp="Computer Engineering";
        
        else if(av>=85 && av<89.5)
           tmp= "Network Engineering";
        
        else if(av>=91 && av<=100)
          tmp="Mustang Engineering";
        
        return tmp;
    
    }
    
}
