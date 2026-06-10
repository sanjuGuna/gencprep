//as the previous version is NOT Thread-safe
class Singleton{
    private static Singleton ins;
    private Singleton(){
        System.out.println("Instance created");
    }
    public static synchronized Singleton getInstance(){//Synchronized b/w threads
        if(ins==null){
            ins=new Singleton();
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