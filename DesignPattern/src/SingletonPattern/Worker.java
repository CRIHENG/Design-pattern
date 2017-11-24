package SingletonPattern;

import org.junit.Test;

/**
 * Created by githu on 2017/11/23.
 */

public class Worker {

    @Test
    public  void  puchLock(){
        

     CEO ceoChu=CEO.getInstance();

     ceoChu.talk();
        CEO ceoChu01=CEO.getInstance();

        ceoChu01.talk();
        CEO ceoChu02=CEO.getInstance();

        ceoChu02.talk();

        
        
    }
}
