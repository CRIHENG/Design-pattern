package MultitionPattern;


import java.util.ArrayList;
import java.util.Random;

/*
* 多例模式
*
* */
public class MoreCeo {
    //定义能创建几个对象
    private static int CEO_NUM = 2;

    //定义老板的名字
    private static ArrayList CEO_NAME = new ArrayList(CEO_NUM);

    //老板的人选
    private static ArrayList CEO = new ArrayList(CEO_NUM);

    //当前CEO是哪个
    private static int NOW_CEO = 0;

    static {
        for (int i = 0; i < CEO_NUM; i++) {
            CEO.add(new MoreCeo("老板CEO" + i));
        }

    }

    //防止直接创建对象
    private MoreCeo() {

    }

    private MoreCeo(String info) {
        CEO_NAME.add(info);
    }

    public static MoreCeo getInstance() {
        Random random = new Random();
        NOW_CEO = random.nextInt(CEO_NUM);
        return (MoreCeo) CEO.get(NOW_CEO);
    }

    public static void getCeoName() {
        System.out.println(CEO.get(NOW_CEO));
    }
}
