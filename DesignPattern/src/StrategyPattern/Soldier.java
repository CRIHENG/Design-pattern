package StrategyPattern;

import org.junit.Test;

/**
 * Created by githu on 2017/11/22.
 * 
 * <p>
 *     
 *     刘备要到江东娶老婆了，走之前诸葛亮给赵云（伴郎）三个锦囊妙计，说是按天机拆开解决棘手问题，
 嘿，还别说，真是解决了大问题，搞到最后是周瑜陪了夫人又折兵呀，那咱们先看看这个场景是什么样子
 的。
 *     
 *     
 *     <p/>
 */
public class Soldier {
    @Test
    public void solve(){
        Box box=new Box(new One());
        box.use();
        
    }
}
