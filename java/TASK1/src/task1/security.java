
package task1;
public class security {
    private int[] offset ;
    public security(int [] offset){
        this.offset=offset;}  
    public String encrypt (String word){
               String encrypt="";
               int p=0;
         for(int i=0;i<word.length();i++)
         {
             p=p % this.offset.length;
       char a=(char) ((word.charAt(i)) + this.offset[p]);
       encrypt=encrypt + a;
       p+=1;
         }
        return encrypt; }
    //////////////////////////////////////////////////////////
            public String decrypt (String word){
            String decrypt="";          
            int p=0;
        for(int i=0;i<word.length();i++)
         {  p=p % this.offset.length;
         char a=(char) ((word.charAt(i)) -  this.offset[p]);
         decrypt=decrypt + a;
         p+=1;
         }  return decrypt;
            }
}
