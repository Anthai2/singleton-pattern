package Singleton;

public class DatabaseConnectionManager {
    private static volatile DatabaseConnectionManager instance;
    private final String connectionId;

    private DatabaseConnectionManager() {
        this.connectionId = "DB-CONN-" + System.currentTimeMillis();
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    public void executeQuery(String serviceName, String sql) {
        System.out.println(serviceName + " dùng " + connectionId + " -> " + sql);
    }
}
