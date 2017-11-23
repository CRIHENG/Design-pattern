package ProxyPattern;

/**
 * Created by githu on 2017/11/22.
 */
public class ThunderBrowerPlayer implements Player {
    private  int vol;
    
    
    ThunderBrowerPlayer (){
        this.vol=50;
    }
    @Override
    public void play() {

        System.out.println("我能播放《这个杀手不太冷》");
    }

    @Override
    public void pause() {
        System.out.println("OK，暂停！");
    }

    @Override
    public void vol(int vol) {
       this.vol=vol;
        System.out.println("音量："+vol+" vol");
    }
}
