package Q2;

class Printer {
    private static Printer _instance;
    private static Object obj = new Object();
    private Printer() {}
    public static Printer getInstance() {
        if(_instance == null) {
            synchronized (obj) {
                if(_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public void getConnection() {
        System.out.println("Your Printer is working");
    }
}