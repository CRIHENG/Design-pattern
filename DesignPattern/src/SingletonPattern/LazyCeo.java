package SingletonPattern;

public class LazyCeo {

    private  static  LazyCeo lazyCeo=new LazyCeo();

    private LazyCeo(){};

    private   synchronized  static LazyCeo getInstance(){
        return  lazyCeo;
    }

}
