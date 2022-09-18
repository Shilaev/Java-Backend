package Patterns.Creational.Singletone;

public class Logger {
    private static Logger logger;
    private static String logFile = "logs";

    private Logger() {
    }

    public static synchronized Logger getLogger() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void addLogInfo(String newLog) {
        logFile += newLog;
    }

    public void showLogInfo(){
        System.out.println(logFile);
    }
}
