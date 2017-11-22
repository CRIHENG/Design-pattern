package StrategyPattern;

/**
 * Created by githu on 2017/11/22.
 */
public class Box {
    
    private Bag bag;
    
    Box(Bag bag){
        this.bag=bag;
    }
     public void use(){
         this.bag.open();
     } 
    
}
