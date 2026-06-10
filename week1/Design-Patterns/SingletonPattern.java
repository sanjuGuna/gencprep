//as the previous version is NOT perfomance oriented
class Singleton{
    private static volatile Singleton ins;
    private Singleton(){
        System.out.println("Instance created");
    }
    public static synchronized Singleton getInstance(){//Synchronized b/w threads
        Singleton tempIns=ins;
        if(tempIns==null){
            synchronized(Singleton.class){
                if(tempIns==null){
                    tempIns=new Singleton();
                }
                ins=tempIns;
            }
        }
        return ins;
    }
}

public class SingletonPattern{
    public static void main(String[] args) {
        Runnable task=()->{
            Singleton ins=Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+"->"+ins.hashCode());
        };
        Thread t1=new Thread(task,"t1");
        Thread t2=new Thread(task,"t2");
        t1.start();
        t2.start();
    }
} 