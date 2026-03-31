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

        System.out.println("\n=== Ap dung vao bai toan cu the: Quan ly ket noi DB ===");
        DatabaseConnectionManager orderServiceDb = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager paymentServiceDb = DatabaseConnectionManager.getInstance();

        orderServiceDb.executeQuery("OrderService", "SELECT * FROM orders WHERE id = 101");
        paymentServiceDb.executeQuery("PaymentService", "UPDATE payments SET status = 'PAID' WHERE id = 77");

        System.out.println("orderServiceDb == paymentServiceDb ? " + (orderServiceDb == paymentServiceDb));
    }
}
