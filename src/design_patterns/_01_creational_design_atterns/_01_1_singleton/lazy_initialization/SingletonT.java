package design_patterns._01_creational_design_atterns._01_1_singleton.lazy_initialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonT {

    private static SingletonT instance = null; //lazy initialization

    private SingletonT() {
        System.out.println("Creating...");
    }

    public static SingletonT getInstance() {
        if (instance == null) {   //check1
            synchronized (SingletonT.class) {
                if (instance == null) {   //check2
                    instance = new SingletonT();
                }
            }
        }
        return instance;
    }

    static void useSingleton() {
        SingletonT singleton = SingletonT.getInstance();
        System.out.println("Hashcode of Singleton Object: " + singleton.hashCode());
    }

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(SingletonT::useSingleton);
        service.submit(SingletonT::useSingleton);
        service.shutdown();
    }
}
