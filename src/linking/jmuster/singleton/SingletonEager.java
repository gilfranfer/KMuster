package linking.jmuster.singleton;

public class SingletonEager {

    private static SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInsatnce(){
        return INSTANCE;
    }
    
}
