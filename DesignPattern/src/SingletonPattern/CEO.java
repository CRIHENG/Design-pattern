package SingletonPattern;

/**
 * Created by githu on 2017/11/23.
 */
public class CEO {
    
    private  static CEO ceo;
    
    private CEO(){
        
        
    }
     public  static  CEO getInstance(){
         return  ceo=new CEO();
         
     }
}
