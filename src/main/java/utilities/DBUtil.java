package utilities;

public class DBUtil {

    private static DBUtil instance;

    // Static method to provide the single instance
    public static DBUtil getInstance() {
        if (instance == null) {
            synchronized (DBUtil.class) {
                if (instance == null) {
                    instance = new DBUtil();
                }
            }
        }
        return instance;
    }

    private DBUtil(){
        System.out.println("DB Util constructor called. connection opened" + this.hashCode());
    }

    public void runQuery(String query){
        System.out.println(query+ " has run successfully");
    }
}