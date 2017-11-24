package SingletonPattern;

/**
 * Created by githu on 2017/11/23.
 *
 * 饿汉式单例模式
 */
public class CEO {
    //
    private  static CEO ceo=null;
    //构造器:访问权限是private
    private CEO(){

    }
    //重点:单例模式--创建类通过 CEO.getIntance() 提供创建见对象的方法 不能通过NEW来创建对象
     public  static  CEO getInstance(){

        if(ceo==null){
            ceo=new CEO();
        }
         return  ceo=new CEO();
         
     }

     public static  void   talk(){
         System.out.println("大家伙好！我是你们的CEO,楚老板");
     }
}
