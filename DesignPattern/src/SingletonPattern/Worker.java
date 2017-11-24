package SingletonPattern;

import org.junit.Test;

/**
 * Created by githu on 2017/11/23.
 */
public class Worker {
    
    @Test
    public  void  puchLock(){
        
     CEO a=   CEO.getInstance();
     CEO b = CEO.getInstance();

        System.out.println(a+""+b); 
        
        
    }
}
