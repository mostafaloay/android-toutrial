
package notfication;

/**
 *
 * @author iraq
 */
public class Notfication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotficationBuldir buldir=new NotficationBuldir();
        buldir.setTitle("facebook");
        buldir.setContent("mostafa added you to group");
        buldir.setIcon("فد صورة");
        buldir.setLedcolor("green");
        buldir.ShowNotfication();

    }
    
}
