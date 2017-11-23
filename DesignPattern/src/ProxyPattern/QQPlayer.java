package ProxyPattern;

/**
 * Created by githu on 2017/11/22.
 */
public class QQPlayer implements Player {
    private  int vol;
    @Override
    public void play() {
        System.out.println("我能播放《战狼》");
    }

    @Override
    public void pause() {
        System.out.println("QQPlay暂停");
    }

    @Override
    public void vol(int vol) {
        this.vol=vol;
        System.out.println("音量："+vol+" vol");
    }
}
