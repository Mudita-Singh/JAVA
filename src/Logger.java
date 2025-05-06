
final class Logger {

    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// cannot extend the final class
/*
class ExtendedLogger extends Logger {
    void logMessage(String message) {
        System.out.println("Overridden Log: " + message);
    }
}
*/


class major {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a log message.");

    }
}
