package MultitionPattern;

import org.junit.Test;

public class Worker {

    @Test
    public void isCeo(){


        int workers=10;
        for(int i=0;i<workers;i++){
            MoreCeo moreCeo=MoreCeo.getInstance();
            System.out.println("我的老板是"+i+"董事长");
            moreCeo.getCeoName();
        }

    }
}
