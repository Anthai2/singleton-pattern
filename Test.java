package Singleton;

public class Test {
    public static void main (String[] args){
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        
        System.out.println("instance1: " + instance1);
        System.out.println("instance2: " + instance2);
        ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstance();
        System.out.println("instance3: " + instance3);
        System.out.println("instance4: " + instance4);
    }
}
