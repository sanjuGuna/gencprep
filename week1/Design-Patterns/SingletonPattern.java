class Singleton{
    private static Singleton ins;
    private Singleton(){
        System.out.println("Instance created");
    }
    public static Singleton getInstance(){
        if(ins==null){
            ins=new Singleton();
        }
        return ins;
    }
}

public class SingletonPattern{
    public static void main(String[] args) {
        Singleton ob1= Singleton.getInstance();
        Singleton ob2= Singleton.getInstance();
        System.out.println(ob1==ob2);
    }
} 