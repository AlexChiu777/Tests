package designpattern.singleton.staticfield;

/**
 * Created by Alex on 5/3/2015.
 */
public class StaticFieldSingleton {
    //Eager Initialization
    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();

    public static StaticFieldSingleton getInstance() {
        return INSTANCE;
    }

    //Lazy initialization
    //for this case, we have to initialize the variable without final
    //private static StaticFieldSingleton INSTANCE;
    /*public synchronized static StaticFieldSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StaticFieldSingleton();
        }
        return INSTANCE;
    }*/

    //Double Checked Locking
    //for this case, we have to initalize variable as volatile
    //private static volatile StaticFieldSingleton INSTANCE;
    /*public static StaticFieldSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (StaticFieldSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new StaticFieldSingleton();
                }
            }
        }

        return INSTANCE;
    }*/

    public void show() {
        System.out.println("StaticField Singleton Pattern");
    }
}
