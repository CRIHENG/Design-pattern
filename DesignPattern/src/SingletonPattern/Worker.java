package SingletonPattern;

import org.junit.Test;

/**
 * Created by githu on 2017/11/23.
 */

public class Worker {

    @Test
    public void puchLock() {


        HungryCeo ceoChu_day01 = HungryCeo.getInstance();

        ceoChu_day01.talkWithWorker();
        HungryCeo ceoChu_day02 = HungryCeo.getInstance();

        ceoChu_day02.talkWithWorker();
        HungryCeo ceoChu_day03 = HungryCeo.getInstance();

        ceoChu_day03.talkWithWorker();

     //这里可以看到当我们无论调用N次都只会创建一个对象除反射意外（反射可以调用类的方法包括私有方法）
    }
}
