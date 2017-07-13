
package task3;

public enum Day {
    SUNDAY(true),
    MONDAY(false),
    TUESDAY(true),
    WEDNESDAY(false),
    THURSDAY(true), 
    FRIDAY (false), 
    SATURDAY(false);
    private boolean av;
    Day(boolean av){
        this.av=av;
    }
     public  boolean get_status(){
        return av;
     }
}

