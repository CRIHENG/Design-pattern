package ProxyPattern;

import org.junit.Test;

/**
 * Created by githu on 2017/11/23.
 */
public class User {
    @Test
    public void watchMovie(){

        System.out.println("");
        
        OldPlayer oldPlayer=new OldPlayer(new QQPlayer());
        
        oldPlayer.vol(50);
        oldPlayer.play();
        oldPlayer.pause();
        
    }
}
