package SingletonPattern;
/*
* 懒汉式单例模式
* */
public class LazyCeo {

    private  static  LazyCeo lazyCeo=new LazyCeo();

    private LazyCeo(){};

    public   synchronized  static LazyCeo getInstance(){
        return  lazyCeo;
    }

    public   void talkWithWorker(){

        System.out.println("大家随意，随意 ，叫我楚哥");
    }

}
