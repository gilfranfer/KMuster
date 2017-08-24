package linking.jmuster.singleton;

public class SingletonLazy {

    private static SingletonLazy INSTANCE;

    private SingletonLazy(){}

    public static SingletonLazy getInsatnce(){
        if(INSTANCE == null)
            INSTANCE = new SingletonLazy();
        return INSTANCE;
    }

}
