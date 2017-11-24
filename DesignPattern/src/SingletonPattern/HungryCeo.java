package SingletonPattern;
/*
*
* 单例模式，构造函数中多加了一个私有（private）构造器，
* 通过getInstance()来创建对象，当我们做B/S项目的时候，
* 每个HTTP请求刀J2EE的容器上都创建了一个线程，那么如果
* 当我执行到代码低19行的时候这时又有请求过来了那么在if()
* 中对象时null or not null?
*
*
* */
public class HungryCeo {
    private static  HungryCeo hungryCeo=null;
    static  int i;
    private HungryCeo(){

    }
    public static HungryCeo getInstance(){

        if(hungryCeo==null){
            hungryCeo=new HungryCeo();
            i++;
            System.out.println(i);
        }

        return hungryCeo;
    }

    public void talkWithWorker(){

        System.out.println("大家好，我是你们的老板，以后可以叫我楚总！");

    }
}
