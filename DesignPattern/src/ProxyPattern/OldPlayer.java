package ProxyPattern;

/**
 * Created by githu on 2017/11/23.
 */
public class OldPlayer implements Player {
    private Player player;
    
    

    OldPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        this.player.play();
    }

    @Override
    public void pause() {
        this.player.pause();
    }

    @Override
    public void vol(int vol) {
         this.player.vol(vol);
    }
}
