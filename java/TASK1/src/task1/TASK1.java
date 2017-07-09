
package task1;

import java.util.Scanner;

public class TASK1 {

    public static void main(String[] args) {
        
        security s=new security(new int [] {3452,354,536,764,3226,23});
      Scanner in=new Scanner(System.in);
      System.out.println("enter your word for encrypt :");

        String a=s.encrypt(in.nextLine());
        System.out.println("after encrtpy: "+a);
        System.out.println("after decrypt: "+s.decrypt(a));
    
    }
    
}
